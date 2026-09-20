package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class acz {

    /* JADX INFO: renamed from: a */
    public static final acz f14474a;

    /* JADX INFO: renamed from: b */
    public static final acz f14475b;

    /* JADX INFO: renamed from: c */
    public static final acz f14476c;

    /* JADX INFO: renamed from: d */
    public static final acz f14477d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ acz[] f14478e;

    static {
        acz aczVar = new acz("Audiobook", 0);
        f14474a = aczVar;
        acz aczVar2 = new acz("ShowEpisode", 1);
        f14475b = aczVar2;
        acz aczVar3 = new acz("Track", 2);
        f14476c = aczVar3;
        acz aczVar4 = new acz("Unknown", 3);
        f14477d = aczVar4;
        f14478e = new acz[]{aczVar, aczVar2, aczVar3, aczVar4};
    }

    public static acz valueOf(String str) {
        return (acz) Enum.valueOf(acz.class, str);
    }

    public static acz[] values() {
        return (acz[]) f14478e.clone();
    }
}
