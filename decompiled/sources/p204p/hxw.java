package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hxw implements z1x {

    /* JADX INFO: renamed from: a */
    public final String f96325a;

    public hxw(String str) {
        this.f96325a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hxw) && wj50.m88271j(this.f96325a, ((hxw) obj).f96325a);
    }

    public final int hashCode() {
        return this.f96325a.hashCode();
    }
}
