package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class o01 extends z01 {
    public static final Parcelable.Creator<o01> CREATOR = new zz0(10);

    /* JADX INFO: renamed from: a */
    public final n01 f160206a;

    public o01(n01 n01Var) {
        this.f160206a = n01Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o01) && wj50.m88271j(this.f160206a, ((o01) obj).f160206a);
    }

    public final int hashCode() {
        return this.f160206a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f160206a, i);
    }
}
