package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jbe0 implements lbe0 {

    /* JADX INFO: renamed from: a */
    public final String f110751a;

    public jbe0(String str) {
        this.f110751a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jbe0) && wj50.m88271j(this.f110751a, ((jbe0) obj).f110751a);
    }

    public final int hashCode() {
        return this.f110751a.hashCode();
    }
}
