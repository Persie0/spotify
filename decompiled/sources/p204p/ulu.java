package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ulu extends vlu {

    /* JADX INFO: renamed from: a */
    public final String f231642a;

    /* JADX INFO: renamed from: b */
    public final String f231643b;

    /* JADX INFO: renamed from: c */
    public final String f231644c;

    public ulu(String str, String str2, String str3) {
        this.f231642a = str;
        this.f231643b = str2;
        this.f231644c = str3;
    }

    @Override // p204p.vlu
    /* JADX INFO: renamed from: a */
    public final String mo81070a() {
        return this.f231644c;
    }

    @Override // p204p.vlu
    /* JADX INFO: renamed from: b */
    public final String mo81071b() {
        return this.f231642a;
    }

    @Override // p204p.vlu
    /* JADX INFO: renamed from: c */
    public final String mo81072c() {
        return this.f231643b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ulu)) {
            return false;
        }
        ulu uluVar = (ulu) obj;
        return wj50.m88271j(this.f231642a, uluVar.f231642a) && wj50.m88271j(this.f231643b, uluVar.f231643b) && wj50.m88271j(this.f231644c, uluVar.f231644c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f231642a.hashCode() * 31, 31, this.f231643b);
        String str = this.f231644c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
