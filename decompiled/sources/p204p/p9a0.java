package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.yourupdates.domain.models.FetchMode;

/* JADX INFO: loaded from: classes11.dex */
public final class p9a0 extends gaa0 {
    public static final Parcelable.Creator<p9a0> CREATOR = new z8a0(9);

    /* JADX INFO: renamed from: a */
    public final FetchMode f175194a;

    /* JADX INFO: renamed from: b */
    public final i8a0 f175195b;

    public p9a0(FetchMode fetchMode, i8a0 i8a0Var) {
        this.f175194a = fetchMode;
        this.f175195b = i8a0Var;
    }

    @Override // p204p.gaa0
    /* JADX INFO: renamed from: c */
    public final FetchMode mo44148c() {
        return this.f175194a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9a0)) {
            return false;
        }
        p9a0 p9a0Var = (p9a0) obj;
        return this.f175194a == p9a0Var.f175194a && wj50.m88271j(this.f175195b, p9a0Var.f175195b);
    }

    public final int hashCode() {
        return this.f175195b.hashCode() + (this.f175194a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f175194a.name());
        parcel.writeParcelable(this.f175195b, i);
    }
}
