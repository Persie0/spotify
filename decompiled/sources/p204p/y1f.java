package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class y1f {

    /* JADX INFO: renamed from: a */
    public static final y1f f268252a;

    /* JADX INFO: renamed from: b */
    public static final y1f f268253b;

    /* JADX INFO: renamed from: c */
    public static final y1f f268254c;

    /* JADX INFO: renamed from: d */
    public static final y1f f268255d;

    /* JADX INFO: renamed from: e */
    public static final y1f f268256e;

    /* JADX INFO: renamed from: f */
    public static final y1f f268257f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ y1f[] f268258g;

    static {
        y1f y1fVar = new y1f("BackButtonClicked", 0);
        f268252a = y1fVar;
        y1f y1fVar2 = new y1f("PlayButtonClicked", 1);
        f268253b = y1fVar2;
        y1f y1fVar3 = new y1f("ShuffleButtonClicked", 2);
        f268254c = y1fVar3;
        y1f y1fVar4 = new y1f("FollowButtonClicked", 3);
        f268255d = y1fVar4;
        y1f y1fVar5 = new y1f("DownloadButtonClicked", 4);
        f268256e = y1fVar5;
        y1f y1fVar6 = new y1f("ContextMenuButtonClicked", 5);
        f268257f = y1fVar6;
        f268258g = new y1f[]{y1fVar, y1fVar2, y1fVar3, y1fVar4, y1fVar5, y1fVar6};
    }

    public static y1f valueOf(String str) {
        return (y1f) Enum.valueOf(y1f.class, str);
    }

    public static y1f[] values() {
        return (y1f[]) f268258g.clone();
    }
}
