package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class c3k {

    /* JADX INFO: renamed from: a */
    public final String f33697a;

    public c3k(String str) {
        this.f33697a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c3k) && wj50.m88271j(this.f33697a, ((c3k) obj).f33697a);
    }

    public final int hashCode() {
        String str = this.f33697a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
