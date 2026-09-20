package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class aiu0 {

    /* JADX INFO: renamed from: a */
    public final List f16094a;

    /* JADX INFO: renamed from: b */
    public final Integer f16095b;

    /* JADX INFO: renamed from: c */
    public final boolean f16096c;

    public aiu0(List list, Integer num, boolean z) {
        this.f16094a = list;
        this.f16095b = num;
        this.f16096c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aiu0)) {
            return false;
        }
        aiu0 aiu0Var = (aiu0) obj;
        return wj50.m88271j(this.f16094a, aiu0Var.f16094a) && wj50.m88271j(this.f16095b, aiu0Var.f16095b) && this.f16096c == aiu0Var.f16096c;
    }

    public final int hashCode() {
        int iHashCode = this.f16094a.hashCode() * 31;
        Integer num = this.f16095b;
        return Boolean.hashCode(this.f16096c) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }
}
