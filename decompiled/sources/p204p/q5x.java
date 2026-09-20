package p204p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class q5x {

    /* JADX INFO: renamed from: a */
    public final epx f185623a;

    /* JADX INFO: renamed from: b */
    public final luk f185624b;

    public /* synthetic */ q5x(epx epxVar, luk lukVar) {
        this.f185623a = epxVar;
        this.f185624b = lukVar;
    }

    /* JADX INFO: renamed from: a */
    public static String m72199a(m340 m340Var) {
        String str;
        z240 z240VarM60640a = m340Var.m60640a(a340.f11863d);
        if (z240VarM60640a == null && (z240VarM60640a = m340Var.m60640a(a340.f11861b)) == null) {
            z240VarM60640a = (z240) g6f.m43745s0(m340Var.f139524a);
        }
        if (z240VarM60640a == null || (str = z240VarM60640a.f278475a.f198763a) == null || wl51.m88460J0(str)) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m72200b(m5x m5xVar, ibk ibkVar) {
        o5x o5xVar;
        m5x m5xVar2;
        Exception e;
        rlv0 rlv0Var;
        if (ibkVar instanceof o5x) {
            o5xVar = (o5x) ibkVar;
            int i = o5xVar.f162146e;
            if ((i & Integer.MIN_VALUE) != 0) {
                o5xVar.f162146e = i - Integer.MIN_VALUE;
            } else {
                o5xVar = new o5x(this, ibkVar);
            }
        } else {
            o5xVar = new o5x(this, ibkVar);
        }
        Object objM76981v = o5xVar.f162144c;
        int i2 = o5xVar.f162146e;
        fbk fbkVar = null;
        try {
            if (i2 == 0) {
                bga.m29073P(objM76981v);
                C1668ai c1668ai = new C1668ai("concert-entity-page-event-hero", false, (gh00) new f6v(m5xVar, 29));
                rlv0 rlv0Var2 = new rlv0();
                try {
                    s5u s5uVar = new s5u(b0g1.m27776L(cyf1.m34374j(k0e1.m54985d(((jpx) this.f185623a).m53978b(c1668ai)), this.f185624b), new cyh(rlv0Var2, fbkVar, 1)), m5xVar, 9);
                    long j = r5x.f196140a;
                    t8s t8sVar = new t8s(s5uVar, fbkVar, 22);
                    o5xVar.f162142a = m5xVar;
                    o5xVar.f162143b = rlv0Var2;
                    o5xVar.f162146e = 1;
                    objM76981v = s1h1.m76981v(j, t8sVar, o5xVar);
                    yuk yukVar = yuk.f276404a;
                    if (objM76981v == yukVar) {
                        return yukVar;
                    }
                    m5xVar2 = m5xVar;
                    rlv0Var = rlv0Var2;
                } catch (Exception e2) {
                    m5xVar2 = m5xVar;
                    e = e2;
                    Logger.m3967c(e, "Failed to resolve event hero metadata for %s", m5xVar2.m60895e());
                    return null;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rlv0Var = o5xVar.f162143b;
                m5xVar2 = o5xVar.f162142a;
                try {
                    bga.m29073P(objM76981v);
                } catch (Exception e3) {
                    e = e3;
                    Logger.m3967c(e, "Failed to resolve event hero metadata for %s", m5xVar2.m60895e());
                    return null;
                }
            }
            gqx gqxVar = (gqx) objM76981v;
            if (gqxVar == null && rlv0Var.f200373a == null) {
                Logger.m3973i("Timed out resolving event hero metadata for %s", m5xVar2.m60895e());
            }
            return gqxVar == null ? (gqx) rlv0Var.f200373a : gqxVar;
        } catch (CancellationException e4) {
            throw e4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public Object m72201c(String str, ntx ntxVar, ibk ibkVar) {
        v9f0 v9f0Var;
        if (ibkVar instanceof v9f0) {
            v9f0Var = (v9f0) ibkVar;
            int i = v9f0Var.f238937c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v9f0Var.f238937c = i - Integer.MIN_VALUE;
            } else {
                v9f0Var = new v9f0(this, ibkVar);
            }
        } else {
            v9f0Var = new v9f0(this, ibkVar);
        }
        Object obj = v9f0Var.f238935a;
        int i2 = v9f0Var.f238937c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        aab0 aab0Var = new aab0(ntxVar, this, str, null, 25);
        v9f0Var.f238937c = 1;
        Object objM89557A = x0h1.m89557A(this.f185624b, aab0Var, v9f0Var);
        yuk yukVar = yuk.f276404a;
        return objM89557A == yukVar ? yukVar : objM89557A;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0096  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public Object m72202d(m5x m5xVar, ibk ibkVar) {
        p5x p5xVar;
        String strM72199a;
        m340 m340Var;
        String strM60893c;
        jiu jiuVar;
        m0v m0vVar;
        ufu ufuVar;
        w240 w240Var;
        m340 m340Var2;
        w240 w240Var2;
        String str;
        m340 m340Var3;
        if (ibkVar instanceof p5x) {
            p5xVar = (p5x) ibkVar;
            int i = p5xVar.f174250d;
            if ((i & Integer.MIN_VALUE) != 0) {
                p5xVar.f174250d = i - Integer.MIN_VALUE;
            } else {
                p5xVar = new p5x(this, ibkVar);
            }
        } else {
            p5xVar = new p5x(this, ibkVar);
        }
        Object objM72200b = p5xVar.f174248b;
        int i2 = p5xVar.f174250d;
        if (i2 == 0) {
            bga.m29073P(objM72200b);
            p5xVar.f174247a = m5xVar;
            p5xVar.f174250d = 1;
            objM72200b = m72200b(m5xVar, p5xVar);
            Object obj = yuk.f276404a;
            if (objM72200b == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m5xVar = p5xVar.f174247a;
            bga.m29073P(objM72200b);
        }
        gqx gqxVar = (gqx) objM72200b;
        if (gqxVar == null) {
            return m5xVar;
        }
        erc1 erc1Var = (erc1) gqxVar.mo45449a(erc1.class, m5xVar.m60895e()).f72301b;
        puh puhVar = (puh) gqxVar.mo45449a(puh.class, m5xVar.m60895e()).f72301b;
        Integer numM74180J = null;
        if (erc1Var == null || (m340Var3 = erc1Var.f62079a) == null || (strM72199a = m72199a(m340Var3)) == null) {
            strM72199a = (erc1Var == null || (m340Var = erc1Var.f62083e) == null) ? null : m72199a(m340Var);
            if (strM72199a == null) {
                strM72199a = m5xVar.m60892b();
            }
        }
        if (m5xVar.m60894d() != 2) {
            strM60893c = m5xVar.m60893c();
        } else if (puhVar == null || (strM60893c = puhVar.f181450c) == null) {
            if (puhVar != null || (str = puhVar.f181449b) == null) {
                strM60893c = null;
            } else {
                if (wl51.m88460J0(str)) {
                    str = null;
                }
                strM60893c = str;
            }
            if (strM60893c == null) {
                strM60893c = m5xVar.m60893c();
            }
        } else {
            if (wl51.m88460J0(strM60893c)) {
                strM60893c = null;
            }
            if (strM60893c == null) {
                if (puhVar != null) {
                    strM60893c = null;
                } else {
                    strM60893c = null;
                }
                if (strM60893c == null) {
                    strM60893c = m5xVar.m60893c();
                }
            }
        }
        if (m5xVar.m60894d() != 2) {
            jiuVar = null;
        } else if (erc1Var == null || (m340Var2 = erc1Var.f62079a) == null || (w240Var2 = m340Var2.f139525b) == null || (jiuVar = w240Var2.f247224c) == null) {
            if (erc1Var == null || (w240Var = erc1Var.f62082d) == null) {
                jiuVar = null;
            } else {
                jiuVar = w240Var.f247224c;
            }
        }
        Integer numM74180J2 = (jiuVar == null || (ufuVar = jiuVar.f112823a) == null) ? null : qyg1.m74180J(rfg1.m75429D(ufuVar.f229876c));
        if (jiuVar != null && (m0vVar = jiuVar.f112824b) != null) {
            numM74180J = qyg1.m74180J(rfg1.m75429D(m0vVar.f138758b));
        }
        return m5x.m60891a(m5xVar, strM72199a, strM60893c, numM74180J2, numM74180J);
    }
}
