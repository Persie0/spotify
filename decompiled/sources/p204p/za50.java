package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class za50 {

    /* JADX INFO: renamed from: a */
    public final String f280984a;

    public za50(String str) {
        this.f280984a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof za50) && wj50.m88271j(this.f280984a, ((za50) obj).f280984a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + s571.m77245d(this.f280984a.hashCode() * 31, 31, false);
    }
}
