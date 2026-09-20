package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ug21 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jsi0 f229955a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nlv0 f229956b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rlv0 f229957c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ bh21 f229958d;

    public ug21(jsi0 jsi0Var, nlv0 nlv0Var, rlv0 rlv0Var, bh21 bh21Var) {
        this.f229955a = jsi0Var;
        this.f229956b = nlv0Var;
        this.f229957c = rlv0Var;
        this.f229958d = bh21Var;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b4 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:21:0x0050, B:36:0x00ac, B:38:0x00b4), top: B:53:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m83025a(wj0 wj0Var, ibk ibkVar) throws Throwable {
        tg21 tg21Var;
        jsi0 jsi0Var;
        bh21 bh21Var;
        nlv0 nlv0Var;
        rlv0 rlv0Var;
        th00 th00Var;
        jsi0 jsi0Var2;
        jsi0 jsi0Var3;
        bh21 bh21Var2;
        Object obj;
        if (ibkVar instanceof tg21) {
            tg21Var = (tg21) ibkVar;
            int i = tg21Var.f220113h;
            if ((i & Integer.MIN_VALUE) != 0) {
                tg21Var.f220113h = i - Integer.MIN_VALUE;
            } else {
                tg21Var = new tg21(this, ibkVar);
            }
        } else {
            tg21Var = new tg21(this, ibkVar);
        }
        Object obj2 = tg21Var.f220111f;
        int i2 = tg21Var.f220113h;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(obj2);
                tg21Var.f220106a = wj0Var;
                jsi0Var = this.f229955a;
                tg21Var.f220107b = jsi0Var;
                nlv0 nlv0Var2 = this.f229956b;
                tg21Var.f220108c = nlv0Var2;
                rlv0 rlv0Var2 = this.f229957c;
                tg21Var.f220109d = rlv0Var2;
                bh21Var = this.f229958d;
                tg21Var.f220110e = bh21Var;
                tg21Var.f220113h = 1;
                if (jsi0Var.mo54248a(tg21Var) != yukVar) {
                    nlv0Var = nlv0Var2;
                    rlv0Var = rlv0Var2;
                    th00Var = wj0Var;
                }
                return yukVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = tg21Var.f220108c;
                    rlv0Var = (rlv0) tg21Var.f220107b;
                    jsi0Var2 = (jsi0) tg21Var.f220106a;
                    try {
                        bga.m29073P(obj2);
                        rlv0Var.f200373a = obj;
                        Object obj3 = rlv0Var.f200373a;
                        jsi0Var2.mo54249c(null);
                        return obj3;
                    } catch (Throwable th) {
                        th = th;
                        jsi0Var2.mo54249c(null);
                        throw th;
                    }
                }
                bh21Var2 = (bh21) tg21Var.f220108c;
                rlv0Var = (rlv0) tg21Var.f220107b;
                jsi0Var3 = (jsi0) tg21Var.f220106a;
                try {
                    bga.m29073P(obj2);
                    if (!wj50.m88271j(obj2, rlv0Var.f200373a)) {
                        tg21Var.f220106a = jsi0Var3;
                        tg21Var.f220107b = rlv0Var;
                        tg21Var.f220108c = obj2;
                        tg21Var.f220113h = 3;
                        if (bh21Var2.m29198j(obj2, tg21Var) != yukVar) {
                            obj = obj2;
                            jsi0Var2 = jsi0Var3;
                            rlv0Var.f200373a = obj;
                        }
                        return yukVar;
                    }
                    jsi0Var2 = jsi0Var3;
                    Object obj4 = rlv0Var.f200373a;
                    jsi0Var2.mo54249c(null);
                    return obj4;
                } catch (Throwable th2) {
                    th = th2;
                    jsi0Var2 = jsi0Var3;
                    jsi0Var2.mo54249c(null);
                    throw th;
                }
            }
            bh21 bh21Var3 = tg21Var.f220110e;
            rlv0Var = tg21Var.f220109d;
            nlv0Var = (nlv0) tg21Var.f220108c;
            jsi0 jsi0Var4 = (jsi0) tg21Var.f220107b;
            th00 th00Var2 = (th00) tg21Var.f220106a;
            bga.m29073P(obj2);
            bh21Var = bh21Var3;
            th00Var = th00Var2;
            jsi0Var = jsi0Var4;
            if (nlv0Var.f155174a) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = rlv0Var.f200373a;
            tg21Var.f220106a = jsi0Var;
            tg21Var.f220107b = rlv0Var;
            tg21Var.f220108c = bh21Var;
            tg21Var.f220109d = null;
            tg21Var.f220110e = null;
            tg21Var.f220113h = 2;
            Object objInvoke = th00Var.invoke(obj5, tg21Var);
            if (objInvoke != yukVar) {
                jsi0Var3 = jsi0Var;
                obj2 = objInvoke;
                bh21Var2 = bh21Var;
                if (!wj50.m88271j(obj2, rlv0Var.f200373a)) {
                    tg21Var.f220106a = jsi0Var3;
                    tg21Var.f220107b = rlv0Var;
                    tg21Var.f220108c = obj2;
                    tg21Var.f220113h = 3;
                    if (bh21Var2.m29198j(obj2, tg21Var) != yukVar) {
                        obj = obj2;
                        jsi0Var2 = jsi0Var3;
                        rlv0Var.f200373a = obj;
                    }
                } else {
                    jsi0Var2 = jsi0Var3;
                }
                Object obj6 = rlv0Var.f200373a;
                jsi0Var2.mo54249c(null);
                return obj6;
            }
            return yukVar;
        } catch (Throwable th3) {
            th = th3;
            jsi0Var2 = jsi0Var;
            jsi0Var2.mo54249c(null);
            throw th;
        }
    }
}
