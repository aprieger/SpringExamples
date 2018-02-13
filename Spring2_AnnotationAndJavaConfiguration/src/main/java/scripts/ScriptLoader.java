package scripts;

public class ScriptLoader {
	private ICommandLineScript script;
	
	public ScriptLoader() {}
	public ScriptLoader(ICommandLineScript script) {
		this.script = script;
	}
	public ICommandLineScript getScript() {
		return script;
	}
	public void setScript(ICommandLineScript script) {
		this.script = script;
	}
	public void loadScript() {
		System.out.println("Loading script of type: " + script.getClass());
		System.out.println(script.viewDirectoryContents("myDir"));
	}

}
