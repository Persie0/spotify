package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class m0r {

    /* JADX INFO: renamed from: a */
    public static final m0r f138725a;

    /* JADX INFO: renamed from: b */
    public static final m0r f138726b;

    /* JADX INFO: renamed from: c */
    public static final m0r f138727c;

    /* JADX INFO: renamed from: d */
    public static final m0r f138728d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ m0r[] f138729e;

    static {
        m0r m0rVar = new m0r("LIKED_SONGS", 0);
        f138725a = m0rVar;
        m0r m0rVar2 = new m0r("YOUR_EPISODES", 1);
        f138726b = m0rVar2;
        m0r m0rVar3 = new m0r("NEW_EPISODES", 2);
        f138727c = m0rVar3;
        m0r m0rVar4 = new m0r("YOUR_KALLAXES", 3);
        f138728d = m0rVar4;
        f138729e = new m0r[]{m0rVar, m0rVar2, m0rVar3, m0rVar4};
    }

    public static m0r valueOf(String str) {
        return (m0r) Enum.valueOf(m0r.class, str);
    }

    public static m0r[] values() {
        return (m0r[]) f138729e.clone();
    }
}
