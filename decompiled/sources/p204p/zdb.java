package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class zdb {

    /* JADX INFO: renamed from: a */
    public static final zdb f281664a;

    /* JADX INFO: renamed from: b */
    public static final zdb f281665b;

    /* JADX INFO: renamed from: c */
    public static final zdb f281666c;

    /* JADX INFO: renamed from: d */
    public static final zdb f281667d;

    /* JADX INFO: renamed from: e */
    public static final zdb f281668e;

    /* JADX INFO: renamed from: f */
    public static final zdb f281669f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ zdb[] f281670g;

    static {
        zdb zdbVar = new zdb("UNKNOWN", 0);
        f281664a = zdbVar;
        zdb zdbVar2 = new zdb("INACTIVE", 1);
        f281665b = zdbVar2;
        zdb zdbVar3 = new zdb("SEARCHING", 2);
        f281666c = zdbVar3;
        zdb zdbVar4 = new zdb("FLASH_REQUIRED", 3);
        f281667d = zdbVar4;
        zdb zdbVar5 = new zdb("CONVERGED", 4);
        f281668e = zdbVar5;
        zdb zdbVar6 = new zdb("LOCKED", 5);
        f281669f = zdbVar6;
        f281670g = new zdb[]{zdbVar, zdbVar2, zdbVar3, zdbVar4, zdbVar5, zdbVar6};
    }

    public static zdb valueOf(String str) {
        return (zdb) Enum.valueOf(zdb.class, str);
    }

    public static zdb[] values() {
        return (zdb[]) f281670g.clone();
    }
}
