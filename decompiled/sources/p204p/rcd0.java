package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rcd0 implements scd0 {

    /* JADX INFO: renamed from: a */
    public final String f197847a;

    public rcd0(String str) {
        this.f197847a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rcd0) && wj50.m88271j(this.f197847a, ((rcd0) obj).f197847a);
    }

    public final int hashCode() {
        return this.f197847a.hashCode();
    }
}
