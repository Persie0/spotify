package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class tcb1 implements vcb1 {
    public static final Parcelable.Creator<tcb1> CREATOR = new c8b1(4);

    /* JADX INFO: renamed from: a */
    public final nen0 f219062a;

    /* JADX INFO: renamed from: b */
    public final String f219063b;

    public tcb1(nen0 nen0Var, String str) {
        this.f219062a = nen0Var;
        this.f219063b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tcb1)) {
            return false;
        }
        tcb1 tcb1Var = (tcb1) obj;
        return wj50.m88271j(this.f219062a, tcb1Var.f219062a) && wj50.m88271j(this.f219063b, tcb1Var.f219063b);
    }

    public final int hashCode() {
        nen0 nen0Var = this.f219062a;
        return this.f219063b.hashCode() + ((nen0Var == null ? 0 : nen0Var.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        nen0 nen0Var = this.f219062a;
        if (nen0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nen0Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f219063b);
    }
}
