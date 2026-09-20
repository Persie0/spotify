package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class t6u {

    /* JADX INFO: renamed from: a */
    public static final t6u f217606a;

    /* JADX INFO: renamed from: b */
    public static final t6u f217607b;

    /* JADX INFO: renamed from: c */
    public static final t6u f217608c;

    /* JADX INFO: renamed from: d */
    public static final t6u f217609d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ t6u[] f217610e;

    static {
        t6u t6uVar = new t6u("INITIAL", 0);
        f217606a = t6uVar;
        t6u t6uVar2 = new t6u("PENDING", 1);
        f217607b = t6uVar2;
        t6u t6uVar3 = new t6u("AD_AVAILABLE", 2);
        f217608c = t6uVar3;
        t6u t6uVar4 = new t6u("NO_AD_AVAILABLE", 3);
        f217609d = t6uVar4;
        f217610e = new t6u[]{t6uVar, t6uVar2, t6uVar3, t6uVar4};
    }

    public static t6u valueOf(String str) {
        return (t6u) Enum.valueOf(t6u.class, str);
    }

    public static t6u[] values() {
        return (t6u[]) f217610e.clone();
    }
}
