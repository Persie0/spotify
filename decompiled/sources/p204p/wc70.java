package p204p;

/* JADX INFO: loaded from: classes11.dex */
public class wc70 extends ad70 implements lr60 {

    /* JADX INFO: renamed from: X */
    public final Object f249975X;

    public wc70(nq60 nq60Var, String str, Object obj, x870 x870Var) {
        super(nq60Var, str, obj, x870Var);
        this.f249975X = q3d0.m72078I(2, new uc70(this, 0));
        q3d0.m72078I(2, new uc70(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.fr70] */
    @Override // p204p.ad70
    /* JADX INFO: renamed from: G */
    public final qc70 mo25525G() {
        return (vc70) this.f249975X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.fr70] */
    @Override // p204p.qr60
    /* JADX INFO: renamed from: b */
    public final jr60 mo32428b() {
        return (vc70) this.f249975X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.fr70] */
    @Override // p204p.lr60
    public final Object get() {
        return ((vc70) this.f249975X.getValue()).mo36585j(new Object[0]);
    }

    @Override // p204p.eh00
    public final Object invoke() {
        return get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.fr70] */
    @Override // p204p.qr60
    /* JADX INFO: renamed from: b */
    public final kr60 mo32428b() {
        return (vc70) this.f249975X.getValue();
    }
}
