package p204p;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class uiq0 {

    /* JADX INFO: renamed from: a */
    public final e6a0 f230792a;

    /* JADX INFO: renamed from: b */
    public final qwx0 f230793b;

    /* JADX INFO: renamed from: c */
    public final rii f230794c;

    /* JADX INFO: renamed from: d */
    public final czj f230795d;

    public uiq0(e6a0 e6a0Var, qwx0 qwx0Var, rii riiVar, czj czjVar) {
        this.f230792a = e6a0Var;
        this.f230793b = qwx0Var;
        this.f230794c = riiVar;
        this.f230795d = czjVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m83205a(e6a0 e6a0Var, String str, ibk ibkVar) {
        oiq0 oiq0Var;
        cbf0 cbf0VarM35556a;
        if (ibkVar instanceof oiq0) {
            oiq0Var = (oiq0) ibkVar;
            int i = oiq0Var.f165867e;
            if ((i & Integer.MIN_VALUE) != 0) {
                oiq0Var.f165867e = i - Integer.MIN_VALUE;
            } else {
                oiq0Var = new oiq0(this, ibkVar);
            }
        } else {
            oiq0Var = new oiq0(this, ibkVar);
        }
        Object obj = oiq0Var.f165865c;
        int i2 = oiq0Var.f165867e;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (this.f230795d.m34453a()) {
                if (((ebf0) e6a0Var.m37927u().f158717a.getValue()).m38368c(mej.class, str) == null) {
                    Map mapM31821M = c95.m31821M(pft0.m69840u(str, Collections.singleton(new fww0(mej.class))));
                    oiq0Var.f165863a = e6a0Var;
                    oiq0Var.f165864b = str;
                    oiq0Var.f165867e = 1;
                    Object objM37917k = e6a0Var.m37917k(mapM31821M, oiq0Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM37917k == yukVar) {
                        return yukVar;
                    }
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = oiq0Var.f165864b;
        e6a0Var = oiq0Var.f165863a;
        bga.m29073P(obj);
        dbf0 dbf0VarM38368c = ((ebf0) e6a0Var.m37927u().f158717a.getValue()).m38368c(mej.class, str);
        mej mejVar = (mej) ((dbf0VarM38368c == null || (cbf0VarM35556a = dbf0VarM38368c.m35556a()) == null) ? null : (ktx) cbf0VarM35556a.f36107a);
        if (mejVar != null) {
            return mejVar.f142740a;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final fiz m83206b(String str, ck90 ck90Var) {
        fbk fbkVar = null;
        if (!this.f230794c.f199551c) {
            return nxf1.m65834m(null);
        }
        qwx0 qwx0Var = this.f230793b;
        return ck90Var != null ? xtm0.m92074U(mvl0.m62953p(new vdm0(k0e1.m54985d(((rwx0) qwx0Var).f203428a), 11)), new x13(this, ck90Var, str, fbkVar, 11)) : xtm0.m92074U(mvl0.m62953p(new vdm0(k0e1.m54985d(((rwx0) qwx0Var).f203428a), 11)), new sb90(fbkVar, this, str, 15));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m83207c(String str, ibk ibkVar) {
        tiq0 tiq0Var;
        if (ibkVar instanceof tiq0) {
            tiq0Var = (tiq0) ibkVar;
            int i = tiq0Var.f220727c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tiq0Var.f220727c = i - Integer.MIN_VALUE;
            } else {
                tiq0Var = new tiq0(this, ibkVar);
            }
        } else {
            tiq0Var = new tiq0(this, ibkVar);
        }
        Object objM83205a = tiq0Var.f220725a;
        int i2 = tiq0Var.f220727c;
        if (i2 == 0) {
            bga.m29073P(objM83205a);
            tiq0Var.f220727c = 1;
            objM83205a = m83205a(this.f230792a, str, tiq0Var);
            Object obj = yuk.f276404a;
            if (objM83205a == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM83205a);
        }
        return wj50.m88271j((vej) objM83205a, uej.f229547a) ? lna0.f135125a : kna0.f124368a;
    }
}
