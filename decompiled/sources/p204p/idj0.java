package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class idj0 implements Parcelable {
    public static final Parcelable.Creator<idj0> CREATOR = new rri0(25);

    /* JADX INFO: renamed from: a */
    public final gdj0 f101142a;

    public idj0(gdj0 gdj0Var) {
        this.f101142a = gdj0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof idj0) && wj50.m88271j(this.f101142a, ((idj0) obj).f101142a);
    }

    public final int hashCode() {
        return this.f101142a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f101142a.writeToParcel(parcel, i);
    }
}
