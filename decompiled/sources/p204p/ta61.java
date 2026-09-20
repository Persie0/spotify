package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ta61 {

    /* JADX INFO: renamed from: k */
    public static final ta61 f218465k = new ta61("", lau.f131415a, qa61.f186765a, 0, null, null, null);

    /* JADX INFO: renamed from: a */
    public final String f218466a;

    /* JADX INFO: renamed from: b */
    public final List f218467b;

    /* JADX INFO: renamed from: c */
    public final sa61 f218468c;

    /* JADX INFO: renamed from: d */
    public final int f218469d;

    /* JADX INFO: renamed from: e */
    public final int f218470e;

    /* JADX INFO: renamed from: f */
    public final String f218471f;

    /* JADX INFO: renamed from: g */
    public final String f218472g;

    /* JADX INFO: renamed from: h */
    public final String f218473h;

    /* JADX INFO: renamed from: i */
    public final boolean f218474i;

    /* JADX INFO: renamed from: j */
    public final boolean f218475j;

    public ta61(String str, List list, sa61 sa61Var, int i, int i2, String str2, String str3, String str4, boolean z, boolean z2) {
        this.f218466a = str;
        this.f218467b = list;
        this.f218468c = sa61Var;
        this.f218469d = i;
        this.f218470e = i2;
        this.f218471f = str2;
        this.f218472g = str3;
        this.f218473h = str4;
        this.f218474i = z;
        this.f218475j = z2;
    }

    /* JADX INFO: renamed from: a */
    public static ta61 m80334a(ta61 ta61Var, ArrayList arrayList, int i, boolean z, int i2) {
        String str = ta61Var.f218466a;
        List list = arrayList;
        if ((i2 & 2) != 0) {
            list = ta61Var.f218467b;
        }
        List list2 = list;
        sa61 sa61Var = (i2 & 4) != 0 ? ta61Var.f218468c : ra61.f197209a;
        if ((i2 & 8) != 0) {
            i = ta61Var.f218469d;
        }
        int i3 = i;
        int i4 = ta61Var.f218470e;
        String str2 = ta61Var.f218471f;
        String str3 = ta61Var.f218472g;
        String str4 = ta61Var.f218473h;
        boolean z2 = (i2 & 256) != 0 ? ta61Var.f218474i : true;
        if ((i2 & 512) != 0) {
            z = ta61Var.f218475j;
        }
        ta61Var.getClass();
        return new ta61(str, list2, sa61Var, i3, i4, str2, str3, str4, z2, z);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:40:0x0066  */
    public final boolean equals(Object obj) {
        boolean zM88271j;
        boolean zM88271j2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta61)) {
            return false;
        }
        ta61 ta61Var = (ta61) obj;
        if (!wj50.m88271j(this.f218466a, ta61Var.f218466a) || !wj50.m88271j(this.f218467b, ta61Var.f218467b) || !wj50.m88271j(this.f218468c, ta61Var.f218468c) || this.f218469d != ta61Var.f218469d || this.f218470e != ta61Var.f218470e || !wj50.m88271j(this.f218471f, ta61Var.f218471f)) {
            return false;
        }
        String str = ta61Var.f218472g;
        String str2 = this.f218472g;
        if (str2 == null) {
            if (str == null) {
                zM88271j = true;
            } else {
                zM88271j = false;
            }
        } else if (str == null) {
            zM88271j = false;
        } else {
            zM88271j = wj50.m88271j(str2, str);
        }
        if (!zM88271j) {
            return false;
        }
        String str3 = ta61Var.f218473h;
        String str4 = this.f218473h;
        if (str4 == null) {
            if (str3 == null) {
                zM88271j2 = true;
            } else {
                zM88271j2 = false;
            }
        } else if (str3 == null) {
            zM88271j2 = false;
        } else {
            zM88271j2 = wj50.m88271j(str4, str3);
        }
        return zM88271j2 && this.f218474i == ta61Var.f218474i && this.f218475j == ta61Var.f218475j;
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f218470e, mt60.m62800g(this.f218469d, (this.f218468c.hashCode() + s571.m77244c(this.f218466a.hashCode() * 31, 31, this.f218467b)) * 31, 31), 31);
        String str = this.f218471f;
        int iHashCode = (iM62800g + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f218472g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f218473h;
        return Boolean.hashCode(this.f218475j) + s571.m77245d((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f218474i);
    }

    public /* synthetic */ ta61(String str, List list, sa61 sa61Var, int i, String str2, String str3, String str4) {
        this(str, list, sa61Var, 0, i, str2, str3, str4, false, false);
    }
}
