package p204p;

import android.media.ResourceBusyException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class lep implements ihs {

    /* JADX INFO: renamed from: b */
    public final UUID f132629b;

    /* JADX INFO: renamed from: c */
    public final hix f132630c;

    /* JADX INFO: renamed from: d */
    public final zcd0 f132631d;

    /* JADX INFO: renamed from: e */
    public final HashMap f132632e;

    /* JADX INFO: renamed from: f */
    public final boolean f132633f;

    /* JADX INFO: renamed from: g */
    public final int[] f132634g;

    /* JADX INFO: renamed from: h */
    public final boolean f132635h;

    /* JADX INFO: renamed from: i */
    public final p7o f132636i;

    /* JADX INFO: renamed from: j */
    public final zz11 f132637j;

    /* JADX INFO: renamed from: k */
    public final bzo f132638k;

    /* JADX INFO: renamed from: l */
    public final long f132639l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f132640m;

    /* JADX INFO: renamed from: n */
    public final Set f132641n;

    /* JADX INFO: renamed from: o */
    public final Set f132642o;

    /* JADX INFO: renamed from: p */
    public int f132643p;

    /* JADX INFO: renamed from: q */
    public jix f132644q;

    /* JADX INFO: renamed from: r */
    public iep f132645r;

    /* JADX INFO: renamed from: s */
    public iep f132646s;

    /* JADX INFO: renamed from: t */
    public Looper f132647t;

    /* JADX INFO: renamed from: u */
    public Handler f132648u;

    /* JADX INFO: renamed from: v */
    public int f132649v;

    /* JADX INFO: renamed from: w */
    public byte[] f132650w;

    /* JADX INFO: renamed from: x */
    public w9p0 f132651x;

    /* JADX INFO: renamed from: y */
    public volatile un6 f132652y;

    public lep(UUID uuid, hix hixVar, zcd0 zcd0Var, HashMap map, boolean z, int[] iArr, boolean z2, zz11 zz11Var) {
        uuid.getClass();
        c95.m31844j(!mva.f147546c.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f132629b = uuid;
        this.f132630c = hixVar;
        this.f132631d = zcd0Var;
        this.f132632e = map;
        this.f132633f = z;
        this.f132634g = iArr;
        this.f132635h = z2;
        this.f132637j = zz11Var;
        this.f132636i = new p7o();
        this.f132638k = new bzo(this, 6);
        this.f132649v = 0;
        this.f132640m = new ArrayList();
        this.f132641n = Collections.newSetFromMap(new IdentityHashMap());
        this.f132642o = Collections.newSetFromMap(new IdentityHashMap());
        this.f132639l = 300000L;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m58802g(iep iepVar) {
        iepVar.m50396q();
        if (iepVar.f101503q != 1) {
            return false;
        }
        DrmSession$DrmSessionException drmSession$DrmSessionExceptionMo29261e = iepVar.mo29261e();
        drmSession$DrmSessionExceptionMo29261e.getClass();
        Throwable cause = drmSession$DrmSessionExceptionMo29261e.getCause();
        return (cause instanceof ResourceBusyException) || zn91.m96534V(cause);
    }

    /* JADX INFO: renamed from: j */
    public static ArrayList m58803j(ahs ahsVar, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(ahsVar.f15762d);
        for (int i = 0; i < ahsVar.f15762d; i++) {
            zgs zgsVar = ahsVar.f15759a[i];
            if ((zgsVar.m96105c(uuid) || (mva.f147547d.equals(uuid) && zgsVar.m96105c(mva.f147546c))) && (zgsVar.f282704e != null || z)) {
                arrayList.add(zgsVar);
            }
        }
        return arrayList;
    }

    @Override // p204p.ihs
    /* JADX INFO: renamed from: a */
    public final hhs mo50670a(ehs ehsVar, r300 r300Var) {
        c95.m31855u(this.f132643p > 0);
        this.f132647t.getClass();
        jep jepVar = new jep(this, ehsVar);
        Handler handler = this.f132648u;
        handler.getClass();
        handler.post(new fxf(8, jepVar, r300Var));
        return jepVar;
    }

    @Override // p204p.ihs
    /* JADX INFO: renamed from: b */
    public final void mo50671b() {
        m58809m(true);
        int i = this.f132643p;
        this.f132643p = i + 1;
        if (i != 0) {
            return;
        }
        if (this.f132644q == null) {
            jix jixVarMo25407l = this.f132630c.mo25407l(this.f132629b);
            this.f132644q = jixVarMo25407l;
            jixVarMo25407l.mo53486n(new xvo(this, 7));
        } else {
            if (this.f132639l == -9223372036854775807L) {
                return;
            }
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.f132640m;
                if (i2 >= arrayList.size()) {
                    return;
                }
                ((iep) arrayList.get(i2)).mo29263g(null);
                i2++;
            }
        }
    }

    @Override // p204p.ihs
    /* JADX INFO: renamed from: c */
    public final int mo44756c(r300 r300Var) {
        m58809m(false);
        jix jixVar = this.f132644q;
        jixVar.getClass();
        int iMo53480h = jixVar.mo53480h();
        ahs ahsVar = r300Var.f195391t;
        if (ahsVar == null) {
            int iM35792i = def0.m35792i(r300Var.f195387p);
            int i = 0;
            while (true) {
                int[] iArr = this.f132634g;
                if (i >= iArr.length) {
                    i = -1;
                    break;
                }
                if (iArr[i] == iM35792i) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return 0;
            }
        } else if (this.f132650w == null) {
            UUID uuid = this.f132629b;
            if (m58803j(ahsVar, uuid, true).isEmpty()) {
                if (ahsVar.f15762d == 1 && ahsVar.f15759a[0].m96105c(mva.f147546c)) {
                    yif1.m93819w0("DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = ahsVar.f15761c;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : Build.VERSION.SDK_INT < 25)) {
                return 1;
            }
        }
        return iMo53480h;
    }

    @Override // p204p.ihs
    /* JADX INFO: renamed from: d */
    public final void mo44757d(Looper looper, w9p0 w9p0Var) {
        synchronized (this) {
            try {
                Looper looper2 = this.f132647t;
                if (looper2 == null) {
                    this.f132647t = looper;
                    this.f132648u = new Handler(looper);
                } else {
                    c95.m31855u(looper2 == looper);
                    this.f132648u.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f132651x = w9p0Var;
    }

    @Override // p204p.ihs
    /* JADX INFO: renamed from: e */
    public final bhs mo44758e(ehs ehsVar, r300 r300Var) {
        m58809m(false);
        c95.m31855u(this.f132643p > 0);
        this.f132647t.getClass();
        return m58804f(this.f132647t, ehsVar, r300Var, true);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:18:0x0035 A[LOOP:0: B:13:0x002c->B:18:0x0035, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:58:0x0039 A[EDGE_INSN: B:58:0x0039->B:20:0x0039 BREAK  A[LOOP:0: B:13:0x002c->B:18:0x0035], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0038 A[SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public final bhs m58804f(Looper looper, ehs ehsVar, r300 r300Var, boolean z) {
        ArrayList arrayListM58803j;
        int[] iArr;
        iep iepVar;
        int i = 2;
        if (this.f132652y == null) {
            this.f132652y = new un6(this, looper, i);
        }
        ahs ahsVar = r300Var.f195391t;
        int i2 = 0;
        iep iepVar2 = null;
        if (ahsVar != null) {
            if (this.f132650w == null) {
                arrayListM58803j = m58803j(ahsVar, this.f132629b, false);
                if (arrayListM58803j.isEmpty()) {
                    DefaultDrmSessionManager$MissingSchemeDataException defaultDrmSessionManager$MissingSchemeDataException = new DefaultDrmSessionManager$MissingSchemeDataException("Media does not support uuid: " + this.f132629b);
                    yif1.m93810s("DRM error", defaultDrmSessionManager$MissingSchemeDataException);
                    if (ehsVar != null) {
                        ehsVar.m39002e(defaultDrmSessionManager$MissingSchemeDataException);
                    }
                    return new vgw(new DrmSession$DrmSessionException(6003, defaultDrmSessionManager$MissingSchemeDataException));
                }
            } else {
                arrayListM58803j = null;
            }
            if (this.f132633f) {
                for (iep iepVar3 : this.f132640m) {
                    if (Objects.equals(iepVar3.f101487a, arrayListM58803j)) {
                        iepVar2 = iepVar3;
                        break;
                    }
                }
            } else {
                iepVar2 = this.f132646s;
            }
            if (iepVar2 != null) {
                iepVar2.mo29263g(ehsVar);
                return iepVar2;
            }
            iep iepVarM58806i = m58806i(arrayListM58803j, false, ehsVar, z);
            if (!this.f132633f) {
                this.f132646s = iepVarM58806i;
            }
            this.f132640m.add(iepVarM58806i);
            return iepVarM58806i;
        }
        int iM35792i = def0.m35792i(r300Var.f195387p);
        jix jixVar = this.f132644q;
        jixVar.getClass();
        if (jixVar.mo53480h() == 2) {
            HashSet hashSet = dgd0.f48781a;
            if (!t900.f218165c) {
                iArr = this.f132634g;
                while (true) {
                    if (i2 < iArr.length) {
                        i2 = -1;
                        break;
                    }
                    if (iArr[i2] == iM35792i) {
                        break;
                    }
                    i2++;
                }
                if (i2 != -1 && jixVar.mo53480h() != 1) {
                    iepVar = this.f132645r;
                    if (iepVar == null) {
                        kf40 kf40Var = pf40.f176960b;
                        iep iepVarM58806i2 = m58806i(wsv0.f254763e, true, null, z);
                        this.f132640m.add(iepVarM58806i2);
                        this.f132645r = iepVarM58806i2;
                    } else {
                        iepVar.mo29263g(null);
                    }
                    return this.f132645r;
                }
            }
        } else {
            iArr = this.f132634g;
            while (true) {
                if (i2 < iArr.length) {
                    i2 = -1;
                    break;
                }
                if (iArr[i2] == iM35792i) {
                    break;
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                iepVar = this.f132645r;
                if (iepVar == null) {
                    kf40 kf40Var2 = pf40.f176960b;
                    iep iepVarM58806i3 = m58806i(wsv0.f254763e, true, null, z);
                    this.f132640m.add(iepVarM58806i3);
                    this.f132645r = iepVarM58806i3;
                } else {
                    iepVar.mo29263g(null);
                }
                return this.f132645r;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final iep m58805h(List list, boolean z, ehs ehsVar) {
        this.f132644q.getClass();
        boolean z2 = this.f132635h | z;
        jix jixVar = this.f132644q;
        int i = this.f132649v;
        byte[] bArr = this.f132650w;
        Looper looper = this.f132647t;
        looper.getClass();
        w9p0 w9p0Var = this.f132651x;
        w9p0Var.getClass();
        iep iepVar = new iep(this.f132629b, jixVar, this.f132636i, this.f132638k, list, i, z2, z, bArr, this.f132632e, this.f132631d, looper, this.f132637j, w9p0Var);
        iepVar.mo29263g(ehsVar);
        if (this.f132639l != -9223372036854775807L) {
            iepVar.mo29263g(null);
        }
        return iepVar;
    }

    /* JADX INFO: renamed from: i */
    public final iep m58806i(List list, boolean z, ehs ehsVar, boolean z2) {
        iep iepVarM58805h = m58805h(list, z, ehsVar);
        boolean zM58802g = m58802g(iepVarM58805h);
        long j = this.f132639l;
        Set set = this.f132642o;
        if (zM58802g && !set.isEmpty()) {
            o3a1 it = hg40.m47406p(set).iterator();
            while (it.hasNext()) {
                ((bhs) it.next()).mo29258b(null);
            }
            iepVarM58805h.mo29258b(ehsVar);
            if (j != -9223372036854775807L) {
                iepVarM58805h.mo29258b(null);
            }
            iepVarM58805h = m58805h(list, z, ehsVar);
        }
        if (m58802g(iepVarM58805h) && z2) {
            Set set2 = this.f132641n;
            if (!set2.isEmpty()) {
                o3a1 it2 = hg40.m47406p(set2).iterator();
                while (it2.hasNext()) {
                    ((jep) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    o3a1 it3 = hg40.m47406p(set).iterator();
                    while (it3.hasNext()) {
                        ((bhs) it3.next()).mo29258b(null);
                    }
                }
                iepVarM58805h.mo29258b(ehsVar);
                if (j != -9223372036854775807L) {
                    iepVarM58805h.mo29258b(null);
                }
                return m58805h(list, z, ehsVar);
            }
        }
        return iepVarM58805h;
    }

    /* JADX INFO: renamed from: k */
    public final void m58807k() {
        if (this.f132644q != null && this.f132643p == 0 && this.f132640m.isEmpty() && this.f132641n.isEmpty()) {
            jix jixVar = this.f132644q;
            jixVar.getClass();
            jixVar.release();
            this.f132644q = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m58808l(byte[] bArr, int i) {
        c95.m31855u(this.f132640m.isEmpty());
        if (i == 1 || i == 3) {
            bArr.getClass();
        }
        this.f132649v = i;
        this.f132650w = bArr;
    }

    /* JADX INFO: renamed from: m */
    public final void m58809m(boolean z) {
        if (z && this.f132647t == null) {
            yif1.m93821x0("DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f132647t;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            yif1.m93821x0("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f132647t.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // p204p.ihs
    public final void release() {
        m58809m(true);
        int i = this.f132643p - 1;
        this.f132643p = i;
        if (i != 0) {
            return;
        }
        if (this.f132639l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f132640m);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((iep) arrayList.get(i2)).mo29258b(null);
            }
        }
        o3a1 it = hg40.m47406p(this.f132641n).iterator();
        while (it.hasNext()) {
            ((jep) it.next()).release();
        }
        m58807k();
    }
}
