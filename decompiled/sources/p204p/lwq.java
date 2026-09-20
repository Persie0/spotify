package p204p;

/* JADX INFO: loaded from: classes11.dex */
public abstract class lwq extends hwq implements uq60 {

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ qr60[] f137619t = {new wys0(lwq.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", 0)};

    /* JADX INFO: renamed from: h */
    public final lpv0 f137620h = kgg1.m56357t(null, new kwq(this, 0));

    /* JADX INFO: renamed from: i */
    public final Object f137621i = q3d0.m72078I(2, new kwq(this, 1));

    @Override // p204p.tvq
    /* JADX INFO: renamed from: G */
    public final zwq mo54483G() {
        qr60 qr60Var = f137619t[0];
        return new zwq(txq.m81932e((zys0) this.f137620h.invoke()).m50169x(), b68.f23871f, false);
    }

    @Override // p204p.tvq
    /* JADX INFO: renamed from: I */
    public final eab mo54484I() {
        qr60 qr60Var = f137619t[0];
        return (zys0) this.f137620h.invoke();
    }

    @Override // p204p.tvq
    /* JADX INFO: renamed from: O */
    public final tvq mo30697O(sp60 sp60Var) {
        throw new IllegalStateException("Property accessors can only be copied by copying the corresponding property");
    }

    @Override // p204p.hwq
    /* JADX INFO: renamed from: P */
    public final kys0 mo48947P() {
        qr60 qr60Var = f137619t[0];
        return (zys0) this.f137620h.invoke();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof lwq) && wj50.m88271j(mo27342Q(), ((lwq) obj).mo27342Q());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.fr70] */
    @Override // p204p.cpv0
    public final lbb getCaller() {
        return (lbb) this.f137621i.getValue();
    }

    @Override // p204p.rp60
    public final String getName() {
        return dq60.m36617q(new StringBuilder("<set-"), mo27342Q().f234720i, '>');
    }

    public final int hashCode() {
        return mo27342Q().hashCode();
    }

    public final String toString() {
        return "setter of " + mo27342Q();
    }
}
