package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class mkr {

    /* JADX INFO: renamed from: a */
    public static final mkr f144633a;

    /* JADX INFO: renamed from: b */
    public static final mkr f144634b;

    /* JADX INFO: renamed from: c */
    public static final mkr f144635c;

    /* JADX INFO: renamed from: d */
    public static final mkr f144636d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ mkr[] f144637e;

    static {
        mkr mkrVar = new mkr("UP", 0);
        f144633a = mkrVar;
        mkr mkrVar2 = new mkr("DOWN", 1);
        f144634b = mkrVar2;
        mkr mkrVar3 = new mkr("LEFT", 2);
        f144635c = mkrVar3;
        mkr mkrVar4 = new mkr("RIGHT", 3);
        f144636d = mkrVar4;
        f144637e = new mkr[]{mkrVar, mkrVar2, mkrVar3, mkrVar4};
    }

    public static mkr valueOf(String str) {
        return (mkr) Enum.valueOf(mkr.class, str);
    }

    public static mkr[] values() {
        return (mkr[]) f144637e.clone();
    }
}
