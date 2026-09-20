package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class kct0 implements Parcelable {
    public static final Parcelable.Creator<kct0> CREATOR = new wds0(27);

    /* JADX INFO: renamed from: a */
    public final boolean f121546a;

    public kct0(boolean z) {
        this.f121546a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kct0) && this.f121546a == ((kct0) obj).f121546a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f121546a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f121546a ? 1 : 0);
    }
}
