package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o8a implements Parcelable {
    public static final Parcelable.Creator<o8a> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final o8a f162745a;

    /* JADX INFO: renamed from: b */
    public static final o8a f162746b;

    /* JADX INFO: renamed from: c */
    public static final o8a f162747c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ o8a[] f162748d;

    static {
        o8a o8aVar = new o8a("DISABLED", 0);
        f162745a = o8aVar;
        o8a o8aVar2 = new o8a("ENABLED_NO_NORMALIZATION", 1);
        f162746b = o8aVar2;
        o8a o8aVar3 = new o8a("ENABLED_WITH_NORMALIZATION", 2);
        f162747c = o8aVar3;
        f162748d = new o8a[]{o8aVar, o8aVar2, o8aVar3};
        CREATOR = new dc9(14);
    }

    public static o8a valueOf(String str) {
        return (o8a) Enum.valueOf(o8a.class, str);
    }

    public static o8a[] values() {
        return (o8a[]) f162748d.clone();
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
