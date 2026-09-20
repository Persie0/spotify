package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class wfz implements Parcelable {
    public static final Parcelable.Creator<wfz> CREATOR = new c2z(21);

    /* JADX INFO: renamed from: a */
    public final String f250929a;

    /* JADX INFO: renamed from: b */
    public final vfz f250930b;

    public wfz(String str, vfz vfzVar) {
        this.f250929a = str;
        this.f250930b = vfzVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfz)) {
            return false;
        }
        wfz wfzVar = (wfz) obj;
        return wj50.m88271j(this.f250929a, wfzVar.f250929a) && wj50.m88271j(this.f250930b, wfzVar.f250930b);
    }

    public final int hashCode() {
        return this.f250930b.hashCode() + (this.f250929a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f250929a);
        parcel.writeParcelable(this.f250930b, i);
    }
}
