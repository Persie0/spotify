package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class an21 {

    /* JADX INFO: renamed from: a */
    public final List f17251a;

    /* JADX INFO: renamed from: b */
    public final boolean f17252b;

    public an21(List list, boolean z) {
        this.f17251a = list;
        this.f17252b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an21)) {
            return false;
        }
        an21 an21Var = (an21) obj;
        return wj50.m88271j(this.f17251a, an21Var.f17251a) && this.f17252b == an21Var.f17252b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17252b) + (this.f17251a.hashCode() * 31);
    }
}
