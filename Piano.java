/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thirdclass;

import sun.audio.*;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author MAHBUB
 */
public class Piano extends javax.swing.JFrame {

    /**
     * Creates new form Piano
     */
    public Piano() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        F = new javax.swing.JButton();
        A = new javax.swing.JButton();
        G = new javax.swing.JButton();
        D = new javax.swing.JButton();
        C = new javax.swing.JButton();
        E = new javax.swing.JButton();
        F_Sharp = new javax.swing.JButton();
        G_Sharp = new javax.swing.JButton();
        C_Sharp = new javax.swing.JButton();
        Bb = new javax.swing.JButton();
        D_Sharp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(557, 550));
        setResizable(false);

        B.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B.setText("B");
        B.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 102), null, new java.awt.Color(204, 204, 204)));
        B.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });
        B.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("   Simple Piano");

        F.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        F.setText("F");
        F.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 102), null, new java.awt.Color(204, 204, 204)));
        F.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        F.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FActionPerformed(evt);
            }
        });
        F.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FKeyTyped(evt);
            }
        });

        A.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        A.setText("A");
        A.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 102), null, new java.awt.Color(204, 204, 204)));
        A.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });
        A.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AKeyTyped(evt);
            }
        });

        G.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        G.setText("G");
        G.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 102), null, new java.awt.Color(204, 204, 204)));
        G.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        G.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        G.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                GStateChanged(evt);
            }
        });
        G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GActionPerformed(evt);
            }
        });
        G.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                GKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                GKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                GKeyTyped(evt);
            }
        });

        D.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        D.setText("D");
        D.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 102), null, new java.awt.Color(204, 204, 204)));
        D.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        D.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });
        D.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DKeyTyped(evt);
            }
        });

        C.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        C.setText("C");
        C.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 102), null, new java.awt.Color(204, 204, 204)));
        C.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });
        C.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CKeyTyped(evt);
            }
        });

        E.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        E.setText("E");
        E.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 102), null, new java.awt.Color(204, 204, 204)));
        E.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        E.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EActionPerformed(evt);
            }
        });
        E.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EKeyTyped(evt);
            }
        });

        F_Sharp.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        F_Sharp.setText("F#");
        F_Sharp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 102), null, new java.awt.Color(204, 204, 204)));
        F_Sharp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        F_Sharp.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        F_Sharp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_SharpActionPerformed(evt);
            }
        });
        F_Sharp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                F_SharpKeyTyped(evt);
            }
        });

        G_Sharp.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        G_Sharp.setText("G#");
        G_Sharp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 102), null, new java.awt.Color(204, 204, 204)));
        G_Sharp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        G_Sharp.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        G_Sharp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G_SharpActionPerformed(evt);
            }
        });
        G_Sharp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                G_SharpKeyPressed(evt);
            }
        });

        C_Sharp.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        C_Sharp.setText("C#");
        C_Sharp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 102), null, new java.awt.Color(204, 204, 204)));
        C_Sharp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C_Sharp.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        C_Sharp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_SharpActionPerformed(evt);
            }
        });

        Bb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Bb.setText("Bb");
        Bb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 102), null, new java.awt.Color(204, 204, 204)));
        Bb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bb.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Bb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbActionPerformed(evt);
            }
        });
        Bb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BbKeyPressed(evt);
            }
        });

        D_Sharp.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        D_Sharp.setText("D#");
        D_Sharp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 102), null, new java.awt.Color(204, 204, 204)));
        D_Sharp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        D_Sharp.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        D_Sharp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_SharpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(C_Sharp)
                                .addGap(18, 18, 18)
                                .addComponent(D_Sharp)
                                .addGap(18, 18, 18)
                                .addComponent(Bb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(23, 23, 23)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(F_Sharp)
                                .addGap(18, 18, 18)
                                .addComponent(G_Sharp))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(G, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C_Sharp, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D_Sharp, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bb, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F_Sharp, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G_Sharp, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(G, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        InputStream iAudio;
        try {
            iAudio = new FileInputStream(new File("I:\\Sound\\B.wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BActionPerformed

    private void FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FActionPerformed
        InputStream iAudio;
        try {
            iAudio = new FileInputStream(new File("I:\\Sound\\F.wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_FActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        InputStream iAudio;
        try {
            iAudio = new FileInputStream(new File("I:\\Sound\\A.wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_AActionPerformed

    private void GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GActionPerformed
        InputStream iAudio;
        try {
            iAudio = new FileInputStream(new File("I:\\Sound\\G#.wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_GActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        InputStream iAudio;
        try {
            iAudio = new FileInputStream(new File("I:\\Sound\\D.wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_DActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        InputStream iAudio;
        try {
            iAudio = new FileInputStream(new File("I:\\Sound\\C.wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_CActionPerformed

    private void EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EActionPerformed
        InputStream iAudio;
        try {
            iAudio = new FileInputStream(new File("I:\\Sound\\E.wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_EActionPerformed

    private void F_SharpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_SharpActionPerformed
        InputStream iAudio;
        try {
            iAudio = new FileInputStream(new File("I:\\Sound\\F#.wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_F_SharpActionPerformed

    private void G_SharpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G_SharpActionPerformed
        InputStream iAudio;
        try {
            iAudio = new FileInputStream(new File("I:\\Sound\\G#.wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_G_SharpActionPerformed

    private void C_SharpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_SharpActionPerformed
        InputStream iAudio;
        try {
            iAudio = new FileInputStream(new File("I:\\Sound\\C#.wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_C_SharpActionPerformed

    private void BbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbActionPerformed
        InputStream iAudio;
        try {
            iAudio = new FileInputStream(new File("I:\\Sound\\Bb.wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BbActionPerformed

    private void D_SharpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_SharpActionPerformed
        InputStream iAudio;
        try {
            iAudio = new FileInputStream(new File("I:\\Sound\\D#.wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_D_SharpActionPerformed

    private void BbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BbKeyPressed

    }//GEN-LAST:event_BbKeyPressed

    private void F_SharpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F_SharpKeyTyped

    }//GEN-LAST:event_F_SharpKeyTyped

    private void FKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FKeyTyped
        InputStream iAudio;
        try {
            iAudio = new FileInputStream(new File("I:\\Sound\\F.wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_FKeyTyped

    private void AKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AKeyTyped
        InputStream iAudio;
        try {
            iAudio = new FileInputStream(new File("I:\\Sound\\A.wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_AKeyTyped

    private void BKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BKeyTyped
        InputStream iAudio;
        try {
            iAudio = new FileInputStream(new File("I:\\Sound\\B.wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BKeyTyped

    private void CKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CKeyTyped
        InputStream iAudio;
        try {
            iAudio = new FileInputStream(new File("I:\\Sound\\C.wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_CKeyTyped

    private void DKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DKeyTyped
        InputStream iAudio;
        try {
            iAudio = new FileInputStream(new File("I:\\Sound\\D.wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_DKeyTyped

    private void EKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EKeyTyped
        InputStream iAudio;
        try {
            iAudio = new FileInputStream(new File("I:\\Sound\\E.wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_EKeyTyped

    private void GKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GKeyTyped
        InputStream iAudio;
        try {
            iAudio = new FileInputStream(new File("I:\\Sound\\G.wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_GKeyTyped

    private void G_SharpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_G_SharpKeyPressed
        InputStream iAudio;
        try {
            iAudio = new FileInputStream(new File("I:\\Sound\\G#.wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_G_SharpKeyPressed

    private void GKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GKeyReleased
        InputStream iAudio;
        try {
            iAudio = new FileInputStream(new File("I:\\Sound\\G.wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_GKeyReleased

    private void GKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GKeyPressed
        InputStream iAudio;
        try {
            iAudio = new FileInputStream(new File("I:\\Sound\\G.wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_GKeyPressed

    private void AKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AKeyPressed
        InputStream iAudio;
        try {
            iAudio = new FileInputStream(new File("I:\\Sound\\A.wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_AKeyPressed

    private void AKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AKeyReleased
       InputStream iAudio;
        try {
            iAudio = new FileInputStream(new File("I:\\Sound\\A.wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_AKeyReleased

    private void GStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_GStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_GStateChanged

    private void BKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BKeyPressed
        InputStream iAudio;
        try {
            iAudio = new FileInputStream(new File("I:\\Sound\\B.wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BKeyPressed

    private void BKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BKeyReleased
        InputStream iAudio;
        try {
            iAudio = new FileInputStream(new File("I:\\Sound\\B.wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BKeyReleased

    private void CKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CKeyReleased
        InputStream iAudio;
        try {
            iAudio = new FileInputStream(new File("I:\\Sound\\C.wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_CKeyReleased

    private void CKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CKeyPressed
       InputStream iAudio;
        try {
            iAudio = new FileInputStream(new File("I:\\Sound\\C.wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_CKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Piano().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton B;
    private javax.swing.JButton Bb;
    private javax.swing.JButton C;
    private javax.swing.JButton C_Sharp;
    private javax.swing.JButton D;
    private javax.swing.JButton D_Sharp;
    private javax.swing.JButton E;
    private javax.swing.JButton F;
    private javax.swing.JButton F_Sharp;
    private javax.swing.JButton G;
    private javax.swing.JButton G_Sharp;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
