package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class nl10 implements Parcelable {
    public static final Parcelable.Creator<nl10> CREATOR = new qz00(15);

    /* JADX INFO: renamed from: a */
    public final ok10 f154987a;

    /* JADX INFO: renamed from: b */
    public final boolean f154988b;

    /* JADX INFO: renamed from: c */
    public final ml10 f154989c;

    /* JADX INFO: renamed from: d */
    public final hm10 f154990d;

    public nl10(ok10 ok10Var, boolean z, ml10 ml10Var, hm10 hm10Var) {
        this.f154987a = ok10Var;
        this.f154988b = z;
        this.f154989c = ml10Var;
        this.f154990d = hm10Var;
    }

    /* JADX INFO: renamed from: c */
    public static nl10 m64712c(nl10 nl10Var, boolean z, ml10 ml10Var, hm10 hm10Var, int i) {
        ok10 ok10Var = nl10Var.f154987a;
        if ((i & 2) != 0) {
            z = nl10Var.f154988b;
        }
        if ((i & 4) != 0) {
            ml10Var = nl10Var.f154989c;
        }
        nl10Var.getClass();
        return new nl10(ok10Var, z, ml10Var, hm10Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl10)) {
            return false;
        }
        nl10 nl10Var = (nl10) obj;
        return wj50.m88271j(this.f154987a, nl10Var.f154987a) && this.f154988b == nl10Var.f154988b && wj50.m88271j(this.f154989c, nl10Var.f154989c) && wj50.m88271j(this.f154990d, nl10Var.f154990d);
    }

    public final int hashCode() {
        return this.f154990d.hashCode() + ((this.f154989c.hashCode() + s571.m77245d(this.f154987a.hashCode() * 31, 31, this.f154988b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f154987a.writeToParcel(parcel, i);
        parcel.writeInt(this.f154988b ? 1 : 0);
        parcel.writeParcelable(this.f154989c, i);
        parcel.writeParcelable(this.f154990d, i);
    }
}
