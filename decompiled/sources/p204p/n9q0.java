package p204p;

import android.database.SQLException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class n9q0 implements gy81, abu0 {

    /* JADX INFO: renamed from: a */
    public final e45 f151846a;

    /* JADX INFO: renamed from: b */
    public final n0j f151847b;

    /* JADX INFO: renamed from: c */
    public final boolean f151848c;

    /* JADX INFO: renamed from: d */
    public final hj5 f151849d = new hj5();

    /* JADX INFO: renamed from: e */
    public volatile boolean f151850e;

    public n9q0(e45 e45Var, n0j n0jVar, boolean z) {
        this.f151846a = e45Var;
        this.f151847b = n0jVar;
        this.f151848c = z;
    }

    @Override // p204p.gy81
    /* JADX INFO: renamed from: a */
    public final Object mo43962a(fy81 fy81Var, th00 th00Var, mb61 mb61Var) {
        if (this.f151850e) {
            mif1.m61859L(21, "Connection is recycled");
            throw null;
        }
        uxi uxiVar = (uxi) mb61Var.getContext().mo26595B(this.f151846a);
        if (uxiVar != null && uxiVar.f234931b == this) {
            return m63931g(fy81Var, th00Var, mb61Var);
        }
        mif1.m61859L(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // p204p.abu0
    /* JADX INFO: renamed from: b */
    public final yyx0 mo25389b() {
        return this.f151847b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.f9q0
    /* JADX INFO: renamed from: c */
    public final Object mo31798c(String str, gh00 gh00Var, ibk ibkVar) {
        m9q0 m9q0Var;
        n0j n0jVar;
        if (ibkVar instanceof m9q0) {
            m9q0Var = (m9q0) ibkVar;
            int i = m9q0Var.f141365f;
            if ((i & Integer.MIN_VALUE) != 0) {
                m9q0Var.f141365f = i - Integer.MIN_VALUE;
            } else {
                m9q0Var = new m9q0(this, ibkVar);
            }
        } else {
            m9q0Var = new m9q0(this, ibkVar);
        }
        Object obj = m9q0Var.f141363d;
        yuk yukVar = yuk.f276404a;
        int i2 = m9q0Var.f141365f;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (this.f151850e) {
                mif1.m61859L(21, "Connection is recycled");
                throw null;
            }
            uxi uxiVar = (uxi) m9q0Var.getContext().mo26595B(this.f151846a);
            if (uxiVar == null || uxiVar.f234931b != this) {
                mif1.m61859L(21, "Attempted to use connection on a different coroutine");
                throw null;
            }
            n0jVar = this.f151847b;
            m9q0Var.f141360a = str;
            m9q0Var.f141361b = gh00Var;
            m9q0Var.f141362c = n0jVar;
            m9q0Var.f141365f = 1;
            if (n0jVar.f149098b.mo54248a(m9q0Var) == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n0j n0jVar2 = m9q0Var.f141362c;
            gh00Var = m9q0Var.f141361b;
            String str2 = m9q0Var.f141360a;
            bga.m29073P(obj);
            n0jVar = n0jVar2;
            str = str2;
        }
        try {
            g9q0 g9q0Var = new g9q0(this, this.f151847b.mo63454G1(str));
            try {
                Object objInvoke = gh00Var.invoke(g9q0Var);
                mif1.m61875i(g9q0Var, null);
                n0jVar.mo54249c(null);
                return objInvoke;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    mif1.m61875i(g9q0Var, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            n0jVar.mo54249c(null);
            throw th3;
        }
    }

    @Override // p204p.gy81
    /* JADX INFO: renamed from: d */
    public final Boolean mo43963d(fbk fbkVar) {
        if (this.f151850e) {
            mif1.m61859L(21, "Connection is recycled");
            throw null;
        }
        uxi uxiVar = (uxi) fbkVar.getContext().mo26595B(this.f151846a);
        if (uxiVar != null && uxiVar.f234931b == this) {
            return Boolean.valueOf(!this.f151849d.isEmpty() || this.f151847b.f149097a.mo63456w());
        }
        mif1.m61859L(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: e */
    public final Object m63929e(fy81 fy81Var, ibk ibkVar) {
        j9q0 j9q0Var;
        n0j n0jVar;
        hj5 hj5Var = this.f151849d;
        if (ibkVar instanceof j9q0) {
            j9q0Var = (j9q0) ibkVar;
            int i = j9q0Var.f110230e;
            if ((i & Integer.MIN_VALUE) != 0) {
                j9q0Var.f110230e = i - Integer.MIN_VALUE;
            } else {
                j9q0Var = new j9q0(this, ibkVar);
            }
        } else {
            j9q0Var = new j9q0(this, ibkVar);
        }
        Object obj = j9q0Var.f110228c;
        int i2 = j9q0Var.f110230e;
        n0j n0jVar2 = this.f151847b;
        if (i2 == 0) {
            bga.m29073P(obj);
            j9q0Var.f110226a = fy81Var;
            j9q0Var.f110227b = n0jVar2;
            j9q0Var.f110230e = 1;
            Object objMo54248a = n0jVar2.f149098b.mo54248a(j9q0Var);
            yuk yukVar = yuk.f276404a;
            if (objMo54248a == yukVar) {
                return yukVar;
            }
            n0jVar = n0jVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n0j n0jVar3 = j9q0Var.f110227b;
            fy81 fy81Var2 = j9q0Var.f110226a;
            bga.m29073P(obj);
            n0jVar = n0jVar3;
            fy81Var = fy81Var2;
        }
        try {
            int i3 = hj5Var.f91964c;
            if (hj5Var.isEmpty()) {
                int iOrdinal = fy81Var.ordinal();
                if (iOrdinal == 0) {
                    mif1.m61880o(n0jVar2, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    mif1.m61880o(n0jVar2, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mif1.m61880o(n0jVar2, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                mif1.m61880o(n0jVar2, "SAVEPOINT '" + i3 + '\'');
            }
            hj5Var.addLast(new i9q0(i3));
            w2a1 w2a1Var = w2a1.f247311a;
            n0jVar.mo54249c(null);
            return w2a1Var;
        } catch (Throwable th) {
            n0jVar.mo54249c(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: f */
    public final Object m63930f(boolean z, ibk ibkVar) {
        k9q0 k9q0Var;
        n0j n0jVar;
        hj5 hj5Var = this.f151849d;
        if (ibkVar instanceof k9q0) {
            k9q0Var = (k9q0) ibkVar;
            int i = k9q0Var.f120676e;
            if ((i & Integer.MIN_VALUE) != 0) {
                k9q0Var.f120676e = i - Integer.MIN_VALUE;
            } else {
                k9q0Var = new k9q0(this, ibkVar);
            }
        } else {
            k9q0Var = new k9q0(this, ibkVar);
        }
        Object obj = k9q0Var.f120674c;
        int i2 = k9q0Var.f120676e;
        n0j n0jVar2 = this.f151847b;
        if (i2 == 0) {
            bga.m29073P(obj);
            k9q0Var.f120673b = n0jVar2;
            k9q0Var.f120672a = z;
            k9q0Var.f120676e = 1;
            Object objMo54248a = n0jVar2.f149098b.mo54248a(k9q0Var);
            yuk yukVar = yuk.f276404a;
            if (objMo54248a == yukVar) {
                return yukVar;
            }
            n0jVar = n0jVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = k9q0Var.f120672a;
            n0jVar = k9q0Var.f120673b;
            bga.m29073P(obj);
        }
        try {
            if (hj5Var.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            i9q0 i9q0Var = (i9q0) j6f.m52570b0(hj5Var);
            if (z) {
                i9q0Var.getClass();
                if (hj5Var.isEmpty()) {
                    mif1.m61880o(n0jVar2, "END TRANSACTION");
                } else {
                    mif1.m61880o(n0jVar2, "RELEASE SAVEPOINT '" + i9q0Var.f100065a + '\'');
                }
            } else if (hj5Var.isEmpty()) {
                mif1.m61880o(n0jVar2, "ROLLBACK TRANSACTION");
            } else {
                mif1.m61880o(n0jVar2, "ROLLBACK TRANSACTION TO SAVEPOINT '" + i9q0Var.f100065a + '\'');
            }
            w2a1 w2a1Var = w2a1.f247311a;
            n0jVar.mo54249c(null);
            return w2a1Var;
        } catch (Throwable th) {
            n0jVar.mo54249c(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009e, code lost:
    
        if (m63930f(false, r0) == r7) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, p.th00] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v4, types: [p.th00] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [p.n9q0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [p.fy81] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v5, types: [p.fy81] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m63931g(fy81 th, th00 th00Var, ibk ibkVar) {
        l9q0 l9q0Var;
        ?? r9;
        ?? r10;
        ?? r11;
        if (ibkVar instanceof l9q0) {
            l9q0Var = (l9q0) ibkVar;
            int i = l9q0Var.f131168f;
            if ((i & Integer.MIN_VALUE) != 0) {
                l9q0Var.f131168f = i - Integer.MIN_VALUE;
            } else {
                l9q0Var = new l9q0(this, ibkVar);
            }
        } else {
            l9q0Var = new l9q0(this, ibkVar);
        }
        Object objInvoke = l9q0Var.f131166d;
        int i2 = l9q0Var.f131168f;
        boolean z = false;
        yuk yukVar = yuk.f276404a;
        try {
            try {
                if (i2 == 0) {
                    bga.m29073P(objInvoke);
                    if (th == 0) {
                        r10 = th;
                        r10 = fy81.f74655a;
                    }
                    r10 = th;
                    l9q0Var.f131163a = th00Var;
                    l9q0Var.f131168f = 1;
                    r11 = th00Var;
                    if (m63929e(r10, l9q0Var) != yukVar) {
                    }
                    return yukVar;
                }
                if (i2 == 1) {
                    th00 th00Var2 = (th00) l9q0Var.f131163a;
                    bga.m29073P(objInvoke);
                    r11 = th00Var2;
                } else {
                    if (i2 != 2) {
                        if (i2 == 3 || i2 == 4) {
                            Object obj = l9q0Var.f131163a;
                            bga.m29073P(objInvoke);
                            return obj;
                        }
                        if (i2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th2 = l9q0Var.f131164b;
                        bga.m29073P(objInvoke);
                        r9 = th2;
                        throw r9;
                    }
                    int i3 = l9q0Var.f131165c;
                    bga.m29073P(objInvoke);
                    th = i3;
                    th00Var = th00Var;
                }
                if (th != 0) {
                    th00Var = r11;
                    z = true;
                }
                th00Var = r11;
                l9q0Var.f131163a = objInvoke;
                l9q0Var.f131168f = 3;
                if (m63930f(z, l9q0Var) != yukVar) {
                    return yukVar;
                }
                return objInvoke;
                h9q0 h9q0Var = new h9q0(this);
                l9q0Var.f131163a = null;
                l9q0Var.f131165c = 1;
                l9q0Var.f131168f = 2;
                objInvoke = r11.invoke(h9q0Var, l9q0Var);
                if (objInvoke != yukVar) {
                    th = 1;
                    if (th != 0) {
                        th00Var = r11;
                        z = true;
                    }
                    th00Var = r11;
                    l9q0Var.f131163a = objInvoke;
                    l9q0Var.f131168f = 3;
                    if (m63930f(z, l9q0Var) != yukVar) {
                        return objInvoke;
                    }
                }
                return yukVar;
            } catch (Throwable th3) {
                th = th3;
                th00Var = th;
                try {
                    throw th00Var;
                } catch (Throwable th4) {
                    l9q0Var.f131163a = th00Var;
                    l9q0Var.f131164b = th4;
                    l9q0Var.f131168f = 5;
                    r9 = th4;
                }
            }
        } catch (SQLException e) {
            if (th00Var == 0) {
                throw e;
            }
            y85.m93061f(th00Var, e);
            r9 = th;
        }
    }
}
