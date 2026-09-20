package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class ame {

    /* JADX INFO: renamed from: a */
    public static final ame f17110a;

    /* JADX INFO: renamed from: b */
    public static final ame f17111b;

    /* JADX INFO: renamed from: c */
    public static final ame f17112c;

    /* JADX INFO: renamed from: d */
    public static final ame f17113d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ ame[] f17114e;

    static {
        ame ameVar = new ame("PlaylistEntity", 0);
        f17110a = ameVar;
        ame ameVar2 = new ame("LikedSongsEntity", 1);
        f17111b = ameVar2;
        ame ameVar3 = new ame("NowPlayingView", 2);
        f17112c = ameVar3;
        ame ameVar4 = new ame("Unknown", 3);
        f17113d = ameVar4;
        f17114e = new ame[]{ameVar, ameVar2, ameVar3, ameVar4};
    }

    public static ame valueOf(String str) {
        return (ame) Enum.valueOf(ame.class, str);
    }

    public static ame[] values() {
        return (ame[]) f17114e.clone();
    }
}
