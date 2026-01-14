package com.pl.premier_zone.Player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "player_statistic", schema = "public")
public class Player {

    @Id
    @Column(name = "player_name")
    private String playerName;

    @Column(name = "nation")
    private String nation;

    @Column(name = "position")
    private String pos;

    @Column(name = "age")
    private Integer age;

    @Column(name = "matches_played")
    private Integer mp;

    @Column(name = "starts")
    private Integer starts;

    @Column(name = "minutes_played")
    private Integer min;

    @Column(name = "goals")
    private Integer gls;

    @Column(name = "assists")
    private Integer ast;

    @Column(name = "penalties_scored")
    private Integer pk;

    @Column(name = "yellow_cards")
    private Integer crdy;

    @Column(name = "red_cards")
    private Integer crdr;

    @Column(name = "expected_goals")
    private Double xg;

    @Column(name = "expected_assists")
    private Double xag;

    @Column(name = "team_name")
    private String team;

    public Player() {
    }

    // Optional: a full constructor (you can delete if you don't use it)
    public Player(String playerName, String nation, String pos, Integer age,
                  Integer mp, Integer starts, Integer min,
                  Integer gls, Integer ast, Integer pk,
                  Integer crdy, Integer crdr, Double xg, Double xag, String team) {
        this.playerName = playerName;
        this.nation = nation;
        this.pos = pos;
        this.age = age;
        this.mp = mp;
        this.starts = starts;
        this.min = min;
        this.gls = gls;
        this.ast = ast;
        this.pk = pk;
        this.crdy = crdy;
        this.crdr = crdr;
        this.xg = xg;
        this.xag = xag;
        this.team = team;
    }

    // --- Getters / Setters ---

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    // If you still want getName()/setName() for older code, map it to playerName:
    public String getName() {
        return playerName;
    }

    public void setName(String name) {
        this.playerName = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMp() {
        return mp;
    }

    public void setMp(Integer mp) {
        this.mp = mp;
    }

    public Integer getStarts() {
        return starts;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getGls() {
        return gls;
    }

    public void setGls(Integer gls) {
        this.gls = gls;
    }

    public Integer getAst() {
        return ast;
    }

    public void setAst(Integer ast) {
        this.ast = ast;
    }

    public Integer getPk() {
        return pk;
    }

    public void setPk(Integer pk) {
        this.pk = pk;
    }

    public Integer getCrdy() {
        return crdy;
    }

    public void setCrdy(Integer crdy) {
        this.crdy = crdy;
    }

    public Integer getCrdr() {
        return crdr;
    }

    public void setCrdr(Integer crdr) {
        this.crdr = crdr;
    }

    public Double getXg() {
        return xg;
    }

    public void setXg(Double xg) {
        this.xg = xg;
    }

    public Double getXag() {
        return xag;
    }

    public void setXag(Double xag) {
        this.xag = xag;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
