package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class m580 implements Parcelable {
    public static final Parcelable.Creator<m580> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final m580 f140160a;

    /* JADX INFO: renamed from: b */
    public static final m580 f140161b;

    /* JADX INFO: renamed from: c */
    public static final m580 f140162c;

    /* JADX INFO: renamed from: d */
    public static final m580 f140163d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ m580[] f140164e;

    static {
        m580 m580Var = new m580("CHECKBOX", 0);
        f140160a = m580Var;
        m580 m580Var2 = new m580("TEXT", 1);
        f140161b = m580Var2;
        m580 m580Var3 = new m580("CONSPICUOUS_TEXT", 2);
        f140162c = m580Var3;
        m580 m580Var4 = new m580("CONSPICUOUS_CHECKBOX", 3);
        f140163d = m580Var4;
        f140164e = new m580[]{m580Var, m580Var2, m580Var3, m580Var4};
        CREATOR = new w270(29);
    }

    public static m580 valueOf(String str) {
        return (m580) Enum.valueOf(m580.class, str);
    }

    public static m580[] values() {
        return (m580[]) f140164e.clone();
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
