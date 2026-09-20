package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class t170 implements Parcelable {
    public static final Parcelable.Creator<t170> CREATOR = new pq50(24);

    /* JADX INFO: renamed from: a */
    public final b370 f216169a;

    public t170(b370 b370Var) {
        this.f216169a = b370Var;
    }

    /* JADX INFO: renamed from: c */
    public final b370 m79866c() {
        return this.f216169a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t170) && wj50.m88271j(this.f216169a, ((t170) obj).f216169a);
    }

    public final int hashCode() {
        return this.f216169a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f216169a, i);
    }
}
