package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nrs implements vrs {

    /* JADX INFO: renamed from: a */
    public final String f157600a;

    public nrs(String str) {
        this.f157600a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nrs) && wj50.m88271j(this.f157600a, ((nrs) obj).f157600a);
    }

    public final int hashCode() {
        return this.f157600a.hashCode();
    }
}
