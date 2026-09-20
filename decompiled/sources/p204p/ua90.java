package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ua90 implements va90 {
    public static final Parcelable.Creator<ua90> CREATOR = new ra90(2);

    /* JADX INFO: renamed from: a */
    public final int f228433a;

    public ua90(int i) {
        this.f228433a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ua90) && this.f228433a == ((ua90) obj).f228433a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f228433a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f228433a);
    }
}
