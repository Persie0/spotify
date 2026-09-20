package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class apu0 implements Parcelable {
    public static final Parcelable.Creator<apu0> CREATOR = new v5u0(23);

    /* JADX INFO: renamed from: a */
    public final String f18014a;

    /* JADX INFO: renamed from: b */
    public final boolean f18015b;

    public apu0(String str, boolean z) {
        this.f18014a = str;
        this.f18015b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apu0)) {
            return false;
        }
        apu0 apu0Var = (apu0) obj;
        return wj50.m88271j(this.f18014a, apu0Var.f18014a) && this.f18015b == apu0Var.f18015b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18015b) + (this.f18014a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18014a);
        parcel.writeInt(this.f18015b ? 1 : 0);
    }
}
