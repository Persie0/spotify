package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class nz10 {

    /* JADX INFO: renamed from: a */
    public final List f159971a;

    public nz10(List list) {
        this.f159971a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nz10) && wj50.m88271j(this.f159971a, ((nz10) obj).f159971a);
    }

    public final int hashCode() {
        return this.f159971a.hashCode();
    }
}
