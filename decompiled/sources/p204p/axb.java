package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class axb implements bo91 {

    /* JADX INFO: renamed from: a */
    public final bo91 f20830a;

    /* JADX INFO: renamed from: b */
    public final rge f20831b;

    /* JADX INFO: renamed from: c */
    public final int f20832c;

    public axb(bo91 bo91Var, rge rgeVar, int i) {
        this.f20830a = bo91Var;
        this.f20831b = rgeVar;
        this.f20832c = i;
    }

    @Override // p204p.bo91
    /* JADX INFO: renamed from: A */
    public final boolean mo27373A() {
        return this.f20830a.mo27373A();
    }

    @Override // p204p.bo91
    /* JADX INFO: renamed from: C */
    public final int mo27374C() {
        return this.f20830a.mo27374C();
    }

    @Override // p204p.bo91
    /* JADX INFO: renamed from: O */
    public final y751 mo27375O() {
        return this.f20830a.mo27375O();
    }

    @Override // p204p.bo91
    /* JADX INFO: renamed from: S */
    public final boolean mo27376S() {
        return true;
    }

    @Override // p204p.qge, p204p.oqo
    /* JADX INFO: renamed from: a */
    public final qge mo27377a() {
        return this.f20830a.mo27377a();
    }

    @Override // p204p.d15
    public final l25 getAnnotations() {
        return this.f20830a.getAnnotations();
    }

    @Override // p204p.bo91
    public final int getIndex() {
        return this.f20830a.getIndex() + this.f20832c;
    }

    @Override // p204p.oqo
    public final qti0 getName() {
        return this.f20830a.getName();
    }

    @Override // p204p.qqo
    public final du31 getSource() {
        return this.f20830a.getSource();
    }

    @Override // p204p.bo91
    public final List getUpperBounds() {
        return this.f20830a.getUpperBounds();
    }

    @Override // p204p.bo91, p204p.qge
    /* JADX INFO: renamed from: k */
    public final jn91 mo27378k() {
        return this.f20830a.mo27378k();
    }

    @Override // p204p.oqo
    /* JADX INFO: renamed from: o */
    public final oqo mo27379o() {
        return this.f20831b;
    }

    @Override // p204p.qge
    /* JADX INFO: renamed from: q */
    public final jd21 mo27380q() {
        return this.f20830a.mo27380q();
    }

    public final String toString() {
        return this.f20830a + "[inner-copy]";
    }

    @Override // p204p.oqo
    /* JADX INFO: renamed from: y */
    public final Object mo27381y(sqo sqoVar, Object obj) {
        return this.f20830a.mo27381y(sqoVar, obj);
    }

    @Override // p204p.oqo
    /* JADX INFO: renamed from: a */
    public final oqo mo27377a() {
        return this.f20830a.mo27377a();
    }

    @Override // p204p.bo91, p204p.qge, p204p.oqo
    /* JADX INFO: renamed from: a */
    public final bo91 mo27377a() {
        return this.f20830a.mo27377a();
    }
}
