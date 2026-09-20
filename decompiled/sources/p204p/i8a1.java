package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i8a1 implements j8a1 {

    /* JADX INFO: renamed from: a */
    public final String f99751a;

    public i8a1(String str) {
        this.f99751a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i8a1) && wj50.m88271j(this.f99751a, ((i8a1) obj).f99751a);
    }

    public final int hashCode() {
        return this.f99751a.hashCode();
    }
}
