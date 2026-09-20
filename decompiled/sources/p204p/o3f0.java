package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class o3f0 extends r3f0 {

    /* JADX INFO: renamed from: a */
    public final String f161359a;

    public o3f0(String str) {
        this.f161359a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o3f0) && wj50.m88271j(this.f161359a, ((o3f0) obj).f161359a);
    }

    public final int hashCode() {
        return this.f161359a.hashCode();
    }
}
