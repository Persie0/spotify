package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class gon0 implements Parcelable {
    public static final Parcelable.Creator<gon0> CREATOR = new ejn0(16);

    /* JADX INFO: renamed from: a */
    public String f82983a;

    /* JADX INFO: renamed from: b */
    public String f82984b;

    /* JADX INFO: renamed from: c */
    public String f82985c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gon0)) {
            return false;
        }
        gon0 gon0Var = (gon0) obj;
        return wj50.m88271j(this.f82983a, gon0Var.f82983a) && wj50.m88271j(this.f82984b, gon0Var.f82984b) && wj50.m88271j(this.f82985c, gon0Var.f82985c);
    }

    public final int hashCode() {
        return this.f82985c.hashCode() + s571.m77243b(this.f82983a.hashCode() * 31, 31, this.f82984b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f82983a);
        parcel.writeString(this.f82984b);
        parcel.writeString(this.f82985c);
    }
}
