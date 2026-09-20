package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class b1z {

    /* JADX INFO: renamed from: a */
    public static final b1z f22441a;

    /* JADX INFO: renamed from: b */
    public static final b1z f22442b;

    /* JADX INFO: renamed from: c */
    public static final b1z f22443c;

    /* JADX INFO: renamed from: d */
    public static final b1z f22444d;

    /* JADX INFO: renamed from: e */
    public static final b1z f22445e;

    /* JADX INFO: renamed from: f */
    public static final b1z f22446f;

    /* JADX INFO: renamed from: g */
    public static final b1z f22447g;

    /* JADX INFO: renamed from: h */
    public static final b1z f22448h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ b1z[] f22449i;

    static {
        b1z b1zVar = new b1z("LocationClicked", 0);
        f22441a = b1zVar;
        b1z b1zVar2 = new b1z("ClearFiltersClicked", 1);
        f22442b = b1zVar2;
        b1z b1zVar3 = new b1z("BrowseLocationClicked", 2);
        f22443c = b1zVar3;
        b1z b1zVar4 = new b1z("ClearBrowseLocationClicked", 3);
        f22444d = b1zVar4;
        b1z b1zVar5 = new b1z("DateFilterClicked", 4);
        f22445e = b1zVar5;
        b1z b1zVar6 = new b1z("ClearDateFilterClicked", 5);
        f22446f = b1zVar6;
        b1z b1zVar7 = new b1z("ConceptFilterClicked", 6);
        f22447g = b1zVar7;
        b1z b1zVar8 = new b1z("ClearConceptFilterClicked", 7);
        f22448h = b1zVar8;
        f22449i = new b1z[]{b1zVar, b1zVar2, b1zVar3, b1zVar4, b1zVar5, b1zVar6, b1zVar7, b1zVar8};
    }

    public static b1z valueOf(String str) {
        return (b1z) Enum.valueOf(b1z.class, str);
    }

    public static b1z[] values() {
        return (b1z[]) f22449i.clone();
    }
}
