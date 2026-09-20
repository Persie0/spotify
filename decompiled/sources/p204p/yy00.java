package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class yy00 extends az00 {
    public static final Parcelable.Creator<yy00> CREATOR = new k700(24);

    /* JADX INFO: renamed from: a */
    public final String f277373a;

    public yy00(String str) {
        this.f277373a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yy00) && wj50.m88271j(this.f277373a, ((yy00) obj).f277373a);
    }

    public final int hashCode() {
        return this.f277373a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f277373a);
    }
}
