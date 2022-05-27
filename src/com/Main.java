package com;

import com.answers.Algorithms;
import com.answers.Core_1;
import com.answers.Core_2;
import com.answers.JPA_Hibernate;
import com.answers.Multithreading;
import com.answers.Patterns;
import com.answers.SQL;
import com.answers.Spring;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static int block;
    private static String block_str;
    private static int question;


    public static void main(String[] args) throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner keyboard = new Scanner(System.in);
        boolean exitProgram = false;

        while (!exitProgram){
            boolean exit = false;
            block = (int) (Math.random()*9);

        switch (block){
            case 1: block_str = "Core-1";           break;
            case 2: block_str = "Core-2";           break;
            case 3: block_str = "Многопоточность";  break;
            case 4: block_str = "SQL";              break;
            case 5: block_str = "Hibernate";        break;
            case 6: block_str = "Spring";           break;
            case 7: block_str = "Паттерны";         break;
            case 8: block_str = "Алгоритмы";        break;
            default: exit = true;                   break;
        }
        if(exit){
            //System.out.println("Раздел не найден, можно отдохнуть :)");
            playSound("C:\\Windows\\Media\\Speech On.wav");
            Thread.sleep(200);
        } else{
            action();
        }
            String input = keyboard.nextLine();
            if(input != null) {
                if ("q".equals(input)) {
                    System.out.println("До свидания!");
                    exitProgram = true;
                } else {
                    //Do something
                    //System.out.println("Программа продолжает работать!");
                }
            }
//            Runtime.getRuntime().exec("clear");
//            System.out.print("\033[H\033[2J");
//            System.out.flush();
        }
        keyboard.close();

    }
    public static void playSound(String path) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        File f = new File(path);
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());
        Clip clip = AudioSystem.getClip();
        clip.open(audioIn);
        clip.start();

    }
    public static void action() throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {

        Scanner keyboard = new Scanner(System.in);
        boolean exitAction = false;

        while (!exitAction) {

            int core_1 = (int) (Math.random() * 120 + 1);
            int core_2 = (int) (Math.random() * 82 + 1);
            int multithreading = (int) (Math.random() * 25 + 1);
            int sql = (int) (Math.random() * 28 + 1);
            int jpa_hibernate = (int) (Math.random() * 40 + 1);
            int spring = (int) (Math.random() * 33 + 1);
            int patterns = (int) (Math.random() * 16 + 1);
            int algorithms = (int) (Math.random() * 11 + 1);

            switch (block_str) {
                case "Core-1":
                    question = core_1;
                    break;
                case "Core-2":
                    question = core_2;
                    break;
                case "Многопоточность":
                    question = multithreading;



                    break;
                case "SQL":
                    question = sql;
                    break;
                case "Hibernate":
                    question = jpa_hibernate;
                    break;
                case "Spring":
                    question = spring;
                    break;
                case "Паттерны":
                    question = patterns;
                    break;
                case "Алгоритмы":
                    question = algorithms;
                    break;
            }

            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Раздел: " + block_str + ".");
            System.out.println("Вопрос: № " + question + ".");

            switch (block_str) {
                case "Core-1":
                    System.out.println(Questions.core_1.get(question - 1));
                    break;
                case "Core-2":
                    System.out.println(Questions.core_2.get(question - 1));
                    break;
                case "Многопоточность":
                    System.out.println(Questions.multithreading.get(question - 1));
                    break;
                case "SQL":
                    System.out.println(Questions.sql.get(question - 1));
                    break;
                case "Hibernate":
                    System.out.println(Questions.jpa_hibernate.get(question - 1));
                    break;
                case "Spring":
                    System.out.println(Questions.spring.get(question - 1));
                    break;
                case "Паттерны":
                    System.out.println(Questions.patterns.get(question - 1));
                    break;
                case "Алгоритмы":
                    System.out.println(Questions.algorithms.get(question - 1));
                    break;
            }
            Main.playSound("C:\\Windows\\Media\\Speech On.wav");
            Thread.sleep(200);

            String input = keyboard.nextLine();
            if(input != null) {
                if ("q".equals(input)) {
                    System.out.println("Едем дальше..");
                    exitAction = true;
                } else {
                    playSound("C:\\Windows\\Media\\Speech Sleep.wav");

                    switch (block_str) {
                        case "Core-1":
                            System.out.println(Core_1.core_1.get(question - 1));
                            break;
                        case "Core-2":
                            System.out.println(Core_2.core_2.get(question - 1));
                            break;
                        case "Многопоточность":
                            System.out.println(Multithreading.multithreading.get(question - 1));
                            break;
                        case "SQL":
                            System.out.println(SQL.sql.get(question - 1));
                            break;
                        case "Hibernate":
                            System.out.println(JPA_Hibernate.jpa_hibernate.get(question - 1));
                            break;
                        case "Spring":
                            System.out.println(Spring.spring.get(question - 1));
                            break;
                        case "Паттерны":
                            System.out.println(Patterns.patterns.get(question - 1));
                            break;
                        case "Алгоритмы":
                            System.out.println(Algorithms.algorithms.get(question - 1));
                            break;
                    }

                    keyboard.nextLine();
                }
            }
            block = (int) (Math.random()*9);
            switch (block){
                case 1: block_str = "Core-1";           break;
                case 2: block_str = "Core-2";           break;
                case 3: block_str = "Многопоточность";  break;
                case 4: block_str = "SQL";              break;
                case 5: block_str = "Hibernate";        break;
                case 6: block_str = "Spring";           break;
                case 7: block_str = "Паттерны";         break;
                case 8: block_str = "Алгоритмы";        break;
                default: System.out.println("");        break;
            }
        }
        keyboard.close();
    }
}
