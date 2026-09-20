package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class yiq0 implements Parcelable {
    public static final Parcelable.Creator<yiq0> CREATOR = new vnp0(17);

    /* JADX INFO: renamed from: a */
    public final voc1 f273190a;

    /* JADX INFO: renamed from: b */
    public final int f273191b;

    public yiq0(voc1 voc1Var, int i) {
        this.f273190a = voc1Var;
        this.f273191b = i;
    }

    /* JADX INFO: renamed from: c */
    public final voc1 m93828c() {
        return this.f273190a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yiq0)) {
            return false;
        }
        yiq0 yiq0Var = (yiq0) obj;
        return wj50.m88271j(this.f273190a, yiq0Var.f273190a) && this.f273191b == yiq0Var.f273191b;
    }

    /* JADX INFO: renamed from: g */
    public final int m93829g() {
        return this.f273191b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f273191b) + (this.f273190a.f243453a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f273190a, i);
        parcel.writeInt(this.f273191b);
    }
}
