package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ph31 implements mi31 {

    /* JADX INFO: renamed from: a */
    public final String f177465a;

    public ph31(String str) {
        this.f177465a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ph31) && wj50.m88271j(this.f177465a, ((ph31) obj).f177465a);
    }

    public final int hashCode() {
        return this.f177465a.hashCode();
    }
}
