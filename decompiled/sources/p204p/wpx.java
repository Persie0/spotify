package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Observable;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes10.dex */
public final class wpx {

    /* JADX INFO: renamed from: a */
    public final epx f253855a;

    public /* synthetic */ wpx(epx epxVar) {
        this.f253855a = epxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Serializable m88725a(wpx wpxVar, List list, ibk ibkVar) {
        s0a0 s0a0Var;
        if (ibkVar instanceof s0a0) {
            s0a0Var = (s0a0) ibkVar;
            int i = s0a0Var.f204336d;
            if ((i & Integer.MIN_VALUE) != 0) {
                s0a0Var.f204336d = i - Integer.MIN_VALUE;
            } else {
                s0a0Var = new s0a0(wpxVar, ibkVar);
            }
        } else {
            s0a0Var = new s0a0(wpxVar, ibkVar);
        }
        Object objM88727c = s0a0Var.f204334b;
        int i2 = s0a0Var.f204336d;
        if (i2 == 0) {
            bga.m29073P(objM88727c);
            C1668ai c1668ai = new C1668ai("playlist-mixing-extended-versions", false, (gh00) new C2602y6(23, list));
            epx epxVar = wpxVar.f253855a;
            s0a0Var.f204333a = list;
            s0a0Var.f204336d = 1;
            objM88727c = wpxVar.m88727c(epxVar, c1668ai, s0a0Var);
            yuk yukVar = yuk.f276404a;
            if (objM88727c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = s0a0Var.f204333a;
            bga.m29073P(objM88727c);
        }
        gqx gqxVar = (gqx) objM88727c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : list) {
            if (gqxVar.mo45449a(daj.class, (String) obj).f72301b != null) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m88726b(zpf0 zpf0Var, ibk ibkVar) {
        p0a0 p0a0Var;
        if (ibkVar instanceof p0a0) {
            p0a0Var = (p0a0) ibkVar;
            int i = p0a0Var.f172624c;
            if ((i & Integer.MIN_VALUE) != 0) {
                p0a0Var.f172624c = i - Integer.MIN_VALUE;
            } else {
                p0a0Var = new p0a0(this, ibkVar);
            }
        } else {
            p0a0Var = new p0a0(this, ibkVar);
        }
        Object objM76978s = p0a0Var.f172622a;
        int i2 = p0a0Var.f172624c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM76978s);
                long j = t0a0.f215800a;
                q0a0 q0a0Var = new q0a0(zpf0Var, this, null, 0);
                p0a0Var.f172624c = 1;
                objM76978s = s1h1.m76978s(j, q0a0Var, p0a0Var);
                yuk yukVar = yuk.f276404a;
                if (objM76978s == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM76978s);
            }
            return (pqf0) objM76978s;
        } catch (TimeoutCancellationException e) {
            Logger.m3967c(e, "Timed out loading extended version data", new Object[0]);
            return jqf0.f114906a;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            Logger.m3967c(e3, "Failed to load extended version data", new Object[0]);
            return jqf0.f114906a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public Object m88727c(epx epxVar, C1668ai c1668ai, ibk ibkVar) {
        r0a0 r0a0Var;
        if (ibkVar instanceof r0a0) {
            r0a0Var = (r0a0) ibkVar;
            int i = r0a0Var.f194420c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r0a0Var.f194420c = i - Integer.MIN_VALUE;
            } else {
                r0a0Var = new r0a0(this, ibkVar);
            }
        } else {
            r0a0Var = new r0a0(this, ibkVar);
        }
        Object obj = r0a0Var.f194418a;
        int i2 = r0a0Var.f194420c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        yab yabVarM54985d = k0e1.m54985d(((jpx) epxVar).m53978b(c1668ai));
        nx70 nx70Var = new nx70(2, 5, null);
        r0a0Var.f194420c = 1;
        Object objM86756u = vyf1.m86756u(yabVarM54985d, nx70Var, r0a0Var);
        yuk yukVar = yuk.f276404a;
        return objM86756u == yukVar ? yukVar : objM86756u;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public Object m88728d(String str, ibk ibkVar) {
        tw01 tw01Var;
        if (ibkVar instanceof tw01) {
            tw01Var = (tw01) ibkVar;
            int i = tw01Var.f224294d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tw01Var.f224294d = i - Integer.MIN_VALUE;
            } else {
                tw01Var = new tw01(this, ibkVar);
            }
        } else {
            tw01Var = new tw01(this, ibkVar);
        }
        Object objM96571q = tw01Var.f224292b;
        int i2 = tw01Var.f224294d;
        if (i2 == 0) {
            bga.m29073P(objM96571q);
            Observable map = ((jpx) this.f253855a).m53978b(new C1668ai("episode-share", false, (gh00) new zpz0(str, 9))).filter(ujr0.f231098Z).map(new ze8(str, 14));
            tw01Var.f224291a = str;
            tw01Var.f224294d = 1;
            objM96571q = zn91.m96571q(map, 1, null, tw01Var);
            yuk yukVar = yuk.f276404a;
            if (objM96571q == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = tw01Var.f224291a;
            bga.m29073P(objM96571q);
        }
        v140 v140Var = (v140) ((fqx) objM96571q).f72301b;
        if (v140Var != null) {
            return v140Var;
        }
        throw new IllegalStateException(edb.m38564m("IdentityTrait was null for ", str).toString());
    }
}
