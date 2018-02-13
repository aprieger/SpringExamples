package scripts;

public class UnixScript implements ICommandLineScript {
	public String viewDirectoryContents(String ls) {
		return "ls " + ls;
	}
}
