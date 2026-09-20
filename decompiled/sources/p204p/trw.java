package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class trw implements y2x {

    /* JADX INFO: renamed from: a */
    public final String f223139a;

    public trw(String str) {
        this.f223139a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof trw) && wj50.m88271j(this.f223139a, ((trw) obj).f223139a);
    }

    public final int hashCode() {
        return this.f223139a.hashCode();
    }
}
