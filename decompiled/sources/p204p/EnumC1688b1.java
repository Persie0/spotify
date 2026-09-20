package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: p.b1 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1688b1 {

    /* JADX INFO: renamed from: a */
    public static final EnumC1688b1 f22156a;

    /* JADX INFO: renamed from: b */
    public static final EnumC1688b1 f22157b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumC1688b1[] f22158c;

    static {
        EnumC1688b1 enumC1688b1 = new EnumC1688b1("NAVIGATE_TO_ENTITY", 0);
        f22156a = enumC1688b1;
        EnumC1688b1 enumC1688b2 = new EnumC1688b1("NAVIGATE_TO_DETAILS", 1);
        f22157b = enumC1688b2;
        f22158c = new EnumC1688b1[]{enumC1688b1, enumC1688b2};
    }

    public static EnumC1688b1 valueOf(String str) {
        return (EnumC1688b1) Enum.valueOf(EnumC1688b1.class, str);
    }

    public static EnumC1688b1[] values() {
        return (EnumC1688b1[]) f22158c.clone();
    }
}
