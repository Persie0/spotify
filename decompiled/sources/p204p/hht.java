package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class hht {

    /* JADX INFO: renamed from: a */
    public final String f91577a;

    public hht(String str) {
        this.f91577a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hht) && wj50.m88271j(this.f91577a, ((hht) obj).f91577a);
    }

    public final int hashCode() {
        return this.f91577a.hashCode();
    }
}
