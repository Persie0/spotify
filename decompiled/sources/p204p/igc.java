package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class igc implements Parcelable {
    public static final Parcelable.Creator<igc> CREATOR = new a5c(9);

    /* JADX INFO: renamed from: a */
    public final String f101947a;

    /* JADX INFO: renamed from: b */
    public final String f101948b;

    public igc(String str, String str2) {
        this.f101947a = str;
        this.f101948b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igc)) {
            return false;
        }
        igc igcVar = (igc) obj;
        return wj50.m88271j(this.f101947a, igcVar.f101947a) && wj50.m88271j(this.f101948b, igcVar.f101948b);
    }

    public final int hashCode() {
        return this.f101948b.hashCode() + (this.f101947a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f101947a);
        parcel.writeString(this.f101948b);
    }
}
