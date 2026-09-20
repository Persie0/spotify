package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class tyl {

    /* JADX INFO: renamed from: a */
    public static final tyl f225000a;

    /* JADX INFO: renamed from: b */
    public static final tyl f225001b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ tyl[] f225002c;

    static {
        tyl tylVar = new tyl("CardClicked", 0);
        f225000a = tylVar;
        tyl tylVar2 = new tyl("CTAButtonClicked", 1);
        f225001b = tylVar2;
        f225002c = new tyl[]{tylVar, tylVar2};
    }

    public static tyl valueOf(String str) {
        return (tyl) Enum.valueOf(tyl.class, str);
    }

    public static tyl[] values() {
        return (tyl[]) f225002c.clone();
    }
}
