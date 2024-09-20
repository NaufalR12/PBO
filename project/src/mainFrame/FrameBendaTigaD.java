package mainFrame;

import G3D.*;

public class FrameBendaTigaD extends javax.swing.JInternalFrame {

    public FrameBendaTigaD() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        outputHasil = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sisi1 = new javax.swing.JLabel();
        sisi2 = new javax.swing.JLabel();
        inputComboBoxJenis2 = new javax.swing.JComboBox<>();
        sisi3 = new javax.swing.JLabel();
        prosesButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        inputSatu = new javax.swing.JTextField();
        inputDua = new javax.swing.JTextField();
        inputTiga = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sisi4 = new javax.swing.JLabel();
        inputEmpat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        outputHasil2 = new javax.swing.JTextField();

        setClosable(true);
        setTitle("3 Dimensi");
        setPreferredSize(new java.awt.Dimension(650, 397));

        outputHasil.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Jenis ");

        sisi1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sisi1.setText("-");

        sisi2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sisi2.setText("-");

        inputComboBoxJenis2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inputComboBoxJenis2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis", "Bola", "Kerucut", "Kubus", "Limas Persegi", "Limas Segitiga", "Prisma Belahketupat", "Prisma Jajargenjang", "Prisma Layang-layang", "Prisma Persegi", "Prisma Segiempat", "Prisma Segitiga", "Prisma Trapesium", "Tabung" }));
        inputComboBoxJenis2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputComboBoxJenis2ActionPerformed(evt);
            }
        });

        sisi3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sisi3.setText("-");

        prosesButton.setText("Proses");
        prosesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Benda 3 Dimensi");

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        inputSatu.setEnabled(false);
        inputSatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSatuActionPerformed(evt);
            }
        });

        inputDua.setEnabled(false);

        inputTiga.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Volume");

        sisi4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sisi4.setText("-");

        inputEmpat.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Luas Permukaan");

        outputHasil2.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputSatu)
                            .addComponent(inputDua)
                            .addComponent(inputTiga)
                            .addComponent(inputEmpat)
                            .addComponent(inputComboBoxJenis2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(sisi4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sisi1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(sisi2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sisi3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(outputHasil, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(outputHasil2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)))
                        .addComponent(prosesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputComboBoxJenis2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sisi1)
                    .addComponent(inputSatu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sisi2)
                    .addComponent(inputDua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sisi3)
                    .addComponent(inputTiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sisi4)
                    .addComponent(inputEmpat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(outputHasil2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton)
                    .addComponent(prosesButton)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        getAccessibleContext().setAccessibleName("3D Object");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputComboBoxJenis2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputComboBoxJenis2ActionPerformed
        switch (inputComboBoxJenis2.getSelectedIndex()) {
            case 0:
                inputTiga.setEnabled(false);
                inputSatu.setEnabled(false);
                inputDua.setEnabled(false);
                inputEmpat.setEnabled(false);
                sisi1.setText("-");
                sisi2.setText("-");
                sisi3.setText("-");
                sisi4.setText("-");
                inputTiga.setText("");
                inputSatu.setText("");
                inputDua.setText("");
                inputEmpat.setText("");
                outputHasil.setText("");
                outputHasil2.setText("");
                break;
            case 1:// Bola --
                inputTiga.setEnabled(false);
                inputSatu.setEnabled(true);
                inputDua.setEnabled(false);
                inputEmpat.setEnabled(false);
                sisi1.setText("Jari-jari");
                sisi2.setText("-");
                sisi3.setText("-");
                sisi4.setText("-");
                inputTiga.setText("");
                inputSatu.setText("");
                inputDua.setText("");
                inputEmpat.setText("");
                outputHasil.setText("");
                outputHasil2.setText("");
                break;
            case 2: //Kerucut --
                inputTiga.setEnabled(false);
                inputSatu.setEnabled(true);
                inputDua.setEnabled(true);
                inputEmpat.setEnabled(false);
                sisi1.setText("Jari-jari");
                sisi2.setText("Tinggi Kerucut");
                sisi3.setText("-");
                sisi4.setText("-");
                inputTiga.setText("");
                inputSatu.setText("");
                inputDua.setText("");
                inputEmpat.setText("");
                outputHasil.setText("");
                outputHasil2.setText("");
                break;
            case 3: // Kubus --
                inputTiga.setEnabled(false);
                inputSatu.setEnabled(true);
                inputDua.setEnabled(false);
                inputEmpat.setEnabled(false);
                sisi1.setText("Sisi");
                sisi2.setText("-");
                sisi3.setText("-");
                sisi4.setText("-");
                inputTiga.setText("");
                inputSatu.setText("");
                inputDua.setText("");
                inputEmpat.setText("");
                outputHasil.setText("");
                outputHasil2.setText("");
                break;

            case 4: //limas persegi --
                inputTiga.setEnabled(false);
                inputSatu.setEnabled(true);
                inputDua.setEnabled(true);
                inputEmpat.setEnabled(false);
                sisi1.setText("Sisi");
                sisi2.setText("Tinggi Limas");
                sisi3.setText("-");
                sisi4.setText("-");
                inputTiga.setText("");
                inputSatu.setText("");
                inputDua.setText("");
                inputEmpat.setText("");
                outputHasil.setText("");
                outputHasil2.setText("");
                break;
            case 5: // limas segitiga --
                inputTiga.setEnabled(true);
                inputSatu.setEnabled(true);
                inputDua.setEnabled(true);
                inputEmpat.setEnabled(false);
                sisi1.setText("Alas");
                sisi2.setText("Tinggi");
                sisi3.setText("Tinggi limas");
                sisi4.setText("-");
                inputTiga.setText("");
                inputSatu.setText("");
                inputDua.setText("");
                inputEmpat.setText("");
                outputHasil.setText("");
                outputHasil2.setText("");
                break;

             case 6: // prisma BelahKetupat --
                inputTiga.setEnabled(true);
                inputSatu.setEnabled(true);
                inputDua.setEnabled(true);
                inputEmpat.setEnabled(false);
                sisi1.setText("Diagonal 1");
                sisi2.setText("Diagonal 2");
                sisi3.setText("Tinggi Prisma");
                sisi4.setText("-");
                inputTiga.setText("");
                inputSatu.setText("");
                inputDua.setText("");
                inputEmpat.setText("");
                outputHasil.setText("");
                outputHasil2.setText("");
                break;  
                
            case 7: // prisma jajargenjang --
                inputTiga.setEnabled(true);
                inputSatu.setEnabled(true);
                inputDua.setEnabled(true);
                inputEmpat.setEnabled(false);
                sisi1.setText("Alas");
                sisi2.setText("Tinggi");
                sisi3.setText("Tinggi Prisma");
                sisi4.setText("-");
                inputTiga.setText("");
                inputSatu.setText("");
                inputDua.setText("");
                inputEmpat.setText("");
                outputHasil.setText("");
                outputHasil2.setText("");
                break;
            case 8: // Prisma Layang --
                inputTiga.setEnabled(true);
                inputSatu.setEnabled(true);
                inputDua.setEnabled(true);
                inputEmpat.setEnabled(false);
                sisi1.setText("Diagonal 1");
                sisi2.setText("Diagonal 2");
                sisi3.setText("Tinggi Prisma");
                sisi4.setText("-");
                inputTiga.setText("");
                inputSatu.setText("");
                inputDua.setText("");
                inputEmpat.setText("");
                outputHasil.setText("");
                outputHasil2.setText("");
                break;
            case 9: // Prisma Persegi --
                inputTiga.setEnabled(false);
                inputSatu.setEnabled(true);
                inputDua.setEnabled(true);
                inputEmpat.setEnabled(false);
                sisi1.setText("Sisi");
                sisi2.setText("Tinggi Prisma");
                sisi3.setText("-");
                sisi4.setText("-");
                inputTiga.setText("");
                inputSatu.setText("");
                inputDua.setText("");
                inputEmpat.setText("");
                outputHasil.setText("");
                outputHasil2.setText("");
                break;

            case 10: // Prisma segiempat --
                inputTiga.setEnabled(true);
                inputSatu.setEnabled(true);
                inputDua.setEnabled(true);
                inputEmpat.setEnabled(false);
                sisi1.setText("Panjang");
                sisi2.setText("Lebar");
                sisi3.setText("Tinggi Prisma");
                sisi4.setText("-");
                inputTiga.setText("");
                inputSatu.setText("");
                inputDua.setText("");
                inputEmpat.setText("");
                outputHasil.setText("");
                outputHasil2.setText("");
                break;

            case 11: // Prisma segitiga --
                inputTiga.setEnabled(true);
                inputSatu.setEnabled(true);
                inputDua.setEnabled(true);
                inputEmpat.setEnabled(false);
                sisi1.setText("Alas");
                sisi2.setText("Tinggi");
                sisi3.setText("Tinggi Prisma");
                sisi4.setText("-");
                inputTiga.setText("");
                inputSatu.setText("");
                inputDua.setText("");
                inputEmpat.setText("");
                outputHasil.setText("");
                outputHasil2.setText("");
                break;

            case 12: // prisma trapesium--
                inputTiga.setEnabled(true);
                inputSatu.setEnabled(true);
                inputDua.setEnabled(true);
                inputEmpat.setEnabled(true);
                sisi1.setText("Sisi 1");
                sisi2.setText("Sisi 2");
                sisi3.setText("Tinggi");
                sisi4.setText("Tinggi Prisma");
                inputTiga.setText("");
                inputSatu.setText("");
                inputDua.setText("");
                inputEmpat.setText("");
                outputHasil.setText("");
                outputHasil2.setText("");
                break;
                
            case 13: // Tabung--
                inputTiga.setEnabled(false);
                inputSatu.setEnabled(true);
                inputDua.setEnabled(true);
                inputEmpat.setEnabled(false);
                sisi1.setText("Jari-jari");
                sisi2.setText("Tinggi Tabung");
                sisi3.setText("-");
                sisi4.setText("-");
                inputTiga.setText("");
                inputSatu.setText("");
                inputDua.setText("");
                inputEmpat.setText("");
                outputHasil.setText("");
                outputHasil2.setText("");
                break;

        }
    }//GEN-LAST:event_inputComboBoxJenis2ActionPerformed

    private void prosesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesButtonActionPerformed
        double nilaiSatu, nilaiDua, nilaiTiga, nilaiEmpat, Hasil, Hasil2; 
        
        switch (inputComboBoxJenis2.getSelectedIndex()) {
            case 1:
                nilaiSatu = Double.parseDouble(inputSatu.getText());
                Bola bola = new Bola(nilaiSatu);
                Hasil = bola.hitungVolume();
                Hasil2 = bola.hitungLuasPermukaan(); 
                outputHasil.setText("" + Hasil);
                outputHasil2.setText("" + Hasil2);
                break;
            case 2:
                nilaiSatu = Double.parseDouble(inputSatu.getText());
                nilaiDua = Double.parseDouble(inputDua.getText());
                Kerucut kerucut = new Kerucut(nilaiSatu, nilaiDua);
                Hasil = kerucut.hitungVolume();
                Hasil2 = kerucut.hitungLuasPermukaan();
                outputHasil.setText("" + Hasil);
                outputHasil2.setText("" + Hasil2);
                break;
            case 3:
                nilaiSatu = Double.parseDouble(inputSatu.getText());
                Kubus kubus = new Kubus(nilaiSatu);
                Hasil = kubus.hitungVolume();
                Hasil2 = kubus.hitungLuasPermukaan();
                outputHasil.setText("" + Hasil);
                outputHasil2.setText("" + Hasil2);
                break;
//            case 4:
//                nilaiSatu = Double.parseDouble(inputSatu.getText());
//                nilaiDua = Double.parseDouble(inputDua.getText());
//                nilaiTiga = Double.parseDouble(inputTiga.getText());
//                LimasBelahketupat limasBelahketupat = new LimasBelahketupat(nilaiSatu, nilaiDua, nilaiTiga);
//                Hasil = limasBelahketupat.hitungVolume();
//                outputHasil.setText("" + Hasil);
//                break;
//            case 5:
//                nilaiSatu = Double.parseDouble(inputSatu.getText());
//                nilaiDua = Double.parseDouble(inputDua.getText());
//                nilaiTiga = Double.parseDouble(inputTiga.getText());
//                LimasJajargenjang limasJajargenjang = new LimasJajargenjang(nilaiSatu, nilaiDua, nilaiTiga);
//                Hasil = limasJajargenjang.hitungVolume();
//                outputHasil.setText("" + Hasil);
//                break;
//            case 6:
//                nilaiSatu = Double.parseDouble(inputSatu.getText());
//                nilaiDua = Double.parseDouble(inputDua.getText());
//                nilaiTiga = Double.parseDouble(inputTiga.getText());
//                LimasLayang2 limasLayang2 = new LimasLayang2(nilaiSatu, nilaiDua, nilaiTiga);
//                Hasil = limasLayang2.hitungVolume();
//                outputHasil.setText("" + Hasil);
//                break;
            case 4:
                nilaiSatu = Double.parseDouble(inputSatu.getText());
                nilaiDua = Double.parseDouble(inputDua.getText());
                LimasPersegi limaspersegi = new LimasPersegi(nilaiSatu, nilaiDua);
                Hasil = limaspersegi.hitungVolume();
                Hasil2 = limaspersegi.hitungLuasPermukaan();
                outputHasil.setText("" + Hasil);
                outputHasil2.setText("" + Hasil2);
                break;
            case 5:
                nilaiSatu = Double.parseDouble(inputSatu.getText());
                nilaiDua = Double.parseDouble(inputDua.getText());
                nilaiTiga = Double.parseDouble(inputTiga.getText());
                LimasSegitiga limasSegitiga = new LimasSegitiga(nilaiSatu, nilaiDua, nilaiTiga);
                Hasil = limasSegitiga.hitungVolume();
                Hasil2 = limasSegitiga.hitungLuasPermukaan();
                outputHasil.setText("" + Hasil);
                outputHasil2.setText("" + Hasil2);
                break;
//            case 9:
//                nilaiSatu = Double.parseDouble(inputSatu.getText());
//                nilaiDua = Double.parseDouble(inputDua.getText());
//                nilaiTiga = Double.parseDouble(inputTiga.getText());
//                nilaiEmpat = Double.parseDouble(inputEmpat.getText());
//                LimasTrapesium limasTrapesium = new LimasTrapesium(nilaiSatu, nilaiDua, nilaiTiga, nilaiEmpat);
//                Hasil = limasTrapesium.hitungVolume();
//                outputHasil.setText("" + Hasil);
//                break;
            case 6:
                nilaiSatu = Double.parseDouble(inputSatu.getText());
                nilaiDua = Double.parseDouble(inputDua.getText());
                nilaiTiga = Double.parseDouble(inputTiga.getText());
                PrismaBelahketupat prismaBelahketupat = new PrismaBelahketupat(nilaiSatu, nilaiDua, nilaiTiga);
                Hasil = prismaBelahketupat.hitungVolume();
                Hasil2 = prismaBelahketupat.hitungLuasPermukaan();
                outputHasil.setText("" + Hasil);
                outputHasil2.setText("" + Hasil2);
                break;
            case 7:
                nilaiSatu = Double.parseDouble(inputSatu.getText());
                nilaiDua = Double.parseDouble(inputDua.getText());
                nilaiTiga = Double.parseDouble(inputTiga.getText());
                PrismaJajargenjang prismaJajargenjang = new PrismaJajargenjang(nilaiSatu, nilaiDua, nilaiTiga);
                Hasil = prismaJajargenjang.hitungVolume();
                Hasil2 = prismaJajargenjang.hitungLuasPermukaan();
                outputHasil.setText("" + Hasil);
                outputHasil2.setText("" + Hasil2);
                break;
            case 8:
                nilaiSatu = Double.parseDouble(inputSatu.getText());
                nilaiDua = Double.parseDouble(inputDua.getText());
                nilaiTiga = Double.parseDouble(inputTiga.getText());
                PrismaLayang2 prismaLayang2 = new PrismaLayang2(nilaiSatu, nilaiDua, nilaiTiga);
                Hasil = prismaLayang2.hitungVolume();
                Hasil2 = prismaLayang2.hitungLuasPermukaan();
                outputHasil.setText("" + Hasil);
                outputHasil2.setText("" + Hasil2);
                break;
            case 9:
                nilaiSatu = Double.parseDouble(inputSatu.getText());
                nilaiDua = Double.parseDouble(inputDua.getText());
                PrismaPersegi prismaPersegi = new PrismaPersegi(nilaiSatu, nilaiDua);
                Hasil = prismaPersegi.hitungVolume();
                Hasil2 = prismaPersegi.hitungLuasPermukaan();
                outputHasil.setText("" + Hasil);
                outputHasil2.setText("" + Hasil2);
                break;
            case 10:
                nilaiSatu = Double.parseDouble(inputSatu.getText());
                nilaiDua = Double.parseDouble(inputDua.getText());
                nilaiTiga = Double.parseDouble(inputTiga.getText());
                PrismaSegi4 prismaSegi4 = new PrismaSegi4(nilaiSatu, nilaiDua, nilaiTiga);
                Hasil = prismaSegi4.hitungVolume();
                Hasil2 = prismaSegi4.hitungLuasPermukaan();
                outputHasil.setText("" + Hasil);
                outputHasil2.setText("" + Hasil2);
                break;
            case 11:
                nilaiSatu = Double.parseDouble(inputSatu.getText());
                nilaiDua = Double.parseDouble(inputDua.getText());
                nilaiTiga = Double.parseDouble(inputTiga.getText());
                PrismaSegitiga prismaSegitiga = new PrismaSegitiga(nilaiSatu, nilaiDua, nilaiTiga);
                Hasil = prismaSegitiga.hitungVolume();
                Hasil2 = prismaSegitiga.hitungLuasPermukaan();
                outputHasil.setText("" + Hasil);
                outputHasil2.setText("" + Hasil2);
                break;
            case 12:
                nilaiSatu = Double.parseDouble(inputSatu.getText());
                nilaiDua = Double.parseDouble(inputDua.getText());
                nilaiTiga = Double.parseDouble(inputTiga.getText());
                nilaiEmpat = Double.parseDouble(inputEmpat.getText());
                PrismaTrapesium prismaTrapesium = new PrismaTrapesium(nilaiSatu, nilaiDua, nilaiTiga, nilaiEmpat);
                Hasil = prismaTrapesium.hitungVolume();
                Hasil2 = prismaTrapesium.hitungLuasPermukaan();
                outputHasil.setText("" + Hasil);
                outputHasil2.setText("" + Hasil2);
                break;
            case 13:
                nilaiSatu = Double.parseDouble(inputSatu.getText());
                nilaiDua = Double.parseDouble(inputDua.getText());
                Tabung tabung = new Tabung(nilaiSatu, nilaiDua);
                Hasil = tabung.hitungVolume();
                Hasil2 = tabung.hitungLuasPermukaan();
                outputHasil.setText("" + Hasil);
                outputHasil2.setText("" + Hasil2);
                break;
        }
    }//GEN-LAST:event_prosesButtonActionPerformed

    private void inputSatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSatuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSatuActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        inputTiga.setText("");
        inputSatu.setText("");
        inputDua.setText("");
        outputHasil.setText("");
        outputHasil2.setText("");
        inputEmpat.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JComboBox<String> inputComboBoxJenis2;
    private javax.swing.JTextField inputDua;
    private javax.swing.JTextField inputEmpat;
    private javax.swing.JTextField inputSatu;
    private javax.swing.JTextField inputTiga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField outputHasil;
    private javax.swing.JTextField outputHasil2;
    private javax.swing.JButton prosesButton;
    private javax.swing.JLabel sisi1;
    private javax.swing.JLabel sisi2;
    private javax.swing.JLabel sisi3;
    private javax.swing.JLabel sisi4;
    // End of variables declaration//GEN-END:variables
}
