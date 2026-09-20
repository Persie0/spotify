package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class qt5 {

    /* JADX INFO: renamed from: a */
    public final String f192293a;

    /* JADX INFO: renamed from: b */
    public final List f192294b;

    /* JADX INFO: renamed from: c */
    public final n6f f192295c;

    public qt5(String str, List list, n6f n6fVar) {
        this.f192293a = str;
        this.f192294b = list;
        this.f192295c = n6fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt5)) {
            return false;
        }
        qt5 qt5Var = (qt5) obj;
        return wj50.m88271j(this.f192293a, qt5Var.f192293a) && wj50.m88271j(this.f192294b, qt5Var.f192294b) && wj50.m88271j(this.f192295c, qt5Var.f192295c);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(this.f192293a.hashCode() * 31, 31, this.f192294b);
        n6f n6fVar = this.f192295c;
        return iM77244c + (n6fVar == null ? 0 : Long.hashCode(n6fVar.f150873a));
    }
}
