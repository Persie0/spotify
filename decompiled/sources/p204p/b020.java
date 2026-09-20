package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class b020 {

    /* JADX INFO: renamed from: a */
    public final String f21726a;

    /* JADX INFO: renamed from: b */
    public final String f21727b;

    /* JADX INFO: renamed from: c */
    public final boolean f21728c;

    /* JADX INFO: renamed from: d */
    public final boolean f21729d;

    /* JADX INFO: renamed from: e */
    public final int f21730e;

    public b020(int i, String str, String str2, boolean z, boolean z2) {
        this.f21726a = str;
        this.f21727b = str2;
        this.f21728c = z;
        this.f21729d = z2;
        this.f21730e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b020)) {
            return false;
        }
        b020 b020Var = (b020) obj;
        return wj50.m88271j(this.f21726a, b020Var.f21726a) && wj50.m88271j(this.f21727b, b020Var.f21727b) && this.f21728c == b020Var.f21728c && this.f21729d == b020Var.f21729d && this.f21730e == b020Var.f21730e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21730e) + s571.m77245d(s571.m77245d(s571.m77243b(this.f21726a.hashCode() * 31, 31, this.f21727b), 31, this.f21728c), 31, this.f21729d);
    }
}
