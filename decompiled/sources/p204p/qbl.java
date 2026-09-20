package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class qbl implements Parcelable {
    public static final Parcelable.Creator<qbl> CREATOR = new z4l(7);

    /* JADX INFO: renamed from: a */
    public final String f187104a;

    /* JADX INFO: renamed from: b */
    public final String f187105b;

    /* JADX INFO: renamed from: c */
    public final obl f187106c;

    public qbl(String str, String str2, obl oblVar) {
        this.f187104a = str;
        this.f187105b = str2;
        this.f187106c = oblVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbl)) {
            return false;
        }
        qbl qblVar = (qbl) obj;
        return wj50.m88271j(this.f187104a, qblVar.f187104a) && wj50.m88271j(this.f187105b, qblVar.f187105b) && wj50.m88271j(this.f187106c, qblVar.f187106c);
    }

    public final int hashCode() {
        String str = this.f187104a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f187105b;
        return this.f187106c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f187104a);
        parcel.writeString(this.f187105b);
        parcel.writeParcelable(this.f187106c, i);
    }

    public /* synthetic */ qbl(String str, obl oblVar, int i) {
        this((i & 1) != 0 ? null : str, (String) null, oblVar);
    }
}
