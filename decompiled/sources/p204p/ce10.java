package p204p;

import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil$GlException;

/* JADX INFO: loaded from: classes3.dex */
public final class ce10 {

    /* JADX INFO: renamed from: e */
    public static final ce10 f36989e = new ce10(-1, -1, -1, -1);

    /* JADX INFO: renamed from: a */
    public final int f36990a;

    /* JADX INFO: renamed from: b */
    public final int f36991b;

    /* JADX INFO: renamed from: c */
    public final int f36992c;

    /* JADX INFO: renamed from: d */
    public final int f36993d;

    public ce10(int i, int i2, int i3, int i4) {
        this.f36990a = i;
        this.f36991b = i2;
        this.f36992c = i3;
        this.f36993d = i4;
    }

    /* JADX INFO: renamed from: a */
    public final void m32471a() throws GlUtil$GlException {
        int i = this.f36990a;
        if (i != -1) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            mjx0.m62033k();
        }
        int i2 = this.f36991b;
        if (i2 != -1) {
            GLES20.glDeleteFramebuffers(1, new int[]{i2}, 0);
            mjx0.m62033k();
        }
    }
}
