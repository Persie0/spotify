package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kff implements lff {

    /* JADX INFO: renamed from: a */
    public final String f122156a;

    /* JADX INFO: renamed from: b */
    public final String f122157b;

    /* JADX INFO: renamed from: c */
    public final String f122158c;

    /* JADX INFO: renamed from: d */
    public final boolean f122159d;

    public /* synthetic */ kff() {
        this("", "", "", false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kff)) {
            return false;
        }
        kff kffVar = (kff) obj;
        return wj50.m88271j(this.f122156a, kffVar.f122156a) && wj50.m88271j(this.f122157b, kffVar.f122157b) && wj50.m88271j(this.f122158c, kffVar.f122158c) && this.f122159d == kffVar.f122159d;
    }

    @Override // p204p.lff
    public final String getName() {
        return this.f122156a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f122159d) + s571.m77243b(s571.m77243b(this.f122156a.hashCode() * 31, 31, this.f122157b), 31, this.f122158c);
    }

    public kff(String str, String str2, String str3, boolean z) {
        this.f122156a = str;
        this.f122157b = str2;
        this.f122158c = str3;
        this.f122159d = z;
    }
}
