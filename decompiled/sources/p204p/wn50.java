package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class wn50 implements Parcelable {
    public static final Parcelable.Creator<wn50> CREATOR = new gd50(16);

    /* JADX INFO: renamed from: a */
    public final String f253066a;

    /* JADX INFO: renamed from: b */
    public final pla1 f253067b;

    public wn50(String str, pla1 pla1Var) {
        this.f253066a = str;
        this.f253067b = pla1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn50)) {
            return false;
        }
        wn50 wn50Var = (wn50) obj;
        return wj50.m88271j(this.f253066a, wn50Var.f253066a) && wj50.m88271j(this.f253067b, wn50Var.f253067b);
    }

    public final int hashCode() {
        return this.f253067b.hashCode() + (this.f253066a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f253066a);
        this.f253067b.writeToParcel(parcel, i);
    }
}
