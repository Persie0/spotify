package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class e7w0 implements h7w0 {
    public static final Parcelable.Creator<e7w0> CREATOR = new h1v0(26);

    /* JADX INFO: renamed from: a */
    public final m8w0 f57015a;

    public e7w0(m8w0 m8w0Var) {
        this.f57015a = m8w0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e7w0) && wj50.m88271j(this.f57015a, ((e7w0) obj).f57015a);
    }

    public final int hashCode() {
        return this.f57015a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f57015a, i);
    }
}
