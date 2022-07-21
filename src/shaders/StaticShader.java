package shaders;

public class StaticShader extends ShaderProgram{

    private static final String VERTEX_FILE = "D:\\project\\GameEngine\\src\\shaders\\shader.vert ";
    private static final String FRAGMENT_FILE = "D:\\project\\GameEngine\\src\\shaders\\shader.frag";

    public StaticShader() {
        super(VERTEX_FILE, FRAGMENT_FILE);
    }

    @Override
    protected void bindAttributes() {
        super.bindAttribute(0, "position");
    }
}
