package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.sk */
/* JADX INFO: loaded from: classes7.dex */
public final class C2379sk extends AbstractC2616yk {

    /* JADX INFO: renamed from: b */
    public static final C2379sk f209961b = new C2379sk(true);
    public static final Parcelable.Creator<C2379sk> CREATOR = new C2047kc(12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C2379sk);
    }

    public final int hashCode() {
        return -1080980627;
    }

    public final String toString() {
        return "Pin";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
