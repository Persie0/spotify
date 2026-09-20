package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nhl0 implements shl0 {

    /* JADX INFO: renamed from: a */
    public final String f154029a;

    public nhl0(String str) {
        this.f154029a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nhl0) && wj50.m88271j(this.f154029a, ((nhl0) obj).f154029a);
    }

    public final int hashCode() {
        return this.f154029a.hashCode();
    }
}
