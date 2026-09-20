package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ab20 implements Parcelable {
    public static final Parcelable.Creator<ab20> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final ab20 f13970a;

    /* JADX INFO: renamed from: b */
    public static final ab20 f13971b;

    /* JADX INFO: renamed from: c */
    public static final ab20 f13972c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ab20[] f13973d;

    static {
        ab20 ab20Var = new ab20("DISABLED", 0);
        f13970a = ab20Var;
        ab20 ab20Var2 = new ab20("ENABLED", 1);
        f13971b = ab20Var2;
        ab20 ab20Var3 = new ab20("ENABLED_EXCLUSIVE", 2);
        f13972c = ab20Var3;
        f13973d = new ab20[]{ab20Var, ab20Var2, ab20Var3};
        CREATOR = new t320(11);
    }

    public static ab20 valueOf(String str) {
        return (ab20) Enum.valueOf(ab20.class, str);
    }

    public static ab20[] values() {
        return (ab20[]) f13973d.clone();
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
