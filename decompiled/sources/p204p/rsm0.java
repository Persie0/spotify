package p204p;

import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: classes3.dex */
public final class rsm0 {

    /* JADX INFO: renamed from: a */
    public String f202350a;

    /* JADX INFO: renamed from: b */
    public if71 f202351b;

    /* JADX INFO: renamed from: c */
    public hzz f202352c;

    /* JADX INFO: renamed from: d */
    public int f202353d;

    /* JADX INFO: renamed from: e */
    public boolean f202354e;

    /* JADX INFO: renamed from: f */
    public int f202355f;

    /* JADX INFO: renamed from: g */
    public int f202356g;

    /* JADX INFO: renamed from: i */
    public yqq f202358i;

    /* JADX INFO: renamed from: j */
    public ok4 f202359j;

    /* JADX INFO: renamed from: k */
    public boolean f202360k;

    /* JADX INFO: renamed from: l */
    public long f202361l;

    /* JADX INFO: renamed from: m */
    public fef0 f202362m;

    /* JADX INFO: renamed from: n */
    public psm0 f202363n;

    /* JADX INFO: renamed from: o */
    public ko70 f202364o;

    /* JADX INFO: renamed from: s */
    public long f202368s;

    /* JADX INFO: renamed from: h */
    public long f202357h = tt40.f223517a;

    /* JADX INFO: renamed from: p */
    public long f202365p = e8j.m38117h(0, 0, 0, 0);

    /* JADX INFO: renamed from: q */
    public int f202366q = -1;

    /* JADX INFO: renamed from: r */
    public int f202367r = -1;

    public rsm0(String str, if71 if71Var, hzz hzzVar, int i, boolean z, int i2, int i3) {
        this.f202350a = str;
        this.f202351b = if71Var;
        this.f202352c = hzzVar;
        this.f202353d = i;
        this.f202354e = z;
        this.f202355f = i2;
        this.f202356g = i3;
        long j = 0;
        this.f202361l = (j & 4294967295L) | (j << 32);
    }

    /* JADX INFO: renamed from: g */
    public static long m76347g(rsm0 rsm0Var, long j, ko70 ko70Var) {
        if71 if71Var = rsm0Var.f202351b;
        fef0 fef0Var = rsm0Var.f202362m;
        yqq yqqVar = rsm0Var.f202358i;
        wj50.m88279p(yqqVar);
        fef0 fef0VarM49027n = hxh.m49027n(fef0Var, ko70Var, if71Var, yqqVar, rsm0Var.f202352c);
        rsm0Var.f202362m = fef0VarM49027n;
        return fef0VarM49027n.m41440a(rsm0Var.f202356g, j);
    }

