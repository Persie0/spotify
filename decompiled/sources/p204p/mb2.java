package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class mb2 extends ob2 {
    public static final Parcelable.Creator<mb2> CREATOR = new lb2(0);

    /* JADX INFO: renamed from: a */
    public final ql50 f141765a;

    public mb2(ql50 ql50Var) {
        this.f141765a = ql50Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mb2) && wj50.m88271j(this.f141765a, ((mb2) obj).f141765a);
    }

    public final int hashCode() {
        return this.f141765a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f141765a, i);
    }
}
