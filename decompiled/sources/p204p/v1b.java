package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class v1b implements z1b {

    /* JADX INFO: renamed from: a */
    public final List f236308a;

    public v1b(List list) {
        this.f236308a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v1b) && wj50.m88271j(this.f236308a, ((v1b) obj).f236308a);
    }

    public final int hashCode() {
        return this.f236308a.hashCode();
    }
}
