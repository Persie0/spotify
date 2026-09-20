package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class h6y implements i6y {
    public static final Parcelable.Creator<h6y> CREATOR = new wfw(19);

    /* JADX INFO: renamed from: a */
    public final int f88293a;

    public h6y(int i) {
        this.f88293a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h6y) && this.f88293a == ((h6y) obj).f88293a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f88293a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f88293a);
    }
}
