package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class d3m implements g3m {

    /* JADX INFO: renamed from: a */
    public final String f44939a;

    public d3m(String str) {
        this.f44939a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d3m) && wj50.m88271j(this.f44939a, ((d3m) obj).f44939a);
    }

    public final int hashCode() {
        return this.f44939a.hashCode();
    }
}
