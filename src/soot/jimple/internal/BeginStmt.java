package soot.jimple.internal;

import soot.UnitPrinter;

public class BeginStmt extends AbstractStmt {

    public String toString()
    {
        return "This is a begin of a method.";
    }
    
    public void toString(UnitPrinter up) {
        up.literal("This is a begin of a method.");
    }

	public boolean fallsThrough() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean branches() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		return null;
	}

}
