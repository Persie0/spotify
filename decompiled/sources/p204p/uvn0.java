package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class uvn0 {

    /* JADX INFO: renamed from: a */
    public final String f234475a;

    /* JADX INFO: renamed from: b */
    public final String f234476b;

    /* JADX INFO: renamed from: c */
    public final String f234477c;

    /* JADX INFO: renamed from: d */
    public final String f234478d;

    /* JADX INFO: renamed from: e */
    public final String f234479e;

    /* JADX INFO: renamed from: f */
    public final String f234480f;

    public uvn0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f234475a = str;
        this.f234476b = str2;
        this.f234477c = str3;
        this.f234478d = str4;
        this.f234479e = str5;
        this.f234480f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvn0)) {
            return false;
        }
        uvn0 uvn0Var = (uvn0) obj;
        return wj50.m88271j(this.f234475a, uvn0Var.f234475a) && wj50.m88271j(this.f234476b, uvn0Var.f234476b) && wj50.m88271j(this.f234477c, uvn0Var.f234477c) && wj50.m88271j(this.f234478d, uvn0Var.f234478d) && wj50.m88271j(this.f234479e, uvn0Var.f234479e) && wj50.m88271j(this.f234480f, uvn0Var.f234480f);
    }

    public final int hashCode() {
        return this.f234480f.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f234475a.hashCode() * 31, 31, this.f234476b), 31, this.f234477c), 31, this.f234478d), 31, this.f234479e);
    }
}
