package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class w7g1 {

    /* JADX INFO: renamed from: a */
    public final g7d1 f248679a;

    /* JADX INFO: renamed from: b */
    public pjq f248680b;

    /* JADX INFO: renamed from: c */
    public final rpe1 f248681c;

    /* JADX INFO: renamed from: d */
    public final okj0 f248682d;

    public w7g1(rpe1 rpe1Var, g7d1 g7d1Var, okj0 okj0Var) {
        this.f248681c = rpe1Var;
        this.f248679a = g7d1Var;
        this.f248682d = okj0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (r7 != r1) goto L27;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m87388a(ibk ibkVar) throws Throwable {
        w6g1 w6g1Var;
        pjq pjqVar;
        String str;
        if (ibkVar instanceof w6g1) {
            w6g1Var = (w6g1) ibkVar;
            int i = w6g1Var.f248381c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w6g1Var.f248381c = i - Integer.MIN_VALUE;
            } else {
                w6g1Var = new w6g1(this, ibkVar);
            }
        } else {
            w6g1Var = new w6g1(this, ibkVar);
        }
        Object objMo31436c = w6g1Var.f248379a;
        yuk yukVar = yuk.f276404a;
        int i2 = w6g1Var.f248381c;
        if (i2 == 0) {
            bga.m29073P(objMo31436c);
            g7d1 g7d1Var = this.f248679a;
            w6g1Var.f248381c = 1;
            objMo31436c = g7d1Var.mo31436c("ovk", w6g1Var);
            if (objMo31436c != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bga.m29073P(objMo31436c);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objMo31436c);
        }
        str = (String) objMo31436c;
        if (str != null || str.length() == 0) {
            return null;
        }
        return str;
        String str2 = (String) objMo31436c;
        if (str2 != null) {
            return str2;
        }
        synchronized (this) {
            pjqVar = this.f248680b;
        }
        if (pjqVar != null) {
            w6g1Var.f248381c = 2;
            objMo31436c = pjqVar.m38777P(w6g1Var);
        } else {
            str = null;
        }
        if (str != null) {
        }
        return null;
    }
}
