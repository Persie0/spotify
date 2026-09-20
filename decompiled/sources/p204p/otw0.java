package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class otw0 implements Parcelable {
    public static final Parcelable.Creator<otw0> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final otw0 f170109a;

    /* JADX INFO: renamed from: b */
    public static final otw0 f170110b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ otw0[] f170111c;

    static {
        otw0 otw0Var = new otw0("LYRICS", 0);
        f170109a = otw0Var;
        otw0 otw0Var2 = new otw0("TRANSLATION", 1);
        f170110b = otw0Var2;
        f170111c = new otw0[]{otw0Var, otw0Var2};
        CREATOR = new b8w0(23);
    }

    public static otw0 valueOf(String str) {
        return (otw0) Enum.valueOf(otw0.class, str);
    }

    public static otw0[] values() {
        return (otw0[]) f170111c.clone();
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
