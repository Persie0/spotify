package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class a411 implements v311 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pa81 f12115a;

    public a411(pa81 pa81Var) {
        this.f12115a = pa81Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1, types: [p.aw31] */
    /* JADX WARN: Type inference failed for: r5v3, types: [p.aw31] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r6v0, types: [p.th00] */
    @Override // p204p.v311
    /* JADX INFO: renamed from: a */
    public final Object mo24656a(String str, th00 th00Var, fbk fbkVar) {
        z311 z311Var;
        if (fbkVar instanceof z311) {
            z311Var = (z311) fbkVar;
            int i = z311Var.f278743d;
            if ((i & Integer.MIN_VALUE) != 0) {
                z311Var.f278743d = i - Integer.MIN_VALUE;
            } else {
                z311Var = new z311(this, fbkVar);
            }
        } else {
            z311Var = new z311(this, fbkVar);
        }
        Object objInvoke = z311Var.f278741b;
        int i2 = z311Var.f278743d;
        try {
            if (i2 == 0) {
                bga.m29073P(objInvoke);
                aw31 aw31VarMo51102c = this.f12115a.mo51102c(null, str);
                w311 w311Var = new w311();
                z311Var.f278740a = aw31VarMo51102c;
                z311Var.f278743d = 1;
                objInvoke = th00Var.invoke(w311Var, z311Var);
                yuk yukVar = yuk.f276404a;
                str = aw31VarMo51102c;
                if (objInvoke == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aw31 aw31Var = z311Var.f278740a;
                bga.m29073P(objInvoke);
                str = aw31Var;
            }
            str.mo27275a(null);
            return objInvoke;
        } catch (Throwable th) {
            str.mo27275a(null);
            throw th;
        }
    }

    @Override // p204p.v311
    public final void setAttribute(String str, String str2) {
        this.f12115a.setAttribute(str, str2);
    }
}
