package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class o341 implements Parcelable {
    public static final Parcelable.Creator<o341> CREATOR = new ln31(19);

    /* JADX INFO: renamed from: a */
    public final int f161282a;

    public o341(int i) {
        this.f161282a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o341) && this.f161282a == ((o341) obj).f161282a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f161282a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f161282a);
    }
}
