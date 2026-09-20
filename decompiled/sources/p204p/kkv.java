package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class kkv {

    /* JADX INFO: renamed from: a */
    public static final kkv f123713a;

    /* JADX INFO: renamed from: b */
    public static final kkv f123714b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ kkv[] f123715c;

    static {
        kkv kkvVar = new kkv("AddButtonClicked", 0);
        f123713a = kkvVar;
        kkv kkvVar2 = new kkv("EntityRowClicked", 1);
        f123714b = kkvVar2;
        f123715c = new kkv[]{kkvVar, kkvVar2};
    }

    public static kkv valueOf(String str) {
        return (kkv) Enum.valueOf(kkv.class, str);
    }

    public static kkv[] values() {
        return (kkv[]) f123715c.clone();
    }
}
