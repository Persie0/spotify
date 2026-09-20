package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class lv10 implements Parcelable {
    public static final Parcelable.Creator<lv10> CREATOR = new km10(19);

    /* JADX INFO: renamed from: a */
    public final ss10 f137188a;

    public lv10(ss10 ss10Var) {
        this.f137188a = ss10Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lv10) && this.f137188a == ((lv10) obj).f137188a;
    }

    public final int hashCode() {
        return this.f137188a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f137188a.name());
    }
}
