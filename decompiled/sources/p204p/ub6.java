package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ub6 implements Parcelable {
    public static final Parcelable.Creator<ub6> CREATOR = new vp5(21);

    /* JADX INFO: renamed from: a */
    public final mlm0 f228634a;

    public ub6(mlm0 mlm0Var) {
        this.f228634a = mlm0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ub6) && this.f228634a == ((ub6) obj).f228634a;
    }

    public final int hashCode() {
        return this.f228634a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f228634a.name());
    }
}
