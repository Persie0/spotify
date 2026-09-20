package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class sqh implements yqh {

    /* JADX INFO: renamed from: a */
    public final List f213106a;

    public sqh(List list) {
        this.f213106a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sqh) && wj50.m88271j(this.f213106a, ((sqh) obj).f213106a);
    }

    public final int hashCode() {
        return this.f213106a.hashCode();
    }
}
