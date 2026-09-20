package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class tdj0 implements Parcelable {
    public static final Parcelable.Creator<tdj0> CREATOR = new rri0(28);

    /* JADX INFO: renamed from: a */
    public final rdj0 f219313a;

    public tdj0(rdj0 rdj0Var) {
        this.f219313a = rdj0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tdj0) && wj50.m88271j(this.f219313a, ((tdj0) obj).f219313a);
    }

    public final int hashCode() {
        return this.f219313a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f219313a.writeToParcel(parcel, i);
    }
}
