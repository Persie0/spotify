package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ev01 extends gv01 {
    public static final Parcelable.Creator<ev01> CREATOR = new bv01(3);

    /* JADX INFO: renamed from: a */
    public final String f63118a;

    public ev01(String str) {
        this.f63118a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ev01) && wj50.m88271j(this.f63118a, ((ev01) obj).f63118a);
    }

    public final int hashCode() {
        return this.f63118a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f63118a);
    }
}
