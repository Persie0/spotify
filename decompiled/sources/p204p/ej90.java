package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ej90 {

    /* JADX INFO: renamed from: a */
    public static final ej90 f60166a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ej90[] f60167b;

    static {
        ej90 ej90Var = new ej90("CardClicked", 0);
        f60166a = ej90Var;
        f60167b = new ej90[]{ej90Var};
    }

    public static ej90 valueOf(String str) {
        return (ej90) Enum.valueOf(ej90.class, str);
    }

    public static ej90[] values() {
        return (ej90[]) f60167b.clone();
    }
}
