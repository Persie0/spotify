package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.allboarding.entrypoint.EntryPoint;

/* JADX INFO: loaded from: classes3.dex */
public final class wj3 implements Parcelable {
    public static final Parcelable.Creator<wj3> CREATOR = new bc3(8);

    /* JADX INFO: renamed from: a */
    public final EntryPoint f251836a;

    public wj3(EntryPoint entryPoint) {
        this.f251836a = entryPoint;
    }

    /* JADX INFO: renamed from: c */
    public final EntryPoint m88243c() {
        return this.f251836a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wj3) && this.f251836a == ((wj3) obj).f251836a;
    }

    public final int hashCode() {
        return this.f251836a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f251836a.name());
    }
}
