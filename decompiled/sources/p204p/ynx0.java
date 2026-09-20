package p204p;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ynx0 {

    /* JADX INFO: renamed from: a */
    public final String f274516a;

    /* JADX INFO: renamed from: b */
    public final String f274517b;

    /* JADX INFO: renamed from: c */
    public final String f274518c;

    /* JADX INFO: renamed from: d */
    public final List f274519d;

    /* JADX INFO: renamed from: e */
    public final List f274520e;

    /* JADX INFO: renamed from: f */
    public final List f274521f;

    /* JADX INFO: renamed from: g */
    public final List f274522g;

    /* JADX INFO: renamed from: h */
    public final int f274523h;

    /* JADX INFO: renamed from: i */
    public final int f274524i;

    /* JADX INFO: renamed from: j */
    public final int f274525j;

    /* JADX INFO: renamed from: k */
    public final Bundle f274526k;

    public ynx0(String str, String str2, String str3, List list, List list2, List list3, List list4, int i, int i2, int i3, Bundle bundle) {
        this.f274516a = str;
        this.f274517b = str2;
        this.f274518c = str3;
        this.f274519d = list;
        this.f274520e = list2;
        this.f274521f = list3;
        this.f274522g = list4;
        this.f274523h = i;
        this.f274524i = i2;
        this.f274525j = i3;
        this.f274526k = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ynx0)) {
            return false;
        }
        ynx0 ynx0Var = (ynx0) obj;
        return wj50.m88271j(this.f274516a, ynx0Var.f274516a) && wj50.m88271j(this.f274517b, ynx0Var.f274517b) && wj50.m88271j(this.f274518c, ynx0Var.f274518c) && wj50.m88271j(this.f274519d, ynx0Var.f274519d) && wj50.m88271j(this.f274520e, ynx0Var.f274520e) && wj50.m88271j(this.f274521f, ynx0Var.f274521f) && wj50.m88271j(this.f274522g, ynx0Var.f274522g) && this.f274523h == ynx0Var.f274523h && this.f274524i == ynx0Var.f274524i && this.f274525j == ynx0Var.f274525j && wj50.m88271j(this.f274526k, ynx0Var.f274526k);
    }

    public final int hashCode() {
        int iHashCode = this.f274516a.hashCode() * 31;
        String str = this.f274517b;
        int iM62800g = mt60.m62800g(this.f274525j, mt60.m62800g(this.f274524i, mt60.m62800g(this.f274523h, s571.m77244c(s571.m77244c(s571.m77244c(s571.m77244c(s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f274518c), 31, this.f274519d), 31, this.f274520e), 31, this.f274521f), 31, this.f274522g), 31), 31), 31);
        Bundle bundle = this.f274526k;
        return iM62800g + (bundle != null ? bundle.hashCode() : 0);
    }
}
