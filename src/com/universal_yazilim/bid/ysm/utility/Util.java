package com.universal_yazilim.bid.ysm.utility;

import javax.swing.*;


public final class Util
{
    private Util() {}

    public static void showInfoMessage(Object message)
    {
        JOptionPane.showMessageDialog(null, message, "Info Message", JOptionPane.INFORMATION_MESSAGE);
    }
}
