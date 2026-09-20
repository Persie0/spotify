package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ikq0 implements Parcelable {
    public static final Parcelable.Creator<ikq0> CREATOR = new vnp0(19);

    /* JADX INFO: renamed from: a */
    public final rkq0 f103188a;

    public ikq0(rkq0 rkq0Var) {
        this.f103188a = rkq0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ikq0) && wj50.m88271j(this.f103188a, ((ikq0) obj).f103188a);
    }

    public final int hashCode() {
        return this.f103188a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f103188a, i);
    }
}
