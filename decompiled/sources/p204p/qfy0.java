package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class qfy0 implements Parcelable {
    public static final Parcelable.Creator<qfy0> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final qfy0 f188311a;

    /* JADX INFO: renamed from: b */
    public static final qfy0 f188312b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ qfy0[] f188313c;

    static {
        qfy0 qfy0Var = new qfy0("PLAYLIST", 0);
        f188311a = qfy0Var;
        qfy0 qfy0Var2 = new qfy0("BLUEJAY", 1);
        f188312b = qfy0Var2;
        f188313c = new qfy0[]{qfy0Var, qfy0Var2};
        CREATOR = new csx0(16);
    }

    public static qfy0 valueOf(String str) {
        return (qfy0) Enum.valueOf(qfy0.class, str);
    }

    public static qfy0[] values() {
        return (qfy0[]) f188313c.clone();
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
