package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class qed0 implements sed0 {
    public static final Parcelable.Creator<qed0> CREATOR = new f4c0(28);

    /* JADX INFO: renamed from: a */
    public final sl00 f187906a;

    public qed0(sl00 sl00Var) {
        this.f187906a = sl00Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qed0) && wj50.m88271j(this.f187906a, ((qed0) obj).f187906a);
    }

    public final int hashCode() {
        return this.f187906a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f187906a.writeToParcel(parcel, i);
    }
}
