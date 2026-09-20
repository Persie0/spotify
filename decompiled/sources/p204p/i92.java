package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class i92 extends k92 {
    public static final Parcelable.Creator<i92> CREATOR = new zt1(23);

    /* JADX INFO: renamed from: b */
    public final o52 f99889b;

    public i92(o52 o52Var) {
        super("https://age-assurance.spotify.com/check/start");
        this.f99889b = o52Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i92) && wj50.m88271j(this.f99889b, ((i92) obj).f99889b);
    }

    public final int hashCode() {
        return this.f99889b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f99889b, i);
    }
}
