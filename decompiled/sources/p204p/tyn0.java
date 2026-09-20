package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class tyn0 implements wyn0 {
    public static final Parcelable.Creator<tyn0> CREATOR = new ejn0(20);

    /* JADX INFO: renamed from: a */
    public final String f225012a;

    public tyn0(String str) {
        this.f225012a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tyn0) && wj50.m88271j(this.f225012a, ((tyn0) obj).f225012a);
    }

    public final int hashCode() {
        return this.f225012a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f225012a);
    }
}
