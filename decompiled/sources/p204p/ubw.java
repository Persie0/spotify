package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class ubw implements Parcelable {
    public static final Parcelable.Creator<ubw> CREATOR = new bwv(17);

    /* JADX INFO: renamed from: a */
    public final wbw f228895a;

    public ubw(wbw wbwVar) {
        this.f228895a = wbwVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ubw) && this.f228895a == ((ubw) obj).f228895a;
    }

    public final int hashCode() {
        return this.f228895a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f228895a.name());
    }
}
