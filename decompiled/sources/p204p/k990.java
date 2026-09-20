package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class k990 implements q990 {
    public static final Parcelable.Creator<k990> CREATOR = new x390(13);

    /* JADX INFO: renamed from: a */
    public final int f120543a;

    public k990(int i) {
        this.f120543a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k990) && this.f120543a == ((k990) obj).f120543a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f120543a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f120543a);
    }
}
