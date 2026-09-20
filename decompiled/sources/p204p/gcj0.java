package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class gcj0 implements Parcelable {
    public static final Parcelable.Creator<gcj0> CREATOR = new rri0(23);

    /* JADX INFO: renamed from: a */
    public final ecj0 f78610a;

    public gcj0(ecj0 ecj0Var) {
        this.f78610a = ecj0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gcj0) && wj50.m88271j(this.f78610a, ((gcj0) obj).f78610a);
    }

    public final int hashCode() {
        return this.f78610a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f78610a.writeToParcel(parcel, i);
    }
}
