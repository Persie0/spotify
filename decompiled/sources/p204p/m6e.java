package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class m6e {

    /* JADX INFO: renamed from: a */
    public final String f140472a;

    /* JADX INFO: renamed from: b */
    public final String f140473b;

    /* JADX INFO: renamed from: c */
    public final String f140474c;

    public m6e(String str, String str2, String str3) {
        this.f140472a = str;
        this.f140473b = str2;
        this.f140474c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6e)) {
            return false;
        }
        m6e m6eVar = (m6e) obj;
        return wj50.m88271j(this.f140472a, m6eVar.f140472a) && wj50.m88271j(this.f140473b, m6eVar.f140473b) && wj50.m88271j(this.f140474c, m6eVar.f140474c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f140472a.hashCode() * 31, 31, this.f140473b);
        String str = this.f140474c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
