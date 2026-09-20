package p204p;

/* JADX INFO: loaded from: classes11.dex */
public abstract class jwq extends hwq implements jr60 {

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ qr60[] f116670t = {new wys0(jwq.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", 0)};

    /* JADX INFO: renamed from: h */
    public final lpv0 f116671h = kgg1.m56357t(null, new iwq(this, 0));

    /* JADX INFO: renamed from: i */
    public final Object f116672i = q3d0.m72078I(2, new iwq(this, 1));

    @Override // p204p.tvq
    /* JADX INFO: renamed from: G */
    public final zwq mo54483G() {
        return (zwq) mo27342Q().mo25530i();
    }

    @Override // p204p.tvq
    /* JADX INFO: renamed from: I */
    public final eab mo54484I() {
        qr60 qr60Var = f116670t[0];
        return (tys0) this.f116671h.invoke();
    }

    @Override // p204p.tvq
    /* JADX INFO: renamed from: O */
    public final tvq mo30697O(sp60 sp60Var) {
        throw new IllegalStateException("Property accessors can only be copied by copying the corresponding property");
    }

    @Override // p204p.hwq
    /* JADX INFO: renamed from: P */
    public final kys0 mo48947P() {
        qr60 qr60Var = f116670t[0];
        return (tys0) this.f116671h.invoke();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jwq) && wj50.m88271j(mo27342Q(), ((jwq) obj).mo27342Q());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.fr70] */
    @Override // p204p.cpv0
    public final lbb getCaller() {
        return (lbb) this.f116672i.getValue();
    }

    @Override // p204p.rp60
    public final String getName() {
        return dq60.m36617q(new StringBuilder("<get-"), mo27342Q().f234720i, '>');
    }

    public final int hashCode() {
        return mo27342Q().hashCode();
    }

    public final String toString() {
        return "getter of " + mo27342Q();
    }
}
