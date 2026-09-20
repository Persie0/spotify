package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class wxt0 implements Parcelable {
    public static final Parcelable.Creator<wxt0> CREATOR = new vit0(18);

    /* JADX INFO: renamed from: a */
    public final String f256101a;

    /* JADX INFO: renamed from: b */
    public final String f256102b;

    /* JADX INFO: renamed from: c */
    public final String f256103c;

    public wxt0(String str, String str2, String str3) {
        this.f256101a = str;
        this.f256102b = str2;
        this.f256103c = str3;
    }

    /* JADX INFO: renamed from: c */
    public final String m89328c() {
        return this.f256101a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxt0)) {
            return false;
        }
        wxt0 wxt0Var = (wxt0) obj;
        return wj50.m88271j(this.f256101a, wxt0Var.f256101a) && wj50.m88271j(this.f256102b, wxt0Var.f256102b) && wj50.m88271j(this.f256103c, wxt0Var.f256103c);
    }

    public final int hashCode() {
        int iHashCode = this.f256101a.hashCode() * 31;
        String str = this.f256102b;
        return this.f256103c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f256101a);
        parcel.writeString(this.f256102b);
        parcel.writeString(this.f256103c);
    }
}
