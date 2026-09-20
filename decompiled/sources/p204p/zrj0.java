package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class zrj0 implements Parcelable {
    public static final Parcelable.Creator<zrj0> CREATOR = new fgj0(6);

    /* JADX INFO: renamed from: a */
    public final String f285698a;

    public zrj0(String str) {
        this.f285698a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zrj0) && wj50.m88271j(this.f285698a, ((zrj0) obj).f285698a);
    }

    public final int hashCode() {
        return this.f285698a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f285698a);
    }
}
