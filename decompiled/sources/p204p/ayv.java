package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ayv implements Parcelable {
    public static final Parcelable.Creator<ayv> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final ayv f21358a;

    /* JADX INFO: renamed from: b */
    public static final ayv f21359b;

    /* JADX INFO: renamed from: c */
    public static final ayv f21360c;

    /* JADX INFO: renamed from: d */
    public static final ayv f21361d;

    /* JADX INFO: renamed from: e */
    public static final ayv f21362e;

    /* JADX INFO: renamed from: f */
    public static final ayv f21363f;

    /* JADX INFO: renamed from: g */
    public static final ayv f21364g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ ayv[] f21365h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ nzv f21366i;

    static {
        ayv ayvVar = new ayv("SHOW", 0);
        f21358a = ayvVar;
        ayv ayvVar2 = new ayv("TRACK", 1);
        f21359b = ayvVar2;
        ayv ayvVar3 = new ayv("ALBUM", 2);
        f21360c = ayvVar3;
        ayv ayvVar4 = new ayv("ARTIST", 3);
        f21361d = ayvVar4;
        ayv ayvVar5 = new ayv("EPISODE", 4);
        f21362e = ayvVar5;
        ayv ayvVar6 = new ayv("AUDIOBOOK", 5);
        f21363f = ayvVar6;
        ayv ayvVar7 = new ayv("PLAYLIST", 6);
        f21364g = ayvVar7;
        ayv[] ayvVarArr = {ayvVar, ayvVar2, ayvVar3, ayvVar4, ayvVar5, ayvVar6, ayvVar7};
        f21365h = ayvVarArr;
        f21366i = new nzv(ayvVarArr);
        CREATOR = new bwv(2);
    }

    public static ayv valueOf(String str) {
        return (ayv) Enum.valueOf(ayv.class, str);
    }

    public static ayv[] values() {
        return (ayv[]) f21365h.clone();
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
