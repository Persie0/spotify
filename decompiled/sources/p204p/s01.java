package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class s01 extends z01 {
    public static final Parcelable.Creator<s01> CREATOR = new zz0(17);

    /* JADX INFO: renamed from: a */
    public final int f204280a;

    public s01(int i) {
        this.f204280a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s01) && this.f204280a == ((s01) obj).f204280a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f204280a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.f204280a;
        if (i2 == 1) {
            str = "CREDENTIAL_NOT_FOUND";
        } else if (i2 == 2) {
            str = "CONNECTION";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "UNKNOWN";
        }
        parcel.writeString(str);
    }
}
