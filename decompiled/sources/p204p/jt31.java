package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class jt31 implements Parcelable {
    public static final Parcelable.Creator<jt31> CREATOR = new ln31(14);

    /* JADX INFO: renamed from: a */
    public final o850 f115703a;

    /* JADX INFO: renamed from: b */
    public final ft31 f115704b;

    public jt31(o850 o850Var, ft31 ft31Var) {
        this.f115703a = o850Var;
        this.f115704b = ft31Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt31)) {
            return false;
        }
        jt31 jt31Var = (jt31) obj;
        return this.f115703a == jt31Var.f115703a && wj50.m88271j(this.f115704b, jt31Var.f115704b);
    }

    public final int hashCode() {
        return this.f115704b.hashCode() + (this.f115703a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f115703a.name());
        this.f115704b.writeToParcel(parcel, i);
    }
}
