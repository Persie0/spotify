package p204p;

import android.content.ComponentName;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class j5b implements zev0 {

    /* JADX INFO: renamed from: a */
    public final a9i0 f108924a;

    /* JADX INFO: renamed from: b */
    public final f9d0 f108925b;

    /* JADX INFO: renamed from: c */
    public final z9t f108926c;

    /* JADX INFO: renamed from: d */
    public pjq f108927d;

    /* JADX INFO: renamed from: e */
    public final lsi0 f108928e = msi0.m62770a();

    public j5b(a9i0 a9i0Var, f9d0 f9d0Var, z9t z9tVar) {
        this.f108924a = a9i0Var;
        this.f108925b = f9d0Var;
        this.f108926c = z9tVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m52453b(j5b j5bVar, ComponentName componentName, ibk ibkVar) {
        i5b i5bVar;
        List list;
        if (ibkVar instanceof i5b) {
            i5bVar = (i5b) ibkVar;
            int i = i5bVar.f98881d;
            if ((i & Integer.MIN_VALUE) != 0) {
                i5bVar.f98881d = i - Integer.MIN_VALUE;
            } else {
                i5bVar = new i5b(j5bVar, ibkVar);
            }
        } else {
            i5bVar = new i5b(j5bVar, ibkVar);
        }
        Object objM76981v = i5bVar.f98879b;
        int i2 = i5bVar.f98881d;
        fbk fbkVar = null;
        Object obj = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    bga.m29073P(objM76981v);
                } else {
                    if (i2 == 2) {
                        bga.m29073P(objM76981v);
                        return objM76981v;
                    }
                    if (i2 == 3) {
                        bga.m29073P(objM76981v);
                        return objM76981v;
                    }
                    if (i2 == 4) {
                        bga.m29073P(objM76981v);
                        return objM76981v;
                    }
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = i5bVar.f98878a;
                    bga.m29073P(objM76981v);
                }
                return new yev0(1, list);
            }
            bga.m29073P(objM76981v);
            long j = k5b.f119466a;
            gw8 gw8Var = new gw8(j5bVar, componentName, fbkVar, 29);
            i5bVar.f98881d = 1;
            objM76981v = s1h1.m76981v(j, gw8Var, i5bVar);
            if (objM76981v == obj) {
                return obj;
            }
            List list2 = (List) objM76981v;
            if (list2 == null) {
                i5bVar.f98878a = null;
                i5bVar.f98881d = 3;
                Object objM52455c = j5bVar.m52455c(i5bVar);
                return objM52455c == obj ? obj : objM52455c;
            }
            if (list2.isEmpty()) {
                i5bVar.f98878a = null;
                i5bVar.f98881d = 4;
                Object objM52455c2 = j5bVar.m52455c(i5bVar);
                return objM52455c2 == obj ? obj : objM52455c2;
            }
            z9t z9tVar = j5bVar.f108926c;
            i5bVar.f98878a = list2;
            i5bVar.f98881d = 5;
            if (z9tVar.m95737y(list2, i5bVar) == obj) {
                return obj;
            }
            list = list2;
            return new yev0(1, list);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            i5bVar.f98878a = null;
            i5bVar.f98881d = 2;
            Object objM52455c3 = j5bVar.m52455c(i5bVar);
            return objM52455c3 == obj ? obj : objM52455c3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00af A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [p.jsi0] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [p.jsi0] */
    /* JADX WARN: Type inference failed for: r1v5, types: [p.jsi0] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // p204p.zev0
    /* JADX INFO: renamed from: a */
    public final Object mo52454a(ibk ibkVar) {
        g5b g5bVar;
        int i;
        pjq pjqVar;
        Object c6x0Var;
        ojq ojqVar;
        ?? r1;
        Object objMo26597I;
        if (ibkVar instanceof g5b) {
            g5bVar = (g5b) ibkVar;
            int i2 = g5bVar.f76638e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g5bVar.f76638e = i2 - Integer.MIN_VALUE;
            } else {
                g5bVar = new g5b(this, ibkVar);
            }
        } else {
            g5bVar = new g5b(this, ibkVar);
        }
        Object objM56684z = g5bVar.f76636c;
        ?? r2 = g5bVar.f76638e;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        try {
            if (r2 == 0) {
                bga.m29073P(objM56684z);
                lsi0 lsi0Var = this.f108928e;
                g5bVar.f76634a = lsi0Var;
                g5bVar.f76635b = 0;
                g5bVar.f76638e = 1;
                if (lsi0Var.mo54248a(g5bVar) != yukVar) {
                    r2 = lsi0Var;
                    i = 0;
                }
                return yukVar;
            }
            if (r2 == 1) {
                int i3 = g5bVar.f76635b;
                jsi0 jsi0Var = g5bVar.f76634a;
                bga.m29073P(objM56684z);
                i = i3;
                r2 = jsi0Var;
            } else {
                if (r2 != 2) {
                    if (r2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM56684z);
                    return objM56684z;
                }
                jsi0 jsi0Var2 = g5bVar.f76634a;
                bga.m29073P(objM56684z);
                r2 = jsi0Var2;
            }
            r1 = r2;
            ojqVar = (ojq) objM56684z;
            r1 = r2;
            ojqVar = pjqVar;
            r1.mo54249c(null);
            g5bVar.f76634a = null;
            g5bVar.f76638e = 3;
            objMo26597I = ojqVar.mo26597I(g5bVar);
            if (objMo26597I != yukVar) {
                return yukVar;
            }
            return objMo26597I;
            pjqVar = this.f108927d;
            if (pjqVar != null) {
                if (!pjqVar.isActive()) {
                    if (pjqVar.mo26606t() && !pjqVar.isCancelled()) {
                        try {
                            r1 = r2;
                            ojqVar = pjqVar;
                            c6x0Var = (yev0) pjqVar.m38786Y();
                        } catch (Throwable th) {
                            c6x0Var = new c6x0(th);
                        }
                        if (!(c6x0Var instanceof c6x0)) {
                            r1 = r2;
                            ojqVar = pjqVar;
                        }
                    }
                    r1 = r2;
                    ojqVar = pjqVar;
                    r1 = r2;
                    ojqVar = pjqVar;
                    this.f108927d = null;
                }
                r1 = r2;
                ojqVar = pjqVar;
                r1.mo54249c(null);
                g5bVar.f76634a = null;
                g5bVar.f76638e = 3;
                objMo26597I = ojqVar.mo26597I(g5bVar);
                if (objMo26597I != yukVar) {
                    return yukVar;
                }
                return objMo26597I;
            }
            of5 of5Var = new of5(this, fbkVar, 18);
            g5bVar.f76634a = r2;
            g5bVar.f76635b = i;
            g5bVar.f76638e = 2;
            objM56684z = kk40.m56684z(of5Var, g5bVar);
            r2 = r2;
            if (objM56684z != yukVar) {
                r1 = r2;
                ojqVar = (ojq) objM56684z;
                r1 = r2;
                ojqVar = pjqVar;
                r1.mo54249c(null);
                g5bVar.f76634a = null;
                g5bVar.f76638e = 3;
                objMo26597I = ojqVar.mo26597I(g5bVar);
                if (objMo26597I != yukVar) {
                    return objMo26597I;
                }
            }
            return yukVar;
        } catch (Throwable th2) {
            r2.mo54249c(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m52455c(ibk ibkVar) {
        h5b h5bVar;
        if (ibkVar instanceof h5b) {
            h5bVar = (h5b) ibkVar;
            int i = h5bVar.f87797c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h5bVar.f87797c = i - Integer.MIN_VALUE;
            } else {
                h5bVar = new h5b(this, ibkVar);
            }
        } else {
            h5bVar = new h5b(this, ibkVar);
        }
        Object objM95733u = h5bVar.f87795a;
        int i2 = h5bVar.f87797c;
        if (i2 == 0) {
            bga.m29073P(objM95733u);
            h5bVar.f87797c = 1;
            objM95733u = this.f108926c.m95733u(h5bVar);
            Object obj = yuk.f276404a;
            if (objM95733u == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM95733u);
        }
        return new yev0(2, (List) objM95733u);
    }
}
