package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class ds31 implements Parcelable {
    public static final Parcelable.Creator<ds31> CREATOR = new ln31(9);

    /* JADX INFO: renamed from: a */
    public final ur31 f52480a;

    public ds31(ur31 ur31Var) {
        this.f52480a = ur31Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ds31) && this.f52480a == ((ds31) obj).f52480a;
    }

    public final int hashCode() {
        return this.f52480a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f52480a.name());
    }
}
