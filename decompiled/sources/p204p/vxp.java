package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class vxp {

    /* JADX INFO: renamed from: a */
    public final String f245797a;

    /* JADX INFO: renamed from: b */
    public int f245798b;

    /* JADX INFO: renamed from: c */
    public long f245799c;

    /* JADX INFO: renamed from: d */
    public final vsd0 f245800d;

    /* JADX INFO: renamed from: e */
    public boolean f245801e;

    /* JADX INFO: renamed from: f */
    public boolean f245802f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ wxp f245803g;

    public vxp(wxp wxpVar, String str, int i, vsd0 vsd0Var) {
        this.f245803g = wxpVar;
        this.f245797a = str;
        this.f245798b = i;
        this.f245799c = vsd0Var == null ? -1L : vsd0Var.f244411d;
        if (vsd0Var == null || !vsd0Var.m86309c()) {
            return;
        }
        this.f245800d = vsd0Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m86665a(int i, vsd0 vsd0Var) {
        if (vsd0Var != null) {
            long j = vsd0Var.f244411d;
            if (j != -1) {
                vsd0 vsd0Var2 = this.f245800d;
                if (vsd0Var2 == null) {
                    return !vsd0Var.m86309c() && j == this.f245799c;
                }
                return j == vsd0Var2.f244411d && vsd0Var.f244409b == vsd0Var2.f244409b && vsd0Var.f244410c == vsd0Var2.f244410c;
            }
        }
        return i == this.f245798b;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m86666b(np3 np3Var) {
        vsd0 vsd0Var = np3Var.f156861d;
        qp71 qp71Var = np3Var.f156859b;
        if (vsd0Var == null) {
            return this.f245798b != np3Var.f156860c;
        }
        long j = this.f245799c;
        if (j == -1) {
            return false;
        }
        if (vsd0Var.f244411d > j) {
            return true;
        }
        vsd0 vsd0Var2 = this.f245800d;
        if (vsd0Var2 == null) {
            return false;
        }
        int i = vsd0Var2.f244409b;
        int iMo26650b = qp71Var.mo26650b(vsd0Var.f244408a);
        int iMo26650b2 = qp71Var.mo26650b(vsd0Var2.f244408a);
        if (vsd0Var.f244411d < vsd0Var2.f244411d || iMo26650b < iMo26650b2) {
            return false;
        }
        if (iMo26650b > iMo26650b2) {
            return true;
        }
        if (!vsd0Var.m86309c()) {
            int i2 = vsd0Var.f244412e;
            return i2 == -1 || i2 > i;
        }
        int i3 = vsd0Var.f244409b;
        int i4 = vsd0Var.f244410c;
        if (i3 <= i) {
            return i3 == i && i4 > vsd0Var2.f244410c;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    /* JADX INFO: renamed from: c */
    public final void m86667c(int i, vsd0 vsd0Var) {
        long j;
        if (this.f245799c == -1 && i == this.f245798b && vsd0Var != null) {
            long j2 = vsd0Var.f244411d;
            wxp wxpVar = this.f245803g;
            vxp vxpVar = (vxp) wxpVar.f256089c.get(wxpVar.f256092f);
            if (vxpVar != null) {
                j = vxpVar.f245799c;
                if (j == -1) {
                    j = wxpVar.f256093g + 1;
                }
            } else {
                j = wxpVar.f256093g + 1;
            }
            if (j2 >= j) {
                this.f245799c = j2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m86668d(qp71 qp71Var, qp71 qp71Var2) {
        vsd0 vsd0Var;
        int i = this.f245798b;
        if (i < qp71Var.mo26655o()) {
            wxp wxpVar = this.f245803g;
            mp71 mp71Var = wxpVar.f256087a;
            qp71Var.m73435m(i, mp71Var);
            int i2 = mp71Var.f145939n;
            while (true) {
                if (i2 > mp71Var.f145940o) {
                    i = -1;
                    break;
                }
                int iMo26650b = qp71Var2.mo26650b(qp71Var.mo26653l(i2));
                if (iMo26650b != -1) {
                    i = qp71Var2.mo26651f(iMo26650b, wxpVar.f256088b, false).f29345c;
                    break;
                }
                i2++;
            }
        } else if (i >= qp71Var2.mo26655o()) {
            i = -1;
            break;
        }
        this.f245798b = i;
        return i != -1 && ((vsd0Var = this.f245800d) == null || qp71Var2.mo26650b(vsd0Var.f244408a) != -1);
    }
}
