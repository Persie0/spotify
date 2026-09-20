package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gsp0 extends hsp0 {

    /* JADX INFO: renamed from: a */
    public final String f84003a;

    public gsp0(String str) {
        this.f84003a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gsp0) && wj50.m88271j(this.f84003a, ((gsp0) obj).f84003a);
    }

    public final int hashCode() {
        return this.f84003a.hashCode();
    }
}
