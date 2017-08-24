package main;

import joptsimple.OptionParser;

/**
 * Created by sarahgilmore on 8/24/17.
 * main file
 */
public final class Main {

    public static void main(String[] args) {
        new Main(args).run();
    }

    private String args[];

    private Main(String[] args) {
        this.args = args;
    }

    private void run() {
        OptionParser parser = new OptionParser();
    }

}
