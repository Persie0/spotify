package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes5.dex */
public final class gi6 implements ii6 {
    public static final Parcelable.Creator<gi6> CREATOR = new fi6(0);

    /* JADX INFO: renamed from: a */
    public final String f80074a;

    /* JADX INFO: renamed from: b */
    public final int f80075b;

    /* JADX INFO: renamed from: c */
    public final String f80076c;

    /* JADX INFO: renamed from: d */
    public final cbm0 f80077d;

    public gi6(String str, int i) {
        this.f80074a = str;
        this.f80075b = i;
        Set set = dd41.f47702f;
        this.f80076c = edb.m38566o("spotify:assisted-curation:search:artist:", r46.m74726U(str).m35710h(), ":", ei6.m39069f(i));
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f80077d = xgg1.m90662N1("ASSISTED_CURATION_SEARCH_ARTIST_ENTITY", "assisted-curation/search/artist-entity", 182, "assisted-curation");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi6)) {
            return false;
        }
        gi6 gi6Var = (gi6) obj;
        return wj50.m88271j(this.f80074a, gi6Var.f80074a) && this.f80075b == gi6Var.f80075b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f80075b) + (this.f80074a.hashCode() * 31);
    }

    @Override // p204p.ii6
    /* JADX INFO: renamed from: r1 */
    public final String mo29288r1() {
        return this.f80076c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f80074a);
        int i2 = this.f80075b;
        if (i2 == 1) {
            str = "TOP_TRACKS";
        } else if (i2 == 2) {
            str = "ALBUMS";
        } else if (i2 == 3) {
            str = "SINGLES";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "APPEARS_ON";
        }
        parcel.writeString(str);
    }

    @Override // p204p.ii6
    /* JADX INFO: renamed from: z1 */
    public final cbm0 mo29289z1() {
        return this.f80077d;
    }
}
