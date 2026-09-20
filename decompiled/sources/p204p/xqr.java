package p204p;

import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xqr implements AutoCloseable {

    /* JADX INFO: renamed from: P0 */
    public static final urv0 f265088P0 = new urv0("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: L0 */
    public boolean f265089L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f265090M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f265091N0;

    /* JADX INFO: renamed from: O0 */
    public final vqr f265092O0;

    /* JADX INFO: renamed from: X */
    public tuu0 f265093X;

    /* JADX INFO: renamed from: Y */
    public boolean f265094Y;

    /* JADX INFO: renamed from: Z */
    public boolean f265095Z;

    /* JADX INFO: renamed from: a */
    public final tbn0 f265096a;

    /* JADX INFO: renamed from: b */
    public final long f265097b;

    /* JADX INFO: renamed from: c */
    public final tbn0 f265098c;

    /* JADX INFO: renamed from: d */
    public final tbn0 f265099d;

    /* JADX INFO: renamed from: e */
    public final tbn0 f265100e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f265101f;

    /* JADX INFO: renamed from: g */
    public final c9k f265102g;

    /* JADX INFO: renamed from: h */
    public final Object f265103h;

    /* JADX INFO: renamed from: i */
    public long f265104i;

    /* JADX INFO: renamed from: t */
    public int f265105t;

    public xqr(long j, ywy ywyVar, tbn0 tbn0Var) {
        this.f265096a = tbn0Var;
        this.f265097b = j;
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f265098c = tbn0Var.m80403e("journal");
        this.f265099d = tbn0Var.m80403e("journal.tmp");
        this.f265100e = tbn0Var.m80403e("journal.bkp");
        this.f265101f = new LinkedHashMap(0, 0.75f, true);
        x461 x461VarM64613f = njg1.m64613f();
        kuk kukVar = luk.f137098b;
        n5q n5qVar = xsr.f265651a;
        this.f265102g = kk40.m56661c(mlg1.m62205A(x461VarM64613f, tlp.f221498c.mo40637Q(1)));
        this.f265103h = new Object();
        this.f265092O0 = new vqr(ywyVar);
    }

    /* JADX INFO: renamed from: G */
    public static void m91880G(String str) {
        if (!f265088P0.m83873e(str)) {
            throw new IllegalArgumentException(dq60.m36608h('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0125 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0014, B:12:0x001b, B:14:0x0023, B:19:0x003b, B:27:0x0049, B:32:0x0069, B:34:0x007c, B:36:0x008d, B:38:0x0094, B:33:0x006f, B:42:0x00b4, B:44:0x00bb, B:47:0x00c0, B:49:0x00d0, B:52:0x00d5, B:57:0x0110, B:59:0x011b, B:64:0x0125, B:53:0x00ed, B:55:0x0102, B:56:0x010d, B:41:0x00a4, B:67:0x012a, B:68:0x0131), top: B:71:0x0003 }] */
    /* JADX INFO: renamed from: a */
    public static final void m91881a(xqr xqrVar, m12 m12Var, boolean z) {
        synchronized (xqrVar.f265103h) {
            qqr qqrVar = (qqr) m12Var.f138797c;
            if (!wj50.m88271j(qqrVar.f191642g, m12Var)) {
                throw new IllegalStateException("Check failed.");
            }
            boolean z2 = true;
            if (!z || qqrVar.f191641f) {
                for (int i = 0; i < 2; i++) {
                    xqrVar.f265092O0.mo40344f((tbn0) qqrVar.f191639d.get(i));
                }
            } else {
                for (int i2 = 0; i2 < 2; i2++) {
                    if (((boolean[]) m12Var.f138798d)[i2]) {
                        vqr vqrVar = xqrVar.f265092O0;
                        tbn0 tbn0Var = (tbn0) qqrVar.f191639d.get(i2);
                        vqrVar.getClass();
                        if (!(vqrVar.mo39302h(tbn0Var) != null)) {
                            m12Var.m60488A(false);
                            return;
                        }
                    }
                }
                for (int i3 = 0; i3 < 2; i3++) {
                    tbn0 tbn0Var2 = (tbn0) qqrVar.f191639d.get(i3);
                    tbn0 tbn0Var3 = (tbn0) qqrVar.f191638c.get(i3);
                    vqr vqrVar2 = xqrVar.f265092O0;
                    vqrVar2.getClass();
                    if (vqrVar2.mo39302h(tbn0Var2) != null) {
                        xqrVar.f265092O0.mo39301c(tbn0Var2, tbn0Var3);
                    } else {
                        wj50.m88285x(xqrVar.f265092O0, (tbn0) qqrVar.f191638c.get(i3));
                    }
                    long j = qqrVar.f191637b[i3];
                    vqr vqrVar3 = xqrVar.f265092O0;
                    vqrVar3.getClass();
                    Long l = whg1.m88142o(vqrVar3, tbn0Var3).f116739d;
                    long jLongValue = l != null ? l.longValue() : 0L;
                    qqrVar.f191637b[i3] = jLongValue;
                    xqrVar.f265104i = (xqrVar.f265104i - j) + jLongValue;
                }
            }
            qqrVar.f191642g = null;
            if (qqrVar.f191641f) {
                xqrVar.m91891B(qqrVar);
                return;
            }
            xqrVar.f265105t++;
            tuu0 tuu0Var = xqrVar.f265093X;
            wj50.m88279p(tuu0Var);
            if (z || qqrVar.f191640e) {
                qqrVar.f191640e = true;
                tuu0Var.mo42406b0("CLEAN");
                tuu0Var.writeByte(32);
                tuu0Var.mo42406b0(qqrVar.f191636a);
                for (long j2 : qqrVar.f191637b) {
                    tuu0Var.writeByte(32);
                    tuu0Var.mo42403B0(j2);
                }
                tuu0Var.writeByte(10);
            } else {
                xqrVar.f265101f.remove(qqrVar.f191636a);
                tuu0Var.mo42406b0("REMOVE");
                tuu0Var.writeByte(32);
                tuu0Var.mo42406b0(qqrVar.f191636a);
                tuu0Var.writeByte(10);
            }
            tuu0Var.flush();
            if (xqrVar.f265104i > xqrVar.f265097b) {
                xqrVar.m91897t();
            } else {
                if (xqrVar.f265105t < 2000) {
                    z2 = false;
                }
                if (z2) {
                    xqrVar.m91897t();
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m91885g(xqr xqrVar) {
        return xqrVar.f265105t >= 2000;
    }

    /* JADX INFO: renamed from: B */
    public final void m91891B(qqr qqrVar) {
        tuu0 tuu0Var;
        int i = qqrVar.f191643h;
        String str = qqrVar.f191636a;
        if (i > 0 && (tuu0Var = this.f265093X) != null) {
            tuu0Var.mo42406b0("DIRTY");
            tuu0Var.writeByte(32);
            tuu0Var.mo42406b0(str);
            tuu0Var.writeByte(10);
            tuu0Var.flush();
        }
        if (qqrVar.f191643h > 0 || qqrVar.f191642g != null) {
            qqrVar.f191641f = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.f265092O0.mo40344f((tbn0) qqrVar.f191638c.get(i2));
            long j = this.f265104i;
            long[] jArr = qqrVar.f191637b;
            this.f265104i = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.f265105t++;
        tuu0 tuu0Var2 = this.f265093X;
        if (tuu0Var2 != null) {
            tuu0Var2.mo42406b0("REMOVE");
            tuu0Var2.writeByte(32);
            tuu0Var2.mo42406b0(str);
            tuu0Var2.writeByte(10);
            tuu0Var2.flush();
        }
        this.f265101f.remove(str);
        if (this.f265105t >= 2000) {
            m91897t();
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m91892D() {
        while (this.f265104i > this.f265097b) {
            for (qqr qqrVar : this.f265101f.values()) {
                if (!qqrVar.f191641f) {
                    m91891B(qqrVar);
                }
            }
            return;
        }
        this.f265090M0 = false;
    }

    /* JADX INFO: renamed from: I */
    public final void m91893I() {
        synchronized (this.f265103h) {
            try {
                tuu0 tuu0Var = this.f265093X;
                if (tuu0Var != null) {
                    tuu0Var.close();
                }
                tuu0 tuu0Var2 = new tuu0(this.f265092O0.mo40347k(this.f265099d, false));
                try {
                    tuu0Var2.mo42406b0("libcore.io.DiskLruCache");
                    tuu0Var2.writeByte(10);
                    tuu0Var2.mo42406b0("1");
                    tuu0Var2.writeByte(10);
                    tuu0Var2.mo42403B0(3);
                    tuu0Var2.writeByte(10);
                    tuu0Var2.mo42403B0(2);
                    tuu0Var2.writeByte(10);
                    tuu0Var2.writeByte(10);
                    for (qqr qqrVar : this.f265101f.values()) {
                        if (qqrVar.f191642g != null) {
                            tuu0Var2.mo42406b0("DIRTY");
                            tuu0Var2.writeByte(32);
                            tuu0Var2.mo42406b0(qqrVar.f191636a);
                            tuu0Var2.writeByte(10);
                        } else {
                            tuu0Var2.mo42406b0("CLEAN");
                            tuu0Var2.writeByte(32);
                            tuu0Var2.mo42406b0(qqrVar.f191636a);
                            for (long j : qqrVar.f191637b) {
                                tuu0Var2.writeByte(32);
                                tuu0Var2.mo42403B0(j);
                            }
                            tuu0Var2.writeByte(10);
                        }
                    }
                    try {
                        tuu0Var2.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        tuu0Var2.close();
                    } catch (Throwable th3) {
                        y85.m93061f(th, th3);
                    }
                }
                if (th != null) {
                    throw th;
                }
                vqr vqrVar = this.f265092O0;
                tbn0 tbn0Var = this.f265098c;
                vqrVar.getClass();
                if (vqrVar.mo39302h(tbn0Var) != null) {
                    this.f265092O0.mo39301c(this.f265098c, this.f265100e);
                    this.f265092O0.mo39301c(this.f265099d, this.f265098c);
                    this.f265092O0.mo40344f(this.f265100e);
                } else {
                    this.f265092O0.mo39301c(this.f265099d, this.f265098c);
                }
                this.f265093X = new tuu0(new eey(this.f265092O0.f119035c.mo40342a(this.f265098c), new C2245p6(this, 15)));
                this.f265105t = 0;
                this.f265094Y = false;
                this.f265091N0 = false;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f265103h) {
            try {
                if (this.f265095Z && !this.f265089L0) {
                    for (qqr qqrVar : (qqr[]) this.f265101f.values().toArray(new qqr[0])) {
                        m12 m12Var = qqrVar.f191642g;
                        if (m12Var != null) {
                            qqr qqrVar2 = (qqr) m12Var.f138797c;
                            if (wj50.m88271j(qqrVar2.f191642g, m12Var)) {
                                qqrVar2.f191641f = true;
                            }
                        }
                    }
                    m91892D();
                    kk40.m56680v(this.f265102g, null);
                    tuu0 tuu0Var = this.f265093X;
                    wj50.m88279p(tuu0Var);
                    tuu0Var.close();
                    this.f265093X = null;
                    this.f265089L0 = true;
                    return;
                }
                this.f265089L0 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final m12 m91894p(String str) {
        synchronized (this.f265103h) {
            if (this.f265089L0) {
                throw new IllegalStateException("cache is closed");
            }
            m91880G(str);
            m91896s();
            qqr qqrVar = (qqr) this.f265101f.get(str);
            if ((qqrVar != null ? qqrVar.f191642g : null) != null) {
                return null;
            }
            if (qqrVar != null && qqrVar.f191643h != 0) {
                return null;
            }
            if (!this.f265090M0 && !this.f265091N0) {
                tuu0 tuu0Var = this.f265093X;
                wj50.m88279p(tuu0Var);
                tuu0Var.mo42406b0("DIRTY");
                tuu0Var.writeByte(32);
                tuu0Var.mo42406b0(str);
                tuu0Var.writeByte(10);
                tuu0Var.flush();
                if (this.f265094Y) {
                    return null;
                }
                if (qqrVar == null) {
                    qqrVar = new qqr(this, str);
                    this.f265101f.put(str, qqrVar);
                }
                m12 m12Var = new m12(this, qqrVar);
                qqrVar.f191642g = m12Var;
                return m12Var;
            }
            m91897t();
            return null;
        }
    }

    /* JADX INFO: renamed from: r */
    public final sqr m91895r(String str) {
        sqr sqrVarM73577a;
        synchronized (this.f265103h) {
            if (this.f265089L0) {
                throw new IllegalStateException("cache is closed");
            }
            m91880G(str);
            m91896s();
            qqr qqrVar = (qqr) this.f265101f.get(str);
            if (qqrVar != null && (sqrVarM73577a = qqrVar.m73577a()) != null) {
                boolean z = true;
                this.f265105t++;
                tuu0 tuu0Var = this.f265093X;
                wj50.m88279p(tuu0Var);
                tuu0Var.mo42406b0("READ");
                tuu0Var.writeByte(32);
                tuu0Var.mo42406b0(str);
                tuu0Var.writeByte(10);
                tuu0Var.flush();
                if (this.f265105t < 2000) {
                    z = false;
                }
                if (z) {
                    m91897t();
                }
                return sqrVarM73577a;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m91896s() {
        synchronized (this.f265103h) {
            try {
                if (this.f265095Z) {
                    return;
                }
                this.f265092O0.mo40344f(this.f265099d);
                vqr vqrVar = this.f265092O0;
                tbn0 tbn0Var = this.f265100e;
                vqrVar.getClass();
                if (vqrVar.mo39302h(tbn0Var) != null) {
                    vqr vqrVar2 = this.f265092O0;
                    tbn0 tbn0Var2 = this.f265098c;
                    vqrVar2.getClass();
                    if (vqrVar2.mo39302h(tbn0Var2) != null) {
                        this.f265092O0.mo40344f(this.f265100e);
                    } else {
                        this.f265092O0.mo39301c(this.f265100e, this.f265098c);
                    }
                }
                vqr vqrVar3 = this.f265092O0;
                tbn0 tbn0Var3 = this.f265098c;
                vqrVar3.getClass();
                if (vqrVar3.mo39302h(tbn0Var3) != null) {
                    try {
                        try {
                            m91899y();
                            m91898x();
                            this.f265095Z = true;
                            return;
                        } catch (Throwable th) {
                            this.f265089L0 = false;
                            throw th;
                        }
                    } catch (IOException unused) {
                        close();
                        wj50.m88286y(this.f265092O0, this.f265096a);
                        this.f265089L0 = false;
                        m91893I();
                        this.f265095Z = true;
                    }
                }
                m91893I();
                this.f265095Z = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m91897t() {
        x0h1.m89578u(this.f265102g, null, 0, new y22(this, null, 6), 3);
    }

    /* JADX INFO: renamed from: x */
    public final void m91898x() {
        Iterator it = this.f265101f.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            qqr qqrVar = (qqr) it.next();
            int i = 0;
            if (qqrVar.f191642g == null) {
                while (i < 2) {
                    j += qqrVar.f191637b[i];
                    i++;
                }
            } else {
                qqrVar.f191642g = null;
                while (i < 2) {
                    tbn0 tbn0Var = (tbn0) qqrVar.f191638c.get(i);
                    vqr vqrVar = this.f265092O0;
                    vqrVar.mo40344f(tbn0Var);
                    vqrVar.mo40344f((tbn0) qqrVar.f191639d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.f265104i = j;
    }

    /* JADX INFO: renamed from: y */
    public final void m91899y() throws Throwable {
        vqr vqrVar = this.f265092O0;
        ywy ywyVar = vqrVar.f119035c;
        tbn0 tbn0Var = this.f265098c;
        vuu0 vuu0Var = new vuu0(ywyVar.mo40348n(tbn0Var));
        try {
            String strMo45421S = vuu0Var.mo45421S(Long.MAX_VALUE);
            String strMo45421S2 = vuu0Var.mo45421S(Long.MAX_VALUE);
            String strMo45421S3 = vuu0Var.mo45421S(Long.MAX_VALUE);
            String strMo45421S4 = vuu0Var.mo45421S(Long.MAX_VALUE);
            String strMo45421S5 = vuu0Var.mo45421S(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strMo45421S) || !"1".equals(strMo45421S2) || !wj50.m88271j(String.valueOf(3), strMo45421S3) || !wj50.m88271j(String.valueOf(2), strMo45421S4) || strMo45421S5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strMo45421S + ", " + strMo45421S2 + ", " + strMo45421S3 + ", " + strMo45421S4 + ", " + strMo45421S5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    m91900z(vuu0Var.mo45421S(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.f265105t = i - this.f265101f.size();
                    if (vuu0Var.mo45420R0()) {
                        this.f265093X = new tuu0(new eey(vqrVar.f119035c.mo40342a(tbn0Var), new C2245p6(this, 15)));
                    } else {
                        m91893I();
                    }
                    try {
                        vuu0Var.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                vuu0Var.close();
            } catch (Throwable th3) {
                y85.m93061f(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m91900z(String str) throws IOException {
        String strSubstring;
        int iM88457G0 = wl51.m88457G0(str, ' ', 0, 6);
        if (iM88457G0 == -1) {
            throw new IOException(edb.m38564m("unexpected journal line: ", str));
        }
        int i = iM88457G0 + 1;
        int iM88457G1 = wl51.m88457G0(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.f265101f;
        if (iM88457G1 == -1) {
            strSubstring = str.substring(i);
            if (iM88457G0 == 6 && bm51.m29803n0(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iM88457G1);
        }
        Object qqrVar = linkedHashMap.get(strSubstring);
        if (qqrVar == null) {
            qqrVar = new qqr(this, strSubstring);
            linkedHashMap.put(strSubstring, qqrVar);
        }
        qqr qqrVar2 = (qqr) qqrVar;
        if (iM88457G1 == -1 || iM88457G0 != 5 || !bm51.m29803n0(str, "CLEAN", false)) {
            if (iM88457G1 == -1 && iM88457G0 == 5 && bm51.m29803n0(str, "DIRTY", false)) {
                qqrVar2.f191642g = new m12(this, qqrVar2);
                return;
            } else {
                if (iM88457G1 != -1 || iM88457G0 != 4 || !bm51.m29803n0(str, "READ", false)) {
                    throw new IOException(edb.m38564m("unexpected journal line: ", str));
                }
                return;
            }
        }
        List listM88476Z0 = wl51.m88476Z0(str.substring(iM88457G1 + 1), new char[]{' '}, 6);
        qqrVar2.f191640e = true;
        qqrVar2.f191642g = null;
        if (listM88476Z0.size() != 2) {
            throw new IOException("unexpected journal line: " + listM88476Z0);
        }
        try {
            int size = listM88476Z0.size();
            for (int i2 = 0; i2 < size; i2++) {
                qqrVar2.f191637b[i2] = Long.parseLong((String) listM88476Z0.get(i2));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + listM88476Z0);
        }
    }
}
