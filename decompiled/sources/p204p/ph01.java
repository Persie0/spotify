package p204p;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ph01 extends vh01 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f177440b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Matrix f177441c;

    public ph01(ArrayList arrayList, Matrix matrix) {
        this.f177440b = arrayList;
        this.f177441c = matrix;
    }

    @Override // p204p.vh01
    /* JADX INFO: renamed from: a */
    public final void mo69934a(Matrix matrix, yg01 yg01Var, int i, Canvas canvas) {
        Iterator it = this.f177440b.iterator();
        while (it.hasNext()) {
            ((vh01) it.next()).mo69934a(this.f177441c, yg01Var, i, canvas);
        }
    }
}
