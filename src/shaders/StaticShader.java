package shaders;

import org.lwjgl.util.vector.Matrix4f;

public class StaticShader extends ShaderProgram{

    private static final String VERTEX_FILE = "D:\\project\\GameEngine\\src\\shaders\\shader.vert ";
    private static final String FRAGMENT_FILE = "D:\\project\\GameEngine\\src\\shaders\\shader.frag";

    private int location_transformationMatrix;

    public StaticShader() {
        super(VERTEX_FILE, FRAGMENT_FILE);
    }

    @Override
    protected void getAllUniformLocations() {
        location_transformationMatrix = super.getUniformLocation("transformationMatrix");

    }

    @Override
    protected void bindAttributes() {
        super.bindAttribute(0, "position");
        super.bindAttribute(1, "textureCoords");
    }

    public void loadTransformationMatrix(Matrix4f matrix) {
        super.loadMatrix(location_transformationMatrix, matrix);
    }
}
