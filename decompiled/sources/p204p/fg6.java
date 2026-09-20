package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class fg6 implements Parcelable {
    public static final Parcelable.Creator<fg6> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final fg6 f69231a;

    /* JADX INFO: renamed from: b */
    public static final fg6 f69232b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ fg6[] f69233c;

    static {
        fg6 fg6Var = new fg6("Curation", 0);
        f69231a = fg6Var;
        fg6 fg6Var2 = new fg6("Selection", 1);
        f69232b = fg6Var2;
        f69233c = new fg6[]{fg6Var, fg6Var2};
        CREATOR = new vp5(23);
    }

    public static fg6 valueOf(String str) {
        return (fg6) Enum.valueOf(fg6.class, str);
    }

    public static fg6[] values() {
        return (fg6[]) f69233c.clone();
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
