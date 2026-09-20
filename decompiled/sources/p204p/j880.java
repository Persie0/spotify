package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class j880 extends k980 {

    /* JADX INFO: renamed from: b */
    public static final j880 f109864b = new j880(true);
    public static final Parcelable.Creator<j880> CREATOR = new o580(5);

    @Override // p204p.k980
    /* JADX INFO: renamed from: c */
    public final List mo25080c() {
        return lau.f131415a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof j880);
    }

    public final int hashCode() {
        return -158750343;
    }

    public final String toString() {
        return "AllFolders";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
