package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class v4x {

    /* JADX INFO: renamed from: a */
    public final String f237254a;

    /* JADX INFO: renamed from: b */
    public final String f237255b;

    /* JADX INFO: renamed from: c */
    public final String f237256c;

    /* JADX INFO: renamed from: d */
    public final String f237257d;

    public v4x(String str, String str2, String str3, String str4) {
        this.f237254a = str;
        this.f237255b = str2;
        this.f237256c = str3;
        this.f237257d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4x)) {
            return false;
        }
        v4x v4xVar = (v4x) obj;
        return wj50.m88271j(this.f237254a, v4xVar.f237254a) && wj50.m88271j(this.f237255b, v4xVar.f237255b) && wj50.m88271j(this.f237256c, v4xVar.f237256c) && wj50.m88271j(this.f237257d, v4xVar.f237257d);
    }

    public final int hashCode() {
        return this.f237257d.hashCode() + s571.m77243b(s571.m77243b(this.f237254a.hashCode() * 31, 31, this.f237255b), 31, this.f237256c);
    }
}
