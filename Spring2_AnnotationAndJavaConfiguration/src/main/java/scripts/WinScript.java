package scripts;

public class WinScript implements ICommandLineScript{
	public String viewDirectoryContents(String dir) {
		return "dir " + dir;
	}
}
