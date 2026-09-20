package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class t5m {

    /* JADX INFO: renamed from: a */
    public static final t5m f217316a;

    /* JADX INFO: renamed from: b */
    public static final t5m f217317b;

    /* JADX INFO: renamed from: c */
    public static final t5m f217318c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ t5m[] f217319d;

    static {
        t5m t5mVar = new t5m("ADDED", 0);
        f217316a = t5mVar;
        t5m t5mVar2 = new t5m("NOT_ADDED", 1);
        f217317b = t5mVar2;
        t5m t5mVar3 = new t5m("UNAVAILABLE", 2);
        f217318c = t5mVar3;
        f217319d = new t5m[]{t5mVar, t5mVar2, t5mVar3};
    }

    public static t5m valueOf(String str) {
        return (t5m) Enum.valueOf(t5m.class, str);
    }

    public static t5m[] values() {
        return (t5m[]) f217319d.clone();
    }
}
