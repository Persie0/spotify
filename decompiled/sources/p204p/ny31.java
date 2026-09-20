package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ny31 implements oy31 {

    /* JADX INFO: renamed from: a */
    public final String f159698a;

    public ny31(String str) {
        this.f159698a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ny31) && wj50.m88271j(this.f159698a, ((ny31) obj).f159698a);
    }

    public final int hashCode() {
        return this.f159698a.hashCode();
    }
}
