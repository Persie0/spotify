package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class stw0 implements utw0 {
    public static final Parcelable.Creator<stw0> CREATOR = new b8w0(24);

    /* JADX INFO: renamed from: a */
    public final String f213959a;

    public stw0(String str) {
        this.f213959a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof stw0) && wj50.m88271j(this.f213959a, ((stw0) obj).f213959a);
    }

    public final int hashCode() {
        return this.f213959a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f213959a);
    }
}
