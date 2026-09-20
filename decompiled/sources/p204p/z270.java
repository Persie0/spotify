package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class z270 implements a370 {
    public static final Parcelable.Creator<z270> CREATOR = new w270(2);

    /* JADX INFO: renamed from: a */
    public final h891 f278507a;

    public z270(h891 h891Var) {
        this.f278507a = h891Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z270) && wj50.m88271j(this.f278507a, ((z270) obj).f278507a);
    }

    public final int hashCode() {
        return this.f278507a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f278507a, i);
    }
}
