package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class err implements iet0 {
    public static final Parcelable.Creator<err> CREATOR = new o5r(23);

    /* JADX INFO: renamed from: a */
    public final int f62164a;

    /* JADX INFO: renamed from: b */
    public final String f62165b;

    /* JADX INFO: renamed from: c */
    public final String f62166c;

    /* JADX INFO: renamed from: d */
    public final String f62167d;

    public err(String str, String str2, int i, String str3) {
        this.f62164a = i;
        this.f62165b = str;
        this.f62166c = str2;
        this.f62167d = str3;
    }

    @Override // p204p.iet0
    /* JADX INFO: renamed from: I0 */
    public final int mo33720I0() {
        return this.f62164a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof err)) {
            return false;
        }
        err errVar = (err) obj;
        return this.f62164a == errVar.f62164a && wj50.m88271j(this.f62165b, errVar.f62165b) && wj50.m88271j(this.f62166c, errVar.f62166c) && wj50.m88271j(this.f62167d, errVar.f62167d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f62164a) * 31;
        String str = this.f62165b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f62166c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f62167d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f62164a);
        parcel.writeString(this.f62165b);
        parcel.writeString(this.f62166c);
        parcel.writeString(this.f62167d);
    }
}
