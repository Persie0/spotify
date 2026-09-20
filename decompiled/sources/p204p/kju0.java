package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class kju0 implements Parcelable {
    public static final Parcelable.Creator<kju0> CREATOR = new v5u0(17);

    /* JADX INFO: renamed from: a */
    public final jju0 f123428a;

    /* JADX INFO: renamed from: b */
    public final String f123429b;

    /* JADX INFO: renamed from: c */
    public final boolean f123430c;

    /* JADX INFO: renamed from: d */
    public final boolean f123431d;

    public kju0(jju0 jju0Var, String str, boolean z, boolean z2) {
        this.f123428a = jju0Var;
        this.f123429b = str;
        this.f123430c = z;
        this.f123431d = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kju0)) {
            return false;
        }
        kju0 kju0Var = (kju0) obj;
        return wj50.m88271j(this.f123428a, kju0Var.f123428a) && wj50.m88271j(this.f123429b, kju0Var.f123429b) && this.f123430c == kju0Var.f123430c && this.f123431d == kju0Var.f123431d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f123431d) + s571.m77245d(s571.m77243b(this.f123428a.hashCode() * 31, 31, this.f123429b), 31, this.f123430c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f123428a.writeToParcel(parcel, i);
        parcel.writeString(this.f123429b);
        parcel.writeInt(this.f123430c ? 1 : 0);
        parcel.writeInt(this.f123431d ? 1 : 0);
    }
}
