package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class tc21 extends AbstractC1969i7 {

    /* JADX INFO: renamed from: b */
    public final kq60 f218990b;

    /* JADX INFO: renamed from: c */
    public final List f218991c;

    /* JADX INFO: renamed from: d */
    public final boolean f218992d;

    /* JADX INFO: renamed from: e */
    public final List f218993e;

    /* JADX INFO: renamed from: f */
    public final sr60 f218994f;

    /* JADX INFO: renamed from: g */
    public final boolean f218995g;

    /* JADX INFO: renamed from: h */
    public final boolean f218996h;

    /* JADX INFO: renamed from: i */
    public final boolean f218997i;

    /* JADX INFO: renamed from: t */
    public final up60 f218998t;

    public /* synthetic */ tc21(kq60 kq60Var, List list, boolean z, List list2, sr60 sr60Var, boolean z2, boolean z3, boolean z4, up60 up60Var) {
        this(kq60Var, list, z, list2, sr60Var, z2, z3, z4, up60Var, null);
    }

    @Override // p204p.AbstractC1969i7
    /* JADX INFO: renamed from: A */
    public final up60 mo32812A() {
        return this.f218998t;
    }

    @Override // p204p.AbstractC1969i7
    /* JADX INFO: renamed from: C */
    public final boolean mo32813C() {
        return this.f218995g;
    }

    @Override // p204p.AbstractC1969i7
    /* JADX INFO: renamed from: G */
    public final boolean mo32814G() {
        return this.f218996h;
    }

    @Override // p204p.AbstractC1969i7
    /* JADX INFO: renamed from: I */
    public final boolean mo32815I() {
        return false;
    }

    @Override // p204p.sr60
    /* JADX INFO: renamed from: K */
    public final List mo27065K() {
        return this.f218991c;
    }

    @Override // p204p.AbstractC1969i7
    /* JADX INFO: renamed from: M */
    public final boolean mo32816M() {
        return this.f218997i;
    }

    @Override // p204p.AbstractC1969i7
    /* JADX INFO: renamed from: N */
    public final AbstractC1969i7 mo32817N() {
        return null;
    }

    @Override // p204p.AbstractC1969i7
    /* JADX INFO: renamed from: O */
    public final AbstractC1969i7 mo32818O(boolean z) {
        return new tc21(this.f218990b, this.f218991c, this.f218992d && !z, this.f218993e, this.f218994f, z, this.f218996h, this.f218997i, this.f218998t, null);
    }

    @Override // p204p.AbstractC1969i7
    /* JADX INFO: renamed from: P */
    public final AbstractC1969i7 mo32819P(boolean z) {
        up60 up60Var;
        kq60 kq60Var = this.f218990b;
        boolean z2 = kq60Var instanceof up60;
        kq60 kq60VarMo54112b = kq60Var;
        if (z2) {
            up60Var = (up60) kq60Var;
            if (z) {
                kq60VarMo54112b = qpv0.f191387a.mo54112b(mif1.m61886u(up60Var));
            } else {
                Class clsM61887v = mif1.m61887v(up60Var);
                if (clsM61887v != null) {
                    kq60VarMo54112b = up60Var;
                    kq60VarMo54112b = qpv0.f191387a.mo54112b(clsM61887v);
                }
            }
        }
        kq60VarMo54112b = up60Var;
        return new tc21(kq60VarMo54112b, this.f218991c, z, this.f218993e, this.f218994f, false, this.f218996h, this.f218997i, this.f218998t, null);
    }

    @Override // p204p.AbstractC1969i7
    /* JADX INFO: renamed from: Q */
    public final AbstractC1969i7 mo32820Q() {
        return null;
    }

    @Override // p204p.AbstractC1969i7
    /* JADX INFO: renamed from: g */
    public final sr60 mo32821g() {
        return this.f218994f;
    }

    @Override // p204p.qp60
    public final List getAnnotations() {
        return this.f218993e;
    }

    @Override // p204p.sr60
    /* JADX INFO: renamed from: q */
    public final boolean mo27066q() {
        return this.f218992d;
    }

    @Override // p204p.sr60
    /* JADX INFO: renamed from: y */
    public final kq60 mo27067y() {
        return this.f218990b;
    }

    public tc21(kq60 kq60Var, List list, boolean z, List list2, sr60 sr60Var, boolean z2, boolean z3, boolean z4, up60 up60Var, eh00 eh00Var) {
        super(eh00Var);
        this.f218990b = kq60Var;
        this.f218991c = list;
        this.f218992d = z;
        this.f218993e = list2;
        this.f218994f = sr60Var;
        this.f218995g = z2;
        this.f218996h = z3;
        this.f218997i = z4;
        this.f218998t = up60Var;
    }
}
