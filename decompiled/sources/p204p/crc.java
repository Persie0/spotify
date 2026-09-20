package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class crc implements Parcelable {
    public static final Parcelable.Creator<crc> CREATOR = new a5c(22);

    /* JADX INFO: renamed from: a */
    public final String f41262a;

    /* JADX INFO: renamed from: b */
    public final String f41263b;

    public crc(String str, String str2) {
        this.f41262a = str;
        this.f41263b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crc)) {
            return false;
        }
        crc crcVar = (crc) obj;
        return wj50.m88271j(this.f41262a, crcVar.f41262a) && wj50.m88271j(this.f41263b, crcVar.f41263b);
    }

    public final int hashCode() {
        return this.f41263b.hashCode() + (this.f41262a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f41262a);
        parcel.writeString(this.f41263b);
    }
}
