package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class v7z implements Parcelable {
    public static final Parcelable.Creator<v7z> CREATOR = new c2z(18);

    /* JADX INFO: renamed from: a */
    public final boolean f238344a;

    public v7z(boolean z) {
        this.f238344a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v7z) && this.f238344a == ((v7z) obj).f238344a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f238344a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f238344a ? 1 : 0);
    }
}
