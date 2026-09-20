package p204p;

import com.spotify.ads.esperanto.proto.SubEventRequest;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class kpc1 {

    /* JADX INFO: renamed from: a */
    public final wm0 f125029a;

    /* JADX INFO: renamed from: b */
    public final l3a1 f125030b;

    /* JADX INFO: renamed from: c */
    public final r27 f125031c;

    public kpc1(wm0 wm0Var, l3a1 l3a1Var, ibp ibpVar) {
        this.f125029a = wm0Var;
        this.f125030b = l3a1Var;
        long millis = TimeUnit.MINUTES.toMillis(30L);
        xre xreVar = (xre) ibpVar.f100614b;
        r27 r27Var = new r27();
        r27Var.f195073b = xreVar;
        r27Var.f195072a = millis;
        r27Var.f195074c = Collections.synchronizedMap(new LinkedHashMap());
        this.f125031c = r27Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m57025a(String str, ibk ibkVar) {
        hpc1 hpc1Var;
        Object obj;
        Object l;
        if (ibkVar instanceof hpc1) {
            hpc1Var = (hpc1) ibkVar;
            int i = hpc1Var.f93751d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hpc1Var.f93751d = i - Integer.MIN_VALUE;
            } else {
                hpc1Var = new hpc1(this, ibkVar);
            }
        } else {
            hpc1Var = new hpc1(this, ibkVar);
        }
        Object objM86756u = hpc1Var.f93749b;
        int i2 = hpc1Var.f93751d;
        r27 r27Var = this.f125031c;
        int i3 = 1;
        if (i2 == 0) {
            bga.m29073P(objM86756u);
            Map map = (Map) r27Var.f195074c;
            pqm0 pqm0Var = (pqm0) map.get(str);
            fbk fbkVar = null;
            if (pqm0Var != null) {
                long jLongValue = ((Number) pqm0Var.f180350a).longValue();
                obj = pqm0Var.f180351b;
                ((wy3) ((xre) r27Var.f195073b)).getClass();
                if (System.currentTimeMillis() >= jLongValue) {
                    map.remove(str);
                    obj = null;
                }
                s6x0 s6x0Var = new s6x0(l);
                ((wy3) ((xre) r27Var.f195073b)).getClass();
                ((Map) r27Var.f195074c).put(str, new pqm0(Long.valueOf(System.currentTimeMillis() + r27Var.f195072a), s6x0Var));
                return l;
            }
            obj = null;
            s6x0 s6x0Var2 = (s6x0) obj;
            if (s6x0Var2 != null) {
                return s6x0Var2.f206218a;
            }
            if (((fh0) this.f125030b.f129253a.get(str)) != null) {
                l = new Long(3000L);
            } else {
                LinkedHashMap linkedHashMap = qm0.f189980b;
                wm0 wm0Var = this.f125029a;
                wm0Var.getClass();
                cr51 cr51VarM2704o = SubEventRequest.m2704o();
                cr51VarM2704o.m33721m("started");
                xjz0 xjz0Var = new xjz0(new C2498vj(new C2498vj(new s2t(wm0Var.f252660a.callStream("spotify.ads.esperanto.proto.Events", "subEvent", (SubEventRequest) cr51VarM2704o.build()), 26), i3), 2), 25);
                moe moeVar = new moe(str, fbkVar, 7);
                hpc1Var.f93748a = str;
                hpc1Var.f93751d = 1;
                objM86756u = vyf1.m86756u(xjz0Var, moeVar, hpc1Var);
                yuk yukVar = yuk.f276404a;
                if (objM86756u == yukVar) {
                    return yukVar;
                }
            }
            s6x0 s6x0Var3 = new s6x0(l);
            ((wy3) ((xre) r27Var.f195073b)).getClass();
            ((Map) r27Var.f195074c).put(str, new pqm0(Long.valueOf(System.currentTimeMillis() + r27Var.f195072a), s6x0Var3));
            return l;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = hpc1Var.f93748a;
        bga.m29073P(objM86756u);
        l = ((fh0) objM86756u).f69498V0;
        if (l == null) {
            l = new c6x0(new IllegalStateException(edb.m38564m("viewable threshold is missing for ad ", str)));
        }
        s6x0 s6x0Var4 = new s6x0(l);
        ((wy3) ((xre) r27Var.f195073b)).getClass();
        ((Map) r27Var.f195074c).put(str, new pqm0(Long.valueOf(System.currentTimeMillis() + r27Var.f195072a), s6x0Var4));
        return l;
    }
}
