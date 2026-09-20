package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class ib2 implements Parcelable {
    public static final Parcelable.Creator<ib2> CREATOR = new zt1(27);

    /* JADX INFO: renamed from: a */
    public final String f100415a;

    /* JADX INFO: renamed from: b */
    public final int f100416b;

    public ib2(String str, int i) {
        this.f100415a = str;
        this.f100416b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib2)) {
            return false;
        }
        ib2 ib2Var = (ib2) obj;
        return wj50.m88271j(this.f100415a, ib2Var.f100415a) && this.f100416b == ib2Var.f100416b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f100416b) + (this.f100415a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f100415a);
        parcel.writeInt(this.f100416b);
    }
}
