package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class gzd extends hzd {
    public static final Parcelable.Creator<gzd> CREATOR = new fjd(25);

    /* JADX INFO: renamed from: a */
    public final String f85896a;

    public gzd(String str) {
        this.f85896a = str;
    }

    @Override // p204p.hzd
    /* JADX INFO: renamed from: c */
    public final String mo40341c() {
        return this.f85896a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gzd) && wj50.m88271j(this.f85896a, ((gzd) obj).f85896a);
    }

    public final int hashCode() {
        return this.f85896a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f85896a);
    }
}
