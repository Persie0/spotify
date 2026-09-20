package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class oa7 implements Parcelable {
    public static final Parcelable.Creator<oa7> CREATOR = new na7(0);

    /* JADX INFO: renamed from: a */
    public final ag1 f163245a;

    /* JADX INFO: renamed from: b */
    public final boolean f163246b;

    public oa7(ag1 ag1Var, boolean z) {
        this.f163245a = ag1Var;
        this.f163246b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa7)) {
            return false;
        }
        oa7 oa7Var = (oa7) obj;
        return this.f163245a == oa7Var.f163245a && this.f163246b == oa7Var.f163246b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163246b) + (this.f163245a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f163245a.name());
        parcel.writeInt(this.f163246b ? 1 : 0);
    }
}
