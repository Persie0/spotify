package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.player.model.command.SignalCommand;

/* JADX INFO: loaded from: classes10.dex */
public final class tp01 extends fq01 {

    /* JADX INFO: renamed from: d */
    public static final tp01 f222377d = new tp01(15, SignalCommand.ENDPOINT_NAME);
    public static final Parcelable.Creator<tp01> CREATOR = new sp01(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tp01);
    }

    public final int hashCode() {
        return 546885762;
    }

    public final String toString() {
        return "Signal";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
