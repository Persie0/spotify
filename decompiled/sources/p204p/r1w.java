package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class r1w {

    /* JADX INFO: renamed from: a */
    public static final r1w f194933a;

    /* JADX INFO: renamed from: b */
    public static final r1w f194934b;

    /* JADX INFO: renamed from: c */
    public static final r1w f194935c;

    /* JADX INFO: renamed from: d */
    public static final r1w f194936d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ r1w[] f194937e;

    static {
        r1w r1wVar = new r1w("RowClicked", 0);
        f194933a = r1wVar;
        r1w r1wVar2 = new r1w("ExpandableDescriptionClicked", 1);
        f194934b = r1wVar2;
        r1w r1wVar3 = new r1w("AddToLibraryClicked", 2);
        f194935c = r1wVar3;
        r1w r1wVar4 = new r1w("ContextMenuClicked", 3);
        f194936d = r1wVar4;
        f194937e = new r1w[]{r1wVar, r1wVar2, r1wVar3, r1wVar4};
    }

    public static r1w valueOf(String str) {
        return (r1w) Enum.valueOf(r1w.class, str);
    }

    public static r1w[] values() {
        return (r1w[]) f194937e.clone();
    }
}
