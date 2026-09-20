package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class hda implements Parcelable {
    public static final Parcelable.Creator<hda> CREATOR = new dc9(20);

    /* JADX INFO: renamed from: a */
    public final dca f90087a;

    public hda(dca dcaVar) {
        this.f90087a = dcaVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hda) && wj50.m88271j(this.f90087a, ((hda) obj).f90087a);
    }

    public final int hashCode() {
        return this.f90087a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f90087a, i);
    }
}
