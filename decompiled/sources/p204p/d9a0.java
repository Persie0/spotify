package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class d9a0 implements faa0 {
    public static final Parcelable.Creator<d9a0> CREATOR = new z8a0(0);

    /* JADX INFO: renamed from: a */
    public final Throwable f46771a;

    public d9a0(Throwable th) {
        this.f46771a = th;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d9a0) && wj50.m88271j(this.f46771a, ((d9a0) obj).f46771a);
    }

    public final int hashCode() {
        return this.f46771a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f46771a);
    }
}
