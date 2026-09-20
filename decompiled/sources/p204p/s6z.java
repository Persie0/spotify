package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class s6z extends u6z {
    public static final Parcelable.Creator<s6z> CREATOR = new c2z(12);

    /* JADX INFO: renamed from: a */
    public final int f206238a;

    public s6z(int i) {
        this.f206238a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s6z) && this.f206238a == ((s6z) obj).f206238a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f206238a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f206238a);
    }
}
