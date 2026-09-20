package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class kz4 extends nz4 {

    /* JADX INFO: renamed from: c */
    public static final kz4 f128008c = new kz4(R.anim.slide_up, R.anim.slide_down);
    public static final Parcelable.Creator<kz4> CREATOR = new bc3(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
