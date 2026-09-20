package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class k6e {

    /* JADX INFO: renamed from: a */
    public static final k6e f119734a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ k6e[] f119735b;

    static {
        k6e k6eVar = new k6e("MediaToggle", 0);
        f119734a = k6eVar;
        f119735b = new k6e[]{k6eVar, new k6e("EntitySegments", 1), new k6e("ChapterList", 2), new k6e("FullEpisode", 3), new k6e("SkipAd", 4)};
    }

    public static k6e valueOf(String str) {
        return (k6e) Enum.valueOf(k6e.class, str);
    }

    public static k6e[] values() {
        return (k6e[]) f119735b.clone();
    }
}
