package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class afe implements Parcelable {
    public static final Parcelable.Creator<afe> CREATOR = new rae(3);

    /* JADX INFO: renamed from: a */
    public final String f15135a;

    /* JADX INFO: renamed from: b */
    public final String f15136b;

    public afe(String str, String str2) {
        this.f15135a = str;
        this.f15136b = str2;
    }

    /* JADX INFO: renamed from: c */
    public final String m25809c() {
        return this.f15135a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afe)) {
            return false;
        }
        afe afeVar = (afe) obj;
        return wj50.m88271j(this.f15135a, afeVar.f15135a) && wj50.m88271j(this.f15136b, afeVar.f15136b);
    }

    public final int hashCode() {
        return this.f15136b.hashCode() + (this.f15135a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f15135a);
        parcel.writeString(this.f15136b);
    }
}
