/*
 * The MIT License
 *
 * Copyright 2025 Luis Guisso &lt;luis.guisso at ifnmg.edu.br&gt;.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package io.github.guisso.meleeinterface;

/**
 * The possible payoffs.
 *
 * @author Luis Guisso &lt;luis.guisso at ifnmg.edu.br&gt;
 * @version 0.1
 * @since 0.1, 2025-03-11
 */
public enum Payoff {

    SUCKER(0, "You cooperate and the other defect = Sucker is 0"),
    PUNISHMENT(1, "Both defects = Punishment is 1"),
    REWARD(3, "Both cooperate = Reward is 3"),
    TEMPTATION(5, "You defect and the other cooperates = Temptation is 5");

    public final int value;
    public final String information;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    Payoff(int value, String information) {
        this.value = value;
        this.information = information;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public int getValue() {
        return value;
    }

    public String getInformation() {
        return information;
    }

    public static Payoff byValue(int value) {
        for (Payoff payoff : Payoff.values()) {
            if (payoff.getValue() == value) {
                return payoff;
            }
        }
        throw new IllegalArgumentException("Invalid value " + value);
    }
    //</editor-fold>

}
