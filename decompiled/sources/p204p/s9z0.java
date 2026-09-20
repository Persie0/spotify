package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class s9z0 {

    /* JADX INFO: renamed from: a */
    public final Integer f207093a;

    /* JADX INFO: renamed from: b */
    public final List f207094b;

    /* JADX INFO: renamed from: c */
    public final boolean f207095c;

    public s9z0(Integer num, List list) {
        this.f207093a = num;
        this.f207094b = list;
        this.f207095c = list.size() > 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9z0)) {
            return false;
        }
        s9z0 s9z0Var = (s9z0) obj;
        return wj50.m88271j(this.f207093a, s9z0Var.f207093a) && wj50.m88271j(this.f207094b, s9z0Var.f207094b);
    }

    public final int hashCode() {
        Integer num = this.f207093a;
        return this.f207094b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }
}
