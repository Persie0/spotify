package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class g6b1 {

    /* JADX INFO: renamed from: a */
    public final String f77015a;

    public g6b1(String str) {
        this.f77015a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g6b1) && wj50.m88271j(this.f77015a, ((g6b1) obj).f77015a);
    }

    public final int hashCode() {
        return this.f77015a.hashCode() * 31;
    }
}
