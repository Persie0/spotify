package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.allboarding.entrypoint.EntryPoint;

/* JADX INFO: loaded from: classes3.dex */
public final class ac3 extends ec3 {
    public static final Parcelable.Creator<ac3> CREATOR = new lb2(29);

    /* JADX INFO: renamed from: a */
    public final EntryPoint f14229a;

    public ac3(EntryPoint entryPoint) {
        this.f14229a = entryPoint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ac3) && this.f14229a == ((ac3) obj).f14229a;
    }

    public final int hashCode() {
        return this.f14229a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14229a.name());
    }
}
