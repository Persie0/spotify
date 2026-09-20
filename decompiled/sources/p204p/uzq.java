package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class uzq implements Parcelable {
    public static final Parcelable.Creator<uzq> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final uzq f235617a;

    /* JADX INFO: renamed from: b */
    public static final uzq f235618b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ uzq[] f235619c;

    static {
        uzq uzqVar = new uzq("CHOOSER_SIGNUP", 0);
        f235617a = uzqVar;
        uzq uzqVar2 = new uzq("CHOOSER_LOGIN", 1);
        f235618b = uzqVar2;
        f235619c = new uzq[]{uzqVar, uzqVar2};
        CREATOR = new lso(19);
    }

    public static uzq valueOf(String str) {
        return (uzq) Enum.valueOf(uzq.class, str);
    }

    public static uzq[] values() {
        return (uzq[]) f235619c.clone();
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
