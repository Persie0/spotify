package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class i5t extends o5t {

    /* JADX INFO: renamed from: a */
    public final String f99019a;

    public i5t(String str) {
        this.f99019a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i5t) && wj50.m88271j(this.f99019a, ((i5t) obj).f99019a);
    }

    public final int hashCode() {
        return this.f99019a.hashCode();
    }
}
