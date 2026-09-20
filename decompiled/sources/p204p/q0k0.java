package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class q0k0 implements Parcelable {
    public static final Parcelable.Creator<q0k0> CREATOR = new fgj0(14);

    /* JADX INFO: renamed from: a */
    public final String f184019a;

    /* JADX INFO: renamed from: b */
    public final fyj0 f184020b;

    public q0k0(String str, fyj0 fyj0Var) {
        this.f184019a = str;
        this.f184020b = fyj0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0k0)) {
            return false;
        }
        q0k0 q0k0Var = (q0k0) obj;
        return wj50.m88271j(this.f184019a, q0k0Var.f184019a) && this.f184020b == q0k0Var.f184020b;
    }

    public final int hashCode() {
        return this.f184020b.hashCode() + (this.f184019a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f184019a);
        parcel.writeParcelable(this.f184020b, i);
    }
}
