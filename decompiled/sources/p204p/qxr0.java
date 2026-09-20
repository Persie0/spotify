package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class qxr0 implements Parcelable {
    public static final Parcelable.Creator<qxr0> CREATOR = new luh0(10);

    /* JADX INFO: renamed from: h */
    public static final qxr0 f193730h;

    /* JADX INFO: renamed from: a */
    public final int f193731a;

    /* JADX INFO: renamed from: b */
    public final List f193732b;

    /* JADX INFO: renamed from: c */
    public final String f193733c;

    /* JADX INFO: renamed from: d */
    public final boolean f193734d;

    /* JADX INFO: renamed from: e */
    public final boolean f193735e;

    /* JADX INFO: renamed from: f */
    public final int f193736f;

    /* JADX INFO: renamed from: g */
    public final int f193737g;

    static {
        qxr0 qxr0Var = new qxr0(1, lau.f131415a, null, false, 124);
        f193730h = qxr0Var;
        m74146c(qxr0Var, 2, null, null, false, false, 0, 0, 126);
        m74146c(qxr0Var, 4, null, null, false, false, 0, 0, 126);
    }

    public qxr0(int i, List list, String str, boolean z, boolean z2, int i2, int i3) {
        this.f193731a = i;
        this.f193732b = list;
        this.f193733c = str;
        this.f193734d = z;
        this.f193735e = z2;
        this.f193736f = i2;
        this.f193737g = i3;
    }

    /* JADX INFO: renamed from: c */
    public static qxr0 m74146c(qxr0 qxr0Var, int i, List list, String str, boolean z, boolean z2, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = qxr0Var.f193731a;
        }
        int i5 = i;
        if ((i4 & 2) != 0) {
            list = qxr0Var.f193732b;
        }
        List list2 = list;
        if ((i4 & 4) != 0) {
            str = qxr0Var.f193733c;
        }
        String str2 = str;
        if ((i4 & 8) != 0) {
            z = qxr0Var.f193734d;
        }
        boolean z3 = z;
        if ((i4 & 16) != 0) {
            z2 = qxr0Var.f193735e;
        }
        boolean z4 = z2;
        if ((i4 & 32) != 0) {
            i2 = qxr0Var.f193736f;
        }
        int i6 = i2;
        if ((i4 & 64) != 0) {
            i3 = qxr0Var.f193737g;
        }
        qxr0Var.getClass();
        return new qxr0(i5, list2, str2, z3, z4, i6, i3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxr0)) {
            return false;
        }
        qxr0 qxr0Var = (qxr0) obj;
        return this.f193731a == qxr0Var.f193731a && wj50.m88271j(this.f193732b, qxr0Var.f193732b) && wj50.m88271j(this.f193733c, qxr0Var.f193733c) && this.f193734d == qxr0Var.f193734d && this.f193735e == qxr0Var.f193735e && this.f193736f == qxr0Var.f193736f && this.f193737g == qxr0Var.f193737g;
    }

    /* JADX INFO: renamed from: g */
    public final int m74147g() {
        return this.f193731a;
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(edb.m38547C(this.f193731a) * 31, 31, this.f193732b);
        String str = this.f193733c;
        return edb.m38547C(this.f193737g) + mt60.m62800g(this.f193736f, s571.m77245d(s571.m77245d((iM77244c + (str == null ? 0 : str.hashCode())) * 31, 31, this.f193734d), 31, this.f193735e), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        int i2 = this.f193731a;
        if (i2 == 1) {
            str = "NOT_LOADED";
        } else if (i2 == 2) {
            str = "LOADING";
        } else if (i2 == 3) {
            str = "LOADED";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "FAILED";
        }
        parcel.writeString(str);
        Iterator itM42468l = fr0.m42468l(parcel, this.f193732b);
        while (itM42468l.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l.next(), i);
        }
        parcel.writeString(this.f193733c);
        parcel.writeInt(this.f193734d ? 1 : 0);
        parcel.writeInt(this.f193735e ? 1 : 0);
        parcel.writeInt(this.f193736f);
        int i3 = this.f193737g;
        if (i3 == 1) {
            str2 = "PRIMARY";
        } else if (i3 == 2) {
            str2 = "SECONDARY";
        } else if (i3 == 3) {
            str2 = "TERTIARY";
        } else {
            if (i3 != 4) {
                throw null;
            }
            str2 = "QUATERNARY";
        }
        parcel.writeString(str2);
    }

    public /* synthetic */ qxr0(int i, List list, String str, boolean z, int i2) {
        this(i, list, (i2 & 4) != 0 ? null : str, false, (i2 & 16) != 0 ? false : z, 50, 1);
    }
}
