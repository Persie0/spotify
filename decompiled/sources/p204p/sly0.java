package p204p;

import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class sly0 {

    /* JADX INFO: renamed from: a */
    public static final sly0 f210516a;

    /* JADX INFO: renamed from: b */
    public static final sly0 f210517b;

    /* JADX INFO: renamed from: c */
    public static final sly0 f210518c;

    /* JADX INFO: renamed from: d */
    public static final sly0 f210519d;

    /* JADX INFO: renamed from: e */
    public static final sly0 f210520e;

    /* JADX INFO: renamed from: f */
    public static final sly0 f210521f;

    /* JADX INFO: renamed from: g */
    public static final sly0 f210522g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ sly0[] f210523h;

    static {
        sly0 sly0Var = new sly0(SearchEndpointResponseKt.RESULT_ERROR, 0);
        f210516a = sly0Var;
        sly0 sly0Var2 = new sly0("UNKNOWN_ERROR", 1);
        f210517b = sly0Var2;
        sly0 sly0Var3 = new sly0(SearchEndpointResponseKt.RESULT_SUCCESS, 2);
        f210518c = sly0Var3;
        sly0 sly0Var4 = new sly0("TIMEOUT", 3);
        f210519d = sly0Var4;
        sly0 sly0Var5 = new sly0("NO_DATA", 4);
        f210520e = sly0Var5;
        sly0 sly0Var6 = new sly0("SCROLLSITA_TIMEOUT", 5);
        f210521f = sly0Var6;
        sly0 sly0Var7 = new sly0("SCROLLSITA_ERROR", 6);
        f210522g = sly0Var7;
        f210523h = new sly0[]{sly0Var, sly0Var2, sly0Var3, sly0Var4, sly0Var5, sly0Var6, sly0Var7};
    }

    public static sly0 valueOf(String str) {
        return (sly0) Enum.valueOf(sly0.class, str);
    }

    public static sly0[] values() {
        return (sly0[]) f210523h.clone();
    }
}
