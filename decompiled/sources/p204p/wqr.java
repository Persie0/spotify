package p204p;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class wqr implements Closeable, Flushable {

    /* JADX INFO: renamed from: R0 */
    public static final urv0 f254132R0 = new urv0("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: S0 */
    public static final String f254133S0 = "CLEAN";

    /* JADX INFO: renamed from: T0 */
    public static final String f254134T0 = "DIRTY";

    /* JADX INFO: renamed from: U0 */
    public static final String f254135U0 = "REMOVE";

    /* JADX INFO: renamed from: V0 */
    public static final String f254136V0 = "READ";

    /* JADX INFO: renamed from: L0 */
    public boolean f254137L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f254138M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f254139N0;

    /* JADX INFO: renamed from: O0 */
    public long f254140O0;

    /* JADX INFO: renamed from: P0 */
    public final kv61 f254141P0;

    /* JADX INFO: renamed from: X */
    public boolean f254143X;

    /* JADX INFO: renamed from: Y */
    public boolean f254144Y;

    /* JADX INFO: renamed from: Z */
    public boolean f254145Z;

    /* JADX INFO: renamed from: a */
    public final tbn0 f254146a;

    /* JADX INFO: renamed from: b */
    public final uqr f254147b;

    /* JADX INFO: renamed from: c */
    public final long f254148c;

    /* JADX INFO: renamed from: d */
    public final tbn0 f254149d;

    /* JADX INFO: renamed from: e */
    public final tbn0 f254150e;

    /* JADX INFO: renamed from: f */
    public final tbn0 f254151f;

    /* JADX INFO: renamed from: g */
    public long f254152g;

    /* JADX INFO: renamed from: h */
    public tuu0 f254153h;

    /* JADX INFO: renamed from: t */
    public int f254155t;

    /* JADX INFO: renamed from: i */
    public final LinkedHashMap f254154i = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: Q0 */
    public final tqr f254142Q0 = new tqr(dq60.m36616p(c0f1.f32775b, " Cache", new StringBuilder()), 0, this);

    public wqr(ywy ywyVar, tbn0 tbn0Var, long j, lv61 lv61Var) {
        this.f254146a = tbn0Var;
        this.f254147b = new uqr(ywyVar);
        this.f254148c = j;
        this.f254141P0 = lv61Var.m60068d();
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f254149d = tbn0Var.m80403e("journal");
        this.f254150e = tbn0Var.m80403e("journal.tmp");
        this.f254151f = tbn0Var.m80403e("journal.bkp");
    }

    /* JADX INFO: renamed from: s */
    public static void m88774s(String str) {
        if (!f254132R0.m83873e(str)) {
            throw new IllegalArgumentException(dq60.m36608h('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m88775a() {
        if (this.f254137L0) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m88776c(nqr nqrVar, boolean z) {
        pqr pqrVar = (pqr) nqrVar.f157321b;
        if (!wj50.m88271j(pqrVar.f180402g, nqrVar)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z && !pqrVar.f180400e) {
            for (int i = 0; i < 2; i++) {
                boolean[] zArr = (boolean[]) nqrVar.f157322c;
                wj50.m88279p(zArr);
                if (!zArr[i]) {
                    nqrVar.m65453a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                uqr uqrVar = this.f254147b;
                tbn0 tbn0Var = (tbn0) pqrVar.f180399d.get(i);
                uqrVar.getClass();
                if (!whg1.m88141n(uqrVar, tbn0Var)) {
                    nqrVar.m65453a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            tbn0 tbn0Var2 = (tbn0) pqrVar.f180399d.get(i2);
            if (!z || pqrVar.f180401f) {
                uqr uqrVar2 = this.f254147b;
                byte[] bArr = a0f1.f11072a;
                try {
                    uqrVar2.mo40344f(tbn0Var2);
                } catch (FileNotFoundException unused) {
                }
            } else {
                uqr uqrVar3 = this.f254147b;
                uqrVar3.getClass();
                if (whg1.m88141n(uqrVar3, tbn0Var2)) {
                    tbn0 tbn0Var3 = (tbn0) pqrVar.f180398c.get(i2);
                    this.f254147b.mo39301c(tbn0Var2, tbn0Var3);
                    long j = pqrVar.f180397b[i2];
                    uqr uqrVar4 = this.f254147b;
                    uqrVar4.getClass();
                    Long l = whg1.m88142o(uqrVar4, tbn0Var3).f116739d;
                    long jLongValue = l != null ? l.longValue() : 0L;
                    pqrVar.f180397b[i2] = jLongValue;
                    this.f254152g = (this.f254152g - j) + jLongValue;
                }
            }
        }
        pqrVar.f180402g = null;
        if (pqrVar.f180401f) {
            m88785p(pqrVar);
            return;
        }
        this.f254155t++;
        tuu0 tuu0Var = this.f254153h;
        wj50.m88279p(tuu0Var);
        if (pqrVar.f180400e || z) {
            pqrVar.f180400e = true;
            tuu0Var.mo42406b0(f254133S0);
            tuu0Var.writeByte(32);
            tuu0Var.mo42406b0(pqrVar.f180396a);
            for (long j2 : pqrVar.f180397b) {
                tuu0Var.writeByte(32);
                tuu0Var.mo42403B0(j2);
            }
            tuu0Var.writeByte(10);
            if (z) {
                long j3 = this.f254140O0;
                this.f254140O0 = 1 + j3;
                pqrVar.f180404i = j3;
            }
        } else {
            this.f254154i.remove(pqrVar.f180396a);
            tuu0Var.mo42406b0(f254135U0);
            tuu0Var.writeByte(32);
            tuu0Var.mo42406b0(pqrVar.f180396a);
            tuu0Var.writeByte(10);
        }
        tuu0Var.flush();
        if (this.f254152g > this.f254148c || m88780h()) {
            this.f254141P0.m57443d(this.f254142Q0, 0L);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f254145Z && !this.f254137L0) {
                for (pqr pqrVar : (pqr[]) this.f254154i.values().toArray(new pqr[0])) {
                    wj50.m88279p(pqrVar);
                    nqr nqrVar = pqrVar.f180402g;
                    if (nqrVar != null) {
                        nqrVar.m65455c();
                    }
                }
                m88786r();
                tuu0 tuu0Var = this.f254153h;
                if (tuu0Var != null) {
                    a0f1.m24341b(tuu0Var);
                }
                this.f254153h = null;
                this.f254137L0 = true;
                return;
            }
            this.f254137L0 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized nqr m88777e(long j, String str) {
        m88779g();
        m88775a();
        m88774s(str);
        pqr pqrVar = (pqr) this.f254154i.get(str);
        if (j != -1 && (pqrVar == null || pqrVar.f180404i != j)) {
            return null;
        }
        if ((pqrVar != null ? pqrVar.f180402g : null) != null) {
            return null;
        }
        if (pqrVar != null && pqrVar.f180403h != 0) {
            return null;
        }
        if (!this.f254138M0 && !this.f254139N0) {
            tuu0 tuu0Var = this.f254153h;
            wj50.m88279p(tuu0Var);
            tuu0Var.mo42406b0(f254134T0);
            tuu0Var.writeByte(32);
            tuu0Var.mo42406b0(str);
            tuu0Var.writeByte(10);
            tuu0Var.flush();
            if (this.f254143X) {
                return null;
            }
            if (pqrVar == null) {
                pqrVar = new pqr(this, str);
                this.f254154i.put(str, pqrVar);
            }
            nqr nqrVar = new nqr(this, pqrVar);
            pqrVar.f180402g = nqrVar;
            return nqrVar;
        }
        this.f254141P0.m57443d(this.f254142Q0, 0L);
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized rqr m88778f(String str) {
        m88779g();
        m88775a();
        m88774s(str);
        pqr pqrVar = (pqr) this.f254154i.get(str);
        if (pqrVar == null) {
            return null;
        }
        rqr rqrVarM70688a = pqrVar.m70688a();
        if (rqrVarM70688a == null) {
            return null;
        }
        this.f254155t++;
        tuu0 tuu0Var = this.f254153h;
        wj50.m88279p(tuu0Var);
        tuu0Var.mo42406b0(f254136V0);
        tuu0Var.writeByte(32);
        tuu0Var.mo42406b0(str);
        tuu0Var.writeByte(10);
        if (m88780h()) {
            this.f254141P0.m57443d(this.f254142Q0, 0L);
        }
        return rqrVarM70688a;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f254145Z) {
            m88775a();
            m88786r();
            tuu0 tuu0Var = this.f254153h;
            wj50.m88279p(tuu0Var);
            tuu0Var.flush();
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0068 A[Catch: all -> 0x002d, TRY_ENTER, TryCatch #5 {all -> 0x002d, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x0018, B:12:0x0025, B:15:0x0030, B:16:0x0039, B:37:0x006c, B:39:0x007b, B:49:0x00be, B:43:0x0086, B:45:0x00b7, B:47:0x00bb, B:48:0x00bd, B:36:0x0068, B:52:0x00c5, B:27:0x0057, B:24:0x0052, B:44:0x00ad, B:18:0x0045), top: B:66:0x0003, inners: #1, #2, #3, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c5 A[Catch: all -> 0x002d, TRY_ENTER, TryCatch #5 {all -> 0x002d, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x0018, B:12:0x0025, B:15:0x0030, B:16:0x0039, B:37:0x006c, B:39:0x007b, B:49:0x00be, B:43:0x0086, B:45:0x00b7, B:47:0x00bb, B:48:0x00bd, B:36:0x0068, B:52:0x00c5, B:27:0x0057, B:24:0x0052, B:44:0x00ad, B:18:0x0045), top: B:66:0x0003, inners: #1, #2, #3, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public final synchronized void m88779g() {
        boolean z;
        uqr uqrVar;
        tbn0 tbn0Var;
        try {
            TimeZone timeZone = c0f1.f32774a;
            if (this.f254145Z) {
                return;
            }
            uqr uqrVar2 = this.f254147b;
            tbn0 tbn0Var2 = this.f254151f;
            uqrVar2.getClass();
            if (whg1.m88141n(uqrVar2, tbn0Var2)) {
                uqr uqrVar3 = this.f254147b;
                tbn0 tbn0Var3 = this.f254149d;
                uqrVar3.getClass();
                if (whg1.m88141n(uqrVar3, tbn0Var3)) {
                    this.f254147b.mo40344f(this.f254151f);
                } else {
                    this.f254147b.mo39301c(this.f254151f, this.f254149d);
                }
            }
            uqr uqrVar4 = this.f254147b;
            tbn0 tbn0Var4 = this.f254151f;
            byte[] bArr = a0f1.f11072a;
            ai21 ai21VarMo40347k = uqrVar4.mo40347k(tbn0Var4, false);
            try {
                uqrVar4.mo40344f(tbn0Var4);
                if (ai21VarMo40347k != null) {
                    try {
                        ai21VarMo40347k.close();
                    } catch (Throwable unused) {
                    }
                }
                z = true;
            } catch (IOException unused2) {
                if (ai21VarMo40347k != null) {
                    try {
                        ai21VarMo40347k.close();
                    } catch (Throwable th) {
                        th = th;
                        th = th;
                        if (th != null) {
                            throw th;
                        }
                        uqrVar4.mo40344f(tbn0Var4);
                        z = false;
                        this.f254144Y = z;
                        uqrVar = this.f254147b;
                        tbn0Var = this.f254149d;
                        uqrVar.getClass();
                        if (whg1.m88141n(uqrVar, tbn0Var)) {
                            try {
                                m88782k();
                                m88781i();
                                this.f254145Z = true;
                                return;
                            } catch (IOException e) {
                                wco0 wco0Var = wco0.f250081a;
                                wco0.f250081a.mo47865j("DiskLruCache " + this.f254146a + " is corrupt: " + e.getMessage() + ", removing", 5, e);
                                try {
                                    close();
                                    a0f1.m24342c(this.f254147b, this.f254146a);
                                    this.f254137L0 = false;
                                    m88784o();
                                    this.f254145Z = true;
                                } catch (Throwable th2) {
                                    this.f254137L0 = false;
                                    throw th2;
                                }
                            }
                        }
                        m88784o();
                        this.f254145Z = true;
                    }
                }
                th = null;
                th = th;
                if (th != null) {
                    throw th;
                }
                uqrVar4.mo40344f(tbn0Var4);
                z = false;
            } catch (Throwable th3) {
                th = th3;
                if (ai21VarMo40347k != null) {
                    try {
                        ai21VarMo40347k.close();
                    } catch (Throwable th4) {
                        y85.m93061f(th, th4);
                    }
                }
                if (th != null) {
                    throw th;
                }
                uqrVar4.mo40344f(tbn0Var4);
                z = false;
                this.f254144Y = z;
                uqrVar = this.f254147b;
                tbn0Var = this.f254149d;
                uqrVar.getClass();
                if (whg1.m88141n(uqrVar, tbn0Var)) {
                    m88782k();
                    m88781i();
                    this.f254145Z = true;
                    return;
                }
                m88784o();
                this.f254145Z = true;
            }
            this.f254144Y = z;
            uqrVar = this.f254147b;
            tbn0Var = this.f254149d;
            uqrVar.getClass();
            if (whg1.m88141n(uqrVar, tbn0Var)) {
                m88782k();
                m88781i();
                this.f254145Z = true;
                return;
            }
            m88784o();
            this.f254145Z = true;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m88780h() {
        int i = this.f254155t;
        return i >= 2000 && i >= this.f254154i.size();
    }

    /* JADX INFO: renamed from: i */
    public final void m88781i() {
        uqr uqrVar = this.f254147b;
        tbn0 tbn0Var = this.f254150e;
        byte[] bArr = a0f1.f11072a;
        try {
            uqrVar.mo40344f(tbn0Var);
        } catch (FileNotFoundException unused) {
        }
        Iterator it = this.f254154i.values().iterator();
        while (it.hasNext()) {
            pqr pqrVar = (pqr) it.next();
            int i = 0;
            if (pqrVar.f180402g == null) {
                while (i < 2) {
                    this.f254152g += pqrVar.f180397b[i];
                    i++;
                }
            } else {
                pqrVar.f180402g = null;
                while (i < 2) {
                    try {
                        uqrVar.mo40344f((tbn0) pqrVar.f180398c.get(i));
                    } catch (FileNotFoundException unused2) {
                    }
                    try {
                        uqrVar.mo40344f((tbn0) pqrVar.f180399d.get(i));
                    } catch (FileNotFoundException unused3) {
                    }
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m88782k() throws Throwable {
        uqr uqrVar = this.f254147b;
        ywy ywyVar = uqrVar.f119035c;
        tbn0 tbn0Var = this.f254149d;
        vuu0 vuu0VarM56500i = kif1.m56500i(ywyVar.mo40348n(tbn0Var));
        try {
            String strMo45421S = vuu0VarM56500i.mo45421S(Long.MAX_VALUE);
            String strMo45421S2 = vuu0VarM56500i.mo45421S(Long.MAX_VALUE);
            String strMo45421S3 = vuu0VarM56500i.mo45421S(Long.MAX_VALUE);
            String strMo45421S4 = vuu0VarM56500i.mo45421S(Long.MAX_VALUE);
            String strMo45421S5 = vuu0VarM56500i.mo45421S(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strMo45421S) || !"1".equals(strMo45421S2) || !wj50.m88271j(String.valueOf(201105), strMo45421S3) || !wj50.m88271j(String.valueOf(2), strMo45421S4) || strMo45421S5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strMo45421S + ", " + strMo45421S2 + ", " + strMo45421S4 + ", " + strMo45421S5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    m88783n(vuu0VarM56500i.mo45421S(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.f254155t = i - this.f254154i.size();
                    if (vuu0VarM56500i.mo45420R0()) {
                        tuu0 tuu0Var = this.f254153h;
                        if (tuu0Var != null) {
                            a0f1.m24341b(tuu0Var);
                        }
                        this.f254153h = kif1.m56499h(new dey(uqrVar.f119035c.mo40342a(tbn0Var), new C2245p6(this, 16)));
                    } else {
                        m88784o();
                    }
                    try {
                        vuu0VarM56500i.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                vuu0VarM56500i.close();
            } catch (Throwable th3) {
                y85.m93061f(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m88783n(String str) throws IOException {
        String strSubstring;
        int iM88457G0 = wl51.m88457G0(str, ' ', 0, 6);
        if (iM88457G0 == -1) {
            throw new IOException(edb.m38564m("unexpected journal line: ", str));
        }
        int i = iM88457G0 + 1;
        int iM88457G1 = wl51.m88457G0(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.f254154i;
        if (iM88457G1 == -1) {
            strSubstring = str.substring(i);
            String str2 = f254135U0;
            if (iM88457G0 == str2.length() && bm51.m29803n0(str, str2, false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iM88457G1);
        }
        pqr pqrVar = (pqr) linkedHashMap.get(strSubstring);
        if (pqrVar == null) {
            pqrVar = new pqr(this, strSubstring);
            linkedHashMap.put(strSubstring, pqrVar);
        }
        if (iM88457G1 != -1) {
            String str3 = f254133S0;
            if (iM88457G0 == str3.length() && bm51.m29803n0(str, str3, false)) {
                List listM88476Z0 = wl51.m88476Z0(str.substring(iM88457G1 + 1), new char[]{' '}, 6);
                pqrVar.f180400e = true;
                pqrVar.f180402g = null;
                int size = listM88476Z0.size();
                pqrVar.f180405j.getClass();
                if (size != 2) {
                    throw new IOException("unexpected journal line: " + listM88476Z0);
                }
                try {
                    int size2 = listM88476Z0.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        pqrVar.f180397b[i2] = Long.parseLong((String) listM88476Z0.get(i2));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + listM88476Z0);
                }
            }
        }
        if (iM88457G1 == -1) {
            String str4 = f254134T0;
            if (iM88457G0 == str4.length() && bm51.m29803n0(str, str4, false)) {
                pqrVar.f180402g = new nqr(this, pqrVar);
                return;
            }
        }
        if (iM88457G1 == -1) {
            String str5 = f254136V0;
            if (iM88457G0 == str5.length() && bm51.m29803n0(str, str5, false)) {
                return;
            }
        }
        throw new IOException(edb.m38564m("unexpected journal line: ", str));
    }

    /* JADX INFO: renamed from: o */
    public final synchronized void m88784o() {
        Throwable th;
        try {
            tuu0 tuu0Var = this.f254153h;
            if (tuu0Var != null) {
                tuu0Var.close();
            }
            tuu0 tuu0VarM56499h = kif1.m56499h(this.f254147b.mo40347k(this.f254150e, false));
            try {
                tuu0VarM56499h.mo42406b0("libcore.io.DiskLruCache");
                tuu0VarM56499h.writeByte(10);
                tuu0VarM56499h.mo42406b0("1");
                tuu0VarM56499h.writeByte(10);
                tuu0VarM56499h.mo42403B0(201105);
                tuu0VarM56499h.writeByte(10);
                tuu0VarM56499h.mo42403B0(2);
                tuu0VarM56499h.writeByte(10);
                tuu0VarM56499h.writeByte(10);
                for (pqr pqrVar : this.f254154i.values()) {
                    if (pqrVar.f180402g != null) {
                        tuu0VarM56499h.mo42406b0(f254134T0);
                        tuu0VarM56499h.writeByte(32);
                        tuu0VarM56499h.mo42406b0(pqrVar.f180396a);
                        tuu0VarM56499h.writeByte(10);
                    } else {
                        tuu0VarM56499h.mo42406b0(f254133S0);
                        tuu0VarM56499h.writeByte(32);
                        tuu0VarM56499h.mo42406b0(pqrVar.f180396a);
                        for (long j : pqrVar.f180397b) {
                            tuu0VarM56499h.writeByte(32);
                            tuu0VarM56499h.mo42403B0(j);
                        }
                        tuu0VarM56499h.writeByte(10);
                    }
                }
                try {
                    tuu0VarM56499h.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    tuu0VarM56499h.close();
                } catch (Throwable th4) {
                    y85.m93061f(th3, th4);
                }
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            uqr uqrVar = this.f254147b;
            tbn0 tbn0Var = this.f254149d;
            uqrVar.getClass();
            if (whg1.m88141n(uqrVar, tbn0Var)) {
                this.f254147b.mo39301c(this.f254149d, this.f254151f);
                this.f254147b.mo39301c(this.f254150e, this.f254149d);
                uqr uqrVar2 = this.f254147b;
                tbn0 tbn0Var2 = this.f254151f;
                byte[] bArr = a0f1.f11072a;
                try {
                    uqrVar2.mo40344f(tbn0Var2);
                } catch (FileNotFoundException unused) {
                }
            } else {
                this.f254147b.mo39301c(this.f254150e, this.f254149d);
            }
            tuu0 tuu0Var2 = this.f254153h;
            if (tuu0Var2 != null) {
                a0f1.m24341b(tuu0Var2);
            }
            this.f254153h = kif1.m56499h(new dey(this.f254147b.f119035c.mo40342a(this.f254149d), new C2245p6(this, 16)));
            this.f254143X = false;
            this.f254139N0 = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m88785p(pqr pqrVar) {
        tuu0 tuu0Var;
        String str = pqrVar.f180396a;
        if (!this.f254144Y) {
            if (pqrVar.f180403h > 0 && (tuu0Var = this.f254153h) != null) {
                tuu0Var.mo42406b0(f254134T0);
                tuu0Var.writeByte(32);
                tuu0Var.mo42406b0(str);
                tuu0Var.writeByte(10);
                tuu0Var.flush();
            }
            if (pqrVar.f180403h > 0 || pqrVar.f180402g != null) {
                pqrVar.f180401f = true;
                return;
            }
        }
        nqr nqrVar = pqrVar.f180402g;
        if (nqrVar != null) {
            nqrVar.m65455c();
        }
        for (int i = 0; i < 2; i++) {
            uqr uqrVar = this.f254147b;
            tbn0 tbn0Var = (tbn0) pqrVar.f180398c.get(i);
            byte[] bArr = a0f1.f11072a;
            try {
                uqrVar.mo40344f(tbn0Var);
            } catch (FileNotFoundException unused) {
            }
            long j = this.f254152g;
            long[] jArr = pqrVar.f180397b;
            this.f254152g = j - jArr[i];
            jArr[i] = 0;
        }
        this.f254155t++;
        tuu0 tuu0Var2 = this.f254153h;
        if (tuu0Var2 != null) {
            tuu0Var2.mo42406b0(f254135U0);
            tuu0Var2.writeByte(32);
            tuu0Var2.mo42406b0(str);
            tuu0Var2.writeByte(10);
        }
        this.f254154i.remove(str);
        if (m88780h()) {
            this.f254141P0.m57443d(this.f254142Q0, 0L);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m88786r() {
        while (this.f254152g > this.f254148c) {
            for (pqr pqrVar : this.f254154i.values()) {
                if (!pqrVar.f180401f) {
                    m88785p(pqrVar);
                }
            }
            return;
        }
        this.f254138M0 = false;
    }
}
