package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class hbe {

    /* JADX INFO: renamed from: a */
    public static final hbe f89505a;

    /* JADX INFO: renamed from: b */
    public static final hbe f89506b;

    /* JADX INFO: renamed from: c */
    public static final hbe f89507c;

    /* JADX INFO: renamed from: d */
    public static final hbe f89508d;

    /* JADX INFO: renamed from: e */
    public static final hbe f89509e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ hbe[] f89510f;

    static {
        hbe hbeVar = new hbe("CURATABLE", 0);
        f89505a = hbeVar;
        hbe hbeVar2 = new hbe("PLAYLIST", 1);
        f89506b = hbeVar2;
        hbe hbeVar3 = new hbe("CONCERT", 2);
        f89507c = hbeVar3;
        hbe hbeVar4 = new hbe("PRERELEASE", 3);
        f89508d = hbeVar4;
        hbe hbeVar5 = new hbe("UNKNOWN", 4);
        f89509e = hbeVar5;
        f89510f = new hbe[]{hbeVar, hbeVar2, hbeVar3, hbeVar4, hbeVar5};
    }

    public static hbe valueOf(String str) {
        return (hbe) Enum.valueOf(hbe.class, str);
    }

    public static hbe[] values() {
        return (hbe[]) f89510f.clone();
    }
}
