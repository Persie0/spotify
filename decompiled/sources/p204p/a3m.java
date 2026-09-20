package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a3m implements g3m {

    /* JADX INFO: renamed from: a */
    public final List f11999a;

    public a3m(List list) {
        this.f11999a = list;
    }

    /* JADX INFO: renamed from: a */
    public final List m24637a() {
        return this.f11999a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a3m) && wj50.m88271j(this.f11999a, ((a3m) obj).f11999a);
    }

    public final int hashCode() {
        return this.f11999a.hashCode();
    }
}
