package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dl20 {

    /* JADX INFO: renamed from: a */
    public final c7i f50096a;

    /* JADX INFO: renamed from: b */
    public final String f50097b;

    /* JADX INFO: renamed from: c */
    public final String f50098c;

    /* JADX INFO: renamed from: d */
    public final String f50099d;

    /* JADX INFO: renamed from: e */
    public final boolean f50100e;

    /* JADX INFO: renamed from: f */
    public final boolean f50101f;

    /* JADX INFO: renamed from: g */
    public final boolean f50102g;

    /* JADX INFO: renamed from: h */
    public final boolean f50103h;

    /* JADX INFO: renamed from: i */
    public final Integer f50104i;

    public dl20(c7i c7iVar, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, Integer num) {
        this.f50096a = c7iVar;
        this.f50097b = str;
        this.f50098c = str2;
        this.f50099d = str3;
        this.f50100e = z;
        this.f50101f = z2;
        this.f50102g = z3;
        this.f50103h = z4;
        this.f50104i = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl20)) {
            return false;
        }
        dl20 dl20Var = (dl20) obj;
        return wj50.m88271j(this.f50096a, dl20Var.f50096a) && wj50.m88271j(this.f50097b, dl20Var.f50097b) && wj50.m88271j(this.f50098c, dl20Var.f50098c) && wj50.m88271j(this.f50099d, dl20Var.f50099d) && this.f50100e == dl20Var.f50100e && this.f50101f == dl20Var.f50101f && this.f50102g == dl20Var.f50102g && this.f50103h == dl20Var.f50103h && wj50.m88271j(this.f50104i, dl20Var.f50104i);
    }

    public final int hashCode() {
        c7i c7iVar = this.f50096a;
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b((c7iVar == null ? 0 : c7iVar.hashCode()) * 31, 31, this.f50097b), 31, this.f50098c), 31, this.f50099d), 31, this.f50100e), 31, this.f50101f), 31, this.f50102g), 31, this.f50103h);
        Integer num = this.f50104i;
        return iM77245d + (num != null ? num.hashCode() : 0);
    }
}
