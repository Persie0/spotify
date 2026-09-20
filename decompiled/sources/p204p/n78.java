package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class n78 implements Parcelable {
    public static final Parcelable.Creator<n78> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final n78 f151097a;

    /* JADX INFO: renamed from: b */
    public static final n78 f151098b;

    /* JADX INFO: renamed from: c */
    public static final n78 f151099c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ n78[] f151100d;

    static {
        n78 n78Var = new n78("DISABLED", 0);
        f151097a = n78Var;
        n78 n78Var2 = new n78("ENABLED", 1);
        f151098b = n78Var2;
        n78 n78Var3 = new n78("ENABLED_EXCLUSIVE", 2);
        f151099c = n78Var3;
        f151100d = new n78[]{n78Var, n78Var2, n78Var3};
        CREATOR = new na7(28);
    }

    public static n78 valueOf(String str) {
        return (n78) Enum.valueOf(n78.class, str);
    }

    public static n78[] values() {
        return (n78[]) f151100d.clone();
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
