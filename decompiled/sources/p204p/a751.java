package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class a751 implements Parcelable {
    public static final Parcelable.Creator<a751> CREATOR = new q051(21);

    /* JADX INFO: renamed from: a */
    public final long f12964a;

    /* JADX INFO: renamed from: b */
    public final long f12965b;

    /* JADX INFO: renamed from: c */
    public final long f12966c;

    /* JADX INFO: renamed from: d */
    public final long f12967d;

    public a751(long j, long j2, long j3, long j4) {
        this.f12964a = j;
        this.f12965b = j2;
        this.f12966c = j3;
        this.f12967d = j4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a751)) {
            return false;
        }
        a751 a751Var = (a751) obj;
        return this.f12964a == a751Var.f12964a && this.f12965b == a751Var.f12965b && this.f12966c == a751Var.f12966c && this.f12967d == a751Var.f12967d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12967d) + dq60.m36605e(dq60.m36605e(Long.hashCode(this.f12964a) * 31, this.f12965b, 31), this.f12966c, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f12964a);
        parcel.writeLong(this.f12965b);
        parcel.writeLong(this.f12966c);
        parcel.writeLong(this.f12967d);
    }
}
