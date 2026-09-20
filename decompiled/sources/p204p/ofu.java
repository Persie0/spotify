package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ofu {

    /* JADX INFO: renamed from: a */
    public final float f164906a;

    public ofu(float f) {
        this.f164906a = f;
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Aspect ratio value must be bigger than zero.");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ofu(float f, float f2) {
        this(f / f2);
        if (f > 0.0f && f2 > 0.0f) {
            return;
        }
        throw new IllegalStateException("Aspect ratio width and height must be bigger than zero.");
    }

    public ofu(int i, int i2) {
        this(i, i2);
    }
}
