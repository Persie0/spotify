package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class f451 {

    /* JADX INFO: renamed from: a */
    public final List f65677a;

    public f451(List list) {
        this.f65677a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f451) && wj50.m88271j(this.f65677a, ((f451) obj).f65677a);
    }

    public final int hashCode() {
        return this.f65677a.hashCode();
    }
}
