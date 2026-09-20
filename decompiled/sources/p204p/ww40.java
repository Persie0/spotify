package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class ww40 implements ax40 {
    public static final Parcelable.Creator<ww40> CREATOR = new y240(18);

    /* JADX INFO: renamed from: a */
    public final int f255695a;

    /* JADX INFO: renamed from: b */
    public final String f255696b;

    public ww40(int i, String str) {
        this.f255695a = i;
        this.f255696b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww40)) {
            return false;
        }
        ww40 ww40Var = (ww40) obj;
        return this.f255695a == ww40Var.f255695a && wj50.m88271j(this.f255696b, ww40Var.f255696b);
    }

    public final int hashCode() {
        return this.f255696b.hashCode() + (Integer.hashCode(this.f255695a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f255695a);
        parcel.writeString(this.f255696b);
    }
}
