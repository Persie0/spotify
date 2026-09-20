package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class w0y {

    /* JADX INFO: renamed from: a */
    public static final w0y f246884a;

    /* JADX INFO: renamed from: b */
    public static final w0y f246885b;

    /* JADX INFO: renamed from: c */
    public static final w0y f246886c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ w0y[] f246887d;

    static {
        w0y w0yVar = new w0y("CONFLICTS_ONLY", 0);
        f246884a = w0yVar;
        w0y w0yVar2 = new w0y("SUCCESS_ONLY", 1);
        f246885b = w0yVar2;
        w0y w0yVar3 = new w0y("BOTH", 2);
        f246886c = w0yVar3;
        f246887d = new w0y[]{w0yVar, w0yVar2, w0yVar3};
    }

    public static w0y valueOf(String str) {
        return (w0y) Enum.valueOf(w0y.class, str);
    }

    public static w0y[] values() {
        return (w0y[]) f246887d.clone();
    }
}
