package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class mk00 implements Parcelable {
    public static final Parcelable.Creator<mk00> CREATOR = new k700(9);

    /* JADX INFO: renamed from: a */
    public final p68 f144461a;

    /* JADX INFO: renamed from: b */
    public final p68 f144462b;

    /* JADX INFO: renamed from: c */
    public final p68 f144463c;

    public mk00(p68 p68Var, p68 p68Var2, p68 p68Var3) {
        this.f144461a = p68Var;
        this.f144462b = p68Var2;
        this.f144463c = p68Var3;
    }

    /* JADX INFO: renamed from: c */
    public static mk00 m62061c(mk00 mk00Var, p68 p68Var, p68 p68Var2, p68 p68Var3, int i) {
        if ((i & 1) != 0) {
            p68Var = mk00Var.f144461a;
        }
        if ((i & 2) != 0) {
            p68Var2 = mk00Var.f144462b;
        }
        if ((i & 4) != 0) {
            p68Var3 = mk00Var.f144463c;
        }
        return new mk00(p68Var, p68Var2, p68Var3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk00)) {
            return false;
        }
        mk00 mk00Var = (mk00) obj;
        return wj50.m88271j(this.f144461a, mk00Var.f144461a) && wj50.m88271j(this.f144462b, mk00Var.f144462b) && wj50.m88271j(this.f144463c, mk00Var.f144463c);
    }

    /* JADX INFO: renamed from: g */
    public final String m62062g() {
        p68 p68Var = this.f144461a;
        String strM69190c = p68Var != null ? p68Var.m69190c() : null;
        p68 p68Var2 = this.f144462b;
        String strM69190c2 = p68Var2 != null ? p68Var2.m69190c() : null;
        p68 p68Var3 = this.f144463c;
        return dq60.m36616p(p68Var3 != null ? p68Var3.m69190c() : null, ")", edb.m38573v("FxCurves(echo=", strM69190c, ", reverb=", strM69190c2, ", delay="));
    }

    public final int hashCode() {
        p68 p68Var = this.f144461a;
        int iHashCode = (p68Var == null ? 0 : p68Var.hashCode()) * 31;
        p68 p68Var2 = this.f144462b;
        int iHashCode2 = (iHashCode + (p68Var2 == null ? 0 : p68Var2.hashCode())) * 31;
        p68 p68Var3 = this.f144463c;
        return iHashCode2 + (p68Var3 != null ? p68Var3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        p68 p68Var = this.f144461a;
        if (p68Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            p68Var.writeToParcel(parcel, i);
        }
        p68 p68Var2 = this.f144462b;
        if (p68Var2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            p68Var2.writeToParcel(parcel, i);
        }
        p68 p68Var3 = this.f144463c;
        if (p68Var3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            p68Var3.writeToParcel(parcel, i);
        }
    }
}
