package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class lck implements nck {
    public static final Parcelable.Creator<lck> CREATOR = new kck(0);

    /* JADX INFO: renamed from: a */
    public final boolean f131946a;

    public lck(boolean z) {
        this.f131946a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lck) && this.f131946a == ((lck) obj).f131946a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f131946a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f131946a ? 1 : 0);
    }
}
