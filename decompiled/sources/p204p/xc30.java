package p204p;

import androidx.car.app.model.Alert;
import com.spotify.audio.record.AudioRecordingException;
import com.spotify.hovercraftasr.p080v1.C0792a;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class xc30 implements sy31 {

    /* JADX INFO: renamed from: q */
    public static final WeakHashMap f260062q = new WeakHashMap();

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ int f260063r = 0;

    /* JADX INFO: renamed from: a */
    public final w47 f260064a;

    /* JADX INFO: renamed from: b */
    public final boolean f260065b;

    /* JADX INFO: renamed from: f */
    public volatile Object f260069f;

    /* JADX INFO: renamed from: h */
    public final fk31 f260071h;

    /* JADX INFO: renamed from: i */
    public final wa21 f260072i;

    /* JADX INFO: renamed from: j */
    public final c9k f260073j;

    /* JADX INFO: renamed from: k */
    public final w47 f260074k;

    /* JADX INFO: renamed from: l */
    public c9k f260075l;

    /* JADX INFO: renamed from: m */
    public final zv41 f260076m;

    /* JADX INFO: renamed from: n */
    public final nnc f260077n;

    /* JADX INFO: renamed from: o */
    public final zv41 f260078o;

    /* JADX INFO: renamed from: p */
    public boolean f260079p;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f260066c = new AtomicReference(null);

    /* JADX INFO: renamed from: d */
    public final ConcurrentLinkedQueue f260067d = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: e */
    public final lsi0 f260068e = msi0.m62770a();

    /* JADX INFO: renamed from: g */
    public fiz f260070g = gau.f78095a;

    public xc30(fk31 fk31Var, wa21 wa21Var, c9k c9kVar, w47 w47Var, boolean z) {
        this.f260064a = w47Var;
        this.f260065b = z;
        this.f260071h = fk31Var;
        this.f260072i = wa21Var;
        this.f260073j = c9kVar;
        this.f260074k = w47Var;
        zv41 zv41VarM52819d = jag1.m52819d(null);
        this.f260076m = zv41VarM52819d;
        this.f260077n = xtm0.m92074U(zv41VarM52819d, new zv3(8));
        this.f260078o = jag1.m52819d(Boolean.FALSE);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:47:0x00be  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ac, code lost:
    
        if (r10 == r1) goto L66;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m90340f(xc30 xc30Var, ibk ibkVar) throws Exception {
        a57 a57Var;
        t47 t47Var;
        fiz fizVar;
        WeakHashMap weakHashMap;
        Object obj;
        xc30 xc30Var2;
        Exception exc;
        if (ibkVar instanceof a57) {
            a57Var = (a57) ibkVar;
            int i = a57Var.f12453e;
            if ((i & Integer.MIN_VALUE) != 0) {
                a57Var.f12453e = i - Integer.MIN_VALUE;
            } else {
                a57Var = new a57(xc30Var, ibkVar);
            }
        } else {
            a57Var = new a57(xc30Var, ibkVar);
        }
        Object objM95786f = a57Var.f12451c;
        yuk yukVar = yuk.f276404a;
        int i2 = a57Var.f12453e;
        fbk fbkVar = null;
        if (i2 == 0) {
            bga.m29073P(objM95786f);
            if (!xc30Var.f260065b && xc30Var.f260064a.f247725f.get() != null) {
                throw new AudioRecordingException(new IllegalStateException("Mic is unavailable while a routed recording is active"));
            }
            w47 w47Var = xc30Var.f260064a;
            a57Var.f12449a = xc30Var;
            a57Var.f12453e = 1;
            objM95786f = zag1.m95786f(w47Var, a57Var);
            if (objM95786f != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            xc30Var = a57Var.f12449a;
            bga.m29073P(objM95786f);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    xc30Var = a57Var.f12449a;
                    bga.m29073P(objM95786f);
                    t47Var = (t47) objM95786f;
                    xc30Var.f260066c.set(t47Var);
                    if (t47Var != null || (fizVar = t47Var.f216929c) == null) {
                        fizVar = gau.f78095a;
                    }
                    xc30Var.f260070g = fizVar;
                    weakHashMap = f260062q;
                    synchronized (weakHashMap) {
                        obj = new Object();
                        xc30Var.f260069f = obj;
                        weakHashMap.put(xc30Var.f260064a, obj);
                    }
                    try {
                        xc30Var.f260064a.m87166c(true);
                        xc30Var.f260064a.f247731l.m81835y();
                        return w2a1.f247311a;
                    } catch (Exception e) {
                        e = e;
                        if (xc30Var.m90343c(obj)) {
                            xc30Var.f260064a.m87166c(false);
                        }
                        t47 t47Var2 = (t47) xc30Var.f260066c.getAndSet(null);
                        if (t47Var2 != null) {
                            a57Var.f12449a = xc30Var;
                            a57Var.f12450b = e;
                            a57Var.f12453e = 4;
                            Object objM89557A = x0h1.m89557A(rnj0.f200934b, new es1(t47Var2.f216930d, t47Var2, fbkVar, 1), a57Var);
                            if (objM89557A != yuk.f276404a) {
                                objM89557A = w2a1.f247311a;
                            }
                            if (objM89557A != yukVar) {
                                xc30Var2 = xc30Var;
                                exc = e;
                            }
                        }
                    }
                } else {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    exc = a57Var.f12450b;
                    xc30Var2 = a57Var.f12449a;
                    bga.m29073P(objM95786f);
                }
                e = exc;
                xc30Var = xc30Var2;
                xc30Var.f260070g = gau.f78095a;
                throw e;
            }
            xc30Var = a57Var.f12449a;
            bga.m29073P(objM95786f);
            if (xc30Var.f260065b) {
                t47Var = null;
                xc30Var.f260066c.set(t47Var);
                if (t47Var != null) {
                    fizVar = gau.f78095a;
                } else {
                    fizVar = gau.f78095a;
                }
                xc30Var.f260070g = fizVar;
                weakHashMap = f260062q;
                synchronized (weakHashMap) {
                    obj = new Object();
                    xc30Var.f260069f = obj;
                    weakHashMap.put(xc30Var.f260064a, obj);
                    xc30Var.f260064a.m87166c(true);
                    xc30Var.f260064a.f247731l.m81835y();
                    return w2a1.f247311a;
                }
            }
            w47 w47Var2 = xc30Var.f260064a;
            a57Var.f12449a = xc30Var;
            a57Var.f12453e = 3;
            objM95786f = w47Var2.m87165b(a57Var);
        }
        if (((Boolean) objM95786f).booleanValue()) {
            xc30Var.f260064a.f247731l.m81836z();
            xc30Var.f260064a.m87166c(false);
        }
        a57Var.f12449a = xc30Var;
        a57Var.f12453e = 2;
        if (xc30Var.m90341a(a57Var) != yukVar) {
            if (xc30Var.f260065b) {
                t47Var = null;
                xc30Var.f260066c.set(t47Var);
                if (t47Var != null) {
                    fizVar = gau.f78095a;
                } else {
                    fizVar = gau.f78095a;
                }
                xc30Var.f260070g = fizVar;
                weakHashMap = f260062q;
                synchronized (weakHashMap) {
                    obj = new Object();
                    xc30Var.f260069f = obj;
                    weakHashMap.put(xc30Var.f260064a, obj);
                    xc30Var.f260064a.m87166c(true);
                    xc30Var.f260064a.f247731l.m81835y();
                    return w2a1.f247311a;
                }
            }
            w47 w47Var3 = xc30Var.f260064a;
            a57Var.f12449a = xc30Var;
            a57Var.f12453e = 3;
            objM95786f = w47Var3.m87165b(a57Var);
        }
        return yukVar;
    }

    /* JADX INFO: renamed from: a */
    public final Object m90341a(ibk ibkVar) throws Throwable {
        Object objM89557A = x0h1.m89557A(rnj0.f200934b, new x47(this, null), ibkVar);
        return objM89557A == yuk.f276404a ? objM89557A : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: b */
    public final void m90342b() {
        List listMo27502c;
        c9k c9kVar = this.f260075l;
        if (c9kVar != null) {
            if (!qlg1.m73186B(c9kVar.f35578a).isActive()) {
                c9kVar = null;
            }
            if (c9kVar == null) {
                return;
            }
            Boolean bool = Boolean.FALSE;
            zv41 zv41Var = this.f260078o;
            zv41Var.getClass();
            zv41Var.m97091m(null, bool);
            m90344d(ka6.DISMISS);
            m90346g();
            kk40.m56680v(c9kVar, null);
            eb11 eb11Var = (eb11) this.f260076m.getValue();
            if (eb11Var == null || (listMo27502c = eb11Var.mo27502c()) == null || !listMo27502c.isEmpty()) {
                return;
            }
            this.f260071h.mo27921a();
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m90343c(Object obj) {
        boolean z;
        WeakHashMap weakHashMap = f260062q;
        synchronized (weakHashMap) {
            try {
                if (this.f260069f == obj) {
                    this.f260069f = null;
                }
                if (weakHashMap.get(this.f260064a) == obj) {
                    weakHashMap.remove(this.f260064a);
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: d */
    public final void m90344d(ka6 ka6Var) {
        if (this.f260079p) {
            return;
        }
        this.f260079p = true;
        wa21 wa21Var = this.f260072i;
        if (wa21Var.f249342e != null) {
            C0792a c0792aM87562b = wa21Var.m87562b();
            c0792aM87562b.m11884r();
            c0792aM87562b.m11888v(ka6Var);
            iva ivaVarM28026i = b3h1.m28026i(c0792aM87562b);
            old1 old1Var = wa21Var.f249342e;
            if (old1Var == null) {
                wj50.m88260d0("webSocket");
                throw null;
            }
            ((yvu0) old1Var).m94751f(2, ivaVarM28026i);
        }
        if (ka6Var == ka6.MANUAL_SUBMISSION) {
            Boolean bool = Boolean.TRUE;
            zv41 zv41Var = this.f260078o;
            zv41Var.getClass();
            zv41Var.m97091m(null, bool);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m90345e(fbk fbkVar) throws Exception {
        sc30 sc30Var;
        juk jukVar;
        c9k c9kVarM56661c;
        luu0 luu0VarM31027s;
        c9k c9kVar;
        Exception e;
        if (fbkVar instanceof sc30) {
            sc30Var = (sc30) fbkVar;
            int i = sc30Var.f207641e;
            if ((i & Integer.MIN_VALUE) != 0) {
                sc30Var.f207641e = i - Integer.MIN_VALUE;
            } else {
                sc30Var = new sc30(this, (ibk) fbkVar);
            }
        } else {
            sc30Var = new sc30(this, (ibk) fbkVar);
        }
        Object obj = sc30Var.f207639c;
        int i2 = sc30Var.f207641e;
        iq3 iq3Var = hf11.f90581a;
        int i3 = 2;
        fbk fbkVar2 = null;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                c9k c9kVar2 = this.f260075l;
                if (c9kVar2 != null && (jukVar = c9kVar2.f35578a) != null) {
                    tf60 tf60VarM73186B = qlg1.m73186B(jukVar);
                    sc30Var.f207641e = 1;
                    if (qlg1.m73213r(tf60VarM73186B, sc30Var) != yukVar) {
                    }
                }
                return yukVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                luu0VarM31027s = sc30Var.f207638b;
                c9kVar = sc30Var.f207637a;
                try {
                    bga.m29073P(obj);
                    x0h1.m89578u(c9kVar, null, 4, new f620(this, fbkVar2, 9), 1);
                    int i4 = 10;
                    luu0 luu0VarM31027s2 = bzf1.m31027s(b0g1.m27776L(xtm0.m92105z(luu0VarM31027s, oyf1.m68486s(nxf1.m65833l(new f620(this, luu0VarM31027s, fbkVar2, 11)), new ga2(i4)), new qp20(this.f260070g, 3)), new y47(this, fbkVar2, i3)), c9kVar, iq3Var, Alert.DURATION_SHOW_INDEFINITELY);
                    zv41 zv41Var = this.f260076m;
                    zv41Var.getClass();
                    zv41Var.m97091m(null, luu0VarM31027s2);
                    x0h1.m89578u(c9kVar, null, 0, new f620(this, c9kVar, fbkVar2, i4), 3);
                    return w2a1.f247311a;
                } catch (Exception e2) {
                    e = e2;
                    kk40.m56680v(c9kVar, null);
                    throw e;
                }
            }
            bga.m29073P(obj);
            sc30Var.f207637a = c9kVarM56661c;
            sc30Var.f207638b = luu0VarM31027s;
            sc30Var.f207641e = 2;
            if (m90340f(this, sc30Var) != yukVar) {
                c9kVar = c9kVarM56661c;
                x0h1.m89578u(c9kVar, null, 4, new f620(this, fbkVar2, 9), 1);
                int i5 = 10;
                luu0 luu0VarM31027s3 = bzf1.m31027s(b0g1.m27776L(xtm0.m92105z(luu0VarM31027s, oyf1.m68486s(nxf1.m65833l(new f620(this, luu0VarM31027s, fbkVar2, 11)), new ga2(i5)), new qp20(this.f260070g, 3)), new y47(this, fbkVar2, i3)), c9kVar, iq3Var, Alert.DURATION_SHOW_INDEFINITELY);
                zv41 zv41Var2 = this.f260076m;
                zv41Var2.getClass();
                zv41Var2.m97091m(null, luu0VarM31027s3);
                x0h1.m89578u(c9kVar, null, 0, new f620(this, c9kVar, fbkVar2, i5), 3);
                return w2a1.f247311a;
            }
            return yukVar;
        } catch (Exception e3) {
            c9kVar = c9kVarM56661c;
            e = e3;
            kk40.m56680v(c9kVar, null);
            throw e;
        }
        juk jukVar2 = this.f260073j.f35578a;
        c9kVarM56661c = kk40.m56661c(jukVar2.mo26608y(qlg1.m73201f(qlg1.m73186B(jukVar2))));
        this.f260075l = c9kVarM56661c;
        this.f260079p = false;
        Boolean boolM74178H = qyg1.m74178H(false);
        zv41 zv41Var3 = this.f260078o;
        zv41Var3.getClass();
        zv41Var3.m97091m(null, boolM74178H);
        luu0VarM31027s = bzf1.m31027s(xtm0.m92105z(b0g1.m27776L(this.f260071h.mo27922b(this.f260072i), new qoy(this, fbkVar2, 29)), xtm0.m92074U(zv41Var3, new zv3(7))), c9kVarM56661c, iq3Var, Alert.DURATION_SHOW_INDEFINITELY);
    }

    /* JADX INFO: renamed from: g */
    public final void m90346g() {
        Object obj = this.f260069f;
        if (obj != null && m90343c(obj)) {
            this.f260064a.f247731l.m81836z();
            this.f260064a.m87166c(false);
        }
        t47 t47Var = (t47) this.f260066c.getAndSet(null);
        if (t47Var != null) {
            this.f260067d.add(t47Var);
        }
        this.f260070g = gau.f78095a;
    }
}
