package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class uzi {

    /* JADX INFO: renamed from: a */
    public static final uzi f235589a;

    /* JADX INFO: renamed from: b */
    public static final uzi f235590b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ uzi[] f235591c;

    static {
        uzi uziVar = new uzi("ONLINE", 0);
        f235589a = uziVar;
        uzi uziVar2 = new uzi("OFFLINE", 1);
        f235590b = uziVar2;
        f235591c = new uzi[]{uziVar, uziVar2};
    }

    public static uzi valueOf(String str) {
        return (uzi) Enum.valueOf(uzi.class, str);
    }

    public static uzi[] values() {
        return (uzi[]) f235591c.clone();
    }
}
