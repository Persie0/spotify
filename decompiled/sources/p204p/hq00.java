package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.voiceassistants.playermodels.ParsedQueryKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class hq00 implements Parcelable {
    public static final Parcelable.Creator<hq00> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final hq00 f93975a;

    /* JADX INFO: renamed from: b */
    public static final hq00 f93976b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ hq00[] f93977c;

    static {
        hq00 hq00Var = new hq00("INTRO", 0);
        f93975a = hq00Var;
        hq00 hq00Var2 = new hq00(ParsedQueryKt.INTENT_PLAY, 1);
        f93976b = hq00Var2;
        f93977c = new hq00[]{hq00Var, hq00Var2};
        CREATOR = new k700(16);
    }

    public static hq00 valueOf(String str) {
        return (hq00) Enum.valueOf(hq00.class, str);
    }

    public static hq00[] values() {
        return (hq00[]) f93977c.clone();
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
