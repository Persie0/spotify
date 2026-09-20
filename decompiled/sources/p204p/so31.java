package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class so31 {

    /* JADX INFO: renamed from: a */
    public final String f211085a;

    /* JADX INFO: renamed from: b */
    public final List f211086b;

    public so31(String str, List list) {
        this.f211085a = str;
        this.f211086b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so31)) {
            return false;
        }
        so31 so31Var = (so31) obj;
        return wj50.m88271j(this.f211085a, so31Var.f211085a) && wj50.m88271j(this.f211086b, so31Var.f211086b);
    }

    public final int hashCode() {
        return this.f211086b.hashCode() + (this.f211085a.hashCode() * 31);
    }
}
