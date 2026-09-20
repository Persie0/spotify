package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class l6f1 extends AbstractC2206o9 {
    public static final Parcelable.Creator<l6f1> CREATOR = new c5f1(21);

    /* JADX INFO: renamed from: a */
    public final String f130365a;

    public l6f1(String str) {
        this.f130365a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l6f1) {
            return acc.m25453c(this.f130365a, ((l6f1) obj).f130365a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f130365a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        alf1.m26308N(parcel, 2, this.f130365a);
        alf1.m26316V(iM26314T, parcel);
    }
}
