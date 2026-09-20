package p204p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class m1m0 implements o1m0 {
    public static final Parcelable.Creator<m1m0> CREATOR = new cpl0(7);

    /* JADX INFO: renamed from: a */
    public final Class f139033a;

    /* JADX INFO: renamed from: b */
    public final Bundle f139034b;

    /* JADX INFO: renamed from: c */
    public final h600 f139035c;

    public m1m0(Class cls, Bundle bundle, h600 h600Var) {
        this.f139033a = cls;
        this.f139034b = bundle;
        this.f139035c = h600Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1m0)) {
            return false;
        }
        m1m0 m1m0Var = (m1m0) obj;
        return wj50.m88271j(this.f139033a, m1m0Var.f139033a) && wj50.m88271j(this.f139034b, m1m0Var.f139034b) && wj50.m88271j(this.f139035c, m1m0Var.f139035c);
    }

    public final int hashCode() {
        return this.f139035c.hashCode() + ((this.f139034b.hashCode() + (this.f139033a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f139033a);
        parcel.writeBundle(this.f139034b);
        parcel.writeParcelable(this.f139035c, i);
    }
}
