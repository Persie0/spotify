package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class w510 extends v510 {

    /* JADX INFO: renamed from: a */
    public final String f247959a;

    /* JADX INFO: renamed from: b */
    public final String f247960b;

    /* JADX INFO: renamed from: c */
    public final boolean f247961c;

    /* JADX INFO: renamed from: d */
    public final String f247962d;

    /* JADX INFO: renamed from: e */
    public final String f247963e;

    /* JADX INFO: renamed from: f */
    public final String f247964f;

    public w510(String str, String str2, String str3, String str4, boolean z, String str5) {
        this.f247959a = str;
        this.f247960b = str2;
        this.f247961c = z;
        this.f247962d = str3;
        this.f247963e = str4;
        this.f247964f = str5;
    }

    @Override // p204p.v510
    /* JADX INFO: renamed from: a */
    public final String mo84671a() {
        return this.f247960b;
    }

    @Override // p204p.v510
    /* JADX INFO: renamed from: b */
    public final String mo84672b() {
        return this.f247959a;
    }

    @Override // p204p.v510
    /* JADX INFO: renamed from: c */
    public final boolean mo84673c() {
        return this.f247961c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w510)) {
            return false;
        }
        w510 w510Var = (w510) obj;
        return wj50.m88271j(this.f247959a, w510Var.f247959a) && wj50.m88271j(this.f247960b, w510Var.f247960b) && this.f247961c == w510Var.f247961c && wj50.m88271j(this.f247962d, w510Var.f247962d) && wj50.m88271j(this.f247963e, w510Var.f247963e) && wj50.m88271j(this.f247964f, w510Var.f247964f);
    }

    public final int hashCode() {
        return this.f247964f.hashCode() + s571.m77243b(s571.m77243b(s571.m77245d(s571.m77243b(this.f247959a.hashCode() * 31, 31, this.f247960b), 31, this.f247961c), 31, this.f247962d), 31, this.f247963e);
    }
}
