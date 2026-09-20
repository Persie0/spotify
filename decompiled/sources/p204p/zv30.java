package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class zv30 extends fx30 {
    public static final Parcelable.Creator<zv30> CREATOR = new mz20(28);

    /* JADX INFO: renamed from: c */
    public final int f286599c;

    public zv30(int i) {
        super(7, 3);
        this.f286599c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zv30) && this.f286599c == ((zv30) obj).f286599c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f286599c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.f286599c;
        if (i2 == 1) {
            str = "PHONE_SPEAKERS";
        } else if (i2 == 2) {
            str = "EXTERNAL_SPEAKER";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "OTHER_DEVICE";
        }
        parcel.writeString(str);
    }
}
