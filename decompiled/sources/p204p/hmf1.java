package p204p;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hmf1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f92976a = 0;

    static {
        hmf1.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static Parcelable m47970a(Parcel parcel) {
        Parcelable.Creator creator = Bundle.CREATOR;
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m47971b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(s571.m77246e(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
