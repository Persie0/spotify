package p204p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class rhf1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f199217a = 0;

    static {
        rhf1.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static Parcelable m75514a(Parcel parcel) {
        Parcelable.Creator creator = Bundle.CREATOR;
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
