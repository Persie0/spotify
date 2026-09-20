package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class wp71 {

    /* JADX INFO: renamed from: a */
    public final zl0 f253694a;

    /* JADX INFO: renamed from: b */
    public final List f253695b;

    /* JADX INFO: renamed from: c */
    public final boolean f253696c;

    public wp71(zl0 zl0Var, List list, boolean z) {
        this.f253694a = zl0Var;
        this.f253695b = list;
        this.f253696c = z;
    }

    /* JADX INFO: renamed from: a */
    public final List m88681a() {
        return this.f253695b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp71)) {
            return false;
        }
        wp71 wp71Var = (wp71) obj;
        return this.f253694a == wp71Var.f253694a && wj50.m88271j(this.f253695b, wp71Var.f253695b) && this.f253696c == wp71Var.f253696c;
    }

    public final int hashCode() {
        int iHashCode = this.f253694a.hashCode() * 31;
        List list = this.f253695b;
        return Boolean.hashCode(this.f253696c) + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
    }
}
