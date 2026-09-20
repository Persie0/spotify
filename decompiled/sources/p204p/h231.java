package p204p;

import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class h231 {

    /* JADX INFO: renamed from: a */
    public static final h231 f86877a;

    /* JADX INFO: renamed from: b */
    public static final h231 f86878b;

    /* JADX INFO: renamed from: c */
    public static final h231 f86879c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ h231[] f86880d;

    static {
        h231 h231Var = new h231(SearchEndpointResponseKt.RESULT_SUCCESS, 0);
        f86877a = h231Var;
        h231 h231Var2 = new h231("FAILURE", 1);
        f86878b = h231Var2;
        h231 h231Var3 = new h231("FORBIDDEN", 2);
        f86879c = h231Var3;
        f86880d = new h231[]{h231Var, h231Var2, h231Var3};
    }

    public static h231 valueOf(String str) {
        return (h231) Enum.valueOf(h231.class, str);
    }

    public static h231[] values() {
        return (h231[]) f86880d.clone();
    }
}
