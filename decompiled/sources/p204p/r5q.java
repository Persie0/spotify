package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class r5q implements omy0 {

    /* JADX INFO: renamed from: a */
    public final gh00 f196086a;

    /* JADX INFO: renamed from: b */
    public final q5q f196087b = new q5q(this);

    /* JADX INFO: renamed from: c */
    public final bri0 f196088c = new bri0();

    /* JADX INFO: renamed from: d */
    public final yum0 f196089d;

    /* JADX INFO: renamed from: e */
    public final yum0 f196090e;

    /* JADX INFO: renamed from: f */
    public final yum0 f196091f;

    public r5q(gh00 gh00Var) {
        this.f196086a = gh00Var;
        Boolean bool = Boolean.FALSE;
        this.f196089d = sam.m77645B(bool);
        this.f196090e = sam.m77645B(bool);
        this.f196091f = sam.m77645B(bool);
    }

    @Override // p204p.omy0
    /* JADX INFO: renamed from: a */
    public final Object mo28414a(xqi0 xqi0Var, th00 th00Var, fbk fbkVar) {
        Object objM56684z = kk40.m56684z(new h5q(this, xqi0Var, th00Var, null, 4), fbkVar);
        return objM56684z == yuk.f276404a ? objM56684z : w2a1.f247311a;
    }

    @Override // p204p.omy0
    /* JADX INFO: renamed from: b */
    public final boolean mo28415b() {
        return ((Boolean) this.f196089d.getValue()).booleanValue();
    }

    @Override // p204p.omy0
    /* JADX INFO: renamed from: e */
    public final float mo28418e(float f) {
        return ((Number) this.f196086a.invoke(Float.valueOf(f))).floatValue();
    }
}
