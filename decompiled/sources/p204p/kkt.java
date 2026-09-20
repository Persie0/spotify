package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kkt implements nkt {

    /* JADX INFO: renamed from: a */
    public final String f123701a;

    /* JADX INFO: renamed from: b */
    public final String f123702b;

    /* JADX INFO: renamed from: c */
    public final int f123703c;

    public kkt(String str, String str2, int i) {
        this.f123701a = str;
        this.f123702b = str2;
        this.f123703c = i;
    }

    @Override // p204p.nkt
    /* JADX INFO: renamed from: a */
    public final int mo56738a() {
        return this.f123703c;
    }

    @Override // p204p.nkt
    /* JADX INFO: renamed from: b */
    public final String mo56739b() {
        return this.f123701a;
    }

    @Override // p204p.nkt
    /* JADX INFO: renamed from: c */
    public final String mo56740c() {
        return this.f123702b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkt)) {
            return false;
        }
        kkt kktVar = (kkt) obj;
        return wj50.m88271j(this.f123701a, kktVar.f123701a) && wj50.m88271j(this.f123702b, kktVar.f123702b) && this.f123703c == kktVar.f123703c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f123703c) + s571.m77243b(this.f123701a.hashCode() * 31, 31, this.f123702b);
    }
}
