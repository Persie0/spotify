package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class d6e {

    /* JADX INFO: renamed from: a */
    public static final d6e f45678a;

    /* JADX INFO: renamed from: b */
    public static final d6e f45679b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ d6e[] f45680c;

    static {
        d6e d6eVar = new d6e("PRIMARY", 0);
        f45678a = d6eVar;
        d6e d6eVar2 = new d6e("FLOATING", 1);
        f45679b = d6eVar2;
        f45680c = new d6e[]{d6eVar, d6eVar2};
    }

    public static d6e valueOf(String str) {
        return (d6e) Enum.valueOf(d6e.class, str);
    }

    public static d6e[] values() {
        return (d6e[]) f45680c.clone();
    }
}
