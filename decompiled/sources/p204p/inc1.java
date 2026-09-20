package p204p;

import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class inc1 {

    /* JADX INFO: renamed from: a */
    public static final inc1 f103951a;

    /* JADX INFO: renamed from: b */
    public static final inc1 f103952b;

    /* JADX INFO: renamed from: c */
    public static final inc1 f103953c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ inc1[] f103954d;

    static {
        inc1 inc1Var = new inc1("EMPTY", 0);
        f103951a = inc1Var;
        inc1 inc1Var2 = new inc1("READY", 1);
        f103952b = inc1Var2;
        inc1 inc1Var3 = new inc1(SearchEndpointResponseKt.RESULT_ERROR, 2);
        f103953c = inc1Var3;
        f103954d = new inc1[]{inc1Var, inc1Var2, inc1Var3};
    }

    public static inc1 valueOf(String str) {
        return (inc1) Enum.valueOf(inc1.class, str);
    }

    public static inc1[] values() {
        return (inc1[]) f103954d.clone();
    }
}
