package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class lz5 {

    /* JADX INFO: renamed from: a */
    public final List f138262a;

    public lz5(List list) {
        this.f138262a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lz5) && wj50.m88271j(this.f138262a, ((lz5) obj).f138262a);
    }

    public final int hashCode() {
        return this.f138262a.hashCode();
    }
}
