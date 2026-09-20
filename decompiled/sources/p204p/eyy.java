package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class eyy {

    /* JADX INFO: renamed from: a */
    public static final eyy f64219a;

    /* JADX INFO: renamed from: b */
    public static final eyy f64220b;

    /* JADX INFO: renamed from: c */
    public static final eyy f64221c;

    /* JADX INFO: renamed from: d */
    public static final eyy f64222d;

    /* JADX INFO: renamed from: e */
    public static final eyy f64223e;

    /* JADX INFO: renamed from: f */
    public static final eyy f64224f;

    /* JADX INFO: renamed from: g */
    public static final eyy f64225g;

    /* JADX INFO: renamed from: h */
    public static final eyy f64226h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ eyy[] f64227i;

    static {
        eyy eyyVar = new eyy("All", 0);
        f64219a = eyyVar;
        eyy eyyVar2 = new eyy("Artists", 1);
        f64220b = eyyVar2;
        eyy eyyVar3 = new eyy("Songs", 2);
        f64221c = eyyVar3;
        eyy eyyVar4 = new eyy("Albums", 3);
        f64222d = eyyVar4;
        eyy eyyVar5 = new eyy("Playlists", 4);
        f64223e = eyyVar5;
        eyy eyyVar6 = new eyy("Podcasts", 5);
        f64224f = eyyVar6;
        eyy eyyVar7 = new eyy("Episodes", 6);
        f64225g = eyyVar7;
        eyy eyyVar8 = new eyy("Audiobooks", 7);
        f64226h = eyyVar8;
        f64227i = new eyy[]{eyyVar, eyyVar2, eyyVar3, eyyVar4, eyyVar5, eyyVar6, eyyVar7, eyyVar8};
    }

    public static eyy valueOf(String str) {
        return (eyy) Enum.valueOf(eyy.class, str);
    }

    public static eyy[] values() {
        return (eyy[]) f64227i.clone();
    }
}
