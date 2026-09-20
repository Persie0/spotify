package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class rbw extends sbw {
    public static final Parcelable.Creator<rbw> CREATOR = new bwv(15);

    /* JADX INFO: renamed from: a */
    public final wbw f197669a;

    public rbw(wbw wbwVar) {
        this.f197669a = wbwVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rbw) && this.f197669a == ((rbw) obj).f197669a;
    }

    public final int hashCode() {
        return this.f197669a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f197669a.name());
    }
}
