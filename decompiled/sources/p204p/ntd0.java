package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class ntd0 implements Parcelable {
    public static final Parcelable.Creator<ntd0> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final ntd0 f158052a;

    /* JADX INFO: renamed from: b */
    public static final ntd0 f158053b;

    /* JADX INFO: renamed from: c */
    public static final ntd0 f158054c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ntd0[] f158055d;

    static {
        ntd0 ntd0Var = new ntd0("PLAYING", 0);
        f158052a = ntd0Var;
        ntd0 ntd0Var2 = new ntd0("PAUSED", 1);
        f158053b = ntd0Var2;
        ntd0 ntd0Var3 = new ntd0("STOPPED", 2);
        f158054c = ntd0Var3;
        f158055d = new ntd0[]{ntd0Var, ntd0Var2, ntd0Var3};
        CREATOR = new jfd0(8);
    }

    public static ntd0 valueOf(String str) {
        return (ntd0) Enum.valueOf(ntd0.class, str);
    }

    public static ntd0[] values() {
        return (ntd0[]) f158055d.clone();
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
