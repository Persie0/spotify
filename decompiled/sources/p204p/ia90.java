package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ia90 implements Parcelable {
    public static final Parcelable.Creator<ia90> CREATOR = new x390(23);

    /* JADX INFO: renamed from: a */
    public final String f100201a;

    /* JADX INFO: renamed from: b */
    public final String f100202b;

    /* JADX INFO: renamed from: c */
    public final ha90 f100203c;

    public ia90(String str, String str2, ha90 ha90Var) {
        this.f100201a = str;
        this.f100202b = str2;
        this.f100203c = ha90Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia90)) {
            return false;
        }
        ia90 ia90Var = (ia90) obj;
        return wj50.m88271j(this.f100201a, ia90Var.f100201a) && wj50.m88271j(this.f100202b, ia90Var.f100202b) && wj50.m88271j(this.f100203c, ia90Var.f100203c);
    }

    public final int hashCode() {
        int iHashCode = this.f100201a.hashCode() * 31;
        String str = this.f100202b;
        return this.f100203c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f100201a);
        parcel.writeString(this.f100202b);
        parcel.writeParcelable(this.f100203c, i);
    }
}
