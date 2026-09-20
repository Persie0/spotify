package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class o0j {

    /* JADX INFO: renamed from: a */
    public static final o0j f160408a;

    /* JADX INFO: renamed from: b */
    public static final o0j f160409b;

    /* JADX INFO: renamed from: c */
    public static final o0j f160410c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ o0j[] f160411d;

    static {
        o0j o0jVar = new o0j("OFFLINE", 0);
        f160408a = o0jVar;
        o0j o0jVar2 = new o0j("ONLINE_UNAUTHENTICATED", 1);
        f160409b = o0jVar2;
        o0j o0jVar3 = new o0j("ONLINE_AUTHENTICATED", 2);
        f160410c = o0jVar3;
        f160411d = new o0j[]{o0jVar, o0jVar2, o0jVar3};
    }

    public static o0j valueOf(String str) {
        return (o0j) Enum.valueOf(o0j.class, str);
    }

    public static o0j[] values() {
        return (o0j[]) f160411d.clone();
    }
}
