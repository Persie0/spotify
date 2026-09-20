package p204p;

import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class gyj0 {

    /* JADX INFO: renamed from: a */
    public static final gyj0 f85661a;

    /* JADX INFO: renamed from: b */
    public static final gyj0 f85662b;

    /* JADX INFO: renamed from: c */
    public static final gyj0 f85663c;

    /* JADX INFO: renamed from: d */
    public static final gyj0 f85664d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ gyj0[] f85665e;

    static {
        gyj0 gyj0Var = new gyj0("IDLE", 0);
        f85661a = gyj0Var;
        gyj0 gyj0Var2 = new gyj0("LOADING", 1);
        f85662b = gyj0Var2;
        gyj0 gyj0Var3 = new gyj0(SearchEndpointResponseKt.RESULT_SUCCESS, 2);
        f85663c = gyj0Var3;
        gyj0 gyj0Var4 = new gyj0(SearchEndpointResponseKt.RESULT_ERROR, 3);
        f85664d = gyj0Var4;
        f85665e = new gyj0[]{gyj0Var, gyj0Var2, gyj0Var3, gyj0Var4};
    }

    public static gyj0 valueOf(String str) {
        return (gyj0) Enum.valueOf(gyj0.class, str);
    }

    public static gyj0[] values() {
        return (gyj0[]) f85665e.clone();
    }
}
