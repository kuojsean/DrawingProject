package art.view;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.io.*;
import java.util.*;

import javax.imageio.*;
import javax.swing.*;

import art.controller.ArtController;

public class ShapeCanvas extends JPanel
{
	private ArrayList<Polygon> triangleList;
	private ArrayList<Polygon> polygonList;
	private ArrayList<Ellipse2D> ellipseList;
	private ArrayList<Rectangle> rectangleList;
	private ArtController app;
	
	private BufferedImage canvasImage;
	
	public ShapeCanvas(ArtController app)
	{
		
	}
}
