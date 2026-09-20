package p204p;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class ui10 {

    /* JADX INFO: renamed from: a */
    public final tey f230561a;

    /* JADX INFO: renamed from: b */
    public final voi f230562b;

    /* JADX INFO: renamed from: c */
    public final h7u f230563c;

    /* JADX INFO: renamed from: d */
    public final AtomicInteger f230564d = new AtomicInteger(0);

    /* JADX INFO: renamed from: e */
    public final hb11 f230565e = j0g1.m52092t(1, 0, 0, 6);

    public ui10(tey teyVar, voi voiVar, h7u h7uVar) {
        this.f230561a = teyVar;
        this.f230562b = voiVar;
        this.f230563c = h7uVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m83171a(ibk ibkVar) {
        qi10 qi10Var;
        if (ibkVar instanceof qi10) {
            qi10Var = (qi10) ibkVar;
            int i = qi10Var.f188897c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qi10Var.f188897c = i - Integer.MIN_VALUE;
            } else {
                qi10Var = new qi10(this, ibkVar);
            }
        } else {
            qi10Var = new qi10(this, ibkVar);
        }
        Object obj = qi10Var.f188895a;
        int i2 = qi10Var.f188897c;
        Object c6x0Var = w2a1.f247311a;
        AtomicInteger atomicInteger = this.f230564d;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                if (atomicInteger.getAndIncrement() > 0) {
                    return c6x0Var;
                }
                tey teyVar = this.f230561a;
                qi10Var.f188897c = 1;
                Object objM80589n = teyVar.m80589n(this, qi10Var);
                yuk yukVar = yuk.f276404a;
                if (objM80589n == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (s6x0.m77348a(c6x0Var) != null) {
            atomicInteger.decrementAndGet();
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a == null || !(thM77348a instanceof CancellationException)) {
            return c6x0Var;
        }
        throw thM77348a;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m83172b(ibk ibkVar) {
        ri10 ri10Var;
        Object objM83173c;
        int i;
        int i2;
        Object objM83173c2;
        if (ibkVar instanceof ri10) {
            ri10Var = (ri10) ibkVar;
            int i3 = ri10Var.f199412e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ri10Var.f199412e = i3 - Integer.MIN_VALUE;
            } else {
                ri10Var = new ri10(this, ibkVar);
            }
        } else {
            ri10Var = new ri10(this, ibkVar);
        }
        Object obj = ri10Var.f199410c;
        int i4 = ri10Var.f199412e;
        Object obj2 = yuk.f276404a;
        if (i4 == 0) {
            bga.m29073P(obj);
            ri10Var.f199412e = 1;
            objM83173c = m83173c(ri10Var);
            if (objM83173c != obj2) {
            }
            return obj2;
        }
        if (i4 == 1) {
            bga.m29073P(obj);
            objM83173c = ((s6x0) obj).f206218a;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
                return ((s6x0) obj).f206218a;
            }
            i = ri10Var.f199409b;
            i2 = ri10Var.f199408a;
            bga.m29073P(obj);
        }
        ri10Var.f199408a = i2;
        ri10Var.f199409b = i;
        ri10Var.f199412e = 3;
        objM83173c2 = m83173c(ri10Var);
        if (objM83173c2 != obj2) {
            return obj2;
        }
        return objM83173c2;
        if (objM83173c instanceof c6x0) {
            Throwable thM77348a = s6x0.m77348a(objM83173c);
            ApiException apiException = thM77348a instanceof ApiException ? (ApiException) thM77348a : null;
            if (apiException != null && apiException.getStatusCode() == 10) {
                i = 0;
                ri10Var.f199408a = 0;
                ri10Var.f199409b = 0;
                ri10Var.f199412e = 2;
                if (this.f230561a.m80589n(this, ri10Var) != obj2) {
                    i2 = 0;
                    ri10Var.f199408a = i2;
                    ri10Var.f199409b = i;
                    ri10Var.f199412e = 3;
                    objM83173c2 = m83173c(ri10Var);
                    if (objM83173c2 != obj2) {
                        return objM83173c2;
                    }
                }
                return obj2;
            }
        }
        return objM83173c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m83173c(ibk ibkVar) {
        si10 si10Var;
        Object c6x0Var;
        Status status;
        int i;
        if (ibkVar instanceof si10) {
            si10Var = (si10) ibkVar;
            int i2 = si10Var.f209312c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                si10Var.f209312c = i2 - Integer.MIN_VALUE;
            } else {
                si10Var = new si10(this, ibkVar);
            }
        } else {
            si10Var = new si10(this, ibkVar);
        }
        Object obj = si10Var.f209310a;
        int i3 = si10Var.f209312c;
        try {
            if (i3 == 0) {
                bga.m29073P(obj);
                tey teyVar = this.f230561a;
                si10Var.f209312c = 1;
                Object objM80591q = teyVar.m80591q(si10Var);
                yuk yukVar = yuk.f276404a;
                if (objM80591q == yukVar) {
                    return yukVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            c6x0Var = w2a1.f247311a;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null) {
            ApiException apiException = thM77348a instanceof ApiException ? (ApiException) thM77348a : null;
            if (apiException != null && (i = (status = apiException.getStatus()).f1842a) != 10) {
                lzi lziVar = status.f1845d;
                this.f230563c.m46806x((lziVar == null || lziVar.f138371b != 16) ? u1h1.m82223r(i) : "API_UNAVAILABLE");
            }
        }
        Throwable thM77348a2 = s6x0.m77348a(c6x0Var);
        if (thM77348a2 == null || !(thM77348a2 instanceof CancellationException)) {
            return c6x0Var;
        }
        throw thM77348a2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m83174d(ibk ibkVar) {
        ti10 ti10Var;
        if (ibkVar instanceof ti10) {
            ti10Var = (ti10) ibkVar;
            int i = ti10Var.f220531c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ti10Var.f220531c = i - Integer.MIN_VALUE;
            } else {
                ti10Var = new ti10(this, ibkVar);
            }
        } else {
            ti10Var = new ti10(this, ibkVar);
        }
        Object obj = ti10Var.f220529a;
        int i2 = ti10Var.f220531c;
        Object c6x0Var = w2a1.f247311a;
        AtomicInteger atomicInteger = this.f230564d;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                if (atomicInteger.decrementAndGet() > 0) {
                    return c6x0Var;
                }
                tey teyVar = this.f230561a;
                ti10Var.f220531c = 1;
                Object objM80596x = teyVar.m80596x(this, ti10Var);
                yuk yukVar = yuk.f276404a;
                if (objM80596x == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (!(c6x0Var instanceof c6x0)) {
            this.f230565e.mo46962a(ni10.f154156a);
        }
        if (s6x0.m77348a(c6x0Var) != null) {
            atomicInteger.incrementAndGet();
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a == null || !(thM77348a instanceof CancellationException)) {
            return c6x0Var;
        }
        throw thM77348a;
    }
}
