package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class i6d1 {

    /* JADX INFO: renamed from: a */
    public final List f99215a;

    public i6d1(List list) {
        this.f99215a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i6d1) && wj50.m88271j(this.f99215a, ((i6d1) obj).f99215a);
    }

    public final int hashCode() {
        return this.f99215a.hashCode();
    }
}
