package p204p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class n1m0 implements o1m0 {
    public static final Parcelable.Creator<n1m0> CREATOR = new cpl0(8);

    /* JADX INFO: renamed from: a */
    public final Class f149471a;

    /* JADX INFO: renamed from: b */
    public final Bundle f149472b;

    /* JADX INFO: renamed from: c */
    public final h600 f149473c;

    public n1m0(Class cls, Bundle bundle, h600 h600Var) {
        this.f149471a = cls;
        this.f149472b = bundle;
        this.f149473c = h600Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1m0)) {
            return false;
        }
        n1m0 n1m0Var = (n1m0) obj;
        return wj50.m88271j(this.f149471a, n1m0Var.f149471a) && wj50.m88271j(this.f149472b, n1m0Var.f149472b) && wj50.m88271j(this.f149473c, n1m0Var.f149473c);
    }

    public final int hashCode() {
        return this.f149473c.hashCode() + ((this.f149472b.hashCode() + (this.f149471a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f149471a);
        parcel.writeBundle(this.f149472b);
        parcel.writeParcelable(this.f149473c, i);
    }
}
