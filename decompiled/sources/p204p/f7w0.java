package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class f7w0 implements h7w0 {
    public static final Parcelable.Creator<f7w0> CREATOR = new h1v0(27);

    /* JADX INFO: renamed from: a */
    public final fyy f66806a;

    /* JADX INFO: renamed from: b */
    public final String f66807b;

    public f7w0(fyy fyyVar, String str) {
        this.f66806a = fyyVar;
        this.f66807b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7w0)) {
            return false;
        }
        f7w0 f7w0Var = (f7w0) obj;
        return wj50.m88271j(this.f66806a, f7w0Var.f66806a) && wj50.m88271j(this.f66807b, f7w0Var.f66807b);
    }

    public final int hashCode() {
        return this.f66807b.hashCode() + (this.f66806a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f66806a.writeToParcel(parcel, i);
        parcel.writeString(this.f66807b);
    }
}
