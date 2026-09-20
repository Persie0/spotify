package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.ic */
/* JADX INFO: loaded from: classes8.dex */
public final class C1974ic extends AbstractC2010jc implements Parcelable {
    public static final Parcelable.Creator<C1974ic> CREATOR = new ora(29);

    /* JADX INFO: renamed from: a */
    public final boolean f100698a;

    /* JADX INFO: renamed from: b */
    public final boolean f100699b;

    public C1974ic(boolean z, boolean z2) {
        this.f100698a = z;
        this.f100699b = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1974ic)) {
            return false;
        }
        C1974ic c1974ic = (C1974ic) obj;
        return this.f100698a == c1974ic.f100698a && this.f100699b == c1974ic.f100699b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f100699b) + (Boolean.hashCode(this.f100698a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f100698a ? 1 : 0);
        parcel.writeInt(this.f100699b ? 1 : 0);
    }
}
