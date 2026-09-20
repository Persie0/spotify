package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class lv7 {

    /* JADX INFO: renamed from: a */
    public static final lv7 f137250a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ lv7[] f137251b;

    static {
        lv7 lv7Var = new lv7("Toggle", 0);
        f137250a = lv7Var;
        f137251b = new lv7[]{lv7Var};
    }

    public static lv7 valueOf(String str) {
        return (lv7) Enum.valueOf(lv7.class, str);
    }

    public static lv7[] values() {
        return (lv7[]) f137251b.clone();
    }
}
