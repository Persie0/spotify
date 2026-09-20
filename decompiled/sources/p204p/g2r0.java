package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class g2r0 extends h2r0 {
    public static final Parcelable.Creator<g2r0> CREATOR = new vzq0(9);

    /* JADX INFO: renamed from: a */
    public final v1r0 f76001a;

    public g2r0(v1r0 v1r0Var) {
        this.f76001a = v1r0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2r0) && this.f76001a == ((g2r0) obj).f76001a;
    }

    public final int hashCode() {
        return this.f76001a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f76001a.name());
    }
}
