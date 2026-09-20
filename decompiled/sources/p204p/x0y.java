package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class x0y {

    /* JADX INFO: renamed from: a */
    public static final x0y f257009a;

    /* JADX INFO: renamed from: b */
    public static final x0y f257010b;

    /* JADX INFO: renamed from: c */
    public static final x0y f257011c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ x0y[] f257012d;

    static {
        x0y x0yVar = new x0y("OVERRIDABLE", 0);
        f257009a = x0yVar;
        x0y x0yVar2 = new x0y("INCOMPATIBLE", 1);
        f257010b = x0yVar2;
        x0y x0yVar3 = new x0y("UNKNOWN", 2);
        f257011c = x0yVar3;
        f257012d = new x0y[]{x0yVar, x0yVar2, x0yVar3};
    }

    public static x0y valueOf(String str) {
        return (x0y) Enum.valueOf(x0y.class, str);
    }

    public static x0y[] values() {
        return (x0y[]) f257012d.clone();
    }
}
