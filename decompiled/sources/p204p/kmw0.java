package p204p;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class kmw0 implements sgs, ybn0, cy10, jz8, nu60 {

    /* JADX INFO: renamed from: a */
    public final Matrix f124223a = new Matrix();

    /* JADX INFO: renamed from: b */
    public final Path f124224b = new Path();

    /* JADX INFO: renamed from: c */
    public final r9b0 f124225c;

    /* JADX INFO: renamed from: d */
    public final oz8 f124226d;

    /* JADX INFO: renamed from: e */
    public final String f124227e;

    /* JADX INFO: renamed from: f */
    public final boolean f124228f;

    /* JADX INFO: renamed from: g */
    public final whz f124229g;

    /* JADX INFO: renamed from: h */
    public final whz f124230h;

    /* JADX INFO: renamed from: i */
    public final h591 f124231i;

    /* JADX INFO: renamed from: j */
    public zhj f124232j;

    public kmw0(r9b0 r9b0Var, oz8 oz8Var, ajv0 ajv0Var) {
        this.f124225c = r9b0Var;
        this.f124226d = oz8Var;
        this.f124227e = ajv0Var.f16360b;
        this.f124228f = ajv0Var.f16362d;
        mz8 mz8VarMo48914j0 = ajv0Var.f16361c.mo48914j0();
        this.f124229g = (whz) mz8VarMo48914j0;
        oz8Var.m68627e(mz8VarMo48914j0);
        mz8VarMo48914j0.m63235a(this);
        mz8 mz8VarMo48914j1 = ((iw4) ajv0Var.f16363e).mo48914j0();
        this.f124230h = (whz) mz8VarMo48914j1;
        oz8Var.m68627e(mz8VarMo48914j1);
        mz8VarMo48914j1.m63235a(this);
        ow4 ow4Var = (ow4) ajv0Var.f16364f;
        ow4Var.getClass();
        h591 h591Var = new h591(ow4Var);
        this.f124231i = h591Var;
        h591Var.m46673a(oz8Var);
        h591Var.m46674b(this);
    }

    @Override // p204p.jz8
    /* JADX INFO: renamed from: a */
    public final void mo27895a() {
        this.f124225c.invalidateSelf();
    }

    @Override // p204p.hej
    /* JADX INFO: renamed from: b */
    public final void mo27896b(List list, List list2) {
        this.f124232j.mo27896b(list, list2);
    }

    @Override // p204p.mu60
    /* JADX INFO: renamed from: c */
    public final void mo25332c(Object obj, xh70 xh70Var) {
        if (this.f124231i.m46675c(obj, xh70Var)) {
            return;
        }
        if (obj == bab0.f25161p) {
            this.f124229g.m63238j(xh70Var);
        } else if (obj == bab0.f25162q) {
            this.f124230h.m63238j(xh70Var);
        }
    }

    @Override // p204p.sgs
    /* JADX INFO: renamed from: d */
    public final void mo25333d(RectF rectF, Matrix matrix, boolean z) {
        this.f124232j.mo25333d(rectF, matrix, z);
    }

    @Override // p204p.cy10
    /* JADX INFO: renamed from: e */
    public final void mo34336e(ListIterator listIterator) {
        if (this.f124232j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((hej) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f124232j = new zhj(this.f124225c, this.f124226d, "Repeater", this.f124228f, arrayList, null);
    }

    @Override // p204p.mu60
    /* JADX INFO: renamed from: f */
    public final void mo27897f(lu60 lu60Var, int i, ArrayList arrayList, lu60 lu60Var2) {
        eff0.m38736f(lu60Var, i, arrayList, lu60Var2, this);
        for (int i2 = 0; i2 < this.f124232j.f282952h.size(); i2++) {
            hej hejVar = (hej) this.f124232j.f282952h.get(i2);
            if (hejVar instanceof nu60) {
                eff0.m38736f(lu60Var, i, arrayList, lu60Var2, (nu60) hejVar);
            }
        }
    }

    @Override // p204p.sgs
    /* JADX INFO: renamed from: g */
    public final void mo27898g(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = ((Float) this.f124229g.mo46515e()).floatValue();
        float fFloatValue2 = ((Float) this.f124230h.mo46515e()).floatValue();
        h591 h591Var = this.f124231i;
        float fFloatValue3 = ((Float) h591Var.f87786m.mo46515e()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) h591Var.f87787n.mo46515e()).floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            Matrix matrix2 = this.f124223a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(h591Var.m46678f(f + fFloatValue2));
            this.f124232j.mo27898g(canvas, matrix2, (int) (eff0.m38735e(fFloatValue3, fFloatValue4, f / fFloatValue) * i));
        }
    }

    @Override // p204p.hej
    public final String getName() {
        return this.f124227e;
    }

    @Override // p204p.ybn0
    public final Path getPath() {
        Path path = this.f124232j.getPath();
        Path path2 = this.f124224b;
        path2.reset();
        float fFloatValue = ((Float) this.f124229g.mo46515e()).floatValue();
        float fFloatValue2 = ((Float) this.f124230h.mo46515e()).floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            Matrix matrixM46678f = this.f124231i.m46678f(i + fFloatValue2);
            Matrix matrix = this.f124223a;
            matrix.set(matrixM46678f);
            path2.addPath(path, matrix);
        }
        return path2;
    }
}
