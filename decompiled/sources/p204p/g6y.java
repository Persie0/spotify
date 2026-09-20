package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class g6y implements i6y {
    public static final Parcelable.Creator<g6y> CREATOR = new wfw(18);

    /* JADX INFO: renamed from: a */
    public final int f77140a;

    public g6y(int i) {
        this.f77140a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g6y) && this.f77140a == ((g6y) obj).f77140a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f77140a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f77140a);
    }
}
