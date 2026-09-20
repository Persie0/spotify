package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class nuh0 {

    /* JADX INFO: renamed from: a */
    public final i5w f158649a;

    /* JADX INFO: renamed from: b */
    public final m8w f158650b;

    /* JADX INFO: renamed from: c */
    public final boolean f158651c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f158652d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f158653e;

    /* JADX INFO: renamed from: f */
    public final boolean f158654f;

    public nuh0(i5w i5wVar, m8w m8wVar, boolean z, ArrayList arrayList, ArrayList arrayList2, boolean z2) {
        this.f158649a = i5wVar;
        this.f158650b = m8wVar;
        this.f158651c = z;
        this.f158652d = arrayList;
        this.f158653e = arrayList2;
        this.f158654f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nuh0)) {
            return false;
        }
        nuh0 nuh0Var = (nuh0) obj;
        return this.f158649a.equals(nuh0Var.f158649a) && this.f158650b.equals(nuh0Var.f158650b) && this.f158651c == nuh0Var.f158651c && this.f158652d.equals(nuh0Var.f158652d) && this.f158653e.equals(nuh0Var.f158653e) && this.f158654f == nuh0Var.f158654f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f158654f) + s571.m77245d(lq51.m59700f(this.f158653e, lq51.m59700f(this.f158652d, s571.m77245d(s571.m77245d((this.f158650b.hashCode() + (this.f158649a.hashCode() * 31)) * 31, 31, false), 31, this.f158651c), 31), 961), 31, false);
    }
}
