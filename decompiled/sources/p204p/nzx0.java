package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class nzx0 implements fiz, iqb {

    /* JADX INFO: renamed from: a */
    public final th00 f160183a;

    public nzx0(th00 th00Var) {
        this.f160183a = th00Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) throws Throwable {
        C1657a7 c1657a7;
        Throwable th;
        izx0 izx0Var;
        if (fbkVar instanceof C1657a7) {
            c1657a7 = (C1657a7) fbkVar;
            int i = c1657a7.f12909d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1657a7.f12909d = i - Integer.MIN_VALUE;
            } else {
                c1657a7 = new C1657a7(this, fbkVar);
            }
        } else {
            c1657a7 = new C1657a7(this, fbkVar);
        }
        Object obj = c1657a7.f12907b;
        int i2 = c1657a7.f12909d;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            izx0Var = c1657a7.f12906a;
            try {
                bga.m29073P(obj);
                izx0Var.releaseIntercepted();
                return w2a1Var;
            } catch (Throwable th2) {
                th = th2;
                izx0Var.releaseIntercepted();
                throw th;
            }
        }
        bga.m29073P(obj);
        izx0 izx0Var2 = new izx0(nizVar, c1657a7.getContext());
        try {
            c1657a7.f12906a = izx0Var2;
            c1657a7.f12909d = 1;
            Object objInvoke = this.f160183a.invoke(izx0Var2, c1657a7);
            yuk yukVar = yuk.f276404a;
            if (objInvoke != yukVar) {
                objInvoke = w2a1Var;
            }
            if (objInvoke == yukVar) {
                return yukVar;
            }
            izx0Var = izx0Var2;
            izx0Var.releaseIntercepted();
            return w2a1Var;
        } catch (Throwable th3) {
            th = th3;
            izx0Var = izx0Var2;
            izx0Var.releaseIntercepted();
            throw th;
        }
    }
}
