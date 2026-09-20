package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class gtb1 implements Parcelable {
    public static final Parcelable.Creator<gtb1> CREATOR = new c8b1(17);

    /* JADX INFO: renamed from: a */
    public final int f84125a;

    public gtb1(int i) {
        this.f84125a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gtb1) && this.f84125a == ((gtb1) obj).f84125a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f84125a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(xl81.m91409r(this.f84125a));
    }
}
