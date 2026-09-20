package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jdd implements qdd {

    /* JADX INFO: renamed from: a */
    public final String f111329a;

    public jdd(String str) {
        this.f111329a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jdd) && wj50.m88271j(this.f111329a, ((jdd) obj).f111329a);
    }

    public final int hashCode() {
        return this.f111329a.hashCode();
    }
}
