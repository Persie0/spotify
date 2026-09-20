package p204p;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class y071 extends AbstractC2440u5 {

    /* JADX INFO: renamed from: e */
    public final AbstractList f267925e;

    public y071(t6h1 t6h1Var, Matrix matrix) {
        super(t6h1Var.f217556a, t6h1Var.f217557b, t6h1Var.f217558c, t6h1Var.f217559d, matrix);
        this.f267925e = q191.m71890H(t6h1Var.f217560e, new bnd1(matrix));
    }

    public y071(String str, Rect rect, List list, String str2, AbstractList abstractList) {
        super(str, rect, list, str2, null);
        this.f267925e = abstractList;
    }
}
