package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class mr10 implements Parcelable {
    public static final Parcelable.Creator<mr10> CREATOR = new km10(5);

    /* JADX INFO: renamed from: a */
    public final ss10 f146403a;

    /* JADX INFO: renamed from: b */
    public final boolean f146404b;

    /* JADX INFO: renamed from: c */
    public final boolean f146405c;

    public mr10(ss10 ss10Var, boolean z, boolean z2) {
        this.f146403a = ss10Var;
        this.f146404b = z;
        this.f146405c = z2;
    }

    /* JADX INFO: renamed from: c */
    public static mr10 m62608c(mr10 mr10Var, boolean z) {
        ss10 ss10Var = mr10Var.f146403a;
        boolean z2 = mr10Var.f146404b;
        mr10Var.getClass();
        return new mr10(ss10Var, z2, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr10)) {
            return false;
        }
        mr10 mr10Var = (mr10) obj;
        return this.f146403a == mr10Var.f146403a && this.f146404b == mr10Var.f146404b && this.f146405c == mr10Var.f146405c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f146405c) + s571.m77245d(this.f146403a.hashCode() * 31, 31, this.f146404b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f146403a.name());
        parcel.writeInt(this.f146404b ? 1 : 0);
        parcel.writeInt(this.f146405c ? 1 : 0);
    }
}
