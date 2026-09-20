package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class f9e implements Parcelable {
    public static final Parcelable.Creator<f9e> CREATOR = new n6e(3);

    /* JADX INFO: renamed from: a */
    public final boolean f67233a;

    /* JADX INFO: renamed from: b */
    public final String f67234b;

    public f9e(boolean z, String str) {
        this.f67233a = z;
        this.f67234b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9e)) {
            return false;
        }
        f9e f9eVar = (f9e) obj;
        return this.f67233a == f9eVar.f67233a && wj50.m88271j(this.f67234b, f9eVar.f67234b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f67233a) * 31;
        String str = this.f67234b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f67233a ? 1 : 0);
        parcel.writeString(this.f67234b);
    }
}
