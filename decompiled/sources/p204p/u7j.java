package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class u7j {

    /* JADX INFO: renamed from: a */
    public static final u7j f227710a;

    /* JADX INFO: renamed from: b */
    public static final u7j f227711b;

    /* JADX INFO: renamed from: c */
    public static final u7j f227712c;

    /* JADX INFO: renamed from: d */
    public static final u7j f227713d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ u7j[] f227714e;

    static {
        u7j u7jVar = new u7j("FIXED", 0);
        f227710a = u7jVar;
        u7j u7jVar2 = new u7j("WRAP_CONTENT", 1);
        f227711b = u7jVar2;
        u7j u7jVar3 = new u7j("MATCH_CONSTRAINT", 2);
        f227712c = u7jVar3;
        u7j u7jVar4 = new u7j("MATCH_PARENT", 3);
        f227713d = u7jVar4;
        f227714e = new u7j[]{u7jVar, u7jVar2, u7jVar3, u7jVar4};
    }

    public static u7j valueOf(String str) {
        return (u7j) Enum.valueOf(u7j.class, str);
    }

    public static u7j[] values() {
        return (u7j[]) f227714e.clone();
    }
}
