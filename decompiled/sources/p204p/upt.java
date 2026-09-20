package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class upt {

    /* JADX INFO: renamed from: a */
    public static final upt f232822a;

    /* JADX INFO: renamed from: b */
    public static final upt f232823b;

    /* JADX INFO: renamed from: c */
    public static final upt f232824c;

    /* JADX INFO: renamed from: d */
    public static final upt f232825d;

    /* JADX INFO: renamed from: e */
    public static final upt f232826e;

    /* JADX INFO: renamed from: f */
    public static final upt f232827f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ upt[] f232828g;

    static {
        upt uptVar = new upt("INVALID", 0);
        f232822a = uptVar;
        upt uptVar2 = new upt("PLAYLIST", 1);
        f232823b = uptVar2;
        upt uptVar3 = new upt("COLLECTION", 2);
        f232824c = uptVar3;
        upt uptVar4 = new upt("YOUR_LIBRARY", 3);
        f232825d = uptVar4;
        upt uptVar5 = new upt("LIVE_EVENTS", 4);
        f232826e = uptVar5;
        upt uptVar6 = new upt("PLAYABLE_CACHE", 5);
        f232827f = uptVar6;
        f232828g = new upt[]{uptVar, uptVar2, uptVar3, uptVar4, uptVar5, uptVar6};
    }

    public static upt valueOf(String str) {
        return (upt) Enum.valueOf(upt.class, str);
    }

    public static upt[] values() {
        return (upt[]) f232828g.clone();
    }
}
