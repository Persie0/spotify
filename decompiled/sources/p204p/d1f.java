package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class d1f {

    /* JADX INFO: renamed from: a */
    public static final d1f[] f44250a;

    /* JADX INFO: renamed from: b */
    public static final d1f f44251b;

    /* JADX INFO: renamed from: c */
    public static final d1f f44252c;

    /* JADX INFO: renamed from: d */
    public static final d1f f44253d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ d1f[] f44254e;

    static {
        d1f d1fVar = new d1f("TRACK", 0);
        f44251b = d1fVar;
        d1f d1fVar2 = new d1f("LIKED_RELEASES_HEADING", 1);
        f44252c = d1fVar2;
        d1f d1fVar3 = new d1f("ALBUM", 2);
        f44253d = d1fVar3;
        d1f[] d1fVarArr = {d1fVar, d1fVar2, d1fVar3};
        f44254e = d1fVarArr;
        f44250a = (d1f[]) wj50.m88264f0(new nzv(d1fVarArr), new d1f[0]);
    }

    public static d1f valueOf(String str) {
        return (d1f) Enum.valueOf(d1f.class, str);
    }

    public static d1f[] values() {
        return (d1f[]) f44254e.clone();
    }
}
