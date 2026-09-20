package p204p;

import android.content.res.Resources;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes7.dex */
public final class f7c0 {

    /* JADX INFO: renamed from: a */
    public final k770 f66640a;

    /* JADX INFO: renamed from: b */
    public final q831 f66641b;

    /* JADX INFO: renamed from: c */
    public final Resources f66642c;

    /* JADX INFO: renamed from: d */
    public final z9j0 f66643d;

    /* JADX INFO: renamed from: e */
    public final luk f66644e;

    /* JADX INFO: renamed from: f */
    public final luk f66645f;

    public f7c0(Resources resources, luk lukVar, luk lukVar2, k770 k770Var, z9j0 z9j0Var, q831 q831Var) {
        this.f66640a = k770Var;
        this.f66641b = q831Var;
        this.f66642c = resources;
        this.f66643d = z9j0Var;
        this.f66644e = lukVar;
        this.f66645f = lukVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m40961a(f7c0 f7c0Var, i6c0 i6c0Var, ibk ibkVar) {
        a7c0 a7c0Var;
        Object c6x0Var;
        if (ibkVar instanceof a7c0) {
            a7c0Var = (a7c0) ibkVar;
            int i = a7c0Var.f13022d;
            if ((i & Integer.MIN_VALUE) != 0) {
                a7c0Var.f13022d = i - Integer.MIN_VALUE;
            } else {
                a7c0Var = new a7c0(f7c0Var, ibkVar);
            }
        } else {
            a7c0Var = new a7c0(f7c0Var, ibkVar);
        }
        Object objM55635b = a7c0Var.f13020b;
        int i2 = a7c0Var.f13022d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM55635b);
                k770 k770Var = f7c0Var.f66640a;
                String str = i6c0Var.f99207c;
                z5c0 z5c0Var = i6c0Var.f99208d;
                C1940hk c1940hk = new C1940hk(Boolean.valueOf(i6c0Var.f99209e), null, null, null, null, null, null, 126);
                a7c0Var.f13019a = i6c0Var;
                a7c0Var.f13022d = 1;
                objM55635b = k770Var.m55635b(str, z5c0Var, c1940hk, a7c0Var);
                yuk yukVar = yuk.f276404a;
                if (objM55635b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i6c0Var = a7c0Var.f13019a;
                bga.m29073P(objM55635b);
            }
            c6x0Var = (C1940hk) objM55635b;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (s6x0.m77348a(c6x0Var) != null) {
            return new j7c0(!i6c0Var.f99209e);
        }
        return new h7c0(i6c0Var.f99209e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m40962b(f7c0 f7c0Var, j6c0 j6c0Var, ibk ibkVar) {
        b7c0 b7c0Var;
        Object c6x0Var;
        if (ibkVar instanceof b7c0) {
            b7c0Var = (b7c0) ibkVar;
            int i = b7c0Var.f24213d;
            if ((i & Integer.MIN_VALUE) != 0) {
                b7c0Var.f24213d = i - Integer.MIN_VALUE;
            } else {
                b7c0Var = new b7c0(f7c0Var, ibkVar);
            }
        } else {
            b7c0Var = new b7c0(f7c0Var, ibkVar);
        }
        Object objM55635b = b7c0Var.f24211b;
        int i2 = b7c0Var.f24213d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM55635b);
                k770 k770Var = f7c0Var.f66640a;
                String str = j6c0Var.f109276c;
                z5c0 z5c0Var = j6c0Var.f109277d;
                C1940hk c1940hk = new C1940hk(null, null, null, null, null, null, Boolean.valueOf(j6c0Var.f109278e), 63);
                b7c0Var.f24210a = j6c0Var;
                b7c0Var.f24213d = 1;
                objM55635b = k770Var.m55635b(str, z5c0Var, c1940hk, b7c0Var);
                yuk yukVar = yuk.f276404a;
                if (objM55635b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j6c0Var = b7c0Var.f24210a;
                bga.m29073P(objM55635b);
            }
            c6x0Var = (C1940hk) objM55635b;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (s6x0.m77348a(c6x0Var) != null) {
            return new n7c0(!j6c0Var.f109278e);
        }
        return new l7c0(j6c0Var.f109278e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m40963c(f7c0 f7c0Var, k6c0 k6c0Var, ibk ibkVar) {
        c7c0 c7c0Var;
        Object c6x0Var;
        if (ibkVar instanceof c7c0) {
            c7c0Var = (c7c0) ibkVar;
            int i = c7c0Var.f34849d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7c0Var.f34849d = i - Integer.MIN_VALUE;
            } else {
                c7c0Var = new c7c0(f7c0Var, ibkVar);
            }
        } else {
            c7c0Var = new c7c0(f7c0Var, ibkVar);
        }
        Object objM55635b = c7c0Var.f34847b;
        int i2 = c7c0Var.f34849d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM55635b);
                k770 k770Var = f7c0Var.f66640a;
                String str = k6c0Var.f119719c;
                z5c0 z5c0Var = k6c0Var.f119720d;
                C1940hk c1940hk = new C1940hk(null, null, null, null, null, Boolean.valueOf(k6c0Var.f119721e), null, 95);
                c7c0Var.f34846a = k6c0Var;
                c7c0Var.f34849d = 1;
                objM55635b = k770Var.m55635b(str, z5c0Var, c1940hk, c7c0Var);
                yuk yukVar = yuk.f276404a;
                if (objM55635b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k6c0Var = c7c0Var.f34846a;
                bga.m29073P(objM55635b);
            }
            c6x0Var = (C1940hk) objM55635b;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (s6x0.m77348a(c6x0Var) != null) {
            return new q7c0(!k6c0Var.f119721e);
        }
        return new o7c0(k6c0Var.f119721e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final Object m40964d(f7c0 f7c0Var, l6c0 l6c0Var, ibk ibkVar) {
        d7c0 d7c0Var;
        Object c6x0Var;
        if (ibkVar instanceof d7c0) {
            d7c0Var = (d7c0) ibkVar;
            int i = d7c0Var.f46064d;
            if ((i & Integer.MIN_VALUE) != 0) {
                d7c0Var.f46064d = i - Integer.MIN_VALUE;
            } else {
                d7c0Var = new d7c0(f7c0Var, ibkVar);
            }
        } else {
            d7c0Var = new d7c0(f7c0Var, ibkVar);
        }
        Object objM55635b = d7c0Var.f46062b;
        int i2 = d7c0Var.f46064d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM55635b);
                k770 k770Var = f7c0Var.f66640a;
                String str = l6c0Var.f130305c;
                z5c0 z5c0Var = l6c0Var.f130306d;
                C1940hk c1940hk = new C1940hk(null, null, null, Boolean.valueOf(l6c0Var.f130307e), null, null, null, 119);
                d7c0Var.f46061a = l6c0Var;
                d7c0Var.f46064d = 1;
                objM55635b = k770Var.m55635b(str, z5c0Var, c1940hk, d7c0Var);
                yuk yukVar = yuk.f276404a;
                if (objM55635b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l6c0Var = d7c0Var.f46061a;
                bga.m29073P(objM55635b);
            }
            c6x0Var = (C1940hk) objM55635b;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (s6x0.m77348a(c6x0Var) != null) {
            return new t7c0(!l6c0Var.f130307e);
        }
        return new r7c0(l6c0Var.f130307e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public static final Object m40965e(f7c0 f7c0Var, m6c0 m6c0Var, ibk ibkVar) {
        e7c0 e7c0Var;
        Object c6x0Var;
        if (ibkVar instanceof e7c0) {
            e7c0Var = (e7c0) ibkVar;
            int i = e7c0Var.f56907d;
            if ((i & Integer.MIN_VALUE) != 0) {
                e7c0Var.f56907d = i - Integer.MIN_VALUE;
            } else {
                e7c0Var = new e7c0(f7c0Var, ibkVar);
            }
        } else {
            e7c0Var = new e7c0(f7c0Var, ibkVar);
        }
        Object objM55635b = e7c0Var.f56905b;
        int i2 = e7c0Var.f56907d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM55635b);
                k770 k770Var = f7c0Var.f66640a;
                String str = m6c0Var.f140462c;
                z5c0 z5c0Var = m6c0Var.f140463d;
                C1940hk c1940hk = new C1940hk(null, Boolean.valueOf(m6c0Var.f140464e), null, null, null, null, null, 125);
                e7c0Var.f56904a = m6c0Var;
                e7c0Var.f56907d = 1;
                objM55635b = k770Var.m55635b(str, z5c0Var, c1940hk, e7c0Var);
                yuk yukVar = yuk.f276404a;
                if (objM55635b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m6c0Var = e7c0Var.f56904a;
                bga.m29073P(objM55635b);
            }
            c6x0Var = (C1940hk) objM55635b;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (s6x0.m77348a(c6x0Var) != null) {
            return new w7c0(!m6c0Var.f140464e);
        }
        return new u7c0(m6c0Var.f140464e);
    }
}
