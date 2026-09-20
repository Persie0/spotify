package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class osc implements Parcelable {
    public static final Parcelable.Creator<osc> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final osc f168790a;

    /* JADX INFO: renamed from: b */
    public static final osc f168791b;

    /* JADX INFO: renamed from: c */
    public static final osc f168792c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ osc[] f168793d;

    static {
        osc oscVar = new osc("UNKNOWN", 0);
        f168790a = oscVar;
        osc oscVar2 = new osc("TALK", 1);
        f168791b = oscVar2;
        osc oscVar3 = new osc("MUSIC", 2);
        f168792c = oscVar3;
        f168793d = new osc[]{oscVar, oscVar2, oscVar3};
        CREATOR = new a5c(27);
    }

    public static osc valueOf(String str) {
        return (osc) Enum.valueOf(osc.class, str);
    }

    public static osc[] values() {
        return (osc[]) f168793d.clone();
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
