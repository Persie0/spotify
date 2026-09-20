package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class kr31 implements Parcelable {
    public static final Parcelable.Creator<kr31> CREATOR = new ln31(6);

    /* JADX INFO: renamed from: a */
    public final int f125536a;

    /* JADX INFO: renamed from: b */
    public final int f125537b;

    public kr31(int i, int i2) {
        this.f125536a = i;
        this.f125537b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr31)) {
            return false;
        }
        kr31 kr31Var = (kr31) obj;
        return this.f125536a == kr31Var.f125536a && this.f125537b == kr31Var.f125537b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f125537b) + (edb.m38547C(this.f125536a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        int i2 = this.f125536a;
        if (i2 == 1) {
            str = "ASC";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "DESC";
        }
        parcel.writeString(str);
        int i3 = this.f125537b;
        if (i3 == 1) {
            str2 = "ALPHABETIC";
        } else if (i3 == 2) {
            str2 = "DATE";
        } else {
            if (i3 != 3) {
                throw null;
            }
            str2 = "NONE";
        }
        parcel.writeString(str2);
    }
}
