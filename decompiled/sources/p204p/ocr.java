package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ocr implements qcr {

    /* JADX INFO: renamed from: a */
    public final String f163974a;

    /* JADX INFO: renamed from: b */
    public final String f163975b;

    /* JADX INFO: renamed from: c */
    public final String f163976c;

    /* JADX INFO: renamed from: d */
    public final String f163977d;

    /* JADX INFO: renamed from: e */
    public final xfr f163978e;

    /* JADX INFO: renamed from: f */
    public final boolean f163979f;

    /* JADX INFO: renamed from: g */
    public final int f163980g;

    public ocr(String str, String str2, String str3, String str4, xfr xfrVar, boolean z, int i) {
        this.f163974a = str;
        this.f163975b = str2;
        this.f163976c = str3;
        this.f163977d = str4;
        this.f163978e = xfrVar;
        this.f163979f = z;
        this.f163980g = i;
    }

    @Override // p204p.qcr
    /* JADX INFO: renamed from: a */
    public final int mo66722a() {
        return this.f163980g;
    }

    @Override // p204p.qcr
    /* JADX INFO: renamed from: b */
    public final String mo66723b() {
        return this.f163976c;
    }

    @Override // p204p.qcr
    /* JADX INFO: renamed from: c */
    public final boolean mo66724c() {
        return this.f163979f;
    }

    @Override // p204p.qcr
    /* JADX INFO: renamed from: d */
    public final String mo66725d() {
        return this.f163974a;
    }

    @Override // p204p.qcr
    /* JADX INFO: renamed from: e */
    public final String mo66726e() {
        return this.f163975b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocr)) {
            return false;
        }
        ocr ocrVar = (ocr) obj;
        return wj50.m88271j(this.f163974a, ocrVar.f163974a) && wj50.m88271j(this.f163975b, ocrVar.f163975b) && wj50.m88271j(this.f163976c, ocrVar.f163976c) && wj50.m88271j(this.f163977d, ocrVar.f163977d) && this.f163978e == ocrVar.f163978e && this.f163979f == ocrVar.f163979f && this.f163980g == ocrVar.f163980g;
    }

    @Override // p204p.qcr
    public final String getName() {
        return this.f163977d;
    }

    @Override // p204p.qcr
    public final xfr getType() {
        return this.f163978e;
    }

    public final int hashCode() {
        return edb.m38547C(this.f163980g) + s571.m77245d((this.f163978e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f163974a.hashCode() * 31, 31, this.f163975b), 31, this.f163976c), 31, this.f163977d)) * 31, 31, this.f163979f);
    }
}
