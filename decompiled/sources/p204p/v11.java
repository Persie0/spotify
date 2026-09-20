package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class v11 implements x11 {
    public static final Parcelable.Creator<v11> CREATOR = new g11(6);

    /* JADX INFO: renamed from: a */
    public final u11 f236216a;

    public v11(u11 u11Var) {
        this.f236216a = u11Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v11) && wj50.m88271j(this.f236216a, ((v11) obj).f236216a);
    }

    public final int hashCode() {
        return this.f236216a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f236216a, i);
    }
}
