package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.qs */
/* JADX INFO: loaded from: classes4.dex */
public final class C2312qs implements InterfaceC2426ts {
    public static final Parcelable.Creator<C2312qs> CREATOR = new C2267ps(0);

    /* JADX INFO: renamed from: a */
    public final boolean f191929a;

    /* JADX INFO: renamed from: b */
    public final boolean f191930b;

    /* JADX INFO: renamed from: c */
    public final boolean f191931c;

    public C2312qs(boolean z, boolean z2, boolean z3) {
        this.f191929a = z;
        this.f191930b = z2;
        this.f191931c = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2312qs)) {
            return false;
        }
        C2312qs c2312qs = (C2312qs) obj;
        return this.f191929a == c2312qs.f191929a && this.f191930b == c2312qs.f191930b && this.f191931c == c2312qs.f191931c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f191931c) + s571.m77245d(Boolean.hashCode(this.f191929a) * 31, 31, this.f191930b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f191929a ? 1 : 0);
        parcel.writeInt(this.f191930b ? 1 : 0);
        parcel.writeInt(this.f191931c ? 1 : 0);
    }
}
