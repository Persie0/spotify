package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class ffe {

    /* JADX INFO: renamed from: a */
    public static final ffe f68990a;

    /* JADX INFO: renamed from: b */
    public static final ffe f68991b;

    /* JADX INFO: renamed from: c */
    public static final ffe f68992c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ffe[] f68993d;

    static {
        ffe ffeVar = new ffe("Cancel", 0);
        f68990a = ffeVar;
        ffe ffeVar2 = new ffe("JoinButton", 1);
        f68991b = ffeVar2;
        ffe ffeVar3 = new ffe("NotNowButton", 2);
        f68992c = ffeVar3;
        f68993d = new ffe[]{ffeVar, ffeVar2, ffeVar3};
    }

    public static ffe valueOf(String str) {
        return (ffe) Enum.valueOf(ffe.class, str);
    }

    public static ffe[] values() {
        return (ffe[]) f68993d.clone();
    }
}
