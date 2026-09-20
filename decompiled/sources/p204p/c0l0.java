package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c0l0 implements Parcelable {
    public static final Parcelable.Creator<c0l0> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final c0l0 f32819a;

    /* JADX INFO: renamed from: b */
    public static final c0l0 f32820b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ c0l0[] f32821c;

    static {
        c0l0 c0l0Var = new c0l0("OFF", 0);
        f32819a = c0l0Var;
        c0l0 c0l0Var2 = new c0l0("ON", 1);
        f32820b = c0l0Var2;
        f32821c = new c0l0[]{c0l0Var, c0l0Var2};
        CREATOR = new oxk0(4);
    }

    public static c0l0 valueOf(String str) {
        return (c0l0) Enum.valueOf(c0l0.class, str);
    }

    public static c0l0[] values() {
        return (c0l0[]) f32821c.clone();
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
