package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class w9j0 implements Parcelable {
    public static final Parcelable.Creator<w9j0> CREATOR = new rri0(15);

    /* JADX INFO: renamed from: a */
    public final dd41 f249183a;

    public w9j0(dd41 dd41Var) {
        this.f249183a = dd41Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w9j0) && wj50.m88271j(this.f249183a, ((w9j0) obj).f249183a);
    }

    public final int hashCode() {
        return this.f249183a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dd41 dd41Var = this.f249183a;
        parcel.writeString(dd41Var != null ? dd41Var.m35694A() : null);
    }
}
