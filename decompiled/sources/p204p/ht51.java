package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ht51 {

    /* JADX INFO: renamed from: a */
    public final boolean f94930a;

    /* JADX INFO: renamed from: b */
    public final List f94931b;

    /* JADX INFO: renamed from: c */
    public final boolean f94932c;

    public ht51(List list, boolean z, boolean z2) {
        this.f94930a = z;
        this.f94931b = list;
        this.f94932c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht51)) {
            return false;
        }
        ht51 ht51Var = (ht51) obj;
        return this.f94930a == ht51Var.f94930a && wj50.m88271j(this.f94931b, ht51Var.f94931b) && this.f94932c == ht51Var.f94932c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f94932c) + s571.m77244c(Boolean.hashCode(this.f94930a) * 31, 31, this.f94931b);
    }
}
