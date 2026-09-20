package p204p;

import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class i83 {

    /* JADX INFO: renamed from: a */
    public static final i83 f99680a;

    /* JADX INFO: renamed from: b */
    public static final i83 f99681b;

    /* JADX INFO: renamed from: c */
    public static final i83 f99682c;

    /* JADX INFO: renamed from: d */
    public static final i83 f99683d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ i83[] f99684e;

    static {
        i83 i83Var = new i83("LINK", 0);
        f99680a = i83Var;
        i83 i83Var2 = new i83("LINKING", 1);
        f99681b = i83Var2;
        i83 i83Var3 = new i83("SET_AS_DEFAULT", 2);
        f99682c = i83Var3;
        i83 i83Var4 = new i83(SearchEndpointResponseKt.RESULT_ERROR, 3);
        f99683d = i83Var4;
        f99684e = new i83[]{i83Var, i83Var2, i83Var3, i83Var4};
    }

    public static i83 valueOf(String str) {
        return (i83) Enum.valueOf(i83.class, str);
    }

    public static i83[] values() {
        return (i83[]) f99684e.clone();
    }
}
