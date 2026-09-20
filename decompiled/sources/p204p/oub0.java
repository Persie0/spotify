package p204p;

import android.view.View;
import kotlin.Metadata;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/oub0;", "Lp/ixh0;", "Lp/qub0;", "foundation"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final class oub0 extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final t45 f170243a;

    /* JADX INFO: renamed from: b */
    public final o871 f170244b;

    /* JADX INFO: renamed from: c */
    public final edo0 f170245c;

    public oub0(t45 t45Var, o871 o871Var, edo0 edo0Var) {
        this.f170243a = t45Var;
        this.f170244b = o871Var;
        this.f170245c = edo0Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        return new qub0(this.f170243a, this.f170244b, this.f170245c);
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        qub0 qub0Var = (qub0) exh0Var;
        float f = qub0Var.f192619O0;
        long j = qub0Var.f192621Q0;
        float f2 = qub0Var.f192622R0;
        boolean z = qub0Var.f192620P0;
        float f3 = qub0Var.f192623S0;
        boolean z2 = qub0Var.f192624T0;
        edo0 edo0Var = qub0Var.f192625U0;
        View view = qub0Var.f192626V0;
        yqq yqqVar = qub0Var.f192627W0;
        qub0Var.f192617M0 = this.f170243a;
        qub0Var.f192619O0 = Float.NaN;
        qub0Var.f192620P0 = true;
        qub0Var.f192621Q0 = 9205357640488583168L;
        qub0Var.f192622R0 = Float.NaN;
        qub0Var.f192623S0 = Float.NaN;
        qub0Var.f192624T0 = true;
        qub0Var.f192618N0 = this.f170244b;
        edo0 edo0Var2 = this.f170245c;
        qub0Var.f192625U0 = edo0Var2;
        View viewM93925q = yjg1.m93925q(qub0Var);
        yqq yqqVar2 = wjg1.m88319I(qub0Var).f135664X0;
        if (qub0Var.f192628X0 != null) {
            lpz0 lpz0Var = rub0.f202791a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(f)) && Float.NaN != f && !edo0Var2.mo36520d()) || 9205357640488583168L != j || !ybs.m93301b(Float.NaN, f2) || !ybs.m93301b(Float.NaN, f3) || true != z || true != z2 || !edo0Var2.equals(edo0Var) || !viewM93925q.equals(view) || !wj50.m88271j(yqqVar2, yqqVar)) {
                qub0Var.m73892I1();
            }
        }
        qub0Var.m73893J1();
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return this.f170245c.hashCode() + ((this.f170244b.hashCode() + s571.m77245d(AbstractC0000a.m8g(AbstractC0000a.m8g(dq60.m36605e(s571.m77245d(AbstractC0000a.m8g(this.f170243a.hashCode() * 961, 31, Float.NaN), 31, true), 9205357640488583168L, 31), 31, Float.NaN), 31, Float.NaN), 31, true)) * 31);
    }
}
