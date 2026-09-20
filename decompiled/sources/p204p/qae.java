package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class qae implements Parcelable {
    public static final Parcelable.Creator<qae> CREATOR = new n6e(29);

    /* JADX INFO: renamed from: a */
    public final String f186852a;

    /* JADX INFO: renamed from: b */
    public final String f186853b;

    /* JADX INFO: renamed from: c */
    public final oae f186854c;

    /* JADX INFO: renamed from: d */
    public final pae f186855d;

    /* JADX INFO: renamed from: e */
    public final pae f186856e;

    public qae(String str, String str2, oae oaeVar, pae paeVar, pae paeVar2) {
        this.f186852a = str;
        this.f186853b = str2;
        this.f186854c = oaeVar;
        this.f186855d = paeVar;
        this.f186856e = paeVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qae)) {
            return false;
        }
        qae qaeVar = (qae) obj;
        return wj50.m88271j(this.f186852a, qaeVar.f186852a) && wj50.m88271j(this.f186853b, qaeVar.f186853b) && wj50.m88271j(this.f186854c, qaeVar.f186854c) && wj50.m88271j(this.f186855d, qaeVar.f186855d) && wj50.m88271j(this.f186856e, qaeVar.f186856e);
    }

    public final int hashCode() {
        int iHashCode = (this.f186854c.hashCode() + s571.m77243b(this.f186852a.hashCode() * 31, 31, this.f186853b)) * 31;
        pae paeVar = this.f186855d;
        int iHashCode2 = (iHashCode + (paeVar == null ? 0 : paeVar.hashCode())) * 31;
        pae paeVar2 = this.f186856e;
        return iHashCode2 + (paeVar2 != null ? paeVar2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f186852a);
        parcel.writeString(this.f186853b);
        parcel.writeParcelable(this.f186854c, i);
        pae paeVar = this.f186855d;
        if (paeVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paeVar.writeToParcel(parcel, i);
        }
        pae paeVar2 = this.f186856e;
        if (paeVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paeVar2.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ qae(String str, String str2, oae oaeVar, pae paeVar, pae paeVar2, int i) {
        this(str, str2, oaeVar, (i & 8) != 0 ? null : paeVar, (i & 16) != 0 ? null : paeVar2);
    }
}
