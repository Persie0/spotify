package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.fc */
/* JADX INFO: loaded from: classes8.dex */
public final class C1855fc extends AbstractC1892gc implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final C1855fc f67961a = new C1855fc();
    public static final Parcelable.Creator<C1855fc> CREATOR = new ora(27);

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
