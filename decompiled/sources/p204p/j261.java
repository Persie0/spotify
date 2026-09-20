package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class j261 implements k261 {

    /* JADX INFO: renamed from: a */
    public final String f107937a;

    public j261(String str) {
        this.f107937a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j261) && wj50.m88271j(this.f107937a, ((j261) obj).f107937a);
    }

    public final int hashCode() {
        return this.f107937a.hashCode();
    }
}
