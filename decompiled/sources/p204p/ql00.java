package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class ql00 implements Parcelable {
    public static final Parcelable.Creator<ql00> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final ql00 f189686a;

    /* JADX INFO: renamed from: b */
    public static final ql00 f189687b;

    /* JADX INFO: renamed from: c */
    public static final ql00 f189688c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ql00[] f189689d;

    static {
        ql00 ql00Var = new ql00("None", 0);
        f189686a = ql00Var;
        ql00 ql00Var2 = new ql00("Viewer", 1);
        f189687b = ql00Var2;
        ql00 ql00Var3 = new ql00("Contributor", 2);
        f189688c = ql00Var3;
        f189689d = new ql00[]{ql00Var, ql00Var2, ql00Var3};
        CREATOR = new k700(12);
    }

    public static ql00 valueOf(String str) {
        return (ql00) Enum.valueOf(ql00.class, str);
    }

    public static ql00[] values() {
        return (ql00[]) f189689d.clone();
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
