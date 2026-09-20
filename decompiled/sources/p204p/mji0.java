package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mji0 implements nji0 {

    /* JADX INFO: renamed from: a */
    public final String f144279a;

    public mji0(String str) {
        this.f144279a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mji0) && wj50.m88271j(this.f144279a, ((mji0) obj).f144279a);
    }

    public final int hashCode() {
        return this.f144279a.hashCode();
    }
}
