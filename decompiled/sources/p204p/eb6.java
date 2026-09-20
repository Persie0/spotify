package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class eb6 implements fb6 {
    public static final Parcelable.Creator<eb6> CREATOR = new vp5(20);

    /* JADX INFO: renamed from: a */
    public final u9c1 f57836a;

    public eb6(u9c1 u9c1Var) {
        this.f57836a = u9c1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eb6) && wj50.m88271j(this.f57836a, ((eb6) obj).f57836a);
    }

    public final int hashCode() {
        return this.f57836a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f57836a, i);
    }
}
