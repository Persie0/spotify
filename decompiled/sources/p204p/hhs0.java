package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class hhs0 extends ths0 {

    /* JADX INFO: renamed from: a */
    public final String f91576a;

    public hhs0(String str) {
        this.f91576a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hhs0) && wj50.m88271j(this.f91576a, ((hhs0) obj).f91576a);
    }

    public final int hashCode() {
        return this.f91576a.hashCode();
    }
}
