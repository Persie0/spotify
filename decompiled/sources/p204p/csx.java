package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class csx implements fsx {

    /* JADX INFO: renamed from: a */
    public final long f41712a;

    /* JADX INFO: renamed from: b */
    public final String f41713b;

    /* JADX INFO: renamed from: c */
    public final qrx f41714c;

    /* JADX INFO: renamed from: d */
    public final boolean f41715d;

    public csx(long j, String str, qrx qrxVar, boolean z) {
        this.f41712a = j;
        this.f41713b = str;
        this.f41714c = qrxVar;
        this.f41715d = z;
    }

    @Override // p204p.fsx
    /* JADX INFO: renamed from: a */
    public final qrx mo33784a() {
        return this.f41714c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csx)) {
            return false;
        }
        csx csxVar = (csx) obj;
        return this.f41712a == csxVar.f41712a && wj50.m88271j(this.f41713b, csxVar.f41713b) && wj50.m88271j(this.f41714c, csxVar.f41714c) && this.f41715d == csxVar.f41715d;
    }

    @Override // p204p.fsx
    public final String getEntityUri() {
        return this.f41713b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f41715d) + ((this.f41714c.hashCode() + s571.m77243b(Long.hashCode(this.f41712a) * 31, 31, this.f41713b)) * 31);
    }
}
