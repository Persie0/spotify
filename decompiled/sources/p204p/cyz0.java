package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class cyz0 implements Parcelable {
    public static final Parcelable.Creator<cyz0> CREATOR = new vcz0(14);

    /* JADX INFO: renamed from: a */
    public final zl7 f43409a;

    public cyz0(zl7 zl7Var) {
        this.f43409a = zl7Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cyz0) && wj50.m88271j(this.f43409a, ((cyz0) obj).f43409a);
    }

    public final int hashCode() {
        return this.f43409a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f43409a, i);
    }
}
