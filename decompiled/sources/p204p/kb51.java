package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class kb51 implements Parcelable {
    public static final Parcelable.Creator<kb51> CREATOR = new q051(28);

    /* JADX INFO: renamed from: a */
    public final int f121097a;

    public kb51(int i) {
        this.f121097a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kb51) && this.f121097a == ((kb51) obj).f121097a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f121097a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.f121097a;
        if (i2 == 1) {
            str = "MUTED";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "UNMUTED";
        }
        parcel.writeString(str);
    }
}
