package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class ili0 extends as01 {
    public static final Parcelable.Creator<ili0> CREATOR = new ruh0(29);

    /* JADX INFO: renamed from: a */
    public final String f103386a;

    public ili0(String str) {
        this.f103386a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ili0) && wj50.m88271j(this.f103386a, ((ili0) obj).f103386a);
    }

    public final int hashCode() {
        String str = this.f103386a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f103386a);
    }
}
