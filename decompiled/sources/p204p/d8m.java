package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class d8m implements g8m {

    /* JADX INFO: renamed from: a */
    public final String f46486a;

    public d8m(String str) {
        this.f46486a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d8m) && wj50.m88271j(this.f46486a, ((d8m) obj).f46486a);
    }

    public final int hashCode() {
        return this.f46486a.hashCode();
    }
}
