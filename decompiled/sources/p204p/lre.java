package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class lre implements Parcelable {
    public static final Parcelable.Creator<lre> CREATOR = new rae(8);

    /* JADX INFO: renamed from: a */
    public final String f136271a;

    /* JADX INFO: renamed from: b */
    public final String f136272b;

    public lre(String str, String str2) {
        this.f136271a = str;
        this.f136272b = str2;
    }

    /* JADX INFO: renamed from: c */
    public final String m59801c() {
        return this.f136272b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lre)) {
            return false;
        }
        lre lreVar = (lre) obj;
        return wj50.m88271j(this.f136271a, lreVar.f136271a) && wj50.m88271j(this.f136272b, lreVar.f136272b);
    }

    public final int hashCode() {
        return this.f136272b.hashCode() + (this.f136271a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f136271a);
        parcel.writeString(this.f136272b);
    }
}
