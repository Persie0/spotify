package p204p;

import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class i4n0 {

    /* JADX INFO: renamed from: a */
    public static final i4n0 f98546a;

    /* JADX INFO: renamed from: b */
    public static final i4n0 f98547b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ i4n0[] f98548c;

    static {
        i4n0 i4n0Var = new i4n0("LOGGED_IN", 0);
        f98546a = i4n0Var;
        i4n0 i4n0Var2 = new i4n0("NOT_LOGGED_IN", 1);
        f98547b = i4n0Var2;
        f98548c = new i4n0[]{i4n0Var, i4n0Var2, new i4n0(SearchEndpointResponseKt.RESULT_ERROR, 2)};
    }

    public static i4n0 valueOf(String str) {
        return (i4n0) Enum.valueOf(i4n0.class, str);
    }

    public static i4n0[] values() {
        return (i4n0[]) f98548c.clone();
    }
}
