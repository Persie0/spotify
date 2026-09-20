package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class wzq0 extends yzq0 {
    public static final Parcelable.Creator<wzq0> CREATOR = new vzq0(0);

    /* JADX INFO: renamed from: b */
    public final boolean f256664b;

    public wzq0(boolean z) {
        super(z);
        this.f256664b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wzq0) && this.f256664b == ((wzq0) obj).f256664b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f256664b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f256664b ? 1 : 0);
    }
}
