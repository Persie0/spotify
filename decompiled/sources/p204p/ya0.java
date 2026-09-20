package p204p;

import android.os.Looper;
import com.comscore.streaming.ContentType;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class ya0 {

    /* JADX INFO: renamed from: a */
    public final aii0 f270705a;

    /* JADX INFO: renamed from: b */
    public final g9j0 f270706b;

    /* JADX INFO: renamed from: c */
    public final zv41 f270707c;

    /* JADX INFO: renamed from: d */
    public final nuu0 f270708d;

    public ya0(aii0 aii0Var, g9j0 g9j0Var) {
        this.f270705a = aii0Var;
        this.f270706b = g9j0Var;
        zv41 zv41VarM52819d = jag1.m52819d(nau.f152117a);
        this.f270707c = zv41VarM52819d;
        this.f270708d = bzf1.m31021m(zv41VarM52819d);
        g9j0Var.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final void m93163a(qrm0 qrm0Var, pem0 pem0Var, rrm0 rrm0Var) {
        Object value;
        Map mapM56696i0;
        Object value2;
        Map mapM56701n0;
        Object value3;
        Map mapM56701n1;
        Object value4;
        Map mapM56701n2;
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null && !wj50.m88271j(Looper.myLooper(), mainLooper)) {
            throw new IllegalStateException("ActivePageSet must be called on the main thread");
        }
        if (this.f270705a.m26104d()) {
            boolean z = pem0Var instanceof kem0;
            zv41 zv41Var = this.f270707c;
            if (!z) {
                xa0 xa0Var = (xa0) ((Map) zv41Var.getValue()).get(qrm0Var);
                if (!wj50.m88271j(xa0Var != null ? xa0Var.m90272b() : null, rrm0Var)) {
                    return;
                }
            }
            Map map = (Map) zv41Var.getValue();
            if (z) {
                while (true) {
                    Object value5 = zv41Var.getValue();
                    kem0 kem0Var = (kem0) pem0Var;
                    rrm0 rrm0Var2 = rrm0Var;
                    if (zv41Var.m97089k(value5, kkc0.m56701n0((Map) value5, pft0.m69840u(qrm0Var, new xa0(kem0Var.f121915a, kem0Var.f121916b, kem0Var.f121917c, rrm0Var2, kem0Var.f121918d))))) {
                        break;
                    } else {
                        rrm0Var = rrm0Var2;
                    }
                }
            } else if (pem0Var instanceof nem0) {
                do {
                    value4 = zv41Var.getValue();
                    mapM56701n2 = (Map) value4;
                    xa0 xa0Var2 = (xa0) mapM56701n2.get(qrm0Var);
                    if (xa0Var2 != null) {
                        nem0 nem0Var = (nem0) pem0Var;
                        mapM56701n2 = kkc0.m56701n0(mapM56701n2, pft0.m69840u(qrm0Var, xa0.m90271a(xa0Var2, nem0Var.f153028a, nem0Var.f153029b, null, nem0Var.f153030c, null, 92)));
                    }
                } while (!zv41Var.m97089k(value4, mapM56701n2));
            } else if (pem0Var instanceof oem0) {
                do {
                    value3 = zv41Var.getValue();
                    mapM56701n1 = (Map) value3;
                    xa0 xa0Var3 = (xa0) mapM56701n1.get(qrm0Var);
                    if (xa0Var3 != null) {
                        mapM56701n1 = kkc0.m56701n0(mapM56701n1, pft0.m69840u(qrm0Var, xa0.m90271a(xa0Var3, null, null, ((oem0) pem0Var).f164476a, null, null, ContentType.USER_GENERATED_LIVE)));
                    }
                } while (!zv41Var.m97089k(value3, mapM56701n1));
            } else if (pem0Var instanceof mem0) {
                do {
                    value2 = zv41Var.getValue();
                    mapM56701n0 = (Map) value2;
                    xa0 xa0Var4 = (xa0) mapM56701n0.get(qrm0Var);
                    if (xa0Var4 != null) {
                        mapM56701n0 = kkc0.m56701n0(mapM56701n0, pft0.m69840u(qrm0Var, xa0.m90271a(xa0Var4, null, null, null, null, ((mem0) pem0Var).f142766a, 63)));
                    }
                } while (!zv41Var.m97089k(value2, mapM56701n0));
            } else {
                if (!(pem0Var instanceof lem0)) {
                    throw new NoWhenBranchMatchedException();
                }
                do {
                    value = zv41Var.getValue();
                    mapM56696i0 = (Map) value;
                    xa0 xa0Var5 = (xa0) mapM56696i0.get(qrm0Var);
                    if (xa0Var5 != null) {
                        if (wj50.m88271j(xa0Var5.m90273c(), ((lem0) pem0Var).m58796a())) {
                            mapM56696i0 = kkc0.m56696i0(qrm0Var, mapM56696i0);
                        } else {
                            qrm0Var.name();
                        }
                    }
                } while (!zv41Var.m97089k(value, mapM56696i0));
            }
            Map map2 = (Map) zv41Var.getValue();
            if (wj50.m88271j(map2, map)) {
                return;
            }
            this.f270706b.m44057h(map2);
        }
    }
}
