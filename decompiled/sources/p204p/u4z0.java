package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
@rtz0
public final class u4z0 extends v4z0 {

    /* JADX INFO: renamed from: b */
    public final String f226859b;
    public static final t4z0 Companion = new t4z0();
    public static final Parcelable.Creator<u4z0> CREATOR = new lpy0(23);

    public /* synthetic */ u4z0(int i, String str) {
        if (1 == (i & 1)) {
            this.f226859b = str;
        } else {
            edo.m38617p(i, 1, s4z0.f205669a.getDescriptor());
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u4z0) && wj50.m88271j(this.f226859b, ((u4z0) obj).f226859b);
    }

    public final int hashCode() {
        return this.f226859b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f226859b);
    }

    public u4z0(String str) {
        this.f226859b = str;
    }
}
