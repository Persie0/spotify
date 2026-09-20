package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class nsk0 implements Parcelable {
    public static final Parcelable.Creator<nsk0> CREATOR = new fgj0(22);

    /* JADX INFO: renamed from: a */
    public final String f157833a;

    /* JADX INFO: renamed from: b */
    public final String f157834b;

    /* JADX INFO: renamed from: c */
    public final boolean f157835c;

    /* JADX INFO: renamed from: d */
    public final boolean f157836d;

    public nsk0(String str, boolean z, String str2, boolean z2) {
        this.f157833a = str;
        this.f157834b = str2;
        this.f157835c = z;
        this.f157836d = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsk0)) {
            return false;
        }
        nsk0 nsk0Var = (nsk0) obj;
        return wj50.m88271j(this.f157833a, nsk0Var.f157833a) && wj50.m88271j(this.f157834b, nsk0Var.f157834b) && this.f157835c == nsk0Var.f157835c && this.f157836d == nsk0Var.f157836d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f157836d) + s571.m77245d(s571.m77243b(this.f157833a.hashCode() * 31, 31, this.f157834b), 31, this.f157835c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f157833a);
        parcel.writeString(this.f157834b);
        parcel.writeInt(this.f157835c ? 1 : 0);
        parcel.writeInt(this.f157836d ? 1 : 0);
    }

    public /* synthetic */ nsk0(int i, String str, String str2, boolean z, boolean z2) {
        this(str, (i & 4) != 0 ? false : z, str2, (i & 8) != 0 ? false : z2);
    }
}
