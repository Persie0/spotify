package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class jv01 extends lv01 {
    public static final Parcelable.Creator<jv01> CREATOR = new bv01(6);

    /* JADX INFO: renamed from: a */
    public final String f116218a;

    public jv01(String str) {
        this.f116218a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jv01) && wj50.m88271j(this.f116218a, ((jv01) obj).f116218a);
    }

    @Override // p204p.lv01
    public final String getUri() {
        return this.f116218a;
    }

    public final int hashCode() {
        return this.f116218a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f116218a);
    }
}
