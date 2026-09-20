package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class v4k0 {

    /* JADX INFO: renamed from: a */
    public final List f237197a;

    public v4k0(List list) {
        this.f237197a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v4k0) && wj50.m88271j(this.f237197a, ((v4k0) obj).f237197a);
    }

    public final int hashCode() {
        return this.f237197a.hashCode() + (Boolean.hashCode(true) * 31);
    }
}
