package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class is31 implements Parcelable {
    public static final Parcelable.Creator<is31> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final is31 f105120a;

    /* JADX INFO: renamed from: b */
    public static final is31 f105121b;

    /* JADX INFO: renamed from: c */
    public static final is31 f105122c;

    /* JADX INFO: renamed from: d */
    public static final is31 f105123d;

    /* JADX INFO: renamed from: e */
    public static final is31 f105124e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ is31[] f105125f;

    static {
        is31 is31Var = new is31("NAME", 0);
        f105121b = is31Var;
        is31 is31Var2 = new is31("ADD_TIME", 1);
        f105122c = is31Var2;
        is31 is31Var3 = new is31("RECENTLY_UPDATED", 2);
        f105123d = is31Var3;
        is31 is31Var4 = new is31("RECENTLY_PLAYED_RANK", 3);
        f105124e = is31Var4;
        f105125f = new is31[]{is31Var, is31Var2, is31Var3, is31Var4};
        CREATOR = new ln31(12);
        f105120a = is31Var3;
    }

    public static is31 valueOf(String str) {
        return (is31) Enum.valueOf(is31.class, str);
    }

    public static is31[] values() {
        return (is31[]) f105125f.clone();
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
