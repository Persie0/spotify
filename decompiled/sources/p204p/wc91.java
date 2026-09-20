package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class wc91 implements yc91 {
    public static final Parcelable.Creator<wc91> CREATOR = new f891(12);

    /* JADX INFO: renamed from: a */
    public final boolean f249982a;

    public wc91(boolean z) {
        this.f249982a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wc91) && this.f249982a == ((wc91) obj).f249982a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f249982a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f249982a ? 1 : 0);
    }
}
