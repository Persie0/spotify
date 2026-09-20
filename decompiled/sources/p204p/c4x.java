package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class c4x {

    /* JADX INFO: renamed from: a */
    public static final c4x f34025a;

    /* JADX INFO: renamed from: b */
    public static final c4x f34026b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ c4x[] f34027c;

    static {
        c4x c4xVar = new c4x("CardClicked", 0);
        f34025a = c4xVar;
        c4x c4xVar2 = new c4x("InterestedButtonClicked", 1);
        f34026b = c4xVar2;
        f34027c = new c4x[]{c4xVar, c4xVar2};
    }

    public static c4x valueOf(String str) {
        return (c4x) Enum.valueOf(c4x.class, str);
    }

    public static c4x[] values() {
        return (c4x[]) f34027c.clone();
    }
}
