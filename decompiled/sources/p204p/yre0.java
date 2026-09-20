package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class yre0 implements zre0 {
    public static final Parcelable.Creator<yre0> CREATOR = new ube0(14);

    /* JADX INFO: renamed from: a */
    public final boolean f275464a;

    public yre0(boolean z) {
        this.f275464a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yre0) && this.f275464a == ((yre0) obj).f275464a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f275464a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f275464a ? 1 : 0);
    }
}
