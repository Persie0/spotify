package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ot10 implements Parcelable {
    public static final Parcelable.Creator<ot10> CREATOR = new km10(15);

    /* JADX INFO: renamed from: a */
    public final ss10 f168947a;

    /* JADX INFO: renamed from: b */
    public final boolean f168948b;

    public ot10(ss10 ss10Var, boolean z) {
        this.f168947a = ss10Var;
        this.f168948b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot10)) {
            return false;
        }
        ot10 ot10Var = (ot10) obj;
        return this.f168947a == ot10Var.f168947a && this.f168948b == ot10Var.f168948b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f168948b) + (this.f168947a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f168947a.name());
        parcel.writeInt(this.f168948b ? 1 : 0);
    }
}
