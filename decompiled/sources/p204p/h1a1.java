package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class h1a1 implements Parcelable {
    public static final Parcelable.Creator<h1a1> CREATOR = new f891(28);

    /* JADX INFO: renamed from: a */
    public final boolean f86547a;

    public h1a1(boolean z) {
        this.f86547a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1a1) && this.f86547a == ((h1a1) obj).f86547a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86547a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f86547a ? 1 : 0);
    }
}
