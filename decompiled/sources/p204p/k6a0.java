package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class k6a0 {

    /* JADX INFO: renamed from: a */
    public final List f119704a;

    /* JADX INFO: renamed from: b */
    public final List f119705b;

    public k6a0(List list, List list2) {
        this.f119704a = list;
        this.f119705b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6a0)) {
            return false;
        }
        k6a0 k6a0Var = (k6a0) obj;
        return wj50.m88271j(this.f119704a, k6a0Var.f119704a) && wj50.m88271j(this.f119705b, k6a0Var.f119705b);
    }

    public final int hashCode() {
        return this.f119705b.hashCode() + (this.f119704a.hashCode() * 31);
    }
}
