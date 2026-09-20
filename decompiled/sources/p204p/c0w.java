package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class c0w {

    /* JADX INFO: renamed from: a */
    public static final c0w f32887a;

    /* JADX INFO: renamed from: b */
    public static final c0w f32888b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ c0w[] f32889c;

    static {
        c0w c0wVar = new c0w("TRAILER", 0);
        f32887a = c0wVar;
        c0w c0wVar2 = new c0w("UNKNOWN", 1);
        f32888b = c0wVar2;
        f32889c = new c0w[]{c0wVar, c0wVar2};
        values();
    }

    public static c0w valueOf(String str) {
        return (c0w) Enum.valueOf(c0w.class, str);
    }

    public static c0w[] values() {
        return (c0w[]) f32889c.clone();
    }
}
