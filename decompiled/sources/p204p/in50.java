package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class in50 implements Parcelable {
    public static final Parcelable.Creator<in50> CREATOR = new gd50(13);

    /* JADX INFO: renamed from: b */
    public static final in50 f103869b = new in50(new fn50(null));

    /* JADX INFO: renamed from: a */
    public final hn50 f103870a;

    public in50(hn50 hn50Var) {
        this.f103870a = hn50Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof in50) && wj50.m88271j(this.f103870a, ((in50) obj).f103870a);
    }

    public final int hashCode() {
        return this.f103870a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f103870a, i);
    }
}
