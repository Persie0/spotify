package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class jiy0 implements oiy0 {
    public static final Parcelable.Creator<jiy0> CREATOR = new csx0(22);

    /* JADX INFO: renamed from: a */
    public final String f112836a;

    public jiy0(String str) {
        this.f112836a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p204p.oiy0
    /* JADX INFO: renamed from: e0 */
    public final String mo41778e0() {
        return "Error";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jiy0) && wj50.m88271j(this.f112836a, ((jiy0) obj).f112836a);
    }

    public final int hashCode() {
        return this.f112836a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f112836a);
    }
}
