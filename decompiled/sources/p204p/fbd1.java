package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class fbd1 {

    /* JADX INFO: renamed from: a */
    public final cbd1 f67798a;

    /* JADX INFO: renamed from: b */
    public final String f67799b;

    /* JADX INFO: renamed from: c */
    public final String f67800c;

    /* JADX INFO: renamed from: d */
    public final String f67801d;

    /* JADX INFO: renamed from: e */
    public final String f67802e;

    /* JADX INFO: renamed from: f */
    public final String f67803f;

    /* JADX INFO: renamed from: g */
    public final n6f f67804g;

    public fbd1(cbd1 cbd1Var, String str, String str2, String str3, String str4, String str5, n6f n6fVar) {
        this.f67798a = cbd1Var;
        this.f67799b = str;
        this.f67800c = str2;
        this.f67801d = str3;
        this.f67802e = str4;
        this.f67803f = str5;
        this.f67804g = n6fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbd1)) {
            return false;
        }
        fbd1 fbd1Var = (fbd1) obj;
        return wj50.m88271j(this.f67798a, fbd1Var.f67798a) && wj50.m88271j(this.f67799b, fbd1Var.f67799b) && wj50.m88271j(this.f67800c, fbd1Var.f67800c) && wj50.m88271j(this.f67801d, fbd1Var.f67801d) && wj50.m88271j(this.f67802e, fbd1Var.f67802e) && wj50.m88271j(this.f67803f, fbd1Var.f67803f) && wj50.m88271j(this.f67804g, fbd1Var.f67804g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f67798a.hashCode() * 31, 31, this.f67799b), 31, this.f67800c), 31, this.f67801d), 31, this.f67802e), 31, this.f67803f);
        n6f n6fVar = this.f67804g;
        return iM77243b + (n6fVar == null ? 0 : as91.m27075c(n6fVar.f150873a));
    }

    public /* synthetic */ fbd1(cbd1 cbd1Var, String str, String str2, String str3, String str4, String str5, int i) {
        this(cbd1Var, str, (i & 4) != 0 ? "" : str2, str3, str4, (i & 32) != 0 ? UUID.randomUUID().toString() : str5, (n6f) null);
    }
}
