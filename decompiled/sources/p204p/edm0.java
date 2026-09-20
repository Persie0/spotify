package p204p;

import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class edm0 {

    /* JADX INFO: renamed from: a */
    public static final edm0 f58546a;

    /* JADX INFO: renamed from: b */
    public static final edm0 f58547b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ edm0[] f58548c;

    static {
        edm0 edm0Var = new edm0("STRONG", 0);
        f58546a = edm0Var;
        edm0 edm0Var2 = new edm0(SearchEndpointResponseKt.RESULT_SUCCESS, 1);
        f58547b = edm0Var2;
        f58548c = new edm0[]{edm0Var, edm0Var2};
    }

    public static edm0 valueOf(String str) {
        return (edm0) Enum.valueOf(edm0.class, str);
    }

    public static edm0[] values() {
        return (edm0[]) f58548c.clone();
    }
}
