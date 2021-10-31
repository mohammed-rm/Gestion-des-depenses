package view;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class Panel extends JPanel {

	public Panel() {
		setOpaque(false);
	}

	@Override
	protected void paintComponent(Graphics grphcs) {
		Graphics2D g2 = (Graphics2D) grphcs;
		g2.setColor(getBackground());
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		GradientPaint gradPaint = new GradientPaint(0, 0, Color.decode("#0b8793"), 0, getHeight(), Color.decode("#360033"));
		g2.setPaint(gradPaint);
		g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
		super.paintComponent(grphcs);

	}
}
