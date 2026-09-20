package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class sca implements Parcelable {
    public static final Parcelable.Creator<sca> CREATOR = new dc9(19);

    /* JADX INFO: renamed from: a */
    public final jca f207671a;

    public sca(jca jcaVar) {
        this.f207671a = jcaVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sca) && wj50.m88271j(this.f207671a, ((sca) obj).f207671a);
    }

    public final int hashCode() {
        return this.f207671a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f207671a, i);
    }
}
