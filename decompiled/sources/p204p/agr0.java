package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class agr0 implements Parcelable {
    public static final Parcelable.Creator<agr0> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final agr0 f15482a;

    /* JADX INFO: renamed from: b */
    public static final agr0 f15483b;

    /* JADX INFO: renamed from: c */
    public static final agr0 f15484c;

    /* JADX INFO: renamed from: d */
    public static final agr0 f15485d;

    /* JADX INFO: renamed from: e */
    public static final agr0 f15486e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ agr0[] f15487f;

    static {
        agr0 agr0Var = new agr0("Unknown", 0);
        f15482a = agr0Var;
        agr0 agr0Var2 = new agr0("Coppa", 1);
        f15483b = agr0Var2;
        agr0 agr0Var3 = new agr0("Non", 2);
        f15484c = agr0Var3;
        agr0 agr0Var4 = new agr0("Implicit", 3);
        f15485d = agr0Var4;
        agr0 agr0Var5 = new agr0("Explicit", 4);
        f15486e = agr0Var5;
        f15487f = new agr0[]{agr0Var, agr0Var2, agr0Var3, agr0Var4, agr0Var5};
        CREATOR = new vzq0(24);
    }

    public static agr0 valueOf(String str) {
        return (agr0) Enum.valueOf(agr0.class, str);
    }

    public static agr0[] values() {
        return (agr0[]) f15487f.clone();
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
