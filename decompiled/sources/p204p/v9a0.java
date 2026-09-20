package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.yourupdates.domain.models.FetchMode;

/* JADX INFO: loaded from: classes11.dex */
public final class v9a0 extends gaa0 {
    public static final Parcelable.Creator<v9a0> CREATOR = new z8a0(12);

    /* JADX INFO: renamed from: a */
    public final FetchMode f238892a;

    public v9a0(FetchMode fetchMode) {
        this.f238892a = fetchMode;
    }

    @Override // p204p.gaa0
    /* JADX INFO: renamed from: c */
    public final FetchMode mo44148c() {
        return this.f238892a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v9a0) && this.f238892a == ((v9a0) obj).f238892a;
    }

    public final int hashCode() {
        return this.f238892a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f238892a.name());
    }
}
