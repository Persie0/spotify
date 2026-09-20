package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class t01 extends z01 {
    public static final Parcelable.Creator<t01> CREATOR = new zz0(18);

    /* JADX INFO: renamed from: a */
    public final t661 f215711a;

    public t01(t661 t661Var) {
        this.f215711a = t661Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t01) && wj50.m88271j(this.f215711a, ((t01) obj).f215711a);
    }

    public final int hashCode() {
        return this.f215711a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f215711a, i);
    }
}
