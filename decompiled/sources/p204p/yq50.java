package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class yq50 implements Parcelable {
    public static final Parcelable.Creator<yq50> CREATOR = new gd50(25);

    /* JADX INFO: renamed from: a */
    public final String f275152a;

    /* JADX INFO: renamed from: b */
    public final String f275153b;

    /* JADX INFO: renamed from: c */
    public final int f275154c;

    /* JADX INFO: renamed from: d */
    public final boolean f275155d;

    public yq50(String str, int i, String str2, boolean z) {
        this.f275152a = str;
        this.f275153b = str2;
        this.f275154c = i;
        this.f275155d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq50)) {
            return false;
        }
        yq50 yq50Var = (yq50) obj;
        return wj50.m88271j(this.f275152a, yq50Var.f275152a) && wj50.m88271j(this.f275153b, yq50Var.f275153b) && this.f275154c == yq50Var.f275154c && this.f275155d == yq50Var.f275155d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f275155d) + mt60.m62800g(this.f275154c, s571.m77243b(this.f275152a.hashCode() * 31, 31, this.f275153b), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f275152a);
        parcel.writeString(this.f275153b);
        parcel.writeInt(this.f275154c);
        parcel.writeInt(this.f275155d ? 1 : 0);
    }
}
