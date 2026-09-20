package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class drc {

    /* JADX INFO: renamed from: a */
    public static final drc f52285a;

    /* JADX INFO: renamed from: b */
    public static final drc f52286b;

    /* JADX INFO: renamed from: c */
    public static final drc f52287c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ drc[] f52288d;

    static {
        drc drcVar = new drc("FINISHED", 0);
        f52285a = drcVar;
        drc drcVar2 = new drc("NOT_STARTED", 1);
        f52286b = drcVar2;
        drc drcVar3 = new drc("IN_PROGRESS", 2);
        f52287c = drcVar3;
        f52288d = new drc[]{drcVar, drcVar2, drcVar3};
    }

    public static drc valueOf(String str) {
        return (drc) Enum.valueOf(drc.class, str);
    }

    public static drc[] values() {
        return (drc[]) f52288d.clone();
    }
}
