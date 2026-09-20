package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class gja1 implements Parcelable {
    public static final Parcelable.Creator<gja1> CREATOR = new u2a1(11);

    /* JADX INFO: renamed from: a */
    public final xu00 f80424a;

    public gja1(xu00 xu00Var) {
        this.f80424a = xu00Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gja1) && wj50.m88271j(this.f80424a, ((gja1) obj).f80424a);
    }

    public final int hashCode() {
        return this.f80424a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f80424a, i);
    }
}
