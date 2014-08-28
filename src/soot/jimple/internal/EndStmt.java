package soot.jimple.internal;

import soot.UnitPrinter;

public class EndStmt extends AbstractStmt{

    public String toString()
    {
        return "This is an end of a method.";
    }
    
    public void toString(UnitPrinter up) {
        up.literal("This is an end of a method.");
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
