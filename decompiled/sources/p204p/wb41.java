package p204p;

import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class wb41 {

    /* JADX INFO: renamed from: a */
    public static final wb41 f249691a;

    /* JADX INFO: renamed from: b */
    public static final wb41 f249692b;

    /* JADX INFO: renamed from: c */
    public static final wb41 f249693c;

    /* JADX INFO: renamed from: d */
    public static final wb41 f249694d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ wb41[] f249695e;

    static {
        wb41 wb41Var = new wb41(SearchEndpointResponseKt.RESULT_SUCCESS, 0);
        f249691a = wb41Var;
        wb41 wb41Var2 = new wb41("CANCELED", 1);
        f249692b = wb41Var2;
        wb41 wb41Var3 = new wb41("CANCELLED_SESSION_CHANGED", 2);
        f249693c = wb41Var3;
        wb41 wb41Var4 = new wb41("ABORTED", 3);
        f249694d = wb41Var4;
        f249695e = new wb41[]{wb41Var, wb41Var2, wb41Var3, wb41Var4};
    }

    public static wb41 valueOf(String str) {
        return (wb41) Enum.valueOf(wb41.class, str);
    }

    public static wb41[] values() {
        return (wb41[]) f249695e.clone();
    }
}
