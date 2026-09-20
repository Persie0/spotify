package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class iq50 implements vq50 {

    /* JADX INFO: renamed from: a */
    public final String f104633a;

    /* JADX INFO: renamed from: b */
    public final String f104634b;

    /* JADX INFO: renamed from: c */
    public final String f104635c;

    /* JADX INFO: renamed from: d */
    public final String f104636d;

    /* JADX INFO: renamed from: e */
    public final String f104637e;

    public iq50(String str, String str2, String str3, String str4, String str5) {
        this.f104633a = str;
        this.f104634b = str2;
        this.f104635c = str3;
        this.f104636d = str4;
        this.f104637e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq50)) {
            return false;
        }
        iq50 iq50Var = (iq50) obj;
        return this.f104633a.equals(iq50Var.f104633a) && this.f104634b.equals(iq50Var.f104634b) && this.f104635c.equals(iq50Var.f104635c) && wj50.m88271j(this.f104636d, iq50Var.f104636d) && wj50.m88271j(this.f104637e, iq50Var.f104637e);
    }

    @Override // p204p.vq50
    public final String getTitle() {
        return this.f104636d;
    }

    public final int hashCode() {
        return this.f104637e.hashCode() + s571.m77243b(s571.m77245d(s571.m77243b(s571.m77243b(this.f104633a.hashCode() * 31, 31, this.f104634b), 31, this.f104635c), 31, false), 31, this.f104636d);
    }

    @Override // p204p.vq50
    /* JADX INFO: renamed from: o */
    public final String mo45408o() {
        return this.f104637e;
    }
}
