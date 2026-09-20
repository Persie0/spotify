package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class zth0 implements Parcelable {
    public static final Parcelable.Creator<zth0> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final zth0 f286167a;

    /* JADX INFO: renamed from: b */
    public static final zth0 f286168b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ zth0[] f286169c;

    static {
        zth0 zth0Var = new zth0("PLAYBACK", 0);
        f286167a = zth0Var;
        zth0 zth0Var2 = new zth0("SELECTION", 1);
        f286168b = zth0Var2;
        f286169c = new zth0[]{zth0Var, zth0Var2};
        CREATOR = new xuf0(11);
    }

    public static zth0 valueOf(String str) {
        return (zth0) Enum.valueOf(zth0.class, str);
    }

    public static zth0[] values() {
        return (zth0[]) f286169c.clone();
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
