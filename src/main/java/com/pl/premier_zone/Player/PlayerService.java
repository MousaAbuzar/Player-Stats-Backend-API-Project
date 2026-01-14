package com.pl.premier_zone.Player;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayers() {
        return playerRepository.findAll();
    }

    public List<Player> getPlayersFromTeam(String teamName) {
        return playerRepository.findAll().stream()
                .filter(player -> teamName != null && teamName.equals(player.getTeam()))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayerByName(String searchText) {
        String s = (searchText == null) ? "" : searchText.toLowerCase();
        return playerRepository.findAll().stream()
                .filter(player -> player.getName() != null && player.getName().toLowerCase().contains(s))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayerByPos(String searchText) {
        String s = (searchText == null) ? "" : searchText.toLowerCase();
        return playerRepository.findAll().stream()
                .filter(player -> player.getPos() != null && player.getPos().toLowerCase().contains(s))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayersByNation(String searchText) {
        String s = (searchText == null) ? "" : searchText.toLowerCase();
        return playerRepository.findAll().stream()
                .filter(player -> player.getNation() != null && player.getNation().toLowerCase().contains(s))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayersByTeamAndPosition(String team, String position) {
        return playerRepository.findAll().stream()
                .filter(player ->
                        team != null && position != null
                                && team.equals(player.getTeam())
                                && position.equals(player.getPos()))
                .collect(Collectors.toList());
    }

    @Transactional
    public Player addPlayer(Player player) {
        return playerRepository.save(player);
    }

    @Transactional
    public Player updatePlayer(Player updatedPlayer) {
        if (updatedPlayer == null || updatedPlayer.getName() == null) return null;

        Optional<Player> existingPlayer = playerRepository.findByName(updatedPlayer.getName());

        if (existingPlayer.isEmpty()) return null;

        Player playerToUpdate = existingPlayer.get();
        playerToUpdate.setName(updatedPlayer.getName());
        playerToUpdate.setTeam(updatedPlayer.getTeam());
        playerToUpdate.setPos(updatedPlayer.getPos());
        playerToUpdate.setNation(updatedPlayer.getNation());

        return playerRepository.save(playerToUpdate);
    }

    @Transactional
    public void deletePlayer(String playerName) {
        playerRepository.deleteByName(playerName);
    }
}
