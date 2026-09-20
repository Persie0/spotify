package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class p7i0 implements pcm0 {

    /* JADX INFO: renamed from: a */
    public final ykn f174700a;

    /* JADX INFO: renamed from: b */
    public boolean f174701b;

    public p7i0(f6m0 f6m0Var, hc80 hc80Var, ofm0 ofm0Var, eh00 eh00Var, nbm0 nbm0Var) {
        this.f174700a = f6m0Var.mo40869a(hc80Var, ofm0Var, eh00Var, nbm0Var);
    }

    @Override // p204p.pcm0
    /* JADX INFO: renamed from: f */
    public final Object mo60822f(Class cls) {
        boolean zEquals = cls.equals(r7i0.class);
        ykn yknVar = this.f174700a;
        if (zEquals) {
            return yknVar.m94050a0();
        }
        if (cls.equals(t9p0.class)) {
            return yknVar.m94050a0();
        }
        throw new IllegalStateException(("Unsupported logger class: " + cls).toString());
    }
}
