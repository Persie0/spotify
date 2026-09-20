package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class pmf1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f179064a = 0;

    static {
        pmf1.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static Parcelable m70341a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
