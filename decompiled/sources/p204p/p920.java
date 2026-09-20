package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class p920 {

    /* JADX INFO: renamed from: a */
    public final List f175128a;

    public p920(List list) {
        this.f175128a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p920) && wj50.m88271j(this.f175128a, ((p920) obj).f175128a);
    }

    public final int hashCode() {
        return this.f175128a.hashCode();
    }
}
