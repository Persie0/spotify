package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ku01 implements Parcelable {
    public static final Parcelable.Creator<ku01> CREATOR = new sp01(24);

    /* JADX INFO: renamed from: a */
    public final e2r f126425a;

    public ku01(e2r e2rVar) {
        this.f126425a = e2rVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ku01) && wj50.m88271j(this.f126425a, ((ku01) obj).f126425a);
    }

    public final int hashCode() {
        return this.f126425a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f126425a.writeToParcel(parcel, i);
    }

    public ku01() {
        this(new e2r(3, uo01.f232305a));
    }
}
