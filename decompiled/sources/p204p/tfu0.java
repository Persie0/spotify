package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class tfu0 implements Parcelable {
    public static final Parcelable.Creator<tfu0> CREATOR = new v5u0(13);

    /* JADX INFO: renamed from: a */
    public final String f220056a;

    /* JADX INFO: renamed from: b */
    public final String f220057b;

    public tfu0(String str, String str2) {
        this.f220056a = str;
        this.f220057b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfu0)) {
            return false;
        }
        tfu0 tfu0Var = (tfu0) obj;
        return wj50.m88271j(this.f220056a, tfu0Var.f220056a) && wj50.m88271j(this.f220057b, tfu0Var.f220057b);
    }

    public final int hashCode() {
        int iHashCode = this.f220056a.hashCode() * 31;
        String str = this.f220057b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f220056a);
        parcel.writeString(this.f220057b);
    }
}
