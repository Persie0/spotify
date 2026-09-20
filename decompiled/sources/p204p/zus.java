package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class zus implements Parcelable {
    public static final Parcelable.Creator<zus> CREATOR = new f9s(13);

    /* JADX INFO: renamed from: a */
    public final String f286513a;

    /* JADX INFO: renamed from: b */
    public final String f286514b;

    public zus(String str, String str2) {
        this.f286513a = str;
        this.f286514b = str2;
    }

    /* JADX INFO: renamed from: c */
    public final String m97066c() {
        return this.f286513a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zus)) {
            return false;
        }
        zus zusVar = (zus) obj;
        return wj50.m88271j(this.f286513a, zusVar.f286513a) && wj50.m88271j(this.f286514b, zusVar.f286514b);
    }

    public final int hashCode() {
        return this.f286514b.hashCode() + (this.f286513a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f286513a);
        parcel.writeString(this.f286514b);
    }
}
