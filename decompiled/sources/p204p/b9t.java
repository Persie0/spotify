package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class b9t implements d9t {
    public static final Parcelable.Creator<b9t> CREATOR = new f9s(28);

    /* JADX INFO: renamed from: a */
    public final String f24997a;

    public b9t(String str) {
        this.f24997a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b9t) && wj50.m88271j(this.f24997a, ((b9t) obj).f24997a);
    }

    public final int hashCode() {
        return this.f24997a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f24997a);
    }
}
