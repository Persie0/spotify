package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class oxz implements sxz {

    /* JADX INFO: renamed from: a */
    public final String f171622a;

    public oxz(String str) {
        this.f171622a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oxz) && wj50.m88271j(this.f171622a, ((oxz) obj).f171622a);
    }

    public final int hashCode() {
        return this.f171622a.hashCode();
    }
}
