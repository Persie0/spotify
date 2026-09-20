package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class hjr0 implements Parcelable {
    public static final Parcelable.Creator<hjr0> CREATOR = new uir0(3);

    /* JADX INFO: renamed from: a */
    public final String f92244a;

    /* JADX INFO: renamed from: b */
    public final hu51 f92245b;

    public hjr0(String str, hu51 hu51Var) {
        this.f92244a = str;
        this.f92245b = hu51Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjr0)) {
            return false;
        }
        hjr0 hjr0Var = (hjr0) obj;
        return wj50.m88271j(this.f92244a, hjr0Var.f92244a) && this.f92245b == hjr0Var.f92245b;
    }

    public final int hashCode() {
        return this.f92245b.hashCode() + (this.f92244a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f92244a);
        parcel.writeString(this.f92245b.name());
    }
}
