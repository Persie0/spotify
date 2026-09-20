package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class g081 {

    /* JADX INFO: renamed from: a */
    public final List f75311a;

    public g081(List list) {
        this.f75311a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g081) && wj50.m88271j(this.f75311a, ((g081) obj).f75311a);
    }

    public final int hashCode() {
        return this.f75311a.hashCode();
    }
}
