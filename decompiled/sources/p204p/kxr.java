package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class kxr implements fiz {

    /* JADX INFO: renamed from: a */
    public final fiz f127580a;

    /* JADX INFO: renamed from: b */
    public final gh00 f127581b;

    /* JADX INFO: renamed from: c */
    public final th00 f127582c;

    public kxr(fiz fizVar, gh00 gh00Var, th00 th00Var) {
        this.f127580a = fizVar;
        this.f127581b = gh00Var;
        this.f127582c = th00Var;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        rlv0 rlv0Var = new rlv0();
        rlv0Var.f200373a = qkf1.f189548a;
        Object objCollect = this.f127580a.collect(new fwj(this, rlv0Var, nizVar, 1), fbkVar);
        return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
    }
}
