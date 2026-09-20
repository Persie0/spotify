package p204p;

import com.spotify.base.java.logging.Logger;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class a61 {

    /* JADX INFO: renamed from: a */
    public final qst0 f12661a;

    /* JADX INFO: renamed from: b */
    public final x7q0 f12662b;

    /* JADX INFO: renamed from: c */
    public final sx71 f12663c;

    /* JADX INFO: renamed from: d */
    public final px00 f12664d;

    /* JADX INFO: renamed from: e */
    public final z9j0 f12665e;

    /* JADX INFO: renamed from: f */
    public final nh61 f12666f;

    /* JADX INFO: renamed from: g */
    public final i26 f12667g;

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap f12668h = new ConcurrentHashMap();

    public a61(qst0 qst0Var, x7q0 x7q0Var, sx71 sx71Var, px00 px00Var, z9j0 z9j0Var, qgm qgmVar, sgm sgmVar, ipg0 ipg0Var, hog0 hog0Var) {
        this.f12661a = qst0Var;
        this.f12662b = x7q0Var;
        this.f12663c = sx71Var;
        this.f12664d = px00Var;
        this.f12665e = z9j0Var;
        this.f12666f = qgmVar.m72754a(hog0Var);
        this.f12667g = sgmVar.m78104a(ipg0Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    public final Object m24829a(String str, String str2, gpm0 gpm0Var, ibk ibkVar) {
        r51 r51Var;
        if (ibkVar instanceof r51) {
            r51Var = (r51) ibkVar;
            int i = r51Var.f195916c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r51Var.f195916c = i - Integer.MIN_VALUE;
            } else {
                r51Var = new r51(this, ibkVar);
            }
        } else {
            r51Var = new r51(this, ibkVar);
        }
        r51 r51Var2 = r51Var;
        Object objM71340e = r51Var2.f195914a;
        int i2 = r51Var2.f195916c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM71340e);
                qst0 qst0Var = this.f12661a;
                r51Var2.f195916c = 1;
                objM71340e = ((px00) qst0Var.f192185b).m71340e(str, str2, new Integer(gpm0Var.f83222a), null, r51Var2);
                yuk yukVar = yuk.f276404a;
                if (objM71340e == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM71340e);
            }
            k0z0 k0z0Var = (k0z0) objM71340e;
            qlg1.m73220y(r51Var2.getContext());
            return new q71(k0z0Var.f118172c, k0z0Var.f118170a, k0z0Var.f118171b);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            qlg1.m73220y(r51Var2.getContext());
            String message = e2.getMessage();
            if (message == null) {
                message = "Search failed";
            }
            return new h71(message);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: b */
    public final Object m24830b(String str, String str2, gpm0 gpm0Var, ibk ibkVar) {
        s51 s51Var;
        Object c6x0Var;
        if (ibkVar instanceof s51) {
            s51Var = (s51) ibkVar;
            int i = s51Var.f205679c;
            if ((i & Integer.MIN_VALUE) != 0) {
                s51Var.f205679c = i - Integer.MIN_VALUE;
            } else {
                s51Var = new s51(this, ibkVar);
            }
        } else {
            s51Var = new s51(this, ibkVar);
        }
        s51 s51Var2 = s51Var;
        Object objM71341f = s51Var2.f205677a;
        int i2 = s51Var2.f205679c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM71341f);
                x7q0 x7q0Var = this.f12662b;
                s51Var2.f205679c = 1;
                objM71341f = ((px00) x7q0Var.f258979b).m71341f(str, str2, new Integer(gpm0Var.f83222a), null, s51Var2);
                yuk yukVar = yuk.f276404a;
                if (objM71341f == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM71341f);
            }
            ibu0 ibu0Var = (ibu0) objM71341f;
            qlg1.m73220y(s51Var2.getContext());
            c6x0Var = new s71(ibu0Var.f100675c, ibu0Var.f100673a, ibu0Var.f100674b);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null) {
            qlg1.m73220y(s51Var2.getContext());
            String message = thM77348a.getMessage();
            if (message == null) {
                message = "Search failed";
            }
            c6x0Var = new h71(message);
        }
        return c6x0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: c */
    public final Object m24831c(String str, String str2, String str3, gpm0 gpm0Var, ibk ibkVar) {
        t51 t51Var;
        if (ibkVar instanceof t51) {
            t51Var = (t51) ibkVar;
            int i = t51Var.f217193c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t51Var.f217193c = i - Integer.MIN_VALUE;
            } else {
                t51Var = new t51(this, ibkVar);
            }
        } else {
            t51Var = new t51(this, ibkVar);
        }
        t51 t51Var2 = t51Var;
        Object objM71340e = t51Var2.f217191a;
        int i2 = t51Var2.f217193c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM71340e);
                qst0 qst0Var = this.f12661a;
                t51Var2.f217193c = 1;
                objM71340e = ((px00) qst0Var.f192185b).m71340e(str, str2, new Integer(gpm0Var.f83222a), str3, t51Var2);
                yuk yukVar = yuk.f276404a;
                if (objM71340e == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM71340e);
            }
            k0z0 k0z0Var = (k0z0) objM71340e;
            qlg1.m73220y(t51Var2.getContext());
            return new a71(k0z0Var.f118170a, k0z0Var.f118172c);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            qlg1.m73220y(t51Var2.getContext());
            return z61.f279675a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: d */
    public final Object m24832d(String str, String str2, String str3, gpm0 gpm0Var, ibk ibkVar) {
        u51 u51Var;
        Object c6x0Var;
        if (ibkVar instanceof u51) {
            u51Var = (u51) ibkVar;
            int i = u51Var.f226877c;
            if ((i & Integer.MIN_VALUE) != 0) {
                u51Var.f226877c = i - Integer.MIN_VALUE;
            } else {
                u51Var = new u51(this, ibkVar);
            }
        } else {
            u51Var = new u51(this, ibkVar);
        }
        u51 u51Var2 = u51Var;
        Object objM71341f = u51Var2.f226875a;
        int i2 = u51Var2.f226877c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM71341f);
                x7q0 x7q0Var = this.f12662b;
                u51Var2.f226877c = 1;
                objM71341f = ((px00) x7q0Var.f258979b).m71341f(str, str2, new Integer(gpm0Var.f83222a), str3, u51Var2);
                yuk yukVar = yuk.f276404a;
                if (objM71341f == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM71341f);
            }
            ibu0 ibu0Var = (ibu0) objM71341f;
            qlg1.m73220y(u51Var2.getContext());
            c6x0Var = new m71(ibu0Var.f100673a, ibu0Var.f100675c);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (s6x0.m77348a(c6x0Var) == null) {
            return c6x0Var;
        }
        qlg1.m73220y(u51Var2.getContext());
        return z61.f279675a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m24833e(String str, String str2, ss8 ss8Var, ss8 ss8Var2, boolean z, ibk ibkVar) {
        z51 z51Var;
        Throwable th;
        Object c6x0Var;
        String str3;
        if (ibkVar instanceof z51) {
            z51Var = (z51) ibkVar;
            int i = z51Var.f279436g;
            if ((i & Integer.MIN_VALUE) != 0) {
                z51Var.f279436g = i - Integer.MIN_VALUE;
            } else {
                z51Var = new z51(this, ibkVar);
            }
        } else {
            z51Var = new z51(this, ibkVar);
        }
        Object objM71343h = z51Var.f279434e;
        int i2 = z51Var.f279436g;
        try {
            try {
                if (i2 == 0) {
                    bga.m29073P(objM71343h);
                    px00 px00Var = this.f12664d;
                    z51Var.f279430a = str2;
                    z51Var.f279431b = ss8Var;
                    z51Var.f279432c = ss8Var2;
                    z51Var.f279433d = z;
                    z51Var.f279436g = 1;
                    objM71343h = px00Var.m71343h(str2, str, ss8Var, z51Var);
                    Object obj = yuk.f276404a;
                    if (objM71343h == obj) {
                        return obj;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = z51Var.f279433d;
                    ss8Var2 = z51Var.f279432c;
                    ss8Var = z51Var.f279431b;
                    str2 = z51Var.f279430a;
                    bga.m29073P(objM71343h);
                }
                str3 = str2;
                try {
                    c6x0Var = new f71(str3, (List) objM71343h, ss8Var, ss8Var2, z);
                } catch (Throwable th2) {
                    th = th2;
                    str2 = str3;
                    c6x0Var = new c6x0(th);
                    str3 = str2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
            Throwable thM77348a = s6x0.m77348a(c6x0Var);
            if (thM77348a == null) {
                return c6x0Var;
            }
            Logger.m3967c(thM77348a, "Error updating ban status for entity: %s", str3);
            return new d71(str3);
        } catch (CancellationException e) {
            throw e;
        }
    }
}
