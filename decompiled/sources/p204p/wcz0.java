package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class wcz0 implements Parcelable {
    public static final Parcelable.Creator<wcz0> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final wcz0 f250151a;

    /* JADX INFO: renamed from: b */
    public static final wcz0 f250152b;

    /* JADX INFO: renamed from: c */
    public static final wcz0 f250153c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ wcz0[] f250154d;

    static {
        wcz0 wcz0Var = new wcz0("NO_PREFETCH", 0);
        f250151a = wcz0Var;
        wcz0 wcz0Var2 = new wcz0("CONCURRENT_MAX_5", 1);
        f250152b = wcz0Var2;
        wcz0 wcz0Var3 = new wcz0("BATCH_5", 2);
        f250153c = wcz0Var3;
        f250154d = new wcz0[]{wcz0Var, wcz0Var2, wcz0Var3};
        CREATOR = new vcz0(0);
    }

    public static wcz0 valueOf(String str) {
        return (wcz0) Enum.valueOf(wcz0.class, str);
    }

    public static wcz0[] values() {
        return (wcz0[]) f250154d.clone();
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
