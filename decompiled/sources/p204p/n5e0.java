package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class n5e0 {

    /* JADX INFO: renamed from: a */
    public final String f150532a;

    /* JADX INFO: renamed from: b */
    public final String f150533b;

    /* JADX INFO: renamed from: c */
    public final un20 f150534c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f150535d;

    /* JADX INFO: renamed from: e */
    public final boolean f150536e;

    /* JADX INFO: renamed from: f */
    public final String f150537f;

    public n5e0(String str, String str2, un20 un20Var, ArrayList arrayList, boolean z, String str3) {
        this.f150532a = str;
        this.f150533b = str2;
        this.f150534c = un20Var;
        this.f150535d = arrayList;
        this.f150536e = z;
        this.f150537f = str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m63719a() {
        return this.f150533b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5e0)) {
            return false;
        }
        n5e0 n5e0Var = (n5e0) obj;
        return wj50.m88271j(this.f150532a, n5e0Var.f150532a) && wj50.m88271j(this.f150533b, n5e0Var.f150533b) && wj50.m88271j(this.f150534c, n5e0Var.f150534c) && wj50.m88271j(this.f150535d, n5e0Var.f150535d) && this.f150536e == n5e0Var.f150536e && wj50.m88271j(this.f150537f, n5e0Var.f150537f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f150532a.hashCode() * 31, 31, this.f150533b);
        un20 un20Var = this.f150534c;
        int iM77245d = s571.m77245d(lq51.m59700f(this.f150535d, (iM77243b + (un20Var == null ? 0 : un20Var.hashCode())) * 31, 31), 31, this.f150536e);
        String str = this.f150537f;
        return iM77245d + (str != null ? str.hashCode() : 0);
    }

    public /* synthetic */ n5e0(String str, String str2, rzd1 rzd1Var, ArrayList arrayList, String str3, int i) {
        this(str, str2, rzd1Var, arrayList, (i & 16) == 0, (i & 32) != 0 ? null : str3);
    }
}
