package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class wxa1 implements Parcelable {
    public static final Parcelable.Creator<wxa1> CREATOR = new u2a1(26);

    /* JADX INFO: renamed from: a */
    public final boolean f255997a;

    public /* synthetic */ wxa1() {
        this(false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wxa1) && this.f255997a == ((wxa1) obj).f255997a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f255997a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f255997a ? 1 : 0);
    }

    public wxa1(boolean z) {
        this.f255997a = z;
    }
}
