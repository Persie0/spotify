package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class pqy {

    /* JADX INFO: renamed from: a */
    public static final pqy f180444a;

    /* JADX INFO: renamed from: b */
    public static final pqy f180445b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ pqy[] f180446c;

    static {
        pqy pqyVar = new pqy("POSITIVE", 0);
        f180444a = pqyVar;
        pqy pqyVar2 = new pqy("NEGATIVE", 1);
        f180445b = pqyVar2;
        f180446c = new pqy[]{pqyVar, pqyVar2};
    }

    public static pqy valueOf(String str) {
        return (pqy) Enum.valueOf(pqy.class, str);
    }

    public static pqy[] values() {
        return (pqy[]) f180446c.clone();
    }
}
