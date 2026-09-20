package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class i7t extends k7t {

    /* JADX INFO: renamed from: a */
    public final List f99630a;

    public i7t(List list) {
        this.f99630a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i7t) && wj50.m88271j(this.f99630a, ((i7t) obj).f99630a);
    }

    public final int hashCode() {
        return this.f99630a.hashCode();
    }
}
