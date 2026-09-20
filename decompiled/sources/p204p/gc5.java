package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class gc5 implements Parcelable {
    public static final Parcelable.Creator<gc5> CREATOR = new bc3(27);

    /* JADX INFO: renamed from: a */
    public final wya0 f78493a;

    public gc5(wya0 wya0Var) {
        this.f78493a = wya0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gc5) && wj50.m88271j(this.f78493a, ((gc5) obj).f78493a);
    }

    public final int hashCode() {
        return this.f78493a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f78493a.writeToParcel(parcel, i);
    }
}
