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
 * All algorithms must have these methods to allow Melee Manager to execute the
 * tournament.
 *
 * @author Luis Guisso &lt;luis.guisso at ifnmg.edu.br&gt;
 * @version 0.1
 * @since 0.1, 2025-03-11
 */
public interface IPlayer {

    /**
     * Used on the Melee Manager to display the competitor's name
     *
     * @return Competitor name
     */
    String getDeveloperName();

    /**
     * Used on the Melee Manager to display the engine's name
     *
     * @return Engine name
     */
    String getEngineName();

    /**
     * Action to be taken under another decision.
     *
     * @param opponentPreviousMove Opponent previous movement
     * @return My decision
     */
    Decision makeMyMove(Decision opponentPreviousMove);

}
