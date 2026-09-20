package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class n261 implements o261 {

    /* JADX INFO: renamed from: a */
    public final List f149651a;

    public n261(List list) {
        this.f149651a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n261) && wj50.m88271j(this.f149651a, ((n261) obj).f149651a);
    }

    public final int hashCode() {
        return this.f149651a.hashCode();
    }
}
