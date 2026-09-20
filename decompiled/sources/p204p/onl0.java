package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class onl0 implements Parcelable {
    public static final Parcelable.Creator<onl0> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final onl0 f167287a;

    /* JADX INFO: renamed from: b */
    public static final onl0 f167288b;

    /* JADX INFO: renamed from: c */
    public static final onl0 f167289c;

    /* JADX INFO: renamed from: d */
    public static final onl0 f167290d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ onl0[] f167291e;

    static {
        onl0 onl0Var = new onl0("NONE", 0);
        f167287a = onl0Var;
        onl0 onl0Var2 = new onl0("DUPLICATING_MIX", 1);
        f167288b = onl0Var2;
        onl0 onl0Var3 = new onl0("SAVING_TRANSITION", 2);
        f167289c = onl0Var3;
        onl0 onl0Var4 = new onl0("SAVING_AND_SHARING", 3);
        f167290d = onl0Var4;
        f167291e = new onl0[]{onl0Var, onl0Var2, onl0Var3, onl0Var4};
        CREATOR = new hbl0(26);
    }

    public static onl0 valueOf(String str) {
        return (onl0) Enum.valueOf(onl0.class, str);
    }

    public static onl0[] values() {
        return (onl0[]) f167291e.clone();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m67416c() {
        return this == f167289c || this == f167290d;
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
