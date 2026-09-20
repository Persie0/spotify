package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class zr2 implements Parcelable {
    public static final Parcelable.Creator<zr2> CREATOR = new lb2(20);

    /* JADX INFO: renamed from: a */
    public final String f285524a;

    public zr2(String str) {
        this.f285524a = str;
    }

    /* JADX INFO: renamed from: c */
    public final String m96754c() {
        return this.f285524a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zr2) && wj50.m88271j(this.f285524a, ((zr2) obj).f285524a);
    }

    public final int hashCode() {
        return this.f285524a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f285524a);
    }
}
