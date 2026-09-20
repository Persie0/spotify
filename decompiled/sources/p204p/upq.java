package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class upq implements Parcelable {
    public static final Parcelable.Creator<upq> CREATOR = new lso(10);

    /* JADX INFO: renamed from: a */
    public final qsj0 f232806a;

    /* JADX INFO: renamed from: b */
    public final int f232807b;

    /* JADX INFO: renamed from: c */
    public final int f232808c;

    public upq(qsj0 qsj0Var, int i, int i2) {
        this.f232806a = qsj0Var;
        this.f232807b = i;
        this.f232808c = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof upq)) {
            return false;
        }
        upq upqVar = (upq) obj;
        return wj50.m88271j(this.f232806a, upqVar.f232806a) && this.f232807b == upqVar.f232807b && this.f232808c == upqVar.f232808c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f232808c) + mt60.m62800g(this.f232807b, this.f232806a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f232806a.writeToParcel(parcel, i);
        parcel.writeInt(this.f232807b);
        parcel.writeInt(this.f232808c);
    }
}
