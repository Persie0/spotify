package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class fzm0 implements lzm0 {
    public static final Parcelable.Creator<fzm0> CREATOR = new pum0(15);

    /* JADX INFO: renamed from: a */
    public final boolean f75128a;

    public fzm0(boolean z) {
        this.f75128a = z;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m43243c() {
        return this.f75128a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fzm0) && this.f75128a == ((fzm0) obj).f75128a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f75128a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f75128a ? 1 : 0);
    }
}
