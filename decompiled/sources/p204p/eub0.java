package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class eub0 extends fub0 {
    public static final Parcelable.Creator<eub0> CREATOR = new apb0(20);

    /* JADX INFO: renamed from: a */
    public final boolean f62935a;

    public eub0(boolean z) {
        this.f62935a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eub0) && this.f62935a == ((eub0) obj).f62935a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f62935a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f62935a ? 1 : 0);
    }
}
