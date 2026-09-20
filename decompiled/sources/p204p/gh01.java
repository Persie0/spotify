package p204p;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gh01 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f79775a;

    /* JADX INFO: renamed from: b */
    public PointF f79776b;

    /* JADX INFO: renamed from: c */
    public boolean f79777c;

    public gh01(PointF pointF, boolean z, List list) {
        this.f79776b = pointF;
        this.f79777c = z;
        this.f79775a = new ArrayList(list);
    }

    /* JADX INFO: renamed from: a */
    public final void m44708a(float f, float f2) {
        if (this.f79776b == null) {
            this.f79776b = new PointF();
        }
        this.f79776b.set(f, f2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.f79775a.size());
        sb.append("closed=");
        return s571.m77253l(sb, this.f79777c, '}');
    }

    public gh01() {
        this.f79775a = new ArrayList();
    }
}
