package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class byu0 implements cyu0 {

    /* JADX INFO: renamed from: a */
    public final String f32323a;

    public byu0(String str) {
        this.f32323a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof byu0) && wj50.m88271j(this.f32323a, ((byu0) obj).f32323a);
    }

    public final int hashCode() {
        return this.f32323a.hashCode();
    }
}
