package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class pgx extends AbstractC2206o9 {
    public static final Parcelable.Creator<pgx> CREATOR = new nlf1(12);

    /* JADX INFO: renamed from: a */
    public String f177425a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pgx) {
            return mvl0.m62956s(this.f177425a, ((pgx) obj).f177425a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f177425a});
    }

    /* JADX INFO: renamed from: k */
    public final String m69932k() {
        return this.f177425a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        alf1.m26308N(parcel, 1, this.f177425a);
        alf1.m26316V(iM26314T, parcel);
    }
}
