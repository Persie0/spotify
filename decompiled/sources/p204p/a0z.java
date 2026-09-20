package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class a0z extends b0z {
    public static final Parcelable.Creator<a0z> CREATOR = new eqy(26);

    /* JADX INFO: renamed from: a */
    public final f2z f11216a;

    public a0z(f2z f2zVar) {
        this.f11216a = f2zVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0z) && this.f11216a == ((a0z) obj).f11216a;
    }

    public final int hashCode() {
        return this.f11216a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11216a.name());
    }
}
