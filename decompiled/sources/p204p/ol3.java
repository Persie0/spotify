package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ol3 implements Parcelable {
    public static final Parcelable.Creator<ol3> CREATOR = new bc3(10);

    /* JADX INFO: renamed from: a */
    public final String f166739a;

    /* JADX INFO: renamed from: b */
    public final String f166740b;

    public ol3(String str, String str2) {
        this.f166739a = str;
        this.f166740b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol3)) {
            return false;
        }
        ol3 ol3Var = (ol3) obj;
        return wj50.m88271j(this.f166739a, ol3Var.f166739a) && wj50.m88271j(this.f166740b, ol3Var.f166740b);
    }

    public final int hashCode() {
        return this.f166740b.hashCode() + (this.f166739a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f166739a);
        parcel.writeString(this.f166740b);
    }
}
