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
 *
 * @author Luis Guisso &lt;luis.guisso at ifnmg.edu.br&gt;
 */
public enum Decision {
    // On the first decision-making
    NONE(0, "No action"),
    // Cooperate for mutual benefit
    COOPERATE(1, "Cooperate"),
    // Betraying the other
    DEFECT(2, "Defect");

    public final int value;
    public final String information;

    Decision(int value, String information) {
        this.value = value;
        this.information = information;
    }

    public int getValue() {
        return value;
    }

    public String getInformation() {
        return information;
    }

    public static Decision byValue(int value) {
        for (Decision decision : Decision.values()) {
            if (decision.getValue() == value) {
                return decision;
            }
        }
        throw new IllegalArgumentException("Invalid value " + value);
    }
}
