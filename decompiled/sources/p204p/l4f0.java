package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class l4f0 extends n4f0 {

    /* JADX INFO: renamed from: a */
    public final String f129674a;

    public l4f0(String str) {
        this.f129674a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l4f0) && wj50.m88271j(this.f129674a, ((l4f0) obj).f129674a);
    }

    public final int hashCode() {
        return this.f129674a.hashCode();
    }
}
