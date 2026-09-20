package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class ll50 extends ql50 {
    public static final Parcelable.Creator<ll50> CREATOR = new gd50(5);

    /* JADX INFO: renamed from: a */
    public final String f134531a;

    public ll50(String str) {
        this.f134531a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ll50) && wj50.m88271j(this.f134531a, ((ll50) obj).f134531a);
    }

    public final int hashCode() {
        String str = this.f134531a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f134531a);
    }
}
