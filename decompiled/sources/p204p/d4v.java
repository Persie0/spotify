package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class d4v implements g4v {

    /* JADX INFO: renamed from: a */
    public final String f45247a;

    public d4v(String str) {
        this.f45247a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d4v) && wj50.m88271j(this.f45247a, ((d4v) obj).f45247a);
    }

    public final int hashCode() {
        return this.f45247a.hashCode();
    }
}
