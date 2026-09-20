package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wlt implements omt {

    /* JADX INFO: renamed from: a */
    public final String f252615a;

    public wlt(String str) {
        this.f252615a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wlt) && wj50.m88271j(this.f252615a, ((wlt) obj).f252615a);
    }

    public final int hashCode() {
        return this.f252615a.hashCode();
    }
}
