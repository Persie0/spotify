package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class ffb1 implements Parcelable {
    public static final Parcelable.Creator<ffb1> CREATOR = new c8b1(6);

    /* JADX INFO: renamed from: a */
    public final boolean f68964a;

    public ffb1(boolean z) {
        this.f68964a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ffb1) && this.f68964a == ((ffb1) obj).f68964a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f68964a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f68964a ? 1 : 0);
    }
}
