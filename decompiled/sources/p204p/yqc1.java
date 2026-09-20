package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class yqc1 implements Parcelable {
    public static final Parcelable.Creator<yqc1> CREATOR = new vmc1(9);

    /* JADX INFO: renamed from: a */
    public final fb6 f275190a;

    /* JADX INFO: renamed from: b */
    public final String f275191b;

    public yqc1(fb6 fb6Var, String str) {
        this.f275190a = fb6Var;
        this.f275191b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqc1)) {
            return false;
        }
        yqc1 yqc1Var = (yqc1) obj;
        return wj50.m88271j(this.f275190a, yqc1Var.f275190a) && wj50.m88271j(this.f275191b, yqc1Var.f275191b);
    }

    public final int hashCode() {
        return this.f275191b.hashCode() + (this.f275190a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f275190a, i);
        parcel.writeString(this.f275191b);
    }
}
