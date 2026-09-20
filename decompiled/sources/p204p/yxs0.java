package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yxs0 implements ays0 {

    /* JADX INFO: renamed from: a */
    public final String f277317a;

    public yxs0(String str) {
        this.f277317a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yxs0) && wj50.m88271j(this.f277317a, ((yxs0) obj).f277317a);
    }

    public final int hashCode() {
        String str = this.f277317a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
