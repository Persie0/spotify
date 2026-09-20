package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class dv01 extends gv01 {
    public static final Parcelable.Creator<dv01> CREATOR = new bv01(2);

    /* JADX INFO: renamed from: a */
    public final String f53331a;

    public dv01(String str) {
        this.f53331a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dv01) && wj50.m88271j(this.f53331a, ((dv01) obj).f53331a);
    }

    public final int hashCode() {
        return this.f53331a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f53331a);
    }
}
