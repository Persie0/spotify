package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class b980 extends k980 {

    /* JADX INFO: renamed from: b */
    public static final b980 f24800b = new b980(false);
    public static final Parcelable.Creator<b980> CREATOR = new o580(23);

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
        return "InProgress";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
