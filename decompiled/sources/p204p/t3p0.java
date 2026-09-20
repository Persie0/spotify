package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class t3p0 implements u3p0 {

    /* JADX INFO: renamed from: a */
    public final String f216821a;

    public t3p0(String str) {
        this.f216821a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t3p0) && wj50.m88271j(this.f216821a, ((t3p0) obj).f216821a);
    }

    public final int hashCode() {
        return this.f216821a.hashCode();
    }
}
