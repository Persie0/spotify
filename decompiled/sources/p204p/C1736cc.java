package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.cc */
/* JADX INFO: loaded from: classes8.dex */
public final class C1736cc extends AbstractC1892gc implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final C1736cc f36273a = new C1736cc();
    public static final Parcelable.Creator<C1736cc> CREATOR = new ora(24);

    @Override // p204p.AbstractC1892gc
    /* JADX INFO: renamed from: c */
    public final boolean mo28653c() {
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
