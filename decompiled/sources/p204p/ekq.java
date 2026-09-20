package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ekq {

    /* JADX INFO: renamed from: a */
    public final List f60522a;

    public ekq(List list) {
        this.f60522a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ekq) && wj50.m88271j(this.f60522a, ((ekq) obj).f60522a);
    }

    public final int hashCode() {
        return this.f60522a.hashCode();
    }
}
