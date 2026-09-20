package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class yr10 implements Parcelable {
    public static final Parcelable.Creator<yr10> CREATOR = new km10(6);

    /* JADX INFO: renamed from: a */
    public final ss10 f275356a;

    public yr10(ss10 ss10Var) {
        this.f275356a = ss10Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yr10) && this.f275356a == ((yr10) obj).f275356a;
    }

    public final int hashCode() {
        return this.f275356a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f275356a.name());
    }
}
