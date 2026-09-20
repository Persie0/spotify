package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zi31 implements bj31 {

    /* JADX INFO: renamed from: a */
    public final String f283073a;

    public zi31(String str) {
        this.f283073a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zi31) && wj50.m88271j(this.f283073a, ((zi31) obj).f283073a);
    }

    public final int hashCode() {
        String str = this.f283073a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
