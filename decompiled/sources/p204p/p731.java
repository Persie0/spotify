package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class p731 implements s731 {

    /* JADX INFO: renamed from: a */
    public final String f174554a;

    public p731(String str) {
        this.f174554a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p731) && wj50.m88271j(this.f174554a, ((p731) obj).f174554a);
    }

    public final int hashCode() {
        return this.f174554a.hashCode();
    }
}
