package p204p;

import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class eqa0 {

    /* JADX INFO: renamed from: a */
    public static final eqa0 f61830a;

    /* JADX INFO: renamed from: b */
    public static final eqa0 f61831b;

    /* JADX INFO: renamed from: c */
    public static final eqa0 f61832c;

    /* JADX INFO: renamed from: d */
    public static final eqa0 f61833d;

    /* JADX INFO: renamed from: e */
    public static final eqa0 f61834e;

    /* JADX INFO: renamed from: f */
    public static final eqa0 f61835f;

    /* JADX INFO: renamed from: g */
    public static final eqa0 f61836g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ eqa0[] f61837h;

    static {
        eqa0 eqa0Var = new eqa0("VERBOSE", 0);
        f61830a = eqa0Var;
        eqa0 eqa0Var2 = new eqa0("DEBUG", 1);
        f61831b = eqa0Var2;
        eqa0 eqa0Var3 = new eqa0("INFO", 2);
        f61832c = eqa0Var3;
        eqa0 eqa0Var4 = new eqa0("WARNING", 3);
        f61833d = eqa0Var4;
        eqa0 eqa0Var5 = new eqa0(SearchEndpointResponseKt.RESULT_ERROR, 4);
        f61834e = eqa0Var5;
        eqa0 eqa0Var6 = new eqa0("BREADCRUMB", 5);
        f61835f = eqa0Var6;
        eqa0 eqa0Var7 = new eqa0("YELL", 6);
        f61836g = eqa0Var7;
        f61837h = new eqa0[]{eqa0Var, eqa0Var2, eqa0Var3, eqa0Var4, eqa0Var5, eqa0Var6, eqa0Var7};
    }

    public static eqa0 valueOf(String str) {
        return (eqa0) Enum.valueOf(eqa0.class, str);
    }

    public static eqa0[] values() {
        return (eqa0[]) f61837h.clone();
    }
}
