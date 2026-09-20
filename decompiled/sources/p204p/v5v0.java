package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class v5v0 extends h6v0 {

    /* JADX INFO: renamed from: a */
    public final List f237651a;

    public v5v0(List list) {
        this.f237651a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v5v0) && wj50.m88271j(this.f237651a, ((v5v0) obj).f237651a);
    }

    public final int hashCode() {
        return this.f237651a.hashCode();
    }
}
