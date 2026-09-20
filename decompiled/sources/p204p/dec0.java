package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class dec0 extends iec0 {

    /* JADX INFO: renamed from: a */
    public final boolean f48052a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f48053b;

    /* JADX INFO: renamed from: c */
    public final String f48054c;

    public dec0(String str, ArrayList arrayList, boolean z) {
        this.f48052a = z;
        this.f48053b = arrayList;
        this.f48054c = str;
    }

    @Override // p204p.iec0
    /* JADX INFO: renamed from: a */
    public final boolean mo35773a() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dec0)) {
            return false;
        }
        dec0 dec0Var = (dec0) obj;
        return this.f48052a == dec0Var.f48052a && this.f48053b.equals(dec0Var.f48053b) && wj50.m88271j(this.f48054c, dec0Var.f48054c);
    }

    public final int hashCode() {
        return this.f48054c.hashCode() + lq51.m59700f(this.f48053b, s571.m77245d(Boolean.hashCode(true) * 31, 31, this.f48052a), 961);
    }
}
