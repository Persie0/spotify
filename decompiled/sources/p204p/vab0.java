package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class vab0 implements Parcelable {
    public static final Parcelable.Creator<vab0> CREATOR = new l0b0(20);

    /* JADX INFO: renamed from: a */
    public final boolean f239175a;

    public vab0(boolean z) {
        this.f239175a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vab0) && this.f239175a == ((vab0) obj).f239175a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f239175a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f239175a ? 1 : 0);
    }
}
