package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class n6b {

    /* JADX INFO: renamed from: a */
    public final String f150800a;

    /* JADX INFO: renamed from: b */
    public final List f150801b;

    /* JADX INFO: renamed from: c */
    public final vda1 f150802c;

    public n6b(String str, List list, vda1 vda1Var) {
        this.f150800a = str;
        this.f150801b = list;
        this.f150802c = vda1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6b)) {
            return false;
        }
        n6b n6bVar = (n6b) obj;
        return wj50.m88271j(this.f150800a, n6bVar.f150800a) && wj50.m88271j(this.f150801b, n6bVar.f150801b) && wj50.m88271j(this.f150802c, n6bVar.f150802c);
    }

    public final int hashCode() {
        return this.f150802c.hashCode() + s571.m77244c(this.f150800a.hashCode() * 31, 31, this.f150801b);
    }
}
