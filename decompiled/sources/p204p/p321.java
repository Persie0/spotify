package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class p321 implements z321 {

    /* JADX INFO: renamed from: a */
    public static final p321 f173546a = new p321();
    public static final Parcelable.Creator<p321> CREATOR = new u111(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
