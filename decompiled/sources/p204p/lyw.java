package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lyw implements z1x {

    /* JADX INFO: renamed from: a */
    public final String f138124a;

    public lyw(String str) {
        this.f138124a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lyw) && wj50.m88271j(this.f138124a, ((lyw) obj).f138124a);
    }

    public final int hashCode() {
        return this.f138124a.hashCode();
    }
}
