package br.edu.ifbaiano.calculadora.view;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;



import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.ExtendedColor;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPTableFooter;
import com.itextpdf.text.pdf.PdfWriter;

public class GerarPDF_calc_porDia {
	
        private Document doc = null;
        private OutputStream os = null;
        private aplicacao j = null;
        private String urlImpressao = "";
		
        public GerarPDF_calc_porDia (aplicacao janela){ 
        	this.j = janela;
        }
        
        public void gerar () throws Exception{
        	try {
                //cria o documento tamanho A4, margens de 2,54cm
                doc = new Document(PageSize.A4, 72, 72, 72, 72);
    			
                //cria a stream de saída
                urlImpressao = j.getJTabbedPane().getTitleAt(1)+".pdf";
                os = new FileOutputStream(urlImpressao);
    			
                //associa a stream de saída ao 
                PdfWriter.getInstance(doc, os);
    			
                //abre o documento
                doc.open();

                //adiciona imagem logo ifbaiano
                Image img = Image.getInstance("if-baiano.jpg");
                img.setAbsolutePosition(64f, 750f);
                img.scaleAbsolute(200, 55);
                doc.add(img);
                
                //adiciona imagem logo MEC
                Image imgMEC = Image.getInstance("mec.jpg");
                imgMEC.setAbsolutePosition(440f, 755f);
                imgMEC.scaleAbsolute(80, 23);
                doc.add(imgMEC);
                
                //adiciona o texto ao PDF                
                /**
                 * titulo do documento
                 */
                // define uma fonte para o titulo do documento
                Font f = new Font(FontFamily.UNDEFINED, 14, Font.BOLD);
                // titulo
                Paragraph p1 = new Paragraph("Cálculo do Auxilio-Transporte", f);
                p1.setSpacingBefore(30);
                p1.setSpacingAfter(20);
                p1.setAlignment(Element.ALIGN_CENTER);
                //adiciona o titulo ao documento
                doc.add(p1);
                
                // cria a tabela
                PdfPTable table = new PdfPTable(2);
                table.setWidthPercentage(100);
                table.setSpacingAfter(30);
                
                // cabeçalho da tabela
                PdfPCell header = new PdfPCell(new Paragraph(j.getJTabbedPane().getTitleAt(1)));
                header.setBackgroundColor(BaseColor.LIGHT_GRAY);
                header.setColspan(2);
                header.setFixedHeight(30);
                header.setBorder(3);
                header.setVerticalAlignment(Element.ALIGN_MIDDLE);
                header.setHorizontalAlignment(Element.ALIGN_CENTER);

                /*header.setBorder(1);
                header.setBorderColorTop(BaseColor.LIGHT_GRAY);
                header.setBorderColorRight(BaseColor.LIGHT_GRAY);
                header.setBorderColorLeft(BaseColor.LIGHT_GRAY);*/
                // adiciona o cabeçalho na tabela
                table.addCell(header);
                
                // celula 1 da primeira linha, posição [0][0]
                //table.addCell("Vencimento Básico.: ");
                PdfPCell lbl1 = new PdfPCell(new Paragraph("Vencimento Básico.: "));
                lbl1.setHorizontalAlignment(Element.ALIGN_LEFT);
                lbl1.setFixedHeight(22);
                lbl1.setBorder(2);
                table.addCell(lbl1);
                
                // celula 2 da primeira linha, posição [0][1]
                PdfPCell vencimentoBasico = new PdfPCell(new Paragraph(j.getJMoneyTextField_vencimentoBasico2().getText()));
                vencimentoBasico.setHorizontalAlignment(Element.ALIGN_RIGHT);
                vencimentoBasico.setFixedHeight(22);
                vencimentoBasico.setBorder(2);
                table.addCell(vencimentoBasico);
                
                // celula 1 da segunda linha, posição [1][0]
                PdfPCell lbl2 = new PdfPCell(new Paragraph("Valor da Passagem Diária.:"));
                lbl2.setHorizontalAlignment(Element.ALIGN_LEFT);
                lbl2.setFixedHeight(22);
                lbl2.setBorder(2);
                table.addCell(lbl2);
                //table.addCell("Valor da Passagem Diária.:");
                
                // celula 2 da segunda linha, posição [1][1]
                PdfPCell valorDiario = new PdfPCell(new Paragraph(j.getJMoneyTextField_valorPassagem().getText()));
                valorDiario.setHorizontalAlignment(Element.ALIGN_RIGHT);
                valorDiario.setFixedHeight(22);
                valorDiario.setBorder(2);
                table.addCell(valorDiario);
                
                // celula 1 da terceira linha, posição [2][0]
                //table.addCell("Quantidade de deslocamento po Mês.:");
                PdfPCell lbl3 = new PdfPCell(new Paragraph("Quantidade de deslocamento po Mês.:"));
                lbl3.setHorizontalAlignment(Element.ALIGN_LEFT);
                lbl3.setFixedHeight(22);
                lbl3.setBorder(2);
                table.addCell(lbl3);
                
                // celula 2 da terceira linha, posição [2][1]
                PdfPCell qtdDeslocamento = new PdfPCell(new Paragraph(j.getJTextField_qtdDeslocamento2().getText()));
                qtdDeslocamento.setHorizontalAlignment(Element.ALIGN_RIGHT);
                qtdDeslocamento.setFixedHeight(22);
                qtdDeslocamento.setBorder(2);
                table.addCell(qtdDeslocamento);
                
                // celula 1 da terceira linha, posição [2][0]
                //table.addCell("Quantidade de passagens Diárias.:");
                PdfPCell lbl4 = new PdfPCell(new Paragraph("Quantidade de passagens Diárias.:"));
                lbl4.setHorizontalAlignment(Element.ALIGN_LEFT);
                lbl4.setFixedHeight(22);
                lbl4.setBorder(2);
                table.addCell(lbl4);
                
                // celula 2 da terceira linha, posição [2][1]                
                PdfPCell qtdDiario = new PdfPCell(new Paragraph("1"));
                qtdDiario.setHorizontalAlignment(Element.ALIGN_RIGHT);
                qtdDiario.setFixedHeight(22);
                qtdDiario.setBorder(2);
                table.addCell(qtdDiario);
                
                /**
                 * resultado do calculo
                 */
                // cria a tabela resultado do calculo
                PdfPTable tableR = new PdfPTable(2);
                tableR.setWidthPercentage(100);
                // cabecalho da tabela
                PdfPCell header2 = new PdfPCell(new Paragraph("Resultado"));
                header2.setBackgroundColor(BaseColor.LIGHT_GRAY);
                header2.setColspan(2);
                header2.setFixedHeight(30);
                header2.setBorder(3);
                header2.setVerticalAlignment(Element.ALIGN_MIDDLE);
                header2.setHorizontalAlignment(Element.ALIGN_CENTER);
                // adiciona o cabeçalho na tabela
                tableR.addCell(header2);
                
                // celula 1 da primeira linha, posição [0][0]
                //tableR.addCell("Valor a ser Descontado.: ");
                PdfPCell lbl5 = new PdfPCell(new Paragraph("Quant. Deslocamento X Valor Diário"));
                lbl5.setHorizontalAlignment(Element.ALIGN_LEFT);
                lbl5.setFixedHeight(22);
                lbl5.setBorder(2);
                tableR.addCell(lbl5);
                
                // celula 2 da primeira linha, posição [0][1]
                PdfPCell vlrDesconto = new PdfPCell(new Paragraph(j.getJMoneyTextField_valorReceber().getText()));
                vlrDesconto.setHorizontalAlignment(Element.ALIGN_RIGHT);
                vlrDesconto.setFixedHeight(22);
                vlrDesconto.setBorder(2);
                tableR.addCell(vlrDesconto);
                
                // celula 1 da segunda linha, posição [1][0]
                //tableR.addCell("Valor do Auxilio.: ");
                PdfPCell lbl6 = new PdfPCell(new Paragraph("Valor Mensal:"));
                lbl6.setHorizontalAlignment(Element.ALIGN_LEFT);
                lbl6.setFixedHeight(22);
                lbl6.setBorder(2);
                tableR.addCell(lbl6);
                
                // celula 2 da segunda linha, posição [1][1]
                PdfPCell vlrAuxilio = new PdfPCell(new Paragraph(j.getJMoneyTextField_valorMensal().getText()));
                vlrAuxilio.setHorizontalAlignment(Element.ALIGN_RIGHT);
                vlrAuxilio.setFixedHeight(22);
                vlrAuxilio.setBorder(2);
                tableR.addCell(vlrAuxilio);
                
                // celula 1 da terceira linha, posição [2][0]
                //tableR.addCell("Valor a Receber.:");
                PdfPCell lbl7 = new PdfPCell(new Paragraph("Valor Mensal/22.: "));
                lbl7.setHorizontalAlignment(Element.ALIGN_LEFT);
                lbl7.setFixedHeight(22);
                lbl7.setBorder(2);
                tableR.addCell(lbl7);
                
                // celula 2 da terceira linha, posição [2][1]
                PdfPCell vlrReceber = new PdfPCell(new Paragraph(j.getJMoneyTextField_valorMensal_22().getText()));
                vlrReceber.setHorizontalAlignment(Element.ALIGN_RIGHT);
                vlrReceber.setFixedHeight(22);
                vlrReceber.setBorder(2);
                tableR.addCell(vlrReceber);
                
                // celula 1 da terceira linha, posição [2][0]
                //tableR.addCell("Valor a Receber.:");
                PdfPCell lbl8 = new PdfPCell(new Paragraph("Valor Lançado no Sistema.: "));
                lbl8.setHorizontalAlignment(Element.ALIGN_LEFT);
                lbl8.setFixedHeight(22);
                lbl8.setBorder(2);
                tableR.addCell(lbl8);
                
                // celula 2 da terceira linha, posição [2][1]
                PdfPCell vlrSistema = new PdfPCell(new Paragraph(j.getJMoneyTextField_valorSistema().getText()));
                vlrSistema.setHorizontalAlignment(Element.ALIGN_RIGHT);
                vlrSistema.setFixedHeight(22);
                vlrSistema.setBorder(2);
                tableR.addCell(vlrSistema);   
                
                // pegar a data e hora do sistema
                PdfPTableFooter footer = new PdfPTableFooter();
                
                //adiciona ao documento as tabelas
                doc.add(table);
                doc.add(tableR);
            } finally {
                if (doc != null) {
                    //fechamento do documento
                    doc.close();
                }
                if (os != null) {
                   //fechamento da stream de saída
                   os.close();
                }
                Desktop.getDesktop().open(new File (urlImpressao));
            }
        }
}