    /* JADX INFO: renamed from: a */
    public final int m76348a(int i, ko70 ko70Var) {
        int i2 = this.f202366q;
        int i3 = this.f202367r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jM38110a = e8j.m38110a(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY);
        if (this.f202356g > 1) {
            jM38110a = m76347g(this, jM38110a, ko70Var);
        }
        psm0 psm0VarM76352e = m76352e(ko70Var);
        int iM57232v = ksg1.m57232v(z520.m95421a(psm0VarM76352e, sxg1.m79637t(this.f202353d, this.f202355f, this.f202354e), this.f202353d, sxg1.m79636s(jM38110a, this.f202354e, this.f202353d, psm0VarM76352e.mo29902b())).m67131b());
        int iM28431j = b8j.m28431j(jM38110a);
        if (iM57232v < iM28431j) {
            iM57232v = iM28431j;
        }
        this.f202366q = i;
        this.f202367r = iM57232v;
        return iM57232v;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m76349b(long j, ko70 ko70Var) {
        psm0 psm0Var;
        this.f202368s = (this.f202368s << 2) | 3;
        boolean z = true;
        if (this.f202356g > 1) {
            j = m76347g(this, j, ko70Var);
        }
        ok4 ok4Var = this.f202359j;
        boolean z2 = false;
        if (ok4Var == null || (psm0Var = this.f202363n) == null || psm0Var.mo29901a() || ko70Var != this.f202364o || (!b8j.m28424c(j, this.f202365p) && (b8j.m28430i(j) != b8j.m28430i(this.f202365p) || b8j.m28432k(j) != b8j.m28432k(this.f202365p) || b8j.m28429h(j) < ok4Var.m67131b() || ok4Var.f166267d.f25457d))) {
            psm0 psm0VarM76352e = m76352e(ko70Var);
            ok4 ok4VarM95421a = z520.m95421a(psm0VarM76352e, sxg1.m79637t(this.f202353d, this.f202355f, this.f202354e), this.f202353d, sxg1.m79636s(j, this.f202354e, this.f202353d, psm0VarM76352e.mo29902b()));
            this.f202365p = j;
            long jM38113d = e8j.m38113d(j, (((long) ksg1.m57232v(ok4VarM95421a.m67134e())) << 32) | (((long) ksg1.m57232v(ok4VarM95421a.m67131b())) & 4294967295L));
            this.f202361l = jM38113d;
            if (this.f202353d != 3 && (((int) (jM38113d >> 32)) < ok4VarM95421a.m67134e() || ((int) (jM38113d & 4294967295L)) < ok4VarM95421a.m67131b())) {
                z2 = true;
            }
            this.f202360k = z2;
            this.f202359j = ok4VarM95421a;
            return true;
        }
        if (!b8j.m28424c(j, this.f202365p)) {
            ok4 ok4Var2 = this.f202359j;
            wj50.m88279p(ok4Var2);
            long jM38113d2 = e8j.m38113d(j, (((long) ksg1.m57232v(Math.min(ok4Var2.f166264a.f210011i.m83593a(), ok4Var2.m67134e()))) << 32) | (((long) ksg1.m57232v(ok4Var2.m67131b())) & 4294967295L));
            this.f202361l = jM38113d2;
            if (this.f202353d == 3 || (((int) (jM38113d2 >> 32)) >= ok4Var2.m67134e() && ((int) (4294967295L & jM38113d2)) >= ok4Var2.m67131b())) {
                z = false;
            }
            this.f202360k = z;
            this.f202365p = j;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final void m76350c() {
        this.f202359j = null;
        this.f202363n = null;
        this.f202364o = null;
        this.f202366q = -1;
        this.f202367r = -1;
        this.f202365p = e8j.m38117h(0, 0, 0, 0);
        long j = 0;
        this.f202361l = (j & 4294967295L) | (j << 32);
        this.f202360k = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m76351d(yqq yqqVar) {
        long jM81497a;
        yqq yqqVar2 = this.f202358i;
        if (yqqVar != null) {
            int i = tt40.f223518b;
            jM81497a = tt40.m81497a(yqqVar.mo24619j(), yqqVar.mo24617W0());
        } else {
            jM81497a = tt40.f223517a;
        }
        if (yqqVar2 == null) {
            this.f202358i = yqqVar;
            this.f202357h = jM81497a;
        } else if (yqqVar == null || this.f202357h != jM81497a) {
            this.f202358i = yqqVar;
            this.f202357h = jM81497a;
            this.f202368s = (this.f202368s << 2) | 1;
            m76350c();
        }
    }

    /* JADX INFO: renamed from: e */
    public final psm0 m76352e(ko70 ko70Var) {
        psm0 sk4Var = this.f202363n;
        if (sk4Var == null || ko70Var != this.f202364o || sk4Var.mo29901a()) {
            this.f202364o = ko70Var;
            String str = this.f202350a;
            if71 if71VarM45952x = gwg1.m45952x(this.f202351b, ko70Var);
            yqq yqqVar = this.f202358i;
            wj50.m88279p(yqqVar);
            hzz hzzVar = this.f202352c;
            lau lauVar = lau.f131415a;
            sk4Var = new sk4(str, if71VarM45952x, lauVar, lauVar, hzzVar, yqqVar);
        }
        this.f202363n = sk4Var;
        return sk4Var;
    }

    /* JADX INFO: renamed from: f */
    public final void m76353f(String str, if71 if71Var, hzz hzzVar, int i, boolean z, int i2, int i3) {
        this.f202350a = str;
        this.f202351b = if71Var;
        this.f202352c = hzzVar;
        this.f202353d = i;
        this.f202354e = z;
        this.f202355f = i2;
        this.f202356g = i3;
        this.f202368s = (this.f202368s << 2) | 2;
        m76350c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.f202359j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) tt40.m81498b(this.f202357h));
        sb.append(", history=");
        return ikc0.m50938j(this.f202368s, ", constraints=$)", sb);
    }
}
