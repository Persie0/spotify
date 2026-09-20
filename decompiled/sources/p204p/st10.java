package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class st10 implements Parcelable {
    public static final Parcelable.Creator<st10> CREATOR = new km10(16);

    /* JADX INFO: renamed from: a */
    public final ss10 f213760a;

    public st10(ss10 ss10Var) {
        this.f213760a = ss10Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof st10) && this.f213760a == ((st10) obj).f213760a;
    }

    public final int hashCode() {
        return this.f213760a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f213760a.name());
    }
}
