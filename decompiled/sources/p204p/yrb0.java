package p204p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class yrb0 implements Parcelable {
    public static final Parcelable.Creator<yrb0> CREATOR = new apb0(12);

    /* JADX INFO: renamed from: a */
    public final Bundle f275441a;

    public yrb0(Bundle bundle) {
        this.f275441a = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yrb0) && wj50.m88271j(this.f275441a, ((yrb0) obj).f275441a);
    }

    public final int hashCode() {
        return this.f275441a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f275441a);
    }
}
