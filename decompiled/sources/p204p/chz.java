package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class chz extends AbstractC1969i7 {

    /* JADX INFO: renamed from: b */
    public final AbstractC1969i7 f38150b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1969i7 f38151c;

    /* JADX INFO: renamed from: d */
    public final boolean f38152d;

    public chz(AbstractC1969i7 abstractC1969i7, AbstractC1969i7 abstractC1969i8, boolean z, eh00 eh00Var) {
        super(eh00Var);
        this.f38150b = abstractC1969i7;
        this.f38151c = abstractC1969i8;
        this.f38152d = z;
    }

    @Override // p204p.AbstractC1969i7
    /* JADX INFO: renamed from: A */
    public final up60 mo32812A() {
        return this.f38150b.mo32812A();
    }

    @Override // p204p.AbstractC1969i7
    /* JADX INFO: renamed from: C */
    public final boolean mo32813C() {
        return false;
    }

    @Override // p204p.AbstractC1969i7
    /* JADX INFO: renamed from: G */
    public final boolean mo32814G() {
        return false;
    }

    @Override // p204p.AbstractC1969i7
    /* JADX INFO: renamed from: I */
    public final boolean mo32815I() {
        return this.f38152d;
    }

    @Override // p204p.sr60
    /* JADX INFO: renamed from: K */
    public final List mo27065K() {
        return this.f38150b.mo27065K();
    }

    @Override // p204p.AbstractC1969i7
    /* JADX INFO: renamed from: M */
    public final boolean mo32816M() {
        return false;
    }

    @Override // p204p.AbstractC1969i7
    /* JADX INFO: renamed from: N */
    public final AbstractC1969i7 mo32817N() {
        return this.f38150b;
    }

    @Override // p204p.AbstractC1969i7
    /* JADX INFO: renamed from: O */
    public final AbstractC1969i7 mo32818O(boolean z) {
        AbstractC1969i7 abstractC1969i7Mo32818O = this.f38150b.mo32818O(z);
        AbstractC1969i7 abstractC1969i7Mo32818O2 = this.f38151c.mo32818O(z);
        return abstractC1969i7Mo32818O.equals(abstractC1969i7Mo32818O2) ? abstractC1969i7Mo32818O : new chz(abstractC1969i7Mo32818O, abstractC1969i7Mo32818O2, this.f38152d, null);
    }

    @Override // p204p.AbstractC1969i7
    /* JADX INFO: renamed from: P */
    public final AbstractC1969i7 mo32819P(boolean z) {
        AbstractC1969i7 abstractC1969i7Mo32819P = this.f38150b.mo32819P(z);
        AbstractC1969i7 abstractC1969i7Mo32819P2 = this.f38151c.mo32819P(z);
        return abstractC1969i7Mo32819P.equals(abstractC1969i7Mo32819P2) ? abstractC1969i7Mo32819P : new chz(abstractC1969i7Mo32819P, abstractC1969i7Mo32819P2, this.f38152d, null);
    }

    @Override // p204p.AbstractC1969i7
    /* JADX INFO: renamed from: Q */
    public final AbstractC1969i7 mo32820Q() {
        return this.f38151c;
    }

    @Override // p204p.AbstractC1969i7
    /* JADX INFO: renamed from: g */
    public final sr60 mo32821g() {
        return null;
    }

    @Override // p204p.qp60
    public final List getAnnotations() {
        return this.f38150b.getAnnotations();
    }

    @Override // p204p.sr60
    /* JADX INFO: renamed from: q */
    public final boolean mo27066q() {
        return this.f38150b.mo27066q();
    }

    @Override // p204p.sr60
    /* JADX INFO: renamed from: y */
    public final kq60 mo27067y() {
        return this.f38150b.mo27067y();
    }
}
