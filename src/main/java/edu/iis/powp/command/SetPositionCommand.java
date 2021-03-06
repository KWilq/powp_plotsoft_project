package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

/**
 * Implementation of IPlotterCommand for setPosition command functionality.
 */
public class SetPositionCommand implements IPlotterCommand {

	private int posX, posY;

	public SetPositionCommand(int posX, int posY) {
		super();
		this.posX = posX;
		this.posY = posY;
	}

	@Override
	public void execute(IPlotter plotter) {
		plotter.setPosition(posX, posY);
	}

}
