package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class b411 {

    /* JADX INFO: renamed from: a */
    public final boolean f23169a;

    /* JADX INFO: renamed from: b */
    public udy0 f23170b;

    public b411(boolean z) {
        tnk0 tnk0Var = tnk0.f221995a;
        this.f23169a = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1, types: [p.pa81] */
    /* JADX WARN: Type inference failed for: r5v5, types: [p.pa81] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [p.th00] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m28059a(String str, Object obj, th00 th00Var, fbk fbkVar) {
        y311 y311Var;
        if (fbkVar instanceof y311) {
            y311Var = (y311) fbkVar;
            int i = y311Var.f268729d;
            if ((i & Integer.MIN_VALUE) != 0) {
                y311Var.f268729d = i - Integer.MIN_VALUE;
            } else {
                y311Var = new y311(this, fbkVar);
            }
        } else {
            y311Var = new y311(this, fbkVar);
        }
        Object objInvoke = y311Var.f268727b;
        int i2 = y311Var.f268729d;
        try {
            if (i2 == 0) {
                bga.m29073P(objInvoke);
                boolean z = this.f23169a;
                yuk yukVar = yuk.f276404a;
                if (z) {
                    pa81 pa81VarM83565m = unk0.m83565m(tnk0.f221995a, str, obj, 4);
                    a411 a411Var = new a411(pa81VarM83565m);
                    y311Var.f268726a = pa81VarM83565m;
                    y311Var.f268729d = 2;
                    objInvoke = th00Var.invoke(a411Var, y311Var);
                    str = pa81VarM83565m;
                } else {
                    y311Var.f268729d = 1;
                    Object objInvoke2 = th00Var.invoke(x311.f257665a, y311Var);
                    if (objInvoke2 != yukVar) {
                        return objInvoke2;
                    }
                }
                return yukVar;
            }
            if (i2 == 1) {
                bga.m29073P(objInvoke);
                return objInvoke;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pa81 pa81Var = y311Var.f268726a;
            bga.m29073P(objInvoke);
            str = pa81Var;
            str.stop();
            return objInvoke;
        } catch (Throwable th) {
            str.stop();
            throw th;
        }
    }
}
