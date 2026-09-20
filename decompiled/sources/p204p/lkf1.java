package p204p;

import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class lkf1 extends tj10 implements mvg1 {

    /* JADX INFO: renamed from: H */
    public static final ura0 f134343H = new ura0("CastClient", null);

    /* JADX INFO: renamed from: I */
    public static final lh51 f134344I = new lh51("Cast.API_CXLESS", new j3f1(9), yef1.f271991a);

    /* JADX INFO: renamed from: A */
    public ogf1 f134345A;

    /* JADX INFO: renamed from: B */
    public final CastDevice f134346B;

    /* JADX INFO: renamed from: C */
    public final HashMap f134347C;

    /* JADX INFO: renamed from: D */
    public final HashMap f134348D;

    /* JADX INFO: renamed from: E */
    public final m6h1 f134349E;

    /* JADX INFO: renamed from: F */
    public final List f134350F;

    /* JADX INFO: renamed from: G */
    public int f134351G;

    /* JADX INFO: renamed from: l */
    public final fkf1 f134352l;

    /* JADX INFO: renamed from: m */
    public ywh0 f134353m;

    /* JADX INFO: renamed from: n */
    public boolean f134354n;

    /* JADX INFO: renamed from: o */
    public boolean f134355o;

    /* JADX INFO: renamed from: p */
    public ev61 f134356p;

    /* JADX INFO: renamed from: q */
    public ev61 f134357q;

    /* JADX INFO: renamed from: r */
    public final AtomicLong f134358r;

    /* JADX INFO: renamed from: s */
    public final Object f134359s;

    /* JADX INFO: renamed from: t */
    public final Object f134360t;

    /* JADX INFO: renamed from: u */
    public lg5 f134361u;

    /* JADX INFO: renamed from: v */
    public String f134362v;

    /* JADX INFO: renamed from: w */
    public double f134363w;

    /* JADX INFO: renamed from: x */
    public boolean f134364x;

    /* JADX INFO: renamed from: y */
    public int f134365y;

    /* JADX INFO: renamed from: z */
    public int f134366z;

    public lkf1(Context context, z9c z9cVar) {
        super(context, null, f134344I, z9cVar, sj10.f209710c);
        this.f134352l = new fkf1(this);
        this.f134359s = new Object();
        this.f134360t = new Object();
        this.f134350F = Collections.synchronizedList(new ArrayList());
        this.f134349E = z9cVar.f280740b;
        this.f134346B = z9cVar.f280739a;
        this.f134347C = new HashMap();
        this.f134348D = new HashMap();
        this.f134358r = new AtomicLong(0L);
        this.f134351G = 1;
        m59271v();
    }

    /* JADX INFO: renamed from: f */
    public final void m59255f(aac aacVar, String str, cbh1 cbh1Var, ev61 ev61Var) {
        ig31.m50508z("Not active connection", this.f134351G != 1);
        if (aacVar != null) {
            gbf1 gbf1Var = (gbf1) cbh1Var.m37438q();
            j45 j45VarM44803n = gif1.m44803n();
            Parcel parcelM43604d2 = gbf1Var.m43604d2();
            parcelM43604d2.writeString(str);
            fmf1.m42107b(parcelM43604d2, j45VarM44803n);
            gbf1Var.m43607g2(12, parcelM43604d2);
        }
        ev61Var.m40097b(null);
    }

    /* JADX INFO: renamed from: g */
    public final void m59256g(int i) {
        synchronized (this.f134360t) {
            try {
                ev61 ev61Var = this.f134357q;
                if (ev61Var == null) {
                    return;
                }
                if (i == 0) {
                    ev61Var.m40097b(new Status(0, null, null, null));
                } else {
                    ev61Var.m40096a(uqe1.m83767f(new Status(i, null, null, null)));
                }
                this.f134357q = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m59257h(int i, long j) {
        ev61 ev61Var;
        HashMap map = this.f134347C;
        synchronized (map) {
            Long lValueOf = Long.valueOf(j);
            ev61Var = (ev61) map.get(lValueOf);
            map.remove(lValueOf);
        }
        if (ev61Var != null) {
            if (i == 0) {
                ev61Var.m40097b(null);
            } else {
                ev61Var.m40096a(uqe1.m83767f(new Status(i, null, null, null)));
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final Handler m59258i() {
        if (this.f134353m == null) {
            this.f134353m = new ywh0(this.f220801g, 5);
        }
        return this.f134353m;
    }

    /* JADX INFO: renamed from: j */
    public final void m59259j() {
        f134343H.m83848a("removing all MessageReceivedCallbacks", new Object[0]);
        HashMap map = this.f134348D;
        synchronized (map) {
            map.clear();
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m59260k() {
        return this.f134351G == 3;
    }

    /* JADX INFO: renamed from: l */
    public final void m59261l(int i) {
        synchronized (this.f134359s) {
            try {
                ev61 ev61Var = this.f134356p;
                if (ev61Var != null) {
                    ev61Var.m40096a(uqe1.m83767f(new Status(i, null, null, null)));
                }
                this.f134356p = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m59262m(bbh1 bbh1Var) {
        this.f134350F.add(bbh1Var);
    }

    /* JADX INFO: renamed from: n */
    public final y7h1 m59263n() {
        fzj fzjVarM32319r = cct.m32319r(this.f134352l, this.f220801g, "castDeviceControllerListenerKey");
        mqi0 mqi0VarM34325j = cxq0.m34325j();
        c4d1 c4d1Var = new c4d1(this, 14);
        this.f134351G = 2;
        mqi0VarM34325j.f146300e = fzjVarM32319r;
        mqi0VarM34325j.f146298c = c4d1Var;
        mqi0VarM34325j.f146299d = mzb1.f148669a;
        mqi0VarM34325j.f146301f = new gey[]{q0f1.f184003g};
        mqi0VarM34325j.f146296a = 8428;
        return m80959b(mqi0VarM34325j.m62563b());
    }

    /* JADX INFO: renamed from: o */
    public final y7h1 m59264o() {
        h9p h9pVarM46874g = h9p.m46874g();
        h9pVarM46874g.f89015c = cic1.f38281a;
        h9pVarM46874g.f89013a = 8403;
        y7h1 y7h1VarM80962e = m80962e(1, h9pVarM46874g.m46881f());
        m59259j();
        i890 i890Var = (i890) cct.m32319r(this.f134352l, this.f220801g, "castDeviceControllerListenerKey").f75031b;
        ig31.m50507y(i890Var, "Key must not be null");
        m80960c(i890Var, 8415);
        return y7h1VarM80962e;
    }

    /* JADX INFO: renamed from: p */
    public final y7h1 m59265p(String str, String str2) {
        acc.m25452b(str);
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        if (str2.length() > 524288) {
            f134343H.m83850c("Message send failed. Message exceeds maximum size", new Object[0]);
            throw new IllegalArgumentException("Message exceeds maximum size524288");
        }
        h9p h9pVarM46874g = h9p.m46874g();
        h9pVarM46874g.f89015c = new y0i0(this, str, str2, 18);
        h9pVarM46874g.f89013a = 8405;
        return m80962e(1, h9pVarM46874g.m46881f());
    }

    /* JADX INFO: renamed from: q */
    public final y7h1 m59266q(String str, kn70 kn70Var) {
        h9p h9pVarM46874g = h9p.m46874g();
        h9pVarM46874g.f89015c = new y0i0(this, str, kn70Var, 19);
        h9pVarM46874g.f89013a = 8406;
        return m80962e(1, h9pVarM46874g.m46881f());
    }

    /* JADX INFO: renamed from: r */
    public final y7h1 m59267r(String str) {
        h9p h9pVarM46874g = h9p.m46874g();
        h9pVarM46874g.f89015c = new s0f1(6, this, str);
        h9pVarM46874g.f89013a = 8409;
        return m80962e(1, h9pVarM46874g.m46881f());
    }

    /* JADX INFO: renamed from: s */
    public final y7h1 m59268s(String str, aac aacVar) {
        acc.m25452b(str);
        if (aacVar != null) {
            HashMap map = this.f134348D;
            synchronized (map) {
                map.put(str, aacVar);
            }
        }
        h9p h9pVarM46874g = h9p.m46874g();
        h9pVarM46874g.f89015c = new g7d1(this, str, aacVar);
        h9pVarM46874g.f89013a = 8413;
        return m80962e(1, h9pVarM46874g.m46881f());
    }

    /* JADX INFO: renamed from: t */
    public final y7h1 m59269t(String str) {
        aac aacVar;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Channel namespace cannot be null or empty");
        }
        HashMap map = this.f134348D;
        synchronized (map) {
            aacVar = (aac) map.remove(str);
        }
        h9p h9pVarM46874g = h9p.m46874g();
        h9pVarM46874g.f89015c = new y0i0(this, aacVar, str, 17);
        h9pVarM46874g.f89013a = 8414;
        return m80962e(1, h9pVarM46874g.m46881f());
    }

    /* JADX INFO: renamed from: u */
    public final y7h1 m59270u(String str, String str2) {
        h9p h9pVarM46874g = h9p.m46874g();
        h9pVarM46874g.f89015c = new f7d1(this, str, str2, false, 10);
        h9pVarM46874g.f89013a = 8407;
        return m80962e(1, h9pVarM46874g.m46881f());
    }

    /* JADX INFO: renamed from: v */
    public final void m59271v() {
        CastDevice castDevice = this.f134346B;
        xhy0 xhy0Var = castDevice.f1779i;
        if (xhy0Var.m91069c(2048) || !xhy0Var.m91069c(4) || xhy0Var.m91069c(1)) {
            return;
        }
        "Chromecast Audio".equals(castDevice.f1775e);
    }

    /* JADX INFO: renamed from: w */
    public final void m59272w(String str, String str2, cbh1 cbh1Var, ev61 ev61Var) {
        HashMap map = this.f134347C;
        long jIncrementAndGet = this.f134358r.incrementAndGet();
        ig31.m50508z("Not connected to device", m59260k());
        try {
            map.put(Long.valueOf(jIncrementAndGet), ev61Var);
            Context context = cbh1Var.f54558c;
            j45 j45VarM44803n = gif1.m44803n();
            gbf1 gbf1Var = (gbf1) cbh1Var.m37438q();
            Parcel parcelM43604d2 = gbf1Var.m43604d2();
            parcelM43604d2.writeString(str);
            parcelM43604d2.writeString(str2);
            parcelM43604d2.writeLong(jIncrementAndGet);
            fmf1.m42107b(parcelM43604d2, j45VarM44803n);
            gbf1Var.m43607g2(9, parcelM43604d2);
        } catch (RemoteException e) {
            map.remove(Long.valueOf(jIncrementAndGet));
            ev61Var.m40096a(e);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m59273x(String str, kn70 kn70Var, cbh1 cbh1Var, ev61 ev61Var) {
        ig31.m50508z("Not connected to device", m59260k());
        gbf1 gbf1Var = (gbf1) cbh1Var.m37438q();
        j45 j45VarM44803n = gif1.m44803n();
        Parcel parcelM43604d2 = gbf1Var.m43604d2();
        parcelM43604d2.writeString(str);
        fmf1.m42107b(parcelM43604d2, kn70Var);
        fmf1.m42107b(parcelM43604d2, j45VarM44803n);
        gbf1Var.m43607g2(13, parcelM43604d2);
        synchronized (this.f134359s) {
            try {
                if (this.f134356p != null) {
                    m59261l(2477);
                }
                this.f134356p = ev61Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m59274y(String str, cbh1 cbh1Var, ev61 ev61Var) {
        ig31.m50508z("Not connected to device", m59260k());
        gbf1 gbf1Var = (gbf1) cbh1Var.m37438q();
        j45 j45VarM44803n = gif1.m44803n();
        Parcel parcelM43604d2 = gbf1Var.m43604d2();
        parcelM43604d2.writeString(str);
        fmf1.m42107b(parcelM43604d2, j45VarM44803n);
        gbf1Var.m43607g2(5, parcelM43604d2);
        synchronized (this.f134360t) {
            try {
                if (this.f134357q != null) {
                    ev61Var.m40096a(uqe1.m83767f(new Status(2001, null, null, null)));
                } else {
                    this.f134357q = ev61Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
