package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class cmn0 extends fmn0 {
    public static final Parcelable.Creator<cmn0> CREATOR = new ejn0(9);

    /* JADX INFO: renamed from: a */
    public final int f39732a;

    public cmn0(int i) {
        this.f39732a = i;
    }

    @Override // p204p.fmn0
    /* JADX INFO: renamed from: c */
    public final int mo33391c() {
        return this.f39732a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cmn0) && this.f39732a == ((cmn0) obj).f39732a;
    }

    @Override // p204p.fmn0
    /* JADX INFO: renamed from: g */
    public final String mo33392g() {
        return String.valueOf(this.f39732a);
    }

    @Override // p204p.fmn0
    /* JADX INFO: renamed from: h */
    public final boolean mo33393h() {
        return ((long) this.f39732a) == 0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39732a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f39732a);
    }
}
