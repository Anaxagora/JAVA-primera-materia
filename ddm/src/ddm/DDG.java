package ddm;

import javax.swing.*;

class DDG {

	public static void main(String[] args) {
		int [][] lv1 = {{1,2,0,0,0,0},{0,3,0,0,0,0},{0,4,0,0,0,0},{0,5,6,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
		int [][] lv2 = {{0,0,0,0,0,0},{0,6,0,0,0,0},{0,5,0,0,0,0},{3,4,0,0,0,0},{2,0,0,0,0,0},{1,0,0,0,0,0}};
		int [][] lv3 = {{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,6,0,0},{0,0,0,5,4,0},{0,0,0,0,3,2},{0,0,0,0,0,1}};
		int lv,r,v;
		String again;
	
		JOptionPane.showMessageDialog(null, "El juego consta en adivinar como Duke Duvlin (DD) abrió y desplegó las 6 caras de un cubo.\nTe desafía a adivinar el recorrido secuencial de este despliegue. "
				+ "\nPara indicarle a DD donde crees que está la siguiente cara del cubo: \nLa celdas tiene una coordenada compuestas por un valor X y otro Y - EJEMPLO:(X;Y). \n Primero deberas ingresar el Numero que representa X y en la pantalla siguiente, el numero que representa Y"
				+ "\n - Contas con un mapa de coordenadas al estilo batalla naval."
				+ "\n - En todos los niveles DD te ayuda señalandote donde está la primera cara del dado."
				+ "\n - Recuerda que todas las caras deben estar unidas y que sólo tienes 3 vidas. \n - Ganarás cuando completes los 6 pasos del recorrido", "Dungeon Dice Game", JOptionPane.DEFAULT_OPTION,new ImageIcon(DDG.class.getResource("/img/reg.png")));
	do {
	lv=Integer.parseInt(JOptionPane.showInputDialog("¿En que nivel desea jugar? \n1) FACIL \n2) INTERMEDIO \n3) DIFICIL"));
	r=2;
	v=3;
	switch (lv) {
	case 1:
		JOptionPane.showMessageDialog(null, "DD le revela el PASO 1, desde aqui comienza a desdoblar el dado", "Dungeon Dice Game", JOptionPane.DEFAULT_OPTION,new ImageIcon(DDG.class.getResource("/img/11.png")));
		for (int i = 1; v>=1; i++) {
			for (int j = 1; v>=1; j++) {
				JOptionPane.showMessageDialog(null, "Paso numero: "+r);
				i=Integer.parseInt((String) JOptionPane.showInputDialog(null, "Donde dimensiona la siguiente cara del dado: EJE X", "Dungeon Dice Game", JOptionPane.DEFAULT_OPTION,new ImageIcon(DDG.class.getResource("/img/mapa.png")),null,null));
				j=Integer.parseInt((String) JOptionPane.showInputDialog(null, "Donde dimensiona la siguiente cara del dado: EJE Y", "Dungeon Dice Game", JOptionPane.DEFAULT_OPTION,new ImageIcon(DDG.class.getResource("/img/mapa.png")),null,null));
				if (lv1[i][j]==r) {
					JOptionPane.showMessageDialog(null, "Correcto", "Dungeon Dice Game", JOptionPane.PLAIN_MESSAGE,new ImageIcon(DDG.class.getResource("/img/1" +r+".png")));
					r=r+1;
					if (r>=7) {
						v=0;
					}
				} else {
					v=v-1;
					r=r;
					JOptionPane.showMessageDialog(null, "Incorrecto, te quedan "+v+" vidas", "Dungeon Dice Game", JOptionPane.PLAIN_MESSAGE,new ImageIcon(DDG.class.getResource("/img/1" +(r-1)+".png")));
				}
			}
		}
		
		if (r>=6) {
			JOptionPane.showMessageDialog(null,"¡Muy bien, ganaste!", "Dungeon Dice Game", JOptionPane.DEFAULT_OPTION,new ImageIcon(DDG.class.getResource("/img/win.gif")));
		} else {
			JOptionPane.showMessageDialog(null,"¡Lo siento, perdiste!", "Dungeon Dice Game", JOptionPane.DEFAULT_OPTION,new ImageIcon(DDG.class.getResource("/img/lose.gif")));
		}
		break;
	case 2:
		JOptionPane.showMessageDialog(null, "DD le revela el PASO 1, desde aqui comienza a desdoblar el dado", "Dungeon Dice Game", JOptionPane.DEFAULT_OPTION,new ImageIcon(DDG.class.getResource("/img/21.png")));
		for (int n = 1; v>=1; n++) {
			for (int m = 1; v>=1; m++) {
				JOptionPane.showMessageDialog(null, "Paso numero: "+r);
				n=Integer.parseInt((String) JOptionPane.showInputDialog(null, "Donde dimensiona la siguiente cara del dado: EJE X","Dungeon Dice Game", JOptionPane.DEFAULT_OPTION,new ImageIcon(DDG.class.getResource("/img/mapa.png")),null,null));
				m=Integer.parseInt((String) JOptionPane.showInputDialog(null, "Donde dimensiona la siguiente cara del dado: EJE Y","Dungeon Dice Game", JOptionPane.DEFAULT_OPTION,new ImageIcon(DDG.class.getResource("/img/mapa.png")),null,null));
				if (lv2[n][m]==r) {
					JOptionPane.showMessageDialog(null, "Correcto", "Dungeon Dice Game", JOptionPane.PLAIN_MESSAGE,new ImageIcon(DDG.class.getResource("/img/2" +r+".png")));
					r=r+1;
					if (r>=7) {
						v=0;
					}
				} else {
					v=v-1;
					r=r;
					JOptionPane.showMessageDialog(null, "Incorrecto, te quedan "+v+" vidas", "Dungeon Dice Game", JOptionPane.PLAIN_MESSAGE,new ImageIcon(DDG.class.getResource("/img/2" +(r-1)+".png")));
				}
			}
		}
		if (r>=6) {
			JOptionPane.showMessageDialog(null,"¡Muy bien, ganaste!", "Dungeon Dice Game", JOptionPane.DEFAULT_OPTION,new ImageIcon(DDG.class.getResource("/img/win.gif")));
		} else {
			JOptionPane.showMessageDialog(null,"¡Lo siento, perdiste!", "Dungeon Dice Game", JOptionPane.DEFAULT_OPTION,new ImageIcon(DDG.class.getResource("/img/lose.gif")));
		}
		break;
	case 3:
		JOptionPane.showMessageDialog(null, "DD le revela el PASO 1, desde aqui comienza a desdoblar el dado", "Dungeon Dice Game", JOptionPane.DEFAULT_OPTION,new ImageIcon(DDG.class.getResource("/img/31.png")));
		for (int s = 1; v>=1; s++) {
			for (int p = 1; v>=1; p++) {
				JOptionPane.showMessageDialog(null, "Paso numero: "+r);
				s=Integer.parseInt((String) JOptionPane.showInputDialog(null, "Donde dimensiona la siguiente cara del dado: EJE X","Dungeon Dice Game", JOptionPane.DEFAULT_OPTION,new ImageIcon(DDG.class.getResource("/img/mapa.png")),null,null));
				p=Integer.parseInt((String) JOptionPane.showInputDialog(null, "Donde dimensiona la siguiente cara del dado: EJE Y","Dungeon Dice Game", JOptionPane.DEFAULT_OPTION,new ImageIcon(DDG.class.getResource("/img/mapa.png")),null,null));
				if (lv3[s][p]==r) {
					JOptionPane.showMessageDialog(null, "Correcto", "Dungeon Dice Game", JOptionPane.PLAIN_MESSAGE,new ImageIcon(DDG.class.getResource("/img/3" +r+".png")));
					r=r+1;
					if (r>=7) {
						v=0;
					}
				} else {
					v=v-1;
					r=r;
					JOptionPane.showMessageDialog(null, "Incorrecto, te quedan "+v+" vidas", "Dungeon Dice Game", JOptionPane.PLAIN_MESSAGE,new ImageIcon(DDG.class.getResource("/img/3" +(r-1)+".png")));
				}
			}
		}
		if (r>=6) {
			JOptionPane.showMessageDialog(null,"¡Muy bien, ganaste!", "Dungeon Dice Game", JOptionPane.DEFAULT_OPTION,new ImageIcon(DDG.class.getResource("/img/win.gif")));
		} else {
			JOptionPane.showMessageDialog(null,"¡Lo siento, perdiste!", "Dungeon Dice Game", JOptionPane.DEFAULT_OPTION,new ImageIcon(DDG.class.getResource("/img/lose.gif")));
		}
		break;
		
	default:
		JOptionPane.showMessageDialog(null, "Opcion incorrecta");
		break;	
	}
	again=(String) JOptionPane.showInputDialog(null, "¿Quiere jugar de nuevo? \nSI / NO", "Dungeon Dice Game", JOptionPane.DEFAULT_OPTION,new ImageIcon(DDG.class.getResource("/img/aga.png")), null, null);
	} while (again.equalsIgnoreCase("si"));	
}
}
