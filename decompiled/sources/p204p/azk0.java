package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class azk0 implements Parcelable {
    public static final Parcelable.Creator<azk0> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final azk0 f21636a;

    /* JADX INFO: renamed from: b */
    public static final azk0 f21637b;

    /* JADX INFO: renamed from: c */
    public static final azk0 f21638c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ azk0[] f21639d;

    static {
        azk0 azk0Var = new azk0("MUSIC", 0);
        f21636a = azk0Var;
        azk0 azk0Var2 = new azk0("PODCASTS", 1);
        f21637b = azk0Var2;
        azk0 azk0Var3 = new azk0("AUDIOBOOKS", 2);
        f21638c = azk0Var3;
        f21639d = new azk0[]{azk0Var, azk0Var2, azk0Var3};
        CREATOR = new oxk0(3);
    }

    public static azk0 valueOf(String str) {
        return (azk0) Enum.valueOf(azk0.class, str);
    }

    public static azk0[] values() {
        return (azk0[]) f21639d.clone();
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
