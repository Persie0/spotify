package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class u9v0 {

    /* JADX INFO: renamed from: a */
    public final String f228284a;

    /* JADX INFO: renamed from: b */
    public final List f228285b;

    public u9v0(String str, List list) {
        this.f228284a = str;
        this.f228285b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9v0)) {
            return false;
        }
        u9v0 u9v0Var = (u9v0) obj;
        return wj50.m88271j(this.f228284a, u9v0Var.f228284a) && wj50.m88271j(this.f228285b, u9v0Var.f228285b);
    }

    public final int hashCode() {
        return this.f228285b.hashCode() + (this.f228284a.hashCode() * 31);
    }
}
