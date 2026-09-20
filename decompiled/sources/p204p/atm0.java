package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class atm0 implements Parcelable {
    public static final Parcelable.Creator<atm0> CREATOR = new cpl0(24);

    /* JADX INFO: renamed from: a */
    public final String f19709a;

    /* JADX INFO: renamed from: b */
    public final int f19710b;

    /* JADX INFO: renamed from: c */
    public final int f19711c;

    /* JADX INFO: renamed from: d */
    public final int f19712d;

    /* JADX INFO: renamed from: e */
    public final xsm0 f19713e;

    /* JADX INFO: renamed from: f */
    public final xsm0 f19714f;

    /* JADX INFO: renamed from: g */
    public final Integer f19715g;

    public atm0(String str, int i, int i2, int i3, xsm0 xsm0Var, xsm0 xsm0Var2, Integer num) {
        this.f19709a = str;
        this.f19710b = i;
        this.f19711c = i2;
        this.f19712d = i3;
        this.f19713e = xsm0Var;
        this.f19714f = xsm0Var2;
        this.f19715g = num;
    }

    /* JADX INFO: renamed from: c */
    public static atm0 m27146c(atm0 atm0Var, String str) {
        int i = atm0Var.f19710b;
        int i2 = atm0Var.f19711c;
        int i3 = atm0Var.f19712d;
        xsm0 xsm0Var = atm0Var.f19713e;
        xsm0 xsm0Var2 = atm0Var.f19714f;
        Integer num = atm0Var.f19715g;
        atm0Var.getClass();
        return new atm0(str, i, i2, i3, xsm0Var, xsm0Var2, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atm0)) {
            return false;
        }
        atm0 atm0Var = (atm0) obj;
        return wj50.m88271j(this.f19709a, atm0Var.f19709a) && this.f19710b == atm0Var.f19710b && this.f19711c == atm0Var.f19711c && this.f19712d == atm0Var.f19712d && wj50.m88271j(this.f19713e, atm0Var.f19713e) && wj50.m88271j(this.f19714f, atm0Var.f19714f) && wj50.m88271j(this.f19715g, atm0Var.f19715g);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f19712d, mt60.m62800g(this.f19711c, mt60.m62800g(this.f19710b, this.f19709a.hashCode() * 31, 31), 31), 31);
        xsm0 xsm0Var = this.f19713e;
        int iHashCode = (iM62800g + (xsm0Var == null ? 0 : xsm0Var.hashCode())) * 31;
        xsm0 xsm0Var2 = this.f19714f;
        int iHashCode2 = (iHashCode + (xsm0Var2 == null ? 0 : xsm0Var2.hashCode())) * 31;
        Integer num = this.f19715g;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19709a);
        parcel.writeInt(this.f19710b);
        parcel.writeInt(this.f19711c);
        parcel.writeInt(this.f19712d);
        xsm0 xsm0Var = this.f19713e;
        if (xsm0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            xsm0Var.writeToParcel(parcel, i);
        }
        xsm0 xsm0Var2 = this.f19714f;
        if (xsm0Var2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            xsm0Var2.writeToParcel(parcel, i);
        }
        Integer num = this.f19715g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
    }

    public /* synthetic */ atm0(String str, int i, int i2) {
        this(str, i, i2, 0, null, null, null);
    }
}
