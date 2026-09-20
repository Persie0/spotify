package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class fe9 extends ie9 {
    public static final Parcelable.Creator<fe9> CREATOR = new dc9(2);

    /* JADX INFO: renamed from: a */
    public final String f68714a;

    public fe9(String str) {
        this.f68714a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fe9) && wj50.m88271j(this.f68714a, ((fe9) obj).f68714a);
    }

    public final int hashCode() {
        return this.f68714a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68714a);
    }
}
