package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class u3d implements h5d {

    /* JADX INFO: renamed from: a */
    public final List f226322a;

    public u3d(List list) {
        this.f226322a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u3d) && wj50.m88271j(this.f226322a, ((u3d) obj).f226322a);
    }

    public final int hashCode() {
        return this.f226322a.hashCode();
    }
}
