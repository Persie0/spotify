package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class xt1 implements du1 {
    public static final Parcelable.Creator<xt1> CREATOR = new g11(28);

    /* JADX INFO: renamed from: a */
    public final x93 f265723a;

    public xt1(x93 x93Var) {
        this.f265723a = x93Var;
    }

    /* JADX INFO: renamed from: c */
    public final x93 m92001c() {
        return this.f265723a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xt1) && this.f265723a == ((xt1) obj).f265723a;
    }

    public final int hashCode() {
        return this.f265723a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f265723a.name());
    }
}
