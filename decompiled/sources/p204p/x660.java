package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class x660 implements y660 {

    /* JADX INFO: renamed from: a */
    public final Set f258602a;

    public x660(Set set) {
        this.f258602a = set;
    }

    @Override // p204p.y660
    /* JADX INFO: renamed from: a */
    public final xw50 mo87268a() {
        return xw50.f266590b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x660) && wj50.m88271j(this.f258602a, ((x660) obj).f258602a);
    }

    public final int hashCode() {
        return xw50.f266590b.hashCode() + (this.f258602a.hashCode() * 31);
    }
}
