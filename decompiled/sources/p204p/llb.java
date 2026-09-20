package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class llb implements mlb {

    /* JADX INFO: renamed from: a */
    public final String f134606a;

    /* JADX INFO: renamed from: b */
    public final String f134607b;

    public llb(String str, String str2) {
        this.f134606a = str;
        this.f134607b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m59304a() {
        return this.f134607b;
    }

    /* JADX INFO: renamed from: b */
    public final String m59305b() {
        return this.f134606a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llb)) {
            return false;
        }
        llb llbVar = (llb) obj;
        return wj50.m88271j(this.f134606a, llbVar.f134606a) && wj50.m88271j(this.f134607b, llbVar.f134607b);
    }

    public final int hashCode() {
        return this.f134607b.hashCode() + (this.f134606a.hashCode() * 31);
    }
}
