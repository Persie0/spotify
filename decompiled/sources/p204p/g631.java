package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class g631 {

    /* JADX INFO: renamed from: a */
    public final h731 f76883a;

    /* JADX INFO: renamed from: b */
    public final String f76884b;

    /* JADX INFO: renamed from: c */
    public final Integer f76885c;

    /* JADX INFO: renamed from: d */
    public final String f76886d;

    /* JADX INFO: renamed from: e */
    public final Integer f76887e;

    /* JADX INFO: renamed from: f */
    public final View.OnClickListener f76888f;

    /* JADX INFO: renamed from: g */
    public final View.OnClickListener f76889g;

    /* JADX INFO: renamed from: h */
    public final b631 f76890h;

    /* JADX INFO: renamed from: i */
    public final boolean f76891i;

    public g631(h731 h731Var, String str, Integer num, String str2, Integer num2, View.OnClickListener onClickListener, ndp ndpVar, b631 b631Var, boolean z) {
        this.f76883a = h731Var;
        this.f76884b = str;
        this.f76885c = num;
        this.f76886d = str2;
        this.f76887e = num2;
        this.f76888f = onClickListener;
        this.f76889g = ndpVar;
        this.f76890h = b631Var;
        this.f76891i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g631)) {
            return false;
        }
        g631 g631Var = (g631) obj;
        return wj50.m88271j(this.f76883a, g631Var.f76883a) && wj50.m88271j(this.f76884b, g631Var.f76884b) && wj50.m88271j(this.f76885c, g631Var.f76885c) && wj50.m88271j(this.f76886d, g631Var.f76886d) && wj50.m88271j(this.f76887e, g631Var.f76887e) && wj50.m88271j(this.f76888f, g631Var.f76888f) && wj50.m88271j(this.f76889g, g631Var.f76889g) && wj50.m88271j(this.f76890h, g631Var.f76890h) && this.f76891i == g631Var.f76891i;
    }

    public final int hashCode() {
        h731 h731Var = this.f76883a;
        int iM77243b = s571.m77243b((h731Var == null ? 0 : h731Var.hashCode()) * 31, 31, this.f76884b);
        Integer num = this.f76885c;
        int iHashCode = (iM77243b + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f76886d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f76887e;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        View.OnClickListener onClickListener = this.f76888f;
        int iHashCode4 = (iHashCode3 + (onClickListener == null ? 0 : onClickListener.hashCode())) * 31;
        View.OnClickListener onClickListener2 = this.f76889g;
        int iHashCode5 = (iHashCode4 + (onClickListener2 == null ? 0 : onClickListener2.hashCode())) * 31;
        b631 b631Var = this.f76890h;
        return Boolean.hashCode(this.f76891i) + ((iHashCode5 + (b631Var != null ? b631Var.hashCode() : 0)) * 31);
    }
}
