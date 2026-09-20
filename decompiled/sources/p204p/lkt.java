package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class lkt implements nkt {

    /* JADX INFO: renamed from: a */
    public final String f134442a;

    /* JADX INFO: renamed from: b */
    public final String f134443b;

    /* JADX INFO: renamed from: c */
    public final int f134444c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f134445d;

    public lkt(String str, String str2, int i, LinkedHashMap linkedHashMap) {
        this.f134442a = str;
        this.f134443b = str2;
        this.f134444c = i;
        this.f134445d = linkedHashMap;
    }

    @Override // p204p.nkt
    /* JADX INFO: renamed from: a */
    public final int mo56738a() {
        return this.f134444c;
    }

    @Override // p204p.nkt
    /* JADX INFO: renamed from: b */
    public final String mo56739b() {
        return this.f134442a;
    }

    @Override // p204p.nkt
    /* JADX INFO: renamed from: c */
    public final String mo56740c() {
        return this.f134443b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkt)) {
            return false;
        }
        lkt lktVar = (lkt) obj;
        return this.f134442a.equals(lktVar.f134442a) && this.f134443b.equals(lktVar.f134443b) && this.f134444c == lktVar.f134444c && this.f134445d.equals(lktVar.f134445d);
    }

    public final int hashCode() {
        return this.f134445d.hashCode() + mt60.m62800g(this.f134444c, s571.m77243b(this.f134442a.hashCode() * 31, 31, this.f134443b), 31);
    }
}
