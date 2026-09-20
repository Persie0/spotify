package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;

/* JADX INFO: renamed from: p.vu */
/* JADX INFO: loaded from: classes4.dex */
public final class C2509vu implements Parcelable {
    public static final Parcelable.Creator<C2509vu> CREATOR = new C2267ps(3);

    /* JADX INFO: renamed from: b */
    public static final C2509vu f244797b = new C2509vu(1);

    /* JADX INFO: renamed from: a */
    public final int f244798a;

    public C2509vu(int i) {
        this.f244798a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2509vu) && this.f244798a == ((C2509vu) obj).f244798a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f244798a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.f244798a;
        if (i2 == 1) {
            str = "NOT_STARTED";
        } else if (i2 == 2) {
            str = "IN_PROGRESS";
        } else if (i2 == 3) {
            str = "CANCELLED";
        } else if (i2 == 4) {
            str = "FAILED";
        } else {
            if (i2 != 5) {
                throw null;
            }
            str = SearchEndpointResponseKt.RESULT_SUCCESS;
        }
        parcel.writeString(str);
    }
}
