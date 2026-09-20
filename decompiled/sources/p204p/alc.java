package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class alc {

    /* JADX INFO: renamed from: a */
    public static final alc f16842a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ alc[] f16843b;

    static {
        alc alcVar = new alc("RowClicked", 0);
        f16842a = alcVar;
        f16843b = new alc[]{alcVar};
    }

    public static alc valueOf(String str) {
        return (alc) Enum.valueOf(alc.class, str);
    }

    public static alc[] values() {
        return (alc[]) f16843b.clone();
    }
}
