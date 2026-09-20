package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class xx7 implements Parcelable {
    public static final Parcelable.Creator<xx7> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final xx7 f266885a;

    /* JADX INFO: renamed from: b */
    public static final xx7 f266886b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ xx7[] f266887c;

    static {
        xx7 xx7Var = new xx7("CORE", 0);
        f266885a = xx7Var;
        xx7 xx7Var2 = new xx7("BACKEND", 1);
        f266886b = xx7Var2;
        f266887c = new xx7[]{xx7Var, xx7Var2};
        CREATOR = new na7(17);
    }

    public static xx7 valueOf(String str) {
        return (xx7) Enum.valueOf(xx7.class, str);
    }

    public static xx7[] values() {
        return (xx7[]) f266887c.clone();
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
