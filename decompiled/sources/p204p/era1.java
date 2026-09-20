package p204p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class era1 {

    /* JADX INFO: renamed from: a */
    public final p140 f62063a;

    /* JADX INFO: renamed from: b */
    public final zqa1 f62064b;

    public era1(p140 p140Var, zqa1 zqa1Var) {
        this.f62063a = p140Var;
        this.f62064b = zqa1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m39771a(String str, String str2, ibk ibkVar) {
        cra1 cra1Var;
        if (ibkVar instanceof cra1) {
            cra1Var = (cra1) ibkVar;
            int i = cra1Var.f41252d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cra1Var.f41252d = i - Integer.MIN_VALUE;
            } else {
                cra1Var = new cra1(this, ibkVar);
            }
        } else {
            cra1Var = new cra1(this, ibkVar);
        }
        Object objM44035k = cra1Var.f41250b;
        int i2 = cra1Var.f41252d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM44035k);
                p140 p140Var = this.f62063a;
                if (str2 == null) {
                    str2 = "";
                }
                cra1Var.f41249a = str;
                cra1Var.f41252d = 1;
                objM44035k = g9g1.m44035k(p140Var, str, str2, cra1Var);
                yuk yukVar = yuk.f276404a;
                if (objM44035k == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = cra1Var.f41249a;
                bga.m29073P(objM44035k);
            }
            e0x0 e0x0Var = (e0x0) objM44035k;
            if (e0x0Var == null) {
                return null;
            }
            this.f62064b.f285337a.put(str, e0x0Var);
            return e0x0Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m39772b(String str, String str2, ibk ibkVar) {
        dra1 dra1Var;
        if (ibkVar instanceof dra1) {
            dra1Var = (dra1) ibkVar;
            int i = dra1Var.f52278c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dra1Var.f52278c = i - Integer.MIN_VALUE;
            } else {
                dra1Var = new dra1(this, ibkVar);
            }
        } else {
            dra1Var = new dra1(this, ibkVar);
        }
        Object objM39771a = dra1Var.f52276a;
        int i2 = dra1Var.f52278c;
        if (i2 == 0) {
            bga.m29073P(objM39771a);
            e0x0 e0x0Var = (e0x0) this.f62064b.f285337a.get(str);
            if (e0x0Var != null && (str2 == null || wj50.m88271j(e0x0Var.m37506a(), str2))) {
                return e0x0Var.m37507b();
            }
            dra1Var.f52278c = 1;
            objM39771a = m39771a(str, str2, dra1Var);
            Object obj = yuk.f276404a;
            if (objM39771a == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM39771a);
        }
        e0x0 e0x0Var2 = (e0x0) objM39771a;
        if (e0x0Var2 == null) {
            return null;
        }
        return e0x0Var2.m37507b();
    }
}
