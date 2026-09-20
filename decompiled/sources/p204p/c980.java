package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class c980 extends k980 {

    /* JADX INFO: renamed from: b */
    public static final c980 f35422b = new c980(false);
    public static final Parcelable.Creator<c980> CREATOR = new o580(24);

    @Override // p204p.k980
    /* JADX INFO: renamed from: c */
    public final List mo25080c() {
        return lau.f131415a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "IsMixed";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
