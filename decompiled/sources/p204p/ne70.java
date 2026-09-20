package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class ne70 implements Parcelable {
    public static final Parcelable.Creator<ne70> CREATOR = new w270(5);

    /* JADX INFO: renamed from: a */
    public final boolean f152943a;

    /* JADX INFO: renamed from: b */
    public final boolean f152944b;

    public ne70(boolean z, boolean z2) {
        this.f152943a = z;
        this.f152944b = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne70)) {
            return false;
        }
        ne70 ne70Var = (ne70) obj;
        return this.f152943a == ne70Var.f152943a && this.f152944b == ne70Var.f152944b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f152944b) + (Boolean.hashCode(this.f152943a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f152943a ? 1 : 0);
        parcel.writeInt(this.f152944b ? 1 : 0);
    }
}
