package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class jcv0 implements Parcelable {
    public static final Parcelable.Creator<jcv0> CREATOR = new h1v0(8);

    /* JADX INFO: renamed from: a */
    public final int f111195a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f111196b;

    public jcv0(int i, ArrayList arrayList) {
        this.f111195a = i;
        this.f111196b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcv0)) {
            return false;
        }
        jcv0 jcv0Var = (jcv0) obj;
        return this.f111195a == jcv0Var.f111195a && this.f111196b.equals(jcv0Var.f111196b);
    }

    public final int hashCode() {
        return this.f111196b.hashCode() + (edb.m38547C(this.f111195a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        switch (this.f111195a) {
            case 1:
                str = "RECOMMENDATIONS_TYPE_UNKNOWN";
                break;
            case 2:
                str = "RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_ARTIST";
                break;
            case 3:
                str = "RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_GENRE";
                break;
            case 4:
                str = "RECOMMENDATIONS_TYPE_PODCASTS_FOR_CATEGORY";
                break;
            case 5:
                str = "RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_TRACK";
                break;
            case 6:
                str = "RECOMMENDATIONS_TYPE_TOPICS_WITH_EPISODE";
                break;
            case 7:
                str = "RECOMMENDATIONS_TYPE_PERSONALIZED_PODCASTS_FOR_CATEGORY";
                break;
            case 8:
                str = "UNRECOGNIZED";
                break;
            default:
                throw null;
        }
        parcel.writeString(str);
        Iterator itM42469m = fr0.m42469m(this.f111196b, parcel);
        while (itM42469m.hasNext()) {
            ((zbv) itM42469m.next()).writeToParcel(parcel, i);
        }
    }
}
