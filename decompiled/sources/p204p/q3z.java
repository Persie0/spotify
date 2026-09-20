package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class q3z {

    /* JADX INFO: renamed from: a */
    public final List f185008a;

    public q3z(List list) {
        this.f185008a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q3z) && wj50.m88271j(this.f185008a, ((q3z) obj).f185008a);
    }

    public final int hashCode() {
        return this.f185008a.hashCode();
    }
}
