package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.yourupdates.domain.models.FetchMode;

/* JADX INFO: loaded from: classes11.dex */
public final class o9a0 extends gaa0 {
    public static final Parcelable.Creator<o9a0> CREATOR = new z8a0(8);

    /* JADX INFO: renamed from: a */
    public final FetchMode f162987a;

    public o9a0(FetchMode fetchMode) {
        this.f162987a = fetchMode;
    }

    @Override // p204p.gaa0
    /* JADX INFO: renamed from: c */
    public final FetchMode mo44148c() {
        return this.f162987a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o9a0) && this.f162987a == ((o9a0) obj).f162987a;
    }

    public final int hashCode() {
        return this.f162987a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f162987a.name());
    }
}
