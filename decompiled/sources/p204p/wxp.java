package p204p;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class wxp {

    /* JADX INFO: renamed from: h */
    public static final j77 f256085h = new j77(3);

    /* JADX INFO: renamed from: i */
    public static final Random f256086i = new Random();

    /* JADX INFO: renamed from: d */
    public Object f256090d;

    /* JADX INFO: renamed from: f */
    public String f256092f;

    /* JADX INFO: renamed from: a */
    public final mp71 f256087a = new mp71();

    /* JADX INFO: renamed from: b */
    public final bp71 f256088b = new bp71();

    /* JADX INFO: renamed from: c */
    public final HashMap f256089c = new HashMap();

    /* JADX INFO: renamed from: e */
    public qp71 f256091e = qp71.f191180a;

    /* JADX INFO: renamed from: g */
    public long f256093g = -1;

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m89319a(np3 np3Var, String str) {
        vxp vxpVar = (vxp) this.f256089c.get(str);
        if (vxpVar == null) {
            return false;
        }
        vxpVar.m86667c(np3Var.f156860c, np3Var.f156861d);
        return vxpVar.m86665a(np3Var.f156860c, np3Var.f156861d);
    }

    /* JADX INFO: renamed from: b */
    public final void m89320b(vxp vxpVar) {
        long j = vxpVar.f245799c;
        if (j != -1 && vxpVar.f245801e) {
            this.f256093g = j;
        }
        this.f256092f = null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, p.e2p0] */
    /* JADX INFO: renamed from: c */
    public final synchronized void m89321c(np3 np3Var) {
        ?? r2;
        try {
            String str = this.f256092f;
            if (str != null) {
                vxp vxpVar = (vxp) this.f256089c.get(str);
                vxpVar.getClass();
                m89320b(vxpVar);
            }
            Iterator it = this.f256089c.values().iterator();
            while (it.hasNext()) {
                vxp vxpVar2 = (vxp) it.next();
                it.remove();
                if (vxpVar2.f245801e && (r2 = this.f256090d) != 0) {
                    r2.mo37614f(np3Var, vxpVar2.f245797a, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final vxp m89322d(int i, vsd0 vsd0Var) {
        HashMap map = this.f256089c;
        vxp vxpVar = null;
        long j = Long.MAX_VALUE;
        for (vxp vxpVar2 : map.values()) {
            vxpVar2.m86667c(i, vsd0Var);
            if (vxpVar2.m86665a(i, vsd0Var)) {
                long j2 = vxpVar2.f245799c;
                if (j2 == -1 || j2 < j) {
                    vxpVar = vxpVar2;
                    j = j2;
                } else if (j2 == j) {
                    String str = h0b1.f86200a;
                    if (vxpVar.f245800d != null && vxpVar2.f245800d != null) {
                        vxpVar = vxpVar2;
                    }
                }
            }
        }
        if (vxpVar != null) {
            return vxpVar;
        }
        String str2 = (String) f256085h.get();
        vxp vxpVar3 = new vxp(this, str2, i, vsd0Var);
        map.put(str2, vxpVar3);
        return vxpVar3;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized String m89323e(qp71 qp71Var, vsd0 vsd0Var) {
        return m89322d(qp71Var.mo46978g(vsd0Var.f244408a, this.f256088b).f29345c, vsd0Var).f245797a;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, p.e2p0] */
    /* JADX INFO: renamed from: f */
    public final void m89324f(np3 np3Var) {
        vsd0 vsd0Var;
        qp71 qp71Var = np3Var.f156859b;
        int i = np3Var.f156860c;
        vsd0 vsd0Var2 = np3Var.f156861d;
        boolean zM73436p = qp71Var.m73436p();
        HashMap map = this.f256089c;
        if (zM73436p) {
            String str = this.f256092f;
            if (str != null) {
                vxp vxpVar = (vxp) map.get(str);
                vxpVar.getClass();
                m89320b(vxpVar);
                return;
            }
            return;
        }
        vxp vxpVar2 = (vxp) map.get(this.f256092f);
        this.f256092f = m89322d(i, vsd0Var2).f245797a;
        m89325g(np3Var);
        if (vsd0Var2 != null) {
            long j = vsd0Var2.f244411d;
            if (vsd0Var2.m86309c()) {
                if (vxpVar2 != null && vxpVar2.f245799c == j && (vsd0Var = vxpVar2.f245800d) != null && vsd0Var.f244409b == vsd0Var2.f244409b && vsd0Var.f244410c == vsd0Var2.f244410c) {
                    return;
                }
                this.f256090d.mo37613a(m89322d(i, new vsd0(j, vsd0Var2.f244408a)).f245797a);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0033 A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x0014, B:10:0x0018, B:12:0x0020, B:14:0x002c, B:17:0x0033, B:23:0x003e, B:25:0x004a, B:27:0x0050, B:33:0x005b, B:35:0x0067, B:36:0x006b, B:38:0x0070, B:40:0x0076, B:42:0x008d, B:43:0x00df, B:45:0x00e3, B:46:0x00ed, B:48:0x00f7, B:50:0x00fb), top: B:55:0x0005 }] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, p.e2p0] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, p.e2p0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, p.e2p0] */
    /* JADX INFO: renamed from: g */
    public final synchronized void m89325g(np3 np3Var) {
        long j;
        this.f256090d.getClass();
        if (np3Var.f156859b.m73436p()) {
            return;
        }
        vsd0 vsd0Var = np3Var.f156861d;
        if (vsd0Var != null) {
            long j2 = vsd0Var.f244411d;
            if (j2 != -1) {
                vxp vxpVar = (vxp) this.f256089c.get(this.f256092f);
                if (vxpVar != null) {
                    j = vxpVar.f245799c;
                    if (j == -1) {
                        j = this.f256093g + 1;
                    }
                } else {
                    j = this.f256093g + 1;
                }
                if (j2 < j) {
                    return;
                }
            }
            vxp vxpVar2 = (vxp) this.f256089c.get(this.f256092f);
            if (vxpVar2 != null && vxpVar2.f245799c == -1 && vxpVar2.f245798b != np3Var.f156860c) {
                return;
            }
        }
        vxp vxpVarM89322d = m89322d(np3Var.f156860c, np3Var.f156861d);
        if (this.f256092f == null) {
            this.f256092f = vxpVarM89322d.f245797a;
        }
        vsd0 vsd0Var2 = np3Var.f156861d;
        if (vsd0Var2 != null && vsd0Var2.m86309c()) {
            vsd0 vsd0Var3 = np3Var.f156861d;
            vsd0 vsd0Var4 = new vsd0(vsd0Var3.f244408a, vsd0Var3.f244411d, vsd0Var3.f244409b);
            vxp vxpVarM89322d2 = m89322d(np3Var.f156860c, vsd0Var4);
            if (!vxpVarM89322d2.f245801e) {
                vxpVarM89322d2.f245801e = true;
                np3Var.f156859b.mo46978g(np3Var.f156861d.f244408a, this.f256088b);
                this.f256090d.mo37616h(new np3(np3Var.f156858a, np3Var.f156859b, np3Var.f156860c, vsd0Var4, Math.max(0L, h0b1.m46326n0(this.f256088b.m30107d(np3Var.f156861d.f244409b)) + h0b1.m46326n0(this.f256088b.f29347e)), np3Var.f156863f, np3Var.f156864g, np3Var.f156865h, np3Var.f156866i, np3Var.f156867j), vxpVarM89322d2.f245797a);
            }
        }
        if (!vxpVarM89322d.f245801e) {
            vxpVarM89322d.f245801e = true;
            this.f256090d.mo37616h(np3Var, vxpVarM89322d.f245797a);
        }
        if (vxpVarM89322d.f245797a.equals(this.f256092f) && !vxpVarM89322d.f245802f) {
            vxpVarM89322d.f245802f = true;
            this.f256090d.mo37615g(np3Var, vxpVarM89322d.f245797a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, p.e2p0] */
    /* JADX INFO: renamed from: h */
    public final synchronized void m89326h(int i, np3 np3Var) {
        try {
            this.f256090d.getClass();
            boolean z = i == 0;
            Iterator it = this.f256089c.values().iterator();
            while (it.hasNext()) {
                vxp vxpVar = (vxp) it.next();
                if (vxpVar.m86666b(np3Var)) {
                    it.remove();
                    boolean zEquals = vxpVar.f245797a.equals(this.f256092f);
                    if (zEquals) {
                        m89320b(vxpVar);
                    }
                    if (vxpVar.f245801e) {
                        this.f256090d.mo37614f(np3Var, vxpVar.f245797a, z && zEquals && vxpVar.f245802f);
                    }
                }
            }
            m89324f(np3Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, p.e2p0] */
    /* JADX INFO: renamed from: i */
    public final synchronized void m89327i(np3 np3Var) {
        try {
            this.f256090d.getClass();
            qp71 qp71Var = this.f256091e;
            this.f256091e = np3Var.f156859b;
            Iterator it = this.f256089c.values().iterator();
            while (it.hasNext()) {
                vxp vxpVar = (vxp) it.next();
                if (!vxpVar.m86668d(qp71Var, this.f256091e) || vxpVar.m86666b(np3Var)) {
                    it.remove();
                    if (vxpVar.f245797a.equals(this.f256092f)) {
                        m89320b(vxpVar);
                    }
                    if (vxpVar.f245801e) {
                        this.f256090d.mo37614f(np3Var, vxpVar.f245797a, false);
                    }
                }
            }
            m89324f(np3Var);
        } catch (Throwable th) {
            throw th;
        }
    }
}
