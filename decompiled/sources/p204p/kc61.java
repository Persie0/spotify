package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class kc61 implements Parcelable {
    public static final Parcelable.Creator<kc61> CREATOR = new e361(26);

    /* JADX INFO: renamed from: a */
    public final int f121393a;

    /* JADX INFO: renamed from: b */
    public final gc61 f121394b;

    public kc61(int i, gc61 gc61Var) {
        this.f121393a = i;
        this.f121394b = gc61Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc61)) {
            return false;
        }
        kc61 kc61Var = (kc61) obj;
        return this.f121393a == kc61Var.f121393a && wj50.m88271j(this.f121394b, kc61Var.f121394b);
    }

    public final int hashCode() {
        return this.f121394b.hashCode() + (Integer.hashCode(this.f121393a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f121393a);
        parcel.writeParcelable(this.f121394b, i);
    }
}
