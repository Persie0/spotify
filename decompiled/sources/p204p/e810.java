package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class e810 extends f810 {

    /* JADX INFO: renamed from: a */
    public final String f57041a;

    public e810(String str) {
        this.f57041a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e810) && wj50.m88271j(this.f57041a, ((e810) obj).f57041a);
    }

    public final int hashCode() {
        return this.f57041a.hashCode();
    }
}
