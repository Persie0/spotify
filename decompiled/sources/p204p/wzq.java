package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class wzq implements Parcelable {
    public static final Parcelable.Creator<wzq> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final wzq f256661a;

    /* JADX INFO: renamed from: b */
    public static final wzq f256662b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ wzq[] f256663c;

    static {
        wzq wzqVar = new wzq("CHOOSER_SIGNUP", 0);
        f256661a = wzqVar;
        wzq wzqVar2 = new wzq("CHOOSER_LOGIN", 1);
        f256662b = wzqVar2;
        f256663c = new wzq[]{wzqVar, wzqVar2};
        CREATOR = new lso(20);
    }

    public static wzq valueOf(String str) {
        return (wzq) Enum.valueOf(wzq.class, str);
    }

    public static wzq[] values() {
        return (wzq[]) f256663c.clone();
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
