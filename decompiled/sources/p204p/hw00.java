package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class hw00 implements Parcelable {
    public static final Parcelable.Creator<hw00> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final hw00 f95828a;

    /* JADX INFO: renamed from: b */
    public static final hw00 f95829b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ hw00[] f95830c;

    static {
        hw00 hw00Var = new hw00("UNSPECIFIED", 0);
        f95828a = hw00Var;
        hw00 hw00Var2 = new hw00("PREMIUM", 1);
        f95829b = hw00Var2;
        f95830c = new hw00[]{hw00Var, hw00Var2};
        CREATOR = new k700(20);
    }

    public static hw00 valueOf(String str) {
        return (hw00) Enum.valueOf(hw00.class, str);
    }

    public static hw00[] values() {
        return (hw00[]) f95830c.clone();
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
