package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class l3e {

    /* JADX INFO: renamed from: a */
    public static final l3e f129303a;

    /* JADX INFO: renamed from: b */
    public static final l3e f129304b;

    /* JADX INFO: renamed from: c */
    public static final l3e f129305c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ l3e[] f129306d;

    static {
        l3e l3eVar = new l3e("REQUEST_GRADUATION", 0);
        f129303a = l3eVar;
        l3e l3eVar2 = new l3e("INITIATE_GRADUATION", 1);
        f129304b = l3eVar2;
        l3e l3eVar3 = new l3e("NONE", 2);
        f129305c = l3eVar3;
        f129306d = new l3e[]{l3eVar, l3eVar2, l3eVar3};
    }

    public static l3e valueOf(String str) {
        return (l3e) Enum.valueOf(l3e.class, str);
    }

    public static l3e[] values() {
        return (l3e[]) f129306d.clone();
    }
}
