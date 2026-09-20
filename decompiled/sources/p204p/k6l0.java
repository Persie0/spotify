package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class k6l0 {

    /* JADX INFO: renamed from: a */
    public final boolean f119780a;

    /* JADX INFO: renamed from: b */
    public final Map f119781b;

    public k6l0(Map map, boolean z) {
        this.f119780a = z;
        this.f119781b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6l0)) {
            return false;
        }
        k6l0 k6l0Var = (k6l0) obj;
        return this.f119780a == k6l0Var.f119780a && wj50.m88271j(this.f119781b, k6l0Var.f119781b);
    }

    public final int hashCode() {
        return this.f119781b.hashCode() + (Boolean.hashCode(this.f119780a) * 31);
    }
}
