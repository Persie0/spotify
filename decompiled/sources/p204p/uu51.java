package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class uu51 implements Parcelable {
    public static final Parcelable.Creator<uu51> CREATOR = new nc51(26);

    /* JADX INFO: renamed from: a */
    public final voc1 f234110a;

    /* JADX INFO: renamed from: b */
    public final String f234111b;

    /* JADX INFO: renamed from: c */
    public final zam0 f234112c;

    /* JADX INFO: renamed from: d */
    public final boolean f234113d;

    public uu51(voc1 voc1Var, String str, zam0 zam0Var, boolean z) {
        this.f234110a = voc1Var;
        this.f234111b = str;
        this.f234112c = zam0Var;
        this.f234113d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu51)) {
            return false;
        }
        uu51 uu51Var = (uu51) obj;
        return wj50.m88271j(this.f234110a, uu51Var.f234110a) && wj50.m88271j(this.f234111b, uu51Var.f234111b) && wj50.m88271j(this.f234112c, uu51Var.f234112c) && this.f234113d == uu51Var.f234113d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f234113d) + ((this.f234112c.hashCode() + s571.m77243b(this.f234110a.f243453a.hashCode() * 31, 31, this.f234111b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f234110a, i);
        parcel.writeString(this.f234111b);
        parcel.writeValue(this.f234112c);
        parcel.writeInt(this.f234113d ? 1 : 0);
    }
}
