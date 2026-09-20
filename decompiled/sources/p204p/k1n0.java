package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class k1n0 implements Parcelable {
    public static final Parcelable.Creator<k1n0> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final k1n0 f118396a;

    /* JADX INFO: renamed from: b */
    public static final k1n0 f118397b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ k1n0[] f118398c;

    static {
        k1n0 k1n0Var = new k1n0("ALLOWLIST", 0);
        f118396a = k1n0Var;
        k1n0 k1n0Var2 = new k1n0("BLOCKLIST", 1);
        f118397b = k1n0Var2;
        f118398c = new k1n0[]{k1n0Var, k1n0Var2};
        CREATOR = new pum0(19);
    }

    public static k1n0 valueOf(String str) {
        return (k1n0) Enum.valueOf(k1n0.class, str);
    }

    public static k1n0[] values() {
        return (k1n0[]) f118398c.clone();
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
