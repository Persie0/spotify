package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class myv0 {

    /* JADX INFO: renamed from: a */
    public final List f148537a;

    public myv0(List list) {
        this.f148537a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof myv0) && wj50.m88271j(this.f148537a, ((myv0) obj).f148537a);
    }

    public final int hashCode() {
        return this.f148537a.hashCode();
    }
}
