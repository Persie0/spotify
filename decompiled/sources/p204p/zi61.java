package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zi61 {

    /* JADX INFO: renamed from: a */
    public final String f283097a;

    /* JADX INFO: renamed from: b */
    public final List f283098b;

    public zi61(String str, List list) {
        this.f283097a = str;
        this.f283098b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi61)) {
            return false;
        }
        zi61 zi61Var = (zi61) obj;
        return wj50.m88271j(this.f283097a, zi61Var.f283097a) && wj50.m88271j(this.f283098b, zi61Var.f283098b);
    }

    public final int hashCode() {
        return this.f283098b.hashCode() + (this.f283097a.hashCode() * 31);
    }
}
