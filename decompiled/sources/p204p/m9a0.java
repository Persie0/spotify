package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.yourupdates.domain.models.FetchMode;

/* JADX INFO: loaded from: classes11.dex */
public final class m9a0 extends gaa0 {
    public static final Parcelable.Creator<m9a0> CREATOR = new z8a0(6);

    /* JADX INFO: renamed from: a */
    public final FetchMode f141243a;

    public m9a0(FetchMode fetchMode) {
        this.f141243a = fetchMode;
    }

    @Override // p204p.gaa0
    /* JADX INFO: renamed from: c */
    public final FetchMode mo44148c() {
        return this.f141243a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m9a0) && this.f141243a == ((m9a0) obj).f141243a;
    }

    public final int hashCode() {
        return this.f141243a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f141243a.name());
    }
}
