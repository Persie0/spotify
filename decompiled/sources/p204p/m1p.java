package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m1p implements p1p {

    /* JADX INFO: renamed from: a */
    public final List f139043a;

    public m1p(List list) {
        this.f139043a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m1p) && wj50.m88271j(this.f139043a, ((m1p) obj).f139043a);
    }

    public final int hashCode() {
        return this.f139043a.hashCode();
    }
}
