package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class vi7 {
    private static final /* synthetic */ lzv $ENTRIES;
    private static final /* synthetic */ vi7[] $VALUES;
    public static final vi7 IDT;
    public static final vi7 NONE;
    public static final vi7 STT;

    static {
        vi7 vi7Var = new vi7("NONE", 0);
        NONE = vi7Var;
        vi7 vi7Var2 = new vi7("IDT", 1);
        IDT = vi7Var2;
        vi7 vi7Var3 = new vi7("STT", 2);
        STT = vi7Var3;
        vi7[] vi7VarArr = {vi7Var, vi7Var2, vi7Var3};
        $VALUES = vi7VarArr;
        $ENTRIES = new nzv(vi7VarArr);
    }

    public static vi7 valueOf(String str) {
        return (vi7) Enum.valueOf(vi7.class, str);
    }

    public static vi7[] values() {
        return (vi7[]) $VALUES.clone();
    }
}
