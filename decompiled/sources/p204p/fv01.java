package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class fv01 extends gv01 {
    public static final Parcelable.Creator<fv01> CREATOR = new bv01(4);

    /* JADX INFO: renamed from: a */
    public final String f73616a;

    public fv01(String str) {
        this.f73616a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fv01) && wj50.m88271j(this.f73616a, ((fv01) obj).f73616a);
    }

    public final int hashCode() {
        return this.f73616a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f73616a);
    }
}
