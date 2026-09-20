package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class tjz implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f221034a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fiz f221035b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mb61 f221036c;

    /* JADX WARN: Multi-variable type inference failed */
    public tjz(fiz fizVar, th00 th00Var) {
        this.f221035b = fizVar;
        this.f221036c = (mb61) th00Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v8, types: [p.mb61, p.th00] */
    /* JADX WARN: Type inference failed for: r2v0, types: [p.mb61, p.vh00] */
    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        sjz sjzVar;
        int i;
        mh71 mh71Var;
        izx0 izx0Var;
        izx0 izx0Var2;
        switch (this.f221034a) {
            case 0:
                if (fbkVar instanceof sjz) {
                    sjzVar = (sjz) fbkVar;
                    int i2 = sjzVar.f209953b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        sjzVar.f209953b = i2 - Integer.MIN_VALUE;
                    } else {
                        sjzVar = new sjz(this, fbkVar);
                    }
                } else {
                    sjzVar = new sjz(this, fbkVar);
                }
                Object obj = sjzVar.f209952a;
                int i3 = sjzVar.f209953b;
                ?? r2 = this.f221036c;
                yuk yukVar = yuk.f276404a;
                if (i3 == 0) {
                    bga.m29073P(obj);
                    i = 0;
                    try {
                        fiz fizVar = this.f221035b;
                        sjzVar.f209955d = nizVar;
                        sjzVar.f209957f = 0;
                        sjzVar.f209953b = 1;
                        if (fizVar.collect(nizVar, sjzVar) == yukVar) {
                            return yukVar;
                        }
                        izx0Var = new izx0(nizVar, sjzVar.getContext());
                        sjzVar.f209955d = null;
                        sjzVar.f209956e = izx0Var;
                        sjzVar.f209957f = i;
                        sjzVar.f209953b = 3;
                        if (r2.mo24510D0(izx0Var, null, sjzVar) == yukVar) {
                            return yukVar;
                        }
                        izx0Var2 = izx0Var;
                        izx0Var2.releaseIntercepted();
                        return w2a1.f247311a;
                    } catch (Throwable th) {
                        th = th;
                        mh71Var = new mh71(th);
                        sjzVar.f209955d = null;
                        sjzVar.f209956e = th;
                        sjzVar.f209957f = i;
                        sjzVar.f209953b = 2;
                        if (kyf1.m57700e(mh71Var, r2, th, sjzVar) == yukVar) {
                            return yukVar;
                        }
                        throw th;
                    }
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        Throwable th2 = (Throwable) sjzVar.f209956e;
                        bga.m29073P(obj);
                        throw th2;
                    }
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    izx0Var2 = (izx0) sjzVar.f209956e;
                    try {
                        bga.m29073P(obj);
                        izx0Var2.releaseIntercepted();
                        return w2a1.f247311a;
                    } catch (Throwable th3) {
                        th = th3;
                        izx0Var2.releaseIntercepted();
                        throw th;
                    }
                }
                int i4 = sjzVar.f209957f;
                niz nizVar2 = sjzVar.f209955d;
                try {
                    bga.m29073P(obj);
                    i = i4;
                    nizVar = nizVar2;
                    izx0Var = new izx0(nizVar, sjzVar.getContext());
                    try {
                        sjzVar.f209955d = null;
                        sjzVar.f209956e = izx0Var;
                        sjzVar.f209957f = i;
                        sjzVar.f209953b = 3;
                        if (r2.mo24510D0(izx0Var, null, sjzVar) == yukVar) {
                            return yukVar;
                        }
                        izx0Var2 = izx0Var;
                        izx0Var2.releaseIntercepted();
                        return w2a1.f247311a;
                    } catch (Throwable th4) {
                        th = th4;
                        izx0Var2 = izx0Var;
                        izx0Var2.releaseIntercepted();
                        throw th;
                    }
                } catch (Throwable th5) {
                    i = i4;
                    th = th5;
                    mh71Var = new mh71(th);
                    sjzVar.f209955d = null;
                    sjzVar.f209956e = th;
                    sjzVar.f209957f = i;
                    sjzVar.f209953b = 2;
                    if (kyf1.m57700e(mh71Var, r2, th, sjzVar) == yukVar) {
                        return yukVar;
                    }
                    throw th;
                }
            default:
                Object objCollect = this.f221035b.collect(new okz(nizVar, (th00) this.f221036c), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tjz(fiz fizVar, vh00 vh00Var) {
        this.f221035b = fizVar;
        this.f221036c = (mb61) vh00Var;
    }
}
