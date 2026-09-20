package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ixu {

    /* JADX INFO: renamed from: a */
    public static final ixu f106770a;

    /* JADX INFO: renamed from: b */
    public static final ixu f106771b;

    /* JADX INFO: renamed from: c */
    public static final ixu f106772c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ixu[] f106773d;

    static {
        ixu ixuVar = new ixu("Default", 0);
        f106770a = ixuVar;
        ixu ixuVar2 = new ixu("Pressed", 1);
        f106771b = ixuVar2;
        ixu ixuVar3 = new ixu("Selected", 2);
        f106772c = ixuVar3;
        f106773d = new ixu[]{ixuVar, ixuVar2, ixuVar3};
    }

    public static ixu valueOf(String str) {
        return (ixu) Enum.valueOf(ixu.class, str);
    }

    public static ixu[] values() {
        return (ixu[]) f106773d.clone();
    }
}
