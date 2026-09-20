package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class gvy implements Parcelable {
    public static final Parcelable.Creator<gvy> CREATOR = new eqy(14);

    /* JADX INFO: renamed from: a */
    public final String f84854a;

    /* JADX INFO: renamed from: b */
    public final String f84855b;

    public gvy(String str, String str2) {
        this.f84854a = str;
        this.f84855b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvy)) {
            return false;
        }
        gvy gvyVar = (gvy) obj;
        return wj50.m88271j(this.f84854a, gvyVar.f84854a) && wj50.m88271j(this.f84855b, gvyVar.f84855b);
    }

    public final int hashCode() {
        return this.f84855b.hashCode() + (this.f84854a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f84854a);
        parcel.writeString(this.f84855b);
    }
}
