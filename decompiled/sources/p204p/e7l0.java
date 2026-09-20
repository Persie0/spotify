package p204p;

import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class e7l0 {

    /* JADX INFO: renamed from: a */
    public static final e7l0 f56952a;

    /* JADX INFO: renamed from: b */
    public static final e7l0 f56953b;

    /* JADX INFO: renamed from: c */
    public static final e7l0 f56954c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ e7l0[] f56955d;

    static {
        e7l0 e7l0Var = new e7l0(SearchEndpointResponseKt.RESULT_SUCCESS, 0);
        f56952a = e7l0Var;
        e7l0 e7l0Var2 = new e7l0("CANCELLATION", 1);
        f56953b = e7l0Var2;
        e7l0 e7l0Var3 = new e7l0("FAILURE", 2);
        f56954c = e7l0Var3;
        f56955d = new e7l0[]{e7l0Var, e7l0Var2, e7l0Var3};
    }

    public static e7l0 valueOf(String str) {
        return (e7l0) Enum.valueOf(e7l0.class, str);
    }

    public static e7l0[] values() {
        return (e7l0[]) f56955d.clone();
    }
}
