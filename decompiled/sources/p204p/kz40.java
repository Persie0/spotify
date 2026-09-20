package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class kz40 implements nz40 {

    /* JADX INFO: renamed from: a */
    public final List f128009a;

    public kz40(List list) {
        this.f128009a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kz40) && wj50.m88271j(this.f128009a, ((kz40) obj).f128009a);
    }

    public final int hashCode() {
        return this.f128009a.hashCode();
    }
}
