package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class etl implements Parcelable {
    public static final Parcelable.Creator<etl> CREATOR = new pkl(4);

    /* JADX INFO: renamed from: a */
    public final String f62740a;

    /* JADX INFO: renamed from: b */
    public final String f62741b;

    /* JADX INFO: renamed from: c */
    public final String f62742c;

    public etl(String str, String str2, String str3) {
        this.f62740a = str;
        this.f62741b = str2;
        this.f62742c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof etl)) {
            return false;
        }
        etl etlVar = (etl) obj;
        return wj50.m88271j(this.f62740a, etlVar.f62740a) && wj50.m88271j(this.f62741b, etlVar.f62741b) && wj50.m88271j(this.f62742c, etlVar.f62742c);
    }

    public final String getEntityUri() {
        return this.f62741b;
    }

    public final int hashCode() {
        String str = this.f62740a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f62741b;
        return this.f62742c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f62740a);
        parcel.writeString(this.f62741b);
        parcel.writeString(this.f62742c);
    }
}
