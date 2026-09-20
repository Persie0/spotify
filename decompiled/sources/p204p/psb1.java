package p204p;

import com.spotify.voiceassistants.playermodels.ParsedQueryKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class psb1 {

    /* JADX INFO: renamed from: a */
    public static final psb1 f180807a;

    /* JADX INFO: renamed from: b */
    public static final psb1 f180808b;

    /* JADX INFO: renamed from: c */
    public static final psb1 f180809c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ psb1[] f180810d;

    static {
        psb1 psb1Var = new psb1(ParsedQueryKt.INTENT_PLAY, 0);
        f180807a = psb1Var;
        psb1 psb1Var2 = new psb1("REPLAY", 1);
        f180808b = psb1Var2;
        psb1 psb1Var3 = new psb1("PAUSE", 2);
        f180809c = psb1Var3;
        f180810d = new psb1[]{psb1Var, psb1Var2, psb1Var3};
    }

    public static psb1 valueOf(String str) {
        return (psb1) Enum.valueOf(psb1.class, str);
    }

    public static psb1[] values() {
        return (psb1[]) f180810d.clone();
    }
}
