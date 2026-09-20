package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class xlx0 implements ylx0 {
    public static final Parcelable.Creator<xlx0> CREATOR = new xxw0(22);

    /* JADX INFO: renamed from: a */
    public final wit0 f263247a;

    public xlx0(wit0 wit0Var) {
        this.f263247a = wit0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xlx0) && wj50.m88271j(this.f263247a, ((xlx0) obj).f263247a);
    }

    public final int hashCode() {
        return this.f263247a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f263247a, i);
    }
}
