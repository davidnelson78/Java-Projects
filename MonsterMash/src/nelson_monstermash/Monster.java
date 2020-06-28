/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nelson_monstermash;

import java.io.*;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import sun.audio.*;

/**
 *
 * @author david
 */
public class Monster {

    private int size;
    private int speed;
    private String name;
    private String monsterType;
    private int scareFactor;

    public int getSize() {
        int size = 1 + (int) (Math.random() * 10);
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSpeed() {
        int speed = 1 + (int) (Math.random() * 10);
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMonsterType() {
        return monsterType;
    }

    public void setMonsterType(String monsterType) {
        this.monsterType = monsterType;
    }

    public int getScareFactor() {
        int scareFactor = 1 + (int) (Math.random() * 10);
        return scareFactor;
    }

    public void setScareFactor(int scareFactor) {
        this.scareFactor = scareFactor;
    }

    public Monster(int size, int speed, String name, String monsterType, int scareFactor) {
        this.size = size;
        this.speed = speed;
        this.name = name;
        this.monsterType = monsterType;
        this.scareFactor = scareFactor;
    }

    public void Speak() throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        InputStream in;
        try {
            in = new BufferedInputStream(new FileInputStream(new File(
                    getClass().getClassLoader()
                            .getResource("Monster Growl-SoundBible.com-344645592.wav").getPath())));
            AudioStream audioStream = new AudioStream(in);
            AudioPlayer.player.start(audioStream);
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }

}
