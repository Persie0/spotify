package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class o161 implements p161 {

    /* JADX INFO: renamed from: a */
    public final String f160629a;

    /* JADX INFO: renamed from: b */
    public final String f160630b;

    public o161(String str, String str2) {
        this.f160629a = str;
        this.f160630b = str2;
    }

    @Override // p204p.p161
    /* JADX INFO: renamed from: a */
    public final String mo46408a() {
        return this.f160630b;
    }

    @Override // p204p.p161
    /* JADX INFO: renamed from: b */
    public final String mo46409b() {
        return this.f160629a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o161)) {
            return false;
        }
        o161 o161Var = (o161) obj;
        return wj50.m88271j(this.f160629a, o161Var.f160629a) && wj50.m88271j(this.f160630b, o161Var.f160630b);
    }

    public final int hashCode() {
        return this.f160630b.hashCode() + (this.f160629a.hashCode() * 31);
    }
}
