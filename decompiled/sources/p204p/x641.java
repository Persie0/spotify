package p204p;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class x641 extends mz8 {

    /* JADX INFO: renamed from: i */
    public final PointF f258585i;

    /* JADX INFO: renamed from: j */
    public final PointF f258586j;

    /* JADX INFO: renamed from: k */
    public final whz f258587k;

    /* JADX INFO: renamed from: l */
    public final whz f258588l;

    /* JADX INFO: renamed from: m */
    public xh70 f258589m;

    /* JADX INFO: renamed from: n */
    public xh70 f258590n;

    public x641(whz whzVar, whz whzVar2) {
        super(Collections.EMPTY_LIST);
        this.f258585i = new PointF();
        this.f258586j = new PointF();
        this.f258587k = whzVar;
        this.f258588l = whzVar2;
        mo46517i(this.f148645d);
    }

    @Override // p204p.mz8
    /* JADX INFO: renamed from: e */
    public final Object mo46515e() {
        return m90073k(0.0f);
    }

    @Override // p204p.mz8
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo25479f(wz60 wz60Var, float f) {
        return m90073k(f);
    }

    @Override // p204p.mz8
    /* JADX INFO: renamed from: i */
    public final void mo46517i(float f) {
        whz whzVar = this.f258587k;
        whzVar.mo46517i(f);
        whz whzVar2 = this.f258588l;
        whzVar2.mo46517i(f);
        this.f258585i.set(((Float) whzVar.mo46515e()).floatValue(), ((Float) whzVar2.mo46515e()).floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f148642a;
            if (i >= arrayList.size()) {
                return;
            }
            ((jz8) arrayList.get(i)).mo27895a();
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX INFO: renamed from: k */
    public final PointF m90073k(float f) {
        float f2;
        Float f3;
        Float f4 = null;
        if (this.f258589m != null) {
            whz whzVar = this.f258587k;
            wz60 wz60VarMo36143k = whzVar.f148644c.mo36143k();
            if (wz60VarMo36143k != null) {
                float fM63236c = whzVar.m63236c();
                Float f5 = wz60VarMo36143k.f256499h;
                xh70 xh70Var = this.f258589m;
                float f6 = wz60VarMo36143k.f256498g;
                f2 = f;
                f3 = (Float) xh70Var.m90961s(f6, f5 == null ? f6 : f5.floatValue(), (Float) wz60VarMo36143k.f256493b, (Float) wz60VarMo36143k.f256494c, f, f, fM63236c);
            } else {
                f2 = f;
                f3 = null;
            }
        } else {
            f2 = f;
            f3 = null;
        }
        if (this.f258590n != null) {
            whz whzVar2 = this.f258588l;
            wz60 wz60VarMo36143k2 = whzVar2.f148644c.mo36143k();
            if (wz60VarMo36143k2 != null) {
                float fM63236c2 = whzVar2.m63236c();
                Float f7 = wz60VarMo36143k2.f256499h;
                xh70 xh70Var2 = this.f258590n;
                float f8 = wz60VarMo36143k2.f256498g;
                f4 = (Float) xh70Var2.m90961s(f8, f7 == null ? f8 : f7.floatValue(), (Float) wz60VarMo36143k2.f256493b, (Float) wz60VarMo36143k2.f256494c, f2, f2, fM63236c2);
            }
        }
        PointF pointF = this.f258585i;
        PointF pointF2 = this.f258586j;
        if (f3 == null) {
            pointF2.set(pointF.x, 0.0f);
        } else {
            pointF2.set(f3.floatValue(), 0.0f);
        }
        if (f4 == null) {
            pointF2.set(pointF2.x, pointF.y);
            return pointF2;
        }
        pointF2.set(pointF2.x, f4.floatValue());
        return pointF2;
    }

    /* JADX INFO: renamed from: l */
    public final void m90074l(xh70 xh70Var) {
        xh70 xh70Var2 = this.f258589m;
        if (xh70Var2 != null) {
            xh70Var2.getClass();
        }
        this.f258589m = xh70Var;
    }

    /* JADX INFO: renamed from: m */
    public final void m90075m(xh70 xh70Var) {
        xh70 xh70Var2 = this.f258590n;
        if (xh70Var2 != null) {
            xh70Var2.getClass();
        }
        this.f258590n = xh70Var;
    }
}
