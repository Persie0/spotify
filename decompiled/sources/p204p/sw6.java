package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class sw6 implements Parcelable {
    public static final Parcelable.Creator<sw6> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final sw6 f214590a;

    /* JADX INFO: renamed from: b */
    public static final sw6 f214591b;

    /* JADX INFO: renamed from: c */
    public static final sw6 f214592c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ sw6[] f214593d;

    static {
        sw6 sw6Var = new sw6("UNSPECIFIED", 0);
        f214590a = sw6Var;
        sw6 sw6Var2 = new sw6("TALK", 1);
        f214591b = sw6Var2;
        sw6 sw6Var3 = new sw6("MUSIC", 2);
        f214592c = sw6Var3;
        f214593d = new sw6[]{sw6Var, sw6Var2, sw6Var3};
        CREATOR = new fi6(21);
    }

    public static sw6 valueOf(String str) {
        return (sw6) Enum.valueOf(sw6.class, str);
    }

    public static sw6[] values() {
        return (sw6[]) f214593d.clone();
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
