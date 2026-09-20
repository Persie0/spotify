package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class u0c {

    /* JADX INFO: renamed from: a */
    public static final u0c f225444a;

    /* JADX INFO: renamed from: b */
    public static final u0c f225445b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ u0c[] f225446c;

    static {
        u0c u0cVar = new u0c("Track", 0);
        f225444a = u0cVar;
        u0c u0cVar2 = new u0c("Episode", 1);
        f225445b = u0cVar2;
        f225446c = new u0c[]{u0cVar, u0cVar2};
    }

    public static u0c valueOf(String str) {
        return (u0c) Enum.valueOf(u0c.class, str);
    }

    public static u0c[] values() {
        return (u0c[]) f225446c.clone();
    }
}
