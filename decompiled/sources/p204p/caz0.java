package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class caz0 {

    /* JADX INFO: renamed from: a */
    public final List f35959a;

    public caz0(List list) {
        this.f35959a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof caz0) && wj50.m88271j(this.f35959a, ((caz0) obj).f35959a);
    }

    public final int hashCode() {
        return this.f35959a.hashCode();
    }
}
