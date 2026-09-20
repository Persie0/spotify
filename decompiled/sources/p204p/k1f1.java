package p204p;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class k1f1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f118314a = 0;

    static {
        k1f1.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static Parcelable m55092a(Parcel parcel) {
        Parcelable.Creator creator = Bundle.CREATOR;
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m55093b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(s571.m77246e(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
