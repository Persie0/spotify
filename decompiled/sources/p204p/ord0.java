package p204p;

import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ord0 {

    /* JADX INFO: renamed from: a */
    public static final ord0 f168538a;

    /* JADX INFO: renamed from: b */
    public static final ord0 f168539b;

    /* JADX INFO: renamed from: c */
    public static final ord0 f168540c;

    /* JADX INFO: renamed from: d */
    public static final ord0 f168541d;

    /* JADX INFO: renamed from: e */
    public static final ord0 f168542e;

    /* JADX INFO: renamed from: f */
    public static final ord0 f168543f;

    /* JADX INFO: renamed from: g */
    public static final ord0 f168544g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ ord0[] f168545h;

    static {
        ord0 ord0Var = new ord0("NONE", 0);
        f168538a = ord0Var;
        ord0 ord0Var2 = new ord0("CONNECTING", 1);
        f168539b = ord0Var2;
        ord0 ord0Var3 = new ord0("PLAYING", 2);
        f168540c = ord0Var3;
        ord0 ord0Var4 = new ord0("PAUSED", 3);
        f168541d = ord0Var4;
        ord0 ord0Var5 = new ord0("STOPPED", 4);
        f168542e = ord0Var5;
        ord0 ord0Var6 = new ord0(SearchEndpointResponseKt.RESULT_ERROR, 5);
        f168543f = ord0Var6;
        ord0 ord0Var7 = new ord0("BUFFERING", 6);
        f168544g = ord0Var7;
        f168545h = new ord0[]{ord0Var, ord0Var2, ord0Var3, ord0Var4, ord0Var5, ord0Var6, ord0Var7};
    }

    public static ord0 valueOf(String str) {
        return (ord0) Enum.valueOf(ord0.class, str);
    }

    public static ord0[] values() {
        return (ord0[]) f168545h.clone();
    }
}
