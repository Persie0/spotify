package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class zl81 implements Parcelable {
    public static final Parcelable.Creator<zl81> CREATOR = new f881(13);

    /* JADX INFO: renamed from: a */
    public final int f283946a;

    /* JADX INFO: renamed from: b */
    public final int f283947b;

    public zl81(int i, int i2) {
        this.f283946a = i;
        this.f283947b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl81)) {
            return false;
        }
        zl81 zl81Var = (zl81) obj;
        return this.f283946a == zl81Var.f283946a && this.f283947b == zl81Var.f283947b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f283947b) + (Integer.hashCode(this.f283946a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeInt(this.f283946a);
        int i2 = this.f283947b;
        if (i2 == 1) {
            str = "Player";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "Scrub";
        }
        parcel.writeString(str);
    }
}
