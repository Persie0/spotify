package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class giy0 implements Parcelable {
    public static final Parcelable.Creator<giy0> CREATOR = new csx0(20);

    /* JADX INFO: renamed from: a */
    public final String f80274a;

    /* JADX INFO: renamed from: b */
    public final String f80275b;

    public giy0(String str, String str2) {
        this.f80274a = str;
        this.f80275b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof giy0)) {
            return false;
        }
        giy0 giy0Var = (giy0) obj;
        return wj50.m88271j(this.f80274a, giy0Var.f80274a) && wj50.m88271j(this.f80275b, giy0Var.f80275b);
    }

    public final int hashCode() {
        int iHashCode = this.f80274a.hashCode() * 31;
        String str = this.f80275b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f80274a);
        parcel.writeString(this.f80275b);
    }
}
