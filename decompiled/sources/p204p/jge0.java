package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jge0 implements lge0 {

    /* JADX INFO: renamed from: a */
    public final String f112176a;

    public jge0(String str) {
        this.f112176a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jge0) && wj50.m88271j(this.f112176a, ((jge0) obj).f112176a);
    }

    public final int hashCode() {
        return this.f112176a.hashCode();
    }
}
