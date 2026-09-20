package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class s1o0 implements w1o0 {

    /* JADX INFO: renamed from: a */
    public final String f204774a;

    public s1o0(String str) {
        this.f204774a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s1o0) && wj50.m88271j(this.f204774a, ((s1o0) obj).f204774a);
    }

    public final int hashCode() {
        return this.f204774a.hashCode();
    }
}
