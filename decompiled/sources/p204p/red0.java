package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class red0 implements sed0 {
    public static final Parcelable.Creator<red0> CREATOR = new f4c0(29);

    /* JADX INFO: renamed from: a */
    public final sl00 f198346a;

    public red0(sl00 sl00Var) {
        this.f198346a = sl00Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof red0) && wj50.m88271j(this.f198346a, ((red0) obj).f198346a);
    }

    public final int hashCode() {
        return this.f198346a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f198346a.writeToParcel(parcel, i);
    }
}
