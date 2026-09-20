package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class dmn0 extends fmn0 {
    public static final Parcelable.Creator<dmn0> CREATOR = new ejn0(10);

    /* JADX INFO: renamed from: a */
    public final long f50575a;

    /* JADX INFO: renamed from: b */
    public final boolean f50576b;

    public dmn0(long j, boolean z) {
        this.f50575a = j;
        this.f50576b = z;
    }

    @Override // p204p.fmn0
    /* JADX INFO: renamed from: c */
    public final int mo33391c() {
        return (int) this.f50575a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmn0)) {
            return false;
        }
        dmn0 dmn0Var = (dmn0) obj;
        return this.f50575a == dmn0Var.f50575a && this.f50576b == dmn0Var.f50576b;
    }

    @Override // p204p.fmn0
    /* JADX INFO: renamed from: g */
    public final String mo33392g() {
        return String.valueOf(this.f50575a);
    }

    @Override // p204p.fmn0
    /* JADX INFO: renamed from: h */
    public final boolean mo33393h() {
        return this.f50576b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50576b) + (Long.hashCode(this.f50575a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f50575a);
        parcel.writeInt(this.f50576b ? 1 : 0);
    }
}
