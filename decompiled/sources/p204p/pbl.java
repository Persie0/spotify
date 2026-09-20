package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class pbl implements Parcelable {
    public static final Parcelable.Creator<pbl> CREATOR = new z4l(10);

    /* JADX INFO: renamed from: a */
    public final String f175865a;

    /* JADX INFO: renamed from: b */
    public final String f175866b;

    /* JADX INFO: renamed from: c */
    public final String f175867c;

    public pbl(String str, String str2, String str3) {
        this.f175865a = str;
        this.f175866b = str2;
        this.f175867c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pbl)) {
            return false;
        }
        pbl pblVar = (pbl) obj;
        return wj50.m88271j(this.f175865a, pblVar.f175865a) && wj50.m88271j(this.f175866b, pblVar.f175866b) && wj50.m88271j(this.f175867c, pblVar.f175867c);
    }

    public final int hashCode() {
        return this.f175867c.hashCode() + s571.m77243b(this.f175865a.hashCode() * 31, 31, this.f175866b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f175865a);
        parcel.writeString(this.f175866b);
        parcel.writeString(this.f175867c);
    }
}
