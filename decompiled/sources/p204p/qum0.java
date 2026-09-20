package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class qum0 implements Parcelable {
    public static final Parcelable.Creator<qum0> CREATOR = new pum0(0);

    /* JADX INFO: renamed from: a */
    public final boolean f192741a;

    public qum0(boolean z) {
        this.f192741a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qum0) && this.f192741a == ((qum0) obj).f192741a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f192741a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f192741a ? 1 : 0);
    }
}
