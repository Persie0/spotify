package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class aru0 {

    /* JADX INFO: renamed from: a */
    public final String f19147a;

    /* JADX INFO: renamed from: b */
    public final String f19148b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f19149c;

    /* JADX INFO: renamed from: d */
    public final n3s0 f19150d;

    /* JADX INFO: renamed from: e */
    public final op71 f19151e;

    /* JADX INFO: renamed from: f */
    public final hpm0 f19152f;

    /* JADX INFO: renamed from: g */
    public final String f19153g;

    /* JADX INFO: renamed from: h */
    public final String f19154h;

    public aru0(String str, String str2, ArrayList arrayList, n3s0 n3s0Var, op71 op71Var, hpm0 hpm0Var, String str3, String str4) {
        this.f19147a = str;
        this.f19148b = str2;
        this.f19149c = arrayList;
        this.f19150d = n3s0Var;
        this.f19151e = op71Var;
        this.f19152f = hpm0Var;
        this.f19153g = str3;
        this.f19154h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aru0)) {
            return false;
        }
        aru0 aru0Var = (aru0) obj;
        return this.f19147a.equals(aru0Var.f19147a) && wj50.m88271j(this.f19148b, aru0Var.f19148b) && this.f19149c.equals(aru0Var.f19149c) && this.f19150d.equals(aru0Var.f19150d) && this.f19151e.equals(aru0Var.f19151e) && this.f19152f.equals(aru0Var.f19152f) && this.f19153g.equals(aru0Var.f19153g) && this.f19154h.equals(aru0Var.f19154h);
    }

    public final int hashCode() {
        int iHashCode = this.f19147a.hashCode() * 31;
        String str = this.f19148b;
        return Long.hashCode(0L) + s571.m77243b(s571.m77243b((this.f19152f.hashCode() + ((this.f19151e.hashCode() + ((this.f19150d.hashCode() + lq51.m59700f(this.f19149c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31)) * 31)) * 31, 31, this.f19153g), 31, this.f19154h);
    }
}
