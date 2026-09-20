package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class b1x implements x2x {

    /* JADX INFO: renamed from: a */
    public final String f22431a;

    public b1x(String str) {
        this.f22431a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1x) && wj50.m88271j(this.f22431a, ((b1x) obj).f22431a);
    }

    public final int hashCode() {
        return this.f22431a.hashCode();
    }
}
