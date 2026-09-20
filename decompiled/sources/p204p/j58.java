package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class j58 implements Parcelable {
    public static final Parcelable.Creator<j58> CREATOR = new na7(25);

    /* JADX INFO: renamed from: a */
    public final boolean f108907a;

    public j58(boolean z) {
        this.f108907a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j58) && this.f108907a == ((j58) obj).f108907a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f108907a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f108907a ? 1 : 0);
    }
}
