package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class zqo0 implements tro0 {
    public static final Parcelable.Creator<zqo0> CREATOR = new igo0(5);

    /* JADX INFO: renamed from: a */
    public final caa0 f285426a;

    public zqo0(caa0 caa0Var) {
        this.f285426a = caa0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zqo0) && wj50.m88271j(this.f285426a, ((zqo0) obj).f285426a);
    }

    public final int hashCode() {
        return this.f285426a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f285426a, i);
    }
}
