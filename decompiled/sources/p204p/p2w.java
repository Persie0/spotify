package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class p2w implements x3b1 {

    /* JADX INFO: renamed from: a */
    public static final p2w f173445a;

    /* JADX INFO: renamed from: b */
    public static final p2w f173446b;

    /* JADX INFO: renamed from: c */
    public static final p2w f173447c;

    /* JADX INFO: renamed from: d */
    public static final p2w f173448d;

    /* JADX INFO: renamed from: e */
    public static final p2w f173449e;

    /* JADX INFO: renamed from: f */
    public static final p2w f173450f;

    /* JADX INFO: renamed from: g */
    public static final p2w f173451g;

    /* JADX INFO: renamed from: h */
    public static final p2w f173452h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ p2w[] f173453i;

    static {
        p2w p2wVar = new p2w("EPISODE_GATED_VALUE_PROP_UNKNOWN", 0);
        f173445a = p2wVar;
        p2w p2wVar2 = new p2w("EPISODE_GATED_VALUE_PROP_UNSPECIFIED", 1);
        f173446b = p2wVar2;
        p2w p2wVar3 = new p2w("EPISODE_GATED_VALUE_PROP_AD_FREE", 2);
        f173447c = p2wVar3;
        p2w p2wVar4 = new p2w("EPISODE_GATED_VALUE_PROP_EXTENDED", 3);
        f173448d = p2wVar4;
        p2w p2wVar5 = new p2w("EPISODE_GATED_VALUE_PROP_EARLY_ACCESS", 4);
        f173449e = p2wVar5;
        p2w p2wVar6 = new p2w("EPISODE_GATED_VALUE_PROP_VIDEO", 5);
        f173450f = p2wVar6;
        p2w p2wVar7 = new p2w("EPISODE_GATED_VALUE_PROP_FULL_LENGTH_EPISODES", 6);
        f173451g = p2wVar7;
        p2w p2wVar8 = new p2w("EPISODE_GATED_VALUE_PROP_NONE", 7);
        f173452h = p2wVar8;
        f173453i = new p2w[]{p2wVar, p2wVar2, p2wVar3, p2wVar4, p2wVar5, p2wVar6, p2wVar7, p2wVar8};
    }

    public static p2w valueOf(String str) {
        return (p2w) Enum.valueOf(p2w.class, str);
    }

    public static p2w[] values() {
        return (p2w[]) f173453i.clone();
    }
}
