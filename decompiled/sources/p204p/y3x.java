package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class y3x {

    /* JADX INFO: renamed from: a */
    public static final y3x f268993a;

    /* JADX INFO: renamed from: b */
    public static final y3x f268994b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ y3x[] f268995c;

    static {
        y3x y3xVar = new y3x("CardClicked", 0);
        f268993a = y3xVar;
        y3x y3xVar2 = new y3x("SaveClicked", 1);
        f268994b = y3xVar2;
        f268995c = new y3x[]{y3xVar, y3xVar2};
    }

    public static y3x valueOf(String str) {
        return (y3x) Enum.valueOf(y3x.class, str);
    }

    public static y3x[] values() {
        return (y3x[]) f268995c.clone();
    }
}
