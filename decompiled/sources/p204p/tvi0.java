package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class tvi0 {

    /* JADX INFO: renamed from: a */
    public final String f224172a;

    /* JADX INFO: renamed from: b */
    public final String f224173b;

    /* JADX INFO: renamed from: c */
    public final String f224174c;

    /* JADX INFO: renamed from: d */
    public final String f224175d;

    /* JADX INFO: renamed from: e */
    public final String f224176e;

    /* JADX INFO: renamed from: f */
    public final String f224177f;

    public tvi0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f224172a = str;
        this.f224173b = str2;
        this.f224174c = str3;
        this.f224175d = str4;
        this.f224176e = str5;
        this.f224177f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvi0)) {
            return false;
        }
        tvi0 tvi0Var = (tvi0) obj;
        return wj50.m88271j(this.f224172a, tvi0Var.f224172a) && wj50.m88271j(this.f224173b, tvi0Var.f224173b) && wj50.m88271j(this.f224174c, tvi0Var.f224174c) && wj50.m88271j(this.f224175d, tvi0Var.f224175d) && wj50.m88271j(this.f224176e, tvi0Var.f224176e) && wj50.m88271j(this.f224177f, tvi0Var.f224177f);
    }

    public final int hashCode() {
        return this.f224177f.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f224172a.hashCode() * 31, 31, this.f224173b), 31, this.f224174c), 31, this.f224175d), 31, this.f224176e);
    }
}
