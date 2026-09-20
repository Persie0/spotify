package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class c0r implements Parcelable {
    public static final Parcelable.Creator<c0r> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final c0r f32847a;

    /* JADX INFO: renamed from: b */
    public static final c0r f32848b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ c0r[] f32849c;

    static {
        c0r c0rVar = new c0r("CHOOSER_SIGNUP", 0);
        f32847a = c0rVar;
        c0r c0rVar2 = new c0r("CHOOSER_LOGIN", 1);
        f32848b = c0rVar2;
        f32849c = new c0r[]{c0rVar, c0rVar2};
        CREATOR = new lso(21);
    }

    public static c0r valueOf(String str) {
        return (c0r) Enum.valueOf(c0r.class, str);
    }

    public static c0r[] values() {
        return (c0r[]) f32849c.clone();
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
