package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ldj implements eej {

    /* JADX INFO: renamed from: a */
    public final ye20 f132181a;

    /* JADX INFO: renamed from: b */
    public final List f132182b;

    /* JADX INFO: renamed from: c */
    public final String f132183c;

    public ldj(ye20 ye20Var, List list, String str) {
        this.f132181a = ye20Var;
        this.f132182b = list;
        this.f132183c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldj)) {
            return false;
        }
        ldj ldjVar = (ldj) obj;
        return wj50.m88271j(this.f132181a, ldjVar.f132181a) && wj50.m88271j(this.f132182b, ldjVar.f132182b) && wj50.m88271j(this.f132183c, ldjVar.f132183c);
    }

    public final int hashCode() {
        return this.f132183c.hashCode() + s571.m77244c(this.f132181a.hashCode() * 31, 31, this.f132182b);
    }
}
