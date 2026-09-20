package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class mzq implements Parcelable {
    public static final Parcelable.Creator<mzq> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final mzq f148759a;

    /* JADX INFO: renamed from: b */
    public static final mzq f148760b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ mzq[] f148761c;

    static {
        mzq mzqVar = new mzq("INTENT_LED_SIGNUP", 0);
        f148759a = mzqVar;
        mzq mzqVar2 = new mzq("INTENT_LED_LOGIN", 1);
        f148760b = mzqVar2;
        f148761c = new mzq[]{mzqVar, mzqVar2};
        CREATOR = new lso(18);
    }

    public static mzq valueOf(String str) {
        return (mzq) Enum.valueOf(mzq.class, str);
    }

    public static mzq[] values() {
        return (mzq[]) f148761c.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
