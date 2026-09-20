package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lf21 implements pf21 {

    /* JADX INFO: renamed from: a */
    public final List f132790a;

    public lf21(List list) {
        this.f132790a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lf21) && wj50.m88271j(this.f132790a, ((lf21) obj).f132790a);
    }

    public final int hashCode() {
        return this.f132790a.hashCode();
    }
}
