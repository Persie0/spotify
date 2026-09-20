package p204p;

import android.graphics.Path;
import android.graphics.PathMeasure;

/* JADX INFO: loaded from: classes3.dex */
public final class wk4 {

    /* JADX INFO: renamed from: a */
    public final PathMeasure f252115a;

    /* JADX INFO: renamed from: b */
    public float[] f252116b;

    /* JADX INFO: renamed from: c */
    public float[] f252117c;

    public wk4(PathMeasure pathMeasure) {
        this.f252115a = pathMeasure;
    }

    /* JADX INFO: renamed from: a */
    public final float m88358a() {
        return this.f252115a.getLength();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m88359b(float f, float f2, vbn0 vbn0Var) {
        if (!(vbn0Var instanceof uk4)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return this.f252115a.getSegment(f, f2, ((uk4) vbn0Var).f231212a, true);
    }

    /* JADX INFO: renamed from: c */
    public final void m88360c(vbn0 vbn0Var, boolean z) {
        Path path;
        if (vbn0Var == null) {
            path = null;
        } else {
            if (!(vbn0Var instanceof uk4)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            path = ((uk4) vbn0Var).f231212a;
        }
        this.f252115a.setPath(path, z);
    }
}
