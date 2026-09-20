package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class wm51 implements gn51 {
    public static final Parcelable.Creator<wm51> CREATOR = new nc51(12);

    /* JADX INFO: renamed from: a */
    public final String f252739a;

    /* JADX INFO: renamed from: b */
    public final String f252740b;

    /* JADX INFO: renamed from: c */
    public final xm51 f252741c;

    public wm51(String str, String str2, xm51 xm51Var) {
        this.f252739a = str;
        this.f252740b = str2;
        this.f252741c = xm51Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm51)) {
            return false;
        }
        wm51 wm51Var = (wm51) obj;
        return wj50.m88271j(this.f252739a, wm51Var.f252739a) && wj50.m88271j(this.f252740b, wm51Var.f252740b) && wj50.m88271j(this.f252741c, wm51Var.f252741c);
    }

    public final int hashCode() {
        int iHashCode = this.f252739a.hashCode() * 31;
        String str = this.f252740b;
        return this.f252741c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f252739a);
        parcel.writeString(this.f252740b);
        this.f252741c.writeToParcel(parcel, i);
    }
}
