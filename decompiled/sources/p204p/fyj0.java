package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class fyj0 implements Parcelable {
    public static final Parcelable.Creator<fyj0> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final fyj0 f74757a;

    /* JADX INFO: renamed from: b */
    public static final fyj0 f74758b;

    /* JADX INFO: renamed from: c */
    public static final fyj0 f74759c;

    /* JADX INFO: renamed from: d */
    public static final fyj0 f74760d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ fyj0[] f74761e;

    static {
        fyj0 fyj0Var = new fyj0("PLAYLISTS", 0);
        f74757a = fyj0Var;
        fyj0 fyj0Var2 = new fyj0("BLUEJAY_REQUEST_NOTIFICATIONS", 1);
        f74758b = fyj0Var2;
        fyj0 fyj0Var3 = new fyj0("BLUEJAY_CONFIRMED_NOTIFICATIONS", 2);
        f74759c = fyj0Var3;
        fyj0 fyj0Var4 = new fyj0("BLUEJAY_EDIT_SUCCESS", 3);
        f74760d = fyj0Var4;
        f74761e = new fyj0[]{fyj0Var, fyj0Var2, fyj0Var3, fyj0Var4};
        CREATOR = new fgj0(13);
    }

    public static fyj0 valueOf(String str) {
        return (fyj0) Enum.valueOf(fyj0.class, str);
    }

    public static fyj0[] values() {
        return (fyj0[]) f74761e.clone();
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
