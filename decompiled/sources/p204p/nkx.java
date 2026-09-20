package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class nkx {

    /* JADX INFO: renamed from: a */
    public final String f154962a;

    public nkx(String str) {
        this.f154962a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nkx) && wj50.m88271j(this.f154962a, ((nkx) obj).f154962a);
    }

    public final int hashCode() {
        String str = this.f154962a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
