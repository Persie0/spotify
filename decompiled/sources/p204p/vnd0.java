package p204p;

import com.spotify.voiceassistants.playermodels.ParsedQueryKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class vnd0 {

    /* JADX INFO: renamed from: L0 */
    public static final vnd0 f243061L0;

    /* JADX INFO: renamed from: M0 */
    public static final /* synthetic */ vnd0[] f243062M0;

    /* JADX INFO: renamed from: X */
    public static final vnd0 f243063X;

    /* JADX INFO: renamed from: Y */
    public static final vnd0 f243064Y;

    /* JADX INFO: renamed from: Z */
    public static final vnd0 f243065Z;

    /* JADX INFO: renamed from: a */
    public static final vnd0 f243066a;

    /* JADX INFO: renamed from: b */
    public static final vnd0 f243067b;

    /* JADX INFO: renamed from: c */
    public static final vnd0 f243068c;

    /* JADX INFO: renamed from: d */
    public static final vnd0 f243069d;

    /* JADX INFO: renamed from: e */
    public static final vnd0 f243070e;

    /* JADX INFO: renamed from: f */
    public static final vnd0 f243071f;

    /* JADX INFO: renamed from: g */
    public static final vnd0 f243072g;

    /* JADX INFO: renamed from: h */
    public static final vnd0 f243073h;

    /* JADX INFO: renamed from: i */
    public static final vnd0 f243074i;

    /* JADX INFO: renamed from: t */
    public static final vnd0 f243075t;

    static {
        vnd0 vnd0Var = new vnd0("STOP", 0);
        f243066a = vnd0Var;
        vnd0 vnd0Var2 = new vnd0("PAUSE", 1);
        f243067b = vnd0Var2;
        vnd0 vnd0Var3 = new vnd0(ParsedQueryKt.INTENT_PLAY, 2);
        f243068c = vnd0Var3;
        vnd0 vnd0Var4 = new vnd0("SKIP_TO_PREVIOUS", 3);
        f243069d = vnd0Var4;
        vnd0 vnd0Var5 = new vnd0("SKIP_TO_NEXT", 4);
        f243070e = vnd0Var5;
        vnd0 vnd0Var6 = new vnd0("SET_RATING", 5);
        f243071f = vnd0Var6;
        vnd0 vnd0Var7 = new vnd0("SEEK_TO", 6);
        f243072g = vnd0Var7;
        vnd0 vnd0Var8 = new vnd0("PLAY_FROM_MEDIA_ID", 7);
        f243073h = vnd0Var8;
        vnd0 vnd0Var9 = new vnd0("PLAY_FROM_SEARCH", 8);
        f243074i = vnd0Var9;
        vnd0 vnd0Var10 = new vnd0("SKIP_TO_QUEUE_ITEM", 9);
        f243075t = vnd0Var10;
        vnd0 vnd0Var11 = new vnd0("PLAY_FROM_URI", 10);
        f243063X = vnd0Var11;
        vnd0 vnd0Var12 = new vnd0("PREPARE_FROM_URI", 11);
        f243064Y = vnd0Var12;
        vnd0 vnd0Var13 = new vnd0("SET_REPEAT_MODE", 12);
        f243065Z = vnd0Var13;
        vnd0 vnd0Var14 = new vnd0("SET_SHUFFLE_MODE", 13);
        f243061L0 = vnd0Var14;
        f243062M0 = new vnd0[]{vnd0Var, vnd0Var2, vnd0Var3, vnd0Var4, vnd0Var5, vnd0Var6, vnd0Var7, vnd0Var8, vnd0Var9, vnd0Var10, vnd0Var11, vnd0Var12, vnd0Var13, vnd0Var14};
    }

    public static vnd0 valueOf(String str) {
        return (vnd0) Enum.valueOf(vnd0.class, str);
    }

    public static vnd0[] values() {
        return (vnd0[]) f243062M0.clone();
    }
}
