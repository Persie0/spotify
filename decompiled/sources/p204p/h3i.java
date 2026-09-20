package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class h3i {

    /* JADX INFO: renamed from: a */
    public static final h3i f87237a;

    /* JADX INFO: renamed from: b */
    public static final h3i f87238b;

    /* JADX INFO: renamed from: c */
    public static final h3i f87239c;

    /* JADX INFO: renamed from: d */
    public static final h3i f87240d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ h3i[] f87241e;

    static {
        h3i h3iVar = new h3i("NORMAL", 0);
        f87237a = h3iVar;
        h3i h3iVar2 = new h3i("SMALL", 1);
        f87238b = h3iVar2;
        h3i h3iVar3 = new h3i("LARGE", 2);
        f87239c = h3iVar3;
        h3i h3iVar4 = new h3i("XLARGE", 3);
        f87240d = h3iVar4;
        f87241e = new h3i[]{h3iVar, h3iVar2, h3iVar3, h3iVar4};
    }

    public static h3i valueOf(String str) {
        return (h3i) Enum.valueOf(h3i.class, str);
    }

    public static h3i[] values() {
        return (h3i[]) f87241e.clone();
    }
}
