package p204p;

/* JADX INFO: loaded from: classes7.dex */
@rtz0
public final class p180 {
    public static final o180 Companion = new o180();

    /* JADX INFO: renamed from: a */
    public final String f172973a;

    /* JADX INFO: renamed from: b */
    public final String f172974b;

    /* JADX INFO: renamed from: c */
    public final String f172975c;

    /* JADX INFO: renamed from: d */
    public final String f172976d;

    /* JADX INFO: renamed from: e */
    public final String f172977e;

    /* JADX INFO: renamed from: f */
    public final String f172978f;

    /* JADX INFO: renamed from: g */
    public final String f172979g;

    /* JADX INFO: renamed from: h */
    public final String f172980h;

    /* JADX INFO: renamed from: i */
    public final lt81 f172981i;

    /* JADX INFO: renamed from: j */
    public final String f172982j;

    /* JADX INFO: renamed from: k */
    public final uul f172983k;

    /* JADX INFO: renamed from: l */
    public final String f172984l;

    public /* synthetic */ p180(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, lt81 lt81Var, String str9, uul uulVar, String str10) {
        if ((i & 1) == 0) {
            this.f172973a = "";
        } else {
            this.f172973a = str;
        }
        if ((i & 2) == 0) {
            this.f172974b = "";
        } else {
            this.f172974b = str2;
        }
        if ((i & 4) == 0) {
            this.f172975c = "";
        } else {
            this.f172975c = str3;
        }
        if ((i & 8) == 0) {
            this.f172976d = "";
        } else {
            this.f172976d = str4;
        }
        if ((i & 16) == 0) {
            this.f172977e = "";
        } else {
            this.f172977e = str5;
        }
        if ((i & 32) == 0) {
            this.f172978f = "";
        } else {
            this.f172978f = str6;
        }
        if ((i & 64) == 0) {
            this.f172979g = "";
        } else {
            this.f172979g = str7;
        }
        if ((i & 128) == 0) {
            this.f172980h = "";
        } else {
            this.f172980h = str8;
        }
        if ((i & 256) == 0) {
            this.f172981i = null;
        } else {
            this.f172981i = lt81Var;
        }
        if ((i & 512) == 0) {
            this.f172982j = "";
        } else {
            this.f172982j = str9;
        }
        if ((i & 1024) == 0) {
            this.f172983k = null;
        } else {
            this.f172983k = uulVar;
        }
        if ((i & 2048) == 0) {
            this.f172984l = "";
        } else {
            this.f172984l = str10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p180)) {
            return false;
        }
        p180 p180Var = (p180) obj;
        return wj50.m88271j(this.f172973a, p180Var.f172973a) && wj50.m88271j(this.f172974b, p180Var.f172974b) && wj50.m88271j(this.f172975c, p180Var.f172975c) && wj50.m88271j(this.f172976d, p180Var.f172976d) && wj50.m88271j(this.f172977e, p180Var.f172977e) && wj50.m88271j(this.f172978f, p180Var.f172978f) && wj50.m88271j(this.f172979g, p180Var.f172979g) && wj50.m88271j(this.f172980h, p180Var.f172980h) && wj50.m88271j(this.f172981i, p180Var.f172981i) && wj50.m88271j(this.f172982j, p180Var.f172982j) && wj50.m88271j(this.f172983k, p180Var.f172983k) && wj50.m88271j(this.f172984l, p180Var.f172984l);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f172973a.hashCode() * 31, 31, this.f172974b), 31, this.f172975c), 31, this.f172976d), 31, this.f172977e), 31, this.f172978f), 31, this.f172979g), 31, this.f172980h);
        lt81 lt81Var = this.f172981i;
        int iM77243b2 = s571.m77243b((iM77243b + (lt81Var == null ? 0 : lt81Var.hashCode())) * 31, 31, this.f172982j);
        uul uulVar = this.f172983k;
        return this.f172984l.hashCode() + ((iM77243b2 + (uulVar != null ? uulVar.hashCode() : 0)) * 31);
    }
}
