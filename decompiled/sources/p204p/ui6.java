package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ui6 implements Parcelable {
    public static final Parcelable.Creator<ui6> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final ui6 f230601a;

    /* JADX INFO: renamed from: b */
    public static final ui6 f230602b;

    /* JADX INFO: renamed from: c */
    public static final ui6 f230603c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ui6[] f230604d;

    static {
        ui6 ui6Var = new ui6("SINGLE_ADD", 0);
        f230601a = ui6Var;
        ui6 ui6Var2 = new ui6("SINGLE_SELECT", 1);
        f230602b = ui6Var2;
        ui6 ui6Var3 = new ui6("MULTI_ADD", 2);
        f230603c = ui6Var3;
        f230604d = new ui6[]{ui6Var, ui6Var2, ui6Var3};
        CREATOR = new fi6(5);
    }

    public static ui6 valueOf(String str) {
        return (ui6) Enum.valueOf(ui6.class, str);
    }

    public static ui6[] values() {
        return (ui6[]) f230604d.clone();
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
