package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class hj91 implements Parcelable {
    public static final Parcelable.Creator<hj91> CREATOR = new f891(21);

    /* JADX INFO: renamed from: a */
    public final jh91 f91998a;

    /* JADX INFO: renamed from: b */
    public final int f91999b;

    public hj91(jh91 jh91Var, int i) {
        this.f91998a = jh91Var;
        this.f91999b = i;
    }

    /* JADX INFO: renamed from: c */
    public final jh91 m47673c() {
        return this.f91998a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj91)) {
            return false;
        }
        hj91 hj91Var = (hj91) obj;
        return wj50.m88271j(this.f91998a, hj91Var.f91998a) && this.f91999b == hj91Var.f91999b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f91999b) + (this.f91998a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f91998a, i);
        parcel.writeInt(this.f91999b);
    }
}
