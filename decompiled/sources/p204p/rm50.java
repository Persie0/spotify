package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class rm50 implements Parcelable {
    public static final Parcelable.Creator<rm50> CREATOR = new gd50(10);

    /* JADX INFO: renamed from: a */
    public final boolean f200453a;

    public rm50(boolean z) {
        this.f200453a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rm50) && this.f200453a == ((rm50) obj).f200453a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f200453a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f200453a ? 1 : 0);
    }
}
