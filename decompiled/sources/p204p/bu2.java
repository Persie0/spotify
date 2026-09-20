package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bu2 implements fu2 {

    /* JADX INFO: renamed from: a */
    public final String f30993a;

    /* JADX INFO: renamed from: b */
    public final List f30994b;

    public bu2(String str, List list) {
        this.f30993a = str;
        this.f30994b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu2)) {
            return false;
        }
        bu2 bu2Var = (bu2) obj;
        return wj50.m88271j(this.f30993a, bu2Var.f30993a) && wj50.m88271j(this.f30994b, bu2Var.f30994b);
    }

    public final int hashCode() {
        return this.f30994b.hashCode() + (this.f30993a.hashCode() * 31);
    }
}
