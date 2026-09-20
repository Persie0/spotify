package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class ew01 {

    /* JADX INFO: renamed from: a */
    public static final ew01 f63387a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ew01[] f63388b;

    static {
        ew01 ew01Var = new ew01("ShareSheetError", 0);
        f63387a = ew01Var;
        f63388b = new ew01[]{ew01Var, new ew01("ShareLinkClicked", 1), new ew01("ShowQrCodeClicked", 2), new ew01("FindPeopleLinkClicked", 3)};
    }

    public static ew01 valueOf(String str) {
        return (ew01) Enum.valueOf(ew01.class, str);
    }

    public static ew01[] values() {
        return (ew01[]) f63388b.clone();
    }
}
