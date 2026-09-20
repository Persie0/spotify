package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class k8w0 implements m8w0 {
    public static final Parcelable.Creator<k8w0> CREATOR = new b8w0(2);

    /* JADX INFO: renamed from: a */
    public final Throwable f120472a;

    public k8w0(Throwable th) {
        this.f120472a = th;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k8w0) && wj50.m88271j(this.f120472a, ((k8w0) obj).f120472a);
    }

    public final int hashCode() {
        return this.f120472a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f120472a);
    }
}
