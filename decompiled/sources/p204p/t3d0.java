package p204p;

import android.content.Context;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes3.dex */
public interface t3d0 extends td10 {
    @Override // p204p.td10
    /* JADX INFO: renamed from: a */
    default be10 mo46361a(Context context, boolean z) {
        return e6q.m37948j(context, pf40.m69794t(this), wsv0.f254763e, z);
    }

    /* JADX INFO: renamed from: b */
    Matrix mo27903b();

    /* JADX INFO: renamed from: c */
    default int mo79758c() {
        return 9729;
    }

    /* JADX INFO: renamed from: d */
    default di21 mo79759d(int i, int i2) {
        return new di21(i, i2);
    }
}
