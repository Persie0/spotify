package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qkd implements ykd {

    /* JADX INFO: renamed from: a */
    public final String f189535a;

    /* JADX INFO: renamed from: b */
    public final String f189536b;

    public qkd(String str, String str2) {
        this.f189535a = str;
        this.f189536b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkd)) {
            return false;
        }
        qkd qkdVar = (qkd) obj;
        return wj50.m88271j(this.f189535a, qkdVar.f189535a) && wj50.m88271j(this.f189536b, qkdVar.f189536b);
    }

    public final int hashCode() {
        return this.f189536b.hashCode() + (this.f189535a.hashCode() * 31);
    }
}
