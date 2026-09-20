package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class df6 implements of6 {

    /* JADX INFO: renamed from: a */
    public final List f48467a;

    public df6(List list) {
        this.f48467a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof df6) && wj50.m88271j(this.f48467a, ((df6) obj).f48467a);
    }

    public final int hashCode() {
        return this.f48467a.hashCode();
    }
}
