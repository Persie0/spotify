package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class he9 extends ie9 {
    public static final Parcelable.Creator<he9> CREATOR = new dc9(4);

    /* JADX INFO: renamed from: a */
    public final int f90376a;

    public he9(int i) {
        this.f90376a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof he9) && this.f90376a == ((he9) obj).f90376a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f90376a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f90376a);
    }
}
