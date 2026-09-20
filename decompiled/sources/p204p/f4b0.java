package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class f4b0 implements Parcelable {
    public static final Parcelable.Creator<f4b0> CREATOR = new l0b0(10);

    /* JADX INFO: renamed from: a */
    public final h4b0 f65723a;

    public f4b0(h4b0 h4b0Var) {
        this.f65723a = h4b0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f4b0) && this.f65723a == ((f4b0) obj).f65723a;
    }

    public final int hashCode() {
        return this.f65723a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f65723a.name());
    }
}
