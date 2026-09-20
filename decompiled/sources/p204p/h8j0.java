package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class h8j0 implements j8j0 {

    /* JADX INFO: renamed from: a */
    public final String f88719a;

    public h8j0(String str) {
        this.f88719a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h8j0) && wj50.m88271j(this.f88719a, ((h8j0) obj).f88719a);
    }

    public final int hashCode() {
        return this.f88719a.hashCode();
    }
}
