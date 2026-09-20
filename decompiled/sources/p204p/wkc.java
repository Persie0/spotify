package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class wkc implements Parcelable {
    public static final Parcelable.Creator<wkc> CREATOR = new a5c(14);

    /* JADX INFO: renamed from: a */
    public final String f252201a;

    /* JADX INFO: renamed from: b */
    public final glc f252202b;

    public wkc(String str, glc glcVar) {
        this.f252201a = str;
        this.f252202b = glcVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkc)) {
            return false;
        }
        wkc wkcVar = (wkc) obj;
        return wj50.m88271j(this.f252201a, wkcVar.f252201a) && wj50.m88271j(this.f252202b, wkcVar.f252202b);
    }

    public final int hashCode() {
        return this.f252202b.hashCode() + (this.f252201a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f252201a);
        parcel.writeParcelable(this.f252202b, i);
    }
}
