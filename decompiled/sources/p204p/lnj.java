package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class lnj extends onj {
    public static final Parcelable.Creator<lnj> CREATOR = new dnj(7);

    /* JADX INFO: renamed from: a */
    public final String f135171a;

    /* JADX INFO: renamed from: b */
    public final int f135172b;

    /* JADX INFO: renamed from: c */
    public final String f135173c;

    public lnj(String str, int i, String str2) {
        this.f135171a = str;
        this.f135172b = i;
        this.f135173c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnj)) {
            return false;
        }
        lnj lnjVar = (lnj) obj;
        return wj50.m88271j(this.f135171a, lnjVar.f135171a) && this.f135172b == lnjVar.f135172b && wj50.m88271j(this.f135173c, lnjVar.f135173c);
    }

    public final int hashCode() {
        return this.f135173c.hashCode() + mt60.m62800g(this.f135172b, this.f135171a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f135171a);
        parcel.writeInt(this.f135172b);
        parcel.writeString(this.f135173c);
    }
}
