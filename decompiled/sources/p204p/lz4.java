package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class lz4 extends nz4 {

    /* JADX INFO: renamed from: c */
    public static final lz4 f138257c = new lz4(R.anim.fade_in_hard, R.anim.fade_out_hard);
    public static final Parcelable.Creator<lz4> CREATOR = new bc3(21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
