package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class eqc0 implements Parcelable {
    public static final Parcelable.Creator<eqc0> CREATOR = new f4c0(10);

    /* JADX INFO: renamed from: a */
    public final vnc0 f61862a;

    public eqc0(vnc0 vnc0Var) {
        this.f61862a = vnc0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eqc0) && wj50.m88271j(this.f61862a, ((eqc0) obj).f61862a);
    }

    public final int hashCode() {
        return this.f61862a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f61862a.writeToParcel(parcel, i);
    }
}
