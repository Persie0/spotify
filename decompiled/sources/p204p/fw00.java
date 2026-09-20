package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class fw00 implements Parcelable {
    public static final Parcelable.Creator<fw00> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final fw00 f73915a;

    /* JADX INFO: renamed from: b */
    public static final fw00 f73916b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ fw00[] f73917c;

    static {
        fw00 fw00Var = new fw00("UNSPECIFIED", 0);
        f73915a = fw00Var;
        fw00 fw00Var2 = new fw00("ENTITLEMENT_MISSING", 1);
        f73916b = fw00Var2;
        f73917c = new fw00[]{fw00Var, fw00Var2};
        CREATOR = new k700(19);
    }

    public static fw00 valueOf(String str) {
        return (fw00) Enum.valueOf(fw00.class, str);
    }

    public static fw00[] values() {
        return (fw00[]) f73917c.clone();
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
