package p204p;

import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ps0 {

    /* JADX INFO: renamed from: a */
    public static final ps0 f180700a;

    /* JADX INFO: renamed from: b */
    public static final ps0 f180701b;

    /* JADX INFO: renamed from: c */
    public static final ps0 f180702c;

    /* JADX INFO: renamed from: d */
    public static final ps0 f180703d;

    /* JADX INFO: renamed from: e */
    public static final ps0 f180704e;

    /* JADX INFO: renamed from: f */
    public static final ps0 f180705f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ ps0[] f180706g;

    static {
        ps0 ps0Var = new ps0(SearchEndpointResponseKt.RESULT_SUCCESS, 0);
        f180700a = ps0Var;
        ps0 ps0Var2 = new ps0("FAIL", 1);
        f180701b = ps0Var2;
        ps0 ps0Var3 = new ps0("INVALID_SLOT", 2);
        f180702c = ps0Var3;
        ps0 ps0Var4 = new ps0("INVALID_DEMAND_STATUS", 3);
        f180703d = ps0Var4;
        ps0 ps0Var5 = new ps0("INVALID_ELIGIBILITY_STATUS", 4);
        f180704e = ps0Var5;
        ps0 ps0Var6 = new ps0("UNRECOGNIZED", 5);
        f180705f = ps0Var6;
        f180706g = new ps0[]{ps0Var, ps0Var2, ps0Var3, ps0Var4, ps0Var5, ps0Var6};
    }

    public static ps0 valueOf(String str) {
        return (ps0) Enum.valueOf(ps0.class, str);
    }

    public static ps0[] values() {
        return (ps0[]) f180706g.clone();
    }
}
