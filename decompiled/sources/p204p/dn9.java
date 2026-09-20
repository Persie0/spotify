package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class dn9 implements Parcelable {
    public static final Parcelable.Creator<dn9> CREATOR = new dc9(8);

    /* JADX INFO: renamed from: a */
    public final String f50706a;

    /* JADX INFO: renamed from: b */
    public final String f50707b;

    public dn9(String str, String str2) {
        this.f50706a = str;
        this.f50707b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn9)) {
            return false;
        }
        dn9 dn9Var = (dn9) obj;
        return wj50.m88271j(this.f50706a, dn9Var.f50706a) && wj50.m88271j(this.f50707b, dn9Var.f50707b);
    }

    public final int hashCode() {
        int iHashCode = this.f50706a.hashCode() * 31;
        String str = this.f50707b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f50706a);
        parcel.writeString(this.f50707b);
    }
}
