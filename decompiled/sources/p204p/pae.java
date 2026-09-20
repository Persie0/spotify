package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class pae implements Parcelable {
    public static final Parcelable.Creator<pae> CREATOR = new n6e(28);

    /* JADX INFO: renamed from: a */
    public final String f175510a;

    /* JADX INFO: renamed from: b */
    public final oae f175511b;

    public pae(String str, oae oaeVar) {
        this.f175510a = str;
        this.f175511b = oaeVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pae)) {
            return false;
        }
        pae paeVar = (pae) obj;
        return wj50.m88271j(this.f175510a, paeVar.f175510a) && wj50.m88271j(this.f175511b, paeVar.f175511b);
    }

    public final int hashCode() {
        return this.f175511b.hashCode() + (this.f175510a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f175510a);
        parcel.writeParcelable(this.f175511b, i);
    }
}
