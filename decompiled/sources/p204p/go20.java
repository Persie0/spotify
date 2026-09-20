package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class go20 implements k3r, Parcelable {
    public static final Parcelable.Creator<go20> CREATOR = new t320(16);

    /* JADX INFO: renamed from: a */
    public final String f82819a;

    /* JADX INFO: renamed from: b */
    public final String f82820b;

    /* JADX INFO: renamed from: c */
    public final int f82821c;

    public go20(String str, String str2, int i) {
        this.f82819a = str;
        this.f82820b = str2;
        this.f82821c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go20)) {
            return false;
        }
        go20 go20Var = (go20) obj;
        return wj50.m88271j(this.f82819a, go20Var.f82819a) && wj50.m88271j(this.f82820b, go20Var.f82820b) && this.f82821c == go20Var.f82821c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f82821c) + s571.m77243b(this.f82819a.hashCode() * 31, 31, this.f82820b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f82819a);
        parcel.writeString(this.f82820b);
        parcel.writeInt(this.f82821c);
    }
}
