package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class wep0 implements Parcelable {
    public static final Parcelable.Creator<wep0> CREATOR = new igo0(24);

    /* JADX INFO: renamed from: a */
    public final String f250600a;

    /* JADX INFO: renamed from: b */
    public final oi3 f250601b;

    public wep0(String str, oi3 oi3Var) {
        this.f250600a = str;
        this.f250601b = oi3Var;
    }

    /* JADX INFO: renamed from: c */
    public final String m87907c() {
        return this.f250600a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wep0)) {
            return false;
        }
        wep0 wep0Var = (wep0) obj;
        return wj50.m88271j(this.f250600a, wep0Var.f250600a) && wj50.m88271j(this.f250601b, wep0Var.f250601b);
    }

    public final int hashCode() {
        return this.f250601b.hashCode() + (this.f250600a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f250600a);
        parcel.writeParcelable(this.f250601b, i);
    }
}
