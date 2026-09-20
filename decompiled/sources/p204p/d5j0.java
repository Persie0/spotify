package p204p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class d5j0 implements f5j0 {
    public static final Parcelable.Creator<d5j0> CREATOR = new rri0(12);

    /* JADX INFO: renamed from: a */
    public final Intent f45457a;

    public d5j0(Intent intent) {
        this.f45457a = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d5j0) && wj50.m88271j(this.f45457a, ((d5j0) obj).f45457a);
    }

    public final int hashCode() {
        return this.f45457a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f45457a, i);
    }
}
