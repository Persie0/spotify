package p204p;

import com.spotify.casita.p040v1.resolved.ResolvedHome;
import com.spotify.extendedmetadata.proto.BatchedExtensionResponse;

/* JADX INFO: loaded from: classes2.dex */
public final class j530 implements k530 {

    /* JADX INFO: renamed from: a */
    public final o9c f108850a;

    /* JADX INFO: renamed from: b */
    public final t2n f108851b;

    /* JADX INFO: renamed from: c */
    public final bqx f108852c;

    /* JADX INFO: renamed from: d */
    public final w430 f108853d;

    /* JADX INFO: renamed from: e */
    public final q530 f108854e;

    /* JADX INFO: renamed from: f */
    public final oxe f108855f;

    /* JADX INFO: renamed from: g */
    public final h12 f108856g;

    /* JADX INFO: renamed from: h */
    public final m600 f108857h;

    /* JADX INFO: renamed from: i */
    public final xp4 f108858i;

    public j530(o9c o9cVar, t2n t2nVar, bqx bqxVar, w430 w430Var, q530 q530Var, xre xreVar, oxe oxeVar, h12 h12Var, m600 m600Var, xp4 xp4Var) {
        this.f108850a = o9cVar;
        this.f108851b = t2nVar;
        this.f108852c = bqxVar;
        this.f108853d = w430Var;
        this.f108854e = q530Var;
        this.f108855f = oxeVar;
        this.f108856g = h12Var;
        this.f108857h = m600Var;
        this.f108858i = xp4Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: d */
    public static final Object m52432d(j530 j530Var, String str, boolean z, kaa0 kaa0Var, boolean z2, boolean z3, String str2, ibk ibkVar) {
        d530 d530Var;
        String str3;
        boolean z4;
        if (ibkVar instanceof d530) {
            d530Var = (d530) ibkVar;
            int i = d530Var.f45320e;
            if ((i & Integer.MIN_VALUE) != 0) {
                d530Var.f45320e = i - Integer.MIN_VALUE;
            } else {
                d530Var = new d530(j530Var, ibkVar);
            }
        } else {
            d530Var = new d530(j530Var, ibkVar);
        }
        d530 d530Var2 = d530Var;
        Object objM52433e = d530Var2.f45318c;
        int i2 = d530Var2.f45320e;
        if (i2 == 0) {
            bga.m29073P(objM52433e);
            j530Var.f108854e.mo40807k(new i630(!z));
            f530 f530Var = new f530(j530Var, str, kaa0Var, z2, z, str2, null);
            d530Var2.f45316a = str;
            d530Var2.f45317b = z;
            d530Var2.f45320e = 1;
            objM52433e = j530Var.m52433e(z3, f530Var, d530Var2);
            Object obj = yuk.f276404a;
            if (objM52433e == obj) {
                return obj;
            }
            str3 = str;
            z4 = z;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z5 = d530Var2.f45317b;
            String str4 = d530Var2.f45316a;
            bga.m29073P(objM52433e);
            z4 = z5;
            str3 = str4;
        }
        o2x0 o2x0Var = (o2x0) objM52433e;
        Object obj2 = o2x0Var.f161172b;
        if (obj2 == null) {
            throw new IllegalArgumentException("ResolvedHome is null");
        }
        ResolvedHome resolvedHome = (ResolvedHome) obj2;
        BatchedExtensionResponse batchedExtensionResponseM5618p = resolvedHome.m5768p().m5618p();
        if (batchedExtensionResponseM5618p.m10535p() > 0) {
            j530Var.f108851b.m79913e(batchedExtensionResponseM5618p);
        }
        return j530Var.m52434f(resolvedHome, str3, j530Var.f108852c, dv9.m37075x(resolvedHome.m5770r(), z4), o2x0Var, z4, j530Var.f108857h);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r0 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r0 == r1) goto L26;
     */
    @Override // p204p.k530
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo28143a(String str, boolean z, String str2, kaa0 kaa0Var, ibk ibkVar) {
        g530 g530Var;
        o2x0 o2x0Var;
        if (ibkVar instanceof g530) {
            g530Var = (g530) ibkVar;
            int i = g530Var.f76576e;
            if ((i & Integer.MIN_VALUE) != 0) {
                g530Var.f76576e = i - Integer.MIN_VALUE;
            } else {
                g530Var = new g530(this, ibkVar);
            }
        } else {
            g530Var = new g530(this, ibkVar);
        }
        g530 g530Var2 = g530Var;
        Object objM66459a = g530Var2.f76574c;
        int i2 = g530Var2.f76576e;
        if (i2 == 0) {
            bga.m29073P(objM66459a);
            kaa0 kaa0Var2 = kaa0.f120848a;
            yuk yukVar = yuk.f276404a;
            if (kaa0Var == kaa0Var2) {
                g530Var2.f76572a = str;
                g530Var2.f76573b = z;
                g530Var2.f76576e = 1;
                objM66459a = h12.m46377f(this.f108856g, str, z, str2, g530Var2);
            } else {
                g530Var2.f76572a = str;
                g530Var2.f76573b = z;
                g530Var2.f76576e = 2;
                objM66459a = o9c.m66459a(this.f108850a, str, kaa0Var, false, z, str2, null, null, g530Var2, 224);
            }
            return yukVar;
        }
        if (i2 == 1) {
            z = g530Var2.f76573b;
            str = g530Var2.f76572a;
            bga.m29073P(objM66459a);
            o2x0Var = (o2x0) objM66459a;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = g530Var2.f76573b;
            str = g530Var2.f76572a;
            bga.m29073P(objM66459a);
            o2x0Var = (o2x0) objM66459a;
        }
        String str3 = str;
        boolean z2 = z;
        o2x0 o2x0Var2 = o2x0Var;
        Object obj = o2x0Var2.f161172b;
        if (obj == null) {
            throw new IllegalArgumentException("ResolvedHome is null");
        }
        ResolvedHome resolvedHome = (ResolvedHome) obj;
        return m52434f(resolvedHome, str3, this.f108852c, dv9.m37075x(resolvedHome.m5770r(), z2), o2x0Var2, z2, this.f108857h);
    }

    @Override // p204p.k530
    /* JADX INFO: renamed from: b */
    public final Object mo28144b(String str, boolean z, kaa0 kaa0Var, boolean z2, boolean z3, String str2, ibk ibkVar) {
        return gga.m44677p(this.f108854e, h630.f87977X, new c530(this, str, z, kaa0Var, z2, z3, str2, null), ibkVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m52433e(boolean z, f530 f530Var, ibk ibkVar) {
        h530 h530Var;
        if (ibkVar instanceof h530) {
            h530Var = (h530) ibkVar;
            int i = h530Var.f87715d;
            if ((i & Integer.MIN_VALUE) != 0) {
                h530Var.f87715d = i - Integer.MIN_VALUE;
            } else {
                h530Var = new h530(this, ibkVar);
            }
        } else {
            h530Var = new h530(this, ibkVar);
        }
        Object objInvoke = h530Var.f87713b;
        int i2 = h530Var.f87715d;
        oxe oxeVar = this.f108855f;
        try {
            if (i2 == 0) {
                bga.m29073P(objInvoke);
                if (z) {
                    ((xy3) oxeVar).m92400e("preload");
                }
                h530Var.f87712a = z;
                h530Var.f87715d = 1;
                objInvoke = f530Var.invoke(h530Var);
                Object obj = yuk.f276404a;
                if (objInvoke == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = h530Var.f87712a;
                bga.m29073P(objInvoke);
            }
            if (z) {
                ((xy3) oxeVar).m92396a("preload");
            }
            return objInvoke;
        } catch (Throwable th) {
            if (z) {
                ((xy3) oxeVar).m92396a("preload");
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public final x9c m52434f(ResolvedHome resolvedHome, String str, bqx bqxVar, t3x0 t3x0Var, o2x0 o2x0Var, boolean z, m600 m600Var) {
        return (x9c) gga.m44675n(this.f108854e, h630.f87978Y, new x530(bga.m29065H(o2x0Var) ? 1 : 2), new i530(this, resolvedHome, str, bqxVar, t3x0Var, o2x0Var, z, m600Var));
    }
}
