package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ezd extends hzd {
    public static final Parcelable.Creator<ezd> CREATOR = new fjd(23);

    /* JADX INFO: renamed from: a */
    public final String f64341a;

    public ezd(String str) {
        this.f64341a = str;
    }

    @Override // p204p.hzd
    /* JADX INFO: renamed from: c */
    public final String mo40341c() {
        return this.f64341a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ezd) && wj50.m88271j(this.f64341a, ((ezd) obj).f64341a);
    }

    public final int hashCode() {
        return this.f64341a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f64341a);
    }
}
