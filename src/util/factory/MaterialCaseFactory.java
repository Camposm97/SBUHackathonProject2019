package util.factory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

import model.Dimension;
import model.Material;
import model.MaterialCase;

public class MaterialCaseFactory {
	private static final String CARPET = "data/carpet", TILE = "data/tiles", WOOD = "data/wood";
	private LinkedList<MaterialCase> matList;

	// Demo
	public static void main(String[] args) throws FileNotFoundException {
		MaterialCaseFactory f = new MaterialCaseFactory();
		while (true) {
			System.out.println(f.emitMaterialCase());
		}
	}
	
	public MaterialCaseFactory() throws FileNotFoundException {
		loadMatCaseData();
	}

	public MaterialCase emitMaterialCase() {
		return matList.get((int)(Math.random() * matList.size()));
	}

	public Dimension emitDim() {
		return new Dimension(Math.random() * 25, Math.random() * 25);
	}
	
	private void loadMatCaseData() throws FileNotFoundException {
		matList = new LinkedList<>();
		Scanner in = new Scanner(new File(CARPET));
		while (in.hasNextLine()) {
			String[] tokens = in.nextLine().split(", ");
			matList.add(new MaterialCase(new Material(tokens[0], emitDim()), 
					Integer.valueOf(tokens[2]), Double.valueOf(tokens[1])));
		}
		in = new Scanner(new File(TILE));
		while (in.hasNextLine()) {
			String[] tokens = in.nextLine().split(", ");
			matList.add(new MaterialCase(new Material(tokens[0], emitDim()), 
					Double.valueOf(tokens[2]), Double.valueOf(tokens[1])));
		}
		in = new Scanner(new File(WOOD));
		while (in.hasNextLine()) {
			String[] tokens = in.nextLine().split(", ");
			matList.add(new MaterialCase(new Material(tokens[0], emitDim()), 
					Double.valueOf(tokens[2]), Double.valueOf(tokens[1])));
		}
		in.close();
	}
}
