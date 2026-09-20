package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class tzq0 extends zzq0 {
    public static final Parcelable.Creator<tzq0> CREATOR = new vnp0(28);

    /* JADX INFO: renamed from: a */
    public final zzq0 f225288a;

    public tzq0(zzq0 zzq0Var) {
        this.f225288a = zzq0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tzq0) && wj50.m88271j(this.f225288a, ((tzq0) obj).f225288a);
    }

    public final int hashCode() {
        return this.f225288a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f225288a, i);
    }
}
