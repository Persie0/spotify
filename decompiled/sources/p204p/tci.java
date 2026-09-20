package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tci implements wci {

    /* JADX INFO: renamed from: a */
    public final String f219088a;

    /* JADX INFO: renamed from: b */
    public final String f219089b;

    public tci(String str, String str2) {
        this.f219088a = str;
        this.f219089b = str2;
    }

    @Override // p204p.wci
    /* JADX INFO: renamed from: a */
    public final String mo80473a() {
        return this.f219088a;
    }

    @Override // p204p.wci
    /* JADX INFO: renamed from: b */
    public final String mo80474b() {
        return this.f219089b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tci)) {
            return false;
        }
        tci tciVar = (tci) obj;
        return wj50.m88271j(this.f219088a, tciVar.f219088a) && wj50.m88271j(this.f219089b, tciVar.f219089b);
    }

    public final int hashCode() {
        return this.f219089b.hashCode() + (this.f219088a.hashCode() * 31);
    }
}
