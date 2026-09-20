package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class s6y implements x6y {

    /* JADX INFO: renamed from: a */
    public final List f206219a;

    public s6y(List list) {
        this.f206219a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s6y) && wj50.m88271j(this.f206219a, ((s6y) obj).f206219a);
    }

    public final int hashCode() {
        return this.f206219a.hashCode();
    }
}
