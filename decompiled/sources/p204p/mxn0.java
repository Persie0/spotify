package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mxn0 {

    /* JADX INFO: renamed from: a */
    public final List f148109a;

    /* JADX INFO: renamed from: b */
    public final int f148110b;

    /* JADX INFO: renamed from: c */
    public final int f148111c;

    /* JADX INFO: renamed from: d */
    public final Integer f148112d;

    /* JADX INFO: renamed from: e */
    public final int f148113e;

    /* JADX INFO: renamed from: f */
    public final boolean f148114f;

    /* JADX INFO: renamed from: g */
    public final String f148115g;

    /* JADX INFO: renamed from: h */
    public final String f148116h;

    public mxn0(List list, int i, int i2, Integer num, int i3, boolean z, String str, String str2) {
        this.f148109a = list;
        this.f148110b = i;
        this.f148111c = i2;
        this.f148112d = num;
        this.f148113e = i3;
        this.f148114f = z;
        this.f148115g = str;
        this.f148116h = str2;
    }

    /* JADX INFO: renamed from: a */
    public static mxn0 m63113a(mxn0 mxn0Var, int i) {
        List list = mxn0Var.f148109a;
        int i2 = mxn0Var.f148110b;
        int i3 = mxn0Var.f148111c;
        Integer num = mxn0Var.f148112d;
        boolean z = mxn0Var.f148114f;
        String str = mxn0Var.f148115g;
        String str2 = mxn0Var.f148116h;
        mxn0Var.getClass();
        return new mxn0(list, i2, i3, num, i, z, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxn0)) {
            return false;
        }
        mxn0 mxn0Var = (mxn0) obj;
        return wj50.m88271j(this.f148109a, mxn0Var.f148109a) && this.f148110b == mxn0Var.f148110b && this.f148111c == mxn0Var.f148111c && wj50.m88271j(this.f148112d, mxn0Var.f148112d) && this.f148113e == mxn0Var.f148113e && this.f148114f == mxn0Var.f148114f && wj50.m88271j(this.f148115g, mxn0Var.f148115g) && wj50.m88271j(this.f148116h, mxn0Var.f148116h);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f148111c, mt60.m62800g(this.f148110b, this.f148109a.hashCode() * 31, 31), 31);
        Integer num = this.f148112d;
        int iM77245d = s571.m77245d(mt60.m62800g(this.f148113e, (iM62800g + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.f148114f);
        String str = this.f148115g;
        int iHashCode = (iM77245d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f148116h;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
