package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class dzi {

    /* JADX INFO: renamed from: a */
    public static final dzi f54670a;

    /* JADX INFO: renamed from: b */
    public static final dzi f54671b;

    /* JADX INFO: renamed from: c */
    public static final dzi f54672c;

    /* JADX INFO: renamed from: d */
    public static final dzi f54673d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ dzi[] f54674e;

    static {
        dzi dziVar = new dzi("UNKNOWN", 0);
        f54670a = dziVar;
        dzi dziVar2 = new dzi("GOOD", 1);
        f54671b = dziVar2;
        dzi dziVar3 = new dzi("POOR", 2);
        f54672c = dziVar3;
        dzi dziVar4 = new dzi("ABSENT", 3);
        f54673d = dziVar4;
        f54674e = new dzi[]{dziVar, dziVar2, dziVar3, dziVar4};
    }

    public static dzi valueOf(String str) {
        return (dzi) Enum.valueOf(dzi.class, str);
    }

    public static dzi[] values() {
        return (dzi[]) f54674e.clone();
    }
}
