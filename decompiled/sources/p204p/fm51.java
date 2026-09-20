package p204p;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public final class fm51 extends b19 {

    /* JADX INFO: renamed from: r */
    public final oz8 f70957r;

    /* JADX INFO: renamed from: s */
    public final String f70958s;

    /* JADX INFO: renamed from: t */
    public final boolean f70959t;

    /* JADX INFO: renamed from: u */
    public final q7f f70960u;

    /* JADX INFO: renamed from: v */
    public h3b1 f70961v;

    /* JADX WARN: Illegal instructions before constructor call */
    public fm51(r9b0 r9b0Var, oz8 oz8Var, zh01 zh01Var) {
        int iM38547C = edb.m38547C(zh01Var.f282760g);
        Paint.Cap cap = iM38547C != 0 ? iM38547C != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iM38547C2 = edb.m38547C(zh01Var.f282761h);
        super(r9b0Var, oz8Var, cap, iM38547C2 != 0 ? iM38547C2 != 1 ? iM38547C2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, zh01Var.f282762i, zh01Var.f282758e, zh01Var.f282759f, zh01Var.f282756c, zh01Var.f282755b);
        this.f70957r = oz8Var;
        this.f70958s = zh01Var.f282754a;
        this.f70959t = zh01Var.f282763j;
        mz8 mz8VarMo48914j0 = zh01Var.f282757d.mo48914j0();
        this.f70960u = (q7f) mz8VarMo48914j0;
        mz8VarMo48914j0.m63235a(this);
        oz8Var.m68627e(mz8VarMo48914j0);
    }

    @Override // p204p.b19, p204p.mu60
    /* JADX INFO: renamed from: c */
    public final void mo25332c(Object obj, xh70 xh70Var) {
        super.mo25332c(obj, xh70Var);
        PointF pointF = bab0.f25146a;
        q7f q7fVar = this.f70960u;
        if (obj == 2) {
            q7fVar.m63238j(xh70Var);
            return;
        }
        if (obj == bab0.f25140F) {
            h3b1 h3b1Var = this.f70961v;
            oz8 oz8Var = this.f70957r;
            if (h3b1Var != null) {
                oz8Var.m68632o(h3b1Var);
            }
            if (xh70Var == null) {
                this.f70961v = null;
                return;
            }
            h3b1 h3b1Var2 = new h3b1(null, xh70Var);
            this.f70961v = h3b1Var2;
            h3b1Var2.m63235a(this);
            oz8Var.m68627e(q7fVar);
        }
    }

    @Override // p204p.b19, p204p.sgs
    /* JADX INFO: renamed from: g */
    public final void mo27898g(Canvas canvas, Matrix matrix, int i) {
        if (this.f70959t) {
            return;
        }
        int iM72288k = this.f70960u.m72288k();
        zd70 zd70Var = this.f22254i;
        zd70Var.setColor(iM72288k);
        h3b1 h3b1Var = this.f70961v;
        if (h3b1Var != null) {
            zd70Var.setColorFilter((ColorFilter) h3b1Var.mo46515e());
        }
        super.mo27898g(canvas, matrix, i);
    }

    @Override // p204p.hej
    public final String getName() {
        return this.f70958s;
    }
}
