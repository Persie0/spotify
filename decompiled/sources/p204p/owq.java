package p204p;

/* JADX INFO: loaded from: classes11.dex */
public class owq extends uwq implements lr60 {

    /* JADX INFO: renamed from: O0 */
    public final Object f170757O0;

    public owq(nq60 nq60Var, nys0 nys0Var, sp60 sp60Var) {
        super(nq60Var, nys0Var, sp60Var);
        this.f170757O0 = q3d0.m72078I(2, new mwq(this, 0));
        q3d0.m72078I(2, new mwq(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.fr70] */
    @Override // p204p.uwq
    /* JADX INFO: renamed from: R */
    public final jwq mo68184R() {
        return (nwq) this.f170757O0.getValue();
    }

    @Override // p204p.tvq
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public owq mo30697O(sp60 sp60Var) {
        return new owq(this.f234719h, mo54484I(), sp60Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.fr70] */
    @Override // p204p.qr60
    /* JADX INFO: renamed from: b */
    public final jr60 mo32428b() {
        return (nwq) this.f170757O0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.fr70] */
    @Override // p204p.lr60
    public final Object get() {
        return ((nwq) this.f170757O0.getValue()).mo36585j(new Object[0]);
    }

    @Override // p204p.eh00
    public final Object invoke() {
        return get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.fr70] */
    @Override // p204p.qr60
    /* JADX INFO: renamed from: b */
    public final kr60 mo32428b() {
        return (nwq) this.f170757O0.getValue();
    }

    public owq(nq60 nq60Var, String str, String str2, Object obj) {
        super(nq60Var, str, str2, obj);
        this.f170757O0 = q3d0.m72078I(2, new mwq(this, 0));
        q3d0.m72078I(2, new mwq(this, 1));
    }
}
