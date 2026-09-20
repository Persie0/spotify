package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class zqc1 implements brc1 {
    public static final Parcelable.Creator<zqc1> CREATOR = new vmc1(10);

    /* JADX INFO: renamed from: a */
    public final String f285362a;

    public zqc1(String str) {
        this.f285362a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zqc1) && wj50.m88271j(this.f285362a, ((zqc1) obj).f285362a);
    }

    public final int hashCode() {
        return this.f285362a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f285362a);
    }
}
