package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class alx0 {

    /* JADX INFO: renamed from: a */
    public final List f17007a;

    public alx0(List list) {
        this.f17007a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof alx0) && wj50.m88271j(this.f17007a, ((alx0) obj).f17007a);
    }

    public final int hashCode() {
        return this.f17007a.hashCode();
    }
}
