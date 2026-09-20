package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class rtd implements Parcelable {
    public static final Parcelable.Creator<rtd> CREATOR = new fjd(14);

    /* JADX INFO: renamed from: a */
    public final String f202564a;

    /* JADX INFO: renamed from: b */
    public final int f202565b;

    public rtd(String str, int i) {
        this.f202564a = str;
        this.f202565b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rtd)) {
            return false;
        }
        rtd rtdVar = (rtd) obj;
        return wj50.m88271j(this.f202564a, rtdVar.f202564a) && this.f202565b == rtdVar.f202565b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f202565b) + (this.f202564a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f202564a);
        parcel.writeInt(this.f202565b);
    }
}
