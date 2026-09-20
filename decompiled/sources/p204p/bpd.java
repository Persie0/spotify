package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bpd implements jpd {

    /* JADX INFO: renamed from: a */
    public final String f29413a;

    /* JADX INFO: renamed from: b */
    public final String f29414b;

    public bpd(String str, String str2) {
        this.f29413a = str;
        this.f29414b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpd)) {
            return false;
        }
        bpd bpdVar = (bpd) obj;
        return wj50.m88271j(this.f29413a, bpdVar.f29413a) && wj50.m88271j(this.f29414b, bpdVar.f29414b);
    }

    public final int hashCode() {
        return this.f29414b.hashCode() + (this.f29413a.hashCode() * 31);
    }
}
