package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class q0b0 extends w0b0 {
    public static final Parcelable.Creator<q0b0> CREATOR = new l0b0(4);

    /* JADX INFO: renamed from: a */
    public final String f183944a;

    /* JADX INFO: renamed from: b */
    public final String f183945b;

    public q0b0(String str, String str2) {
        this.f183944a = str;
        this.f183945b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0b0)) {
            return false;
        }
        q0b0 q0b0Var = (q0b0) obj;
        return wj50.m88271j(this.f183944a, q0b0Var.f183944a) && wj50.m88271j(this.f183945b, q0b0Var.f183945b);
    }

    public final int hashCode() {
        return this.f183945b.hashCode() + (this.f183944a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f183944a);
        parcel.writeString(this.f183945b);
    }

    public /* synthetic */ q0b0(String str) {
        this(str, "");
    }
}
