package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fp50 implements ip50 {

    /* JADX INFO: renamed from: a */
    public final String f71741a;

    public fp50(String str) {
        this.f71741a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fp50) && wj50.m88271j(this.f71741a, ((fp50) obj).f71741a);
    }

    public final int hashCode() {
        return this.f71741a.hashCode();
    }
}
