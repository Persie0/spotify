package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class wde1 implements yde1 {
    public static final Parcelable.Creator<wde1> CREATOR = new xed1(12);

    /* JADX INFO: renamed from: a */
    public final String f250270a;

    public wde1(String str) {
        this.f250270a = str;
    }

    /* JADX INFO: renamed from: c */
    public final String m87826c() {
        return this.f250270a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wde1) && wj50.m88271j(this.f250270a, ((wde1) obj).f250270a);
    }

    public final int hashCode() {
        return this.f250270a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f250270a);
    }
}
