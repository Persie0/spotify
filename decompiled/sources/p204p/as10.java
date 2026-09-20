package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class as10 extends bs10 {
    public static final Parcelable.Creator<as10> CREATOR = new km10(8);

    /* JADX INFO: renamed from: a */
    public final int f19276a;

    public as10(int i) {
        this.f19276a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof as10) && this.f19276a == ((as10) obj).f19276a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19276a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f19276a);
    }
}
