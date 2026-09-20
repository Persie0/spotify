package p204p;

import android.graphics.Paint;
import android.graphics.Shader;
import androidx.compose.p002ui.graphics.ColorFilter;

/* JADX INFO: loaded from: classes.dex */
public final class lk4 {

    /* JADX INFO: renamed from: a */
    public final Paint f134233a;

    /* JADX INFO: renamed from: b */
    public int f134234b = 3;

    /* JADX INFO: renamed from: c */
    public Shader f134235c;

    /* JADX INFO: renamed from: d */
    public ColorFilter f134236d;

    /* JADX INFO: renamed from: e */
    public vk4 f134237e;

    public lk4(Paint paint) {
        this.f134233a = paint;
    }

    /* JADX INFO: renamed from: a */
    public final void m59206a(float f) {
        s800.m77414O(this.f134233a, f);
    }

    /* JADX INFO: renamed from: b */
    public final void m59207b(int i) {
        if (ftg1.m42662v(this.f134234b, i)) {
            return;
        }
        this.f134234b = i;
        s800.m77415P(this.f134233a, i);
    }

    /* JADX INFO: renamed from: c */
    public final void m59208c(long j) {
        s800.m77416Q(this.f134233a, j);
    }

    /* JADX INFO: renamed from: d */
    public final void m59209d(ColorFilter colorFilter) {
        this.f134236d = colorFilter;
        s800.m77417R(this.f134233a, colorFilter);
    }

    /* JADX INFO: renamed from: e */
    public final void m59210e(Shader shader) {
        this.f134235c = shader;
        s800.m77420U(this.f134233a, shader);
    }

    /* JADX INFO: renamed from: f */
    public final void m59211f(float f) {
        s800.m77424Y(this.f134233a, f);
    }

    /* JADX INFO: renamed from: g */
    public final void m59212g(int i) {
        s800.m77425Z(this.f134233a, i);
    }
}
