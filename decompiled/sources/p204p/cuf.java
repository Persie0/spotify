package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class cuf extends duf {
    public static final Parcelable.Creator<cuf> CREATOR = new rae(20);

    /* JADX INFO: renamed from: a */
    public final int f42106a;

    public cuf(int i) {
        this.f42106a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cuf) && this.f42106a == ((cuf) obj).f42106a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42106a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f42106a);
    }
}
