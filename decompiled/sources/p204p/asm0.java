package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class asm0 extends ksm0 {
    public static final Parcelable.Creator<asm0> CREATOR = new cpl0(20);

    /* JADX INFO: renamed from: a */
    public final String f19471a;

    /* JADX INFO: renamed from: b */
    public final String f19472b;

    public asm0(String str, String str2) {
        this.f19471a = str;
        this.f19472b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asm0)) {
            return false;
        }
        asm0 asm0Var = (asm0) obj;
        return wj50.m88271j(this.f19471a, asm0Var.f19471a) && wj50.m88271j(this.f19472b, asm0Var.f19472b);
    }

    public final int hashCode() {
        return this.f19472b.hashCode() + (this.f19471a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19471a);
        parcel.writeString(this.f19472b);
    }
}
