package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class ipv {

    /* JADX INFO: renamed from: a */
    public static final ipv f104565a;

    /* JADX INFO: renamed from: b */
    public static final ipv f104566b;

    /* JADX INFO: renamed from: c */
    public static final ipv f104567c;

    /* JADX INFO: renamed from: d */
    public static final ipv f104568d;

    /* JADX INFO: renamed from: e */
    public static final ipv f104569e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ ipv[] f104570f;

    static {
        ipv ipvVar = new ipv("RowClicked", 0);
        f104565a = ipvVar;
        ipv ipvVar2 = new ipv("RowLongClicked", 1);
        f104566b = ipvVar2;
        ipv ipvVar3 = new ipv("DismissClicked", 2);
        f104567c = ipvVar3;
        ipv ipvVar4 = new ipv("ContextMenuClicked", 3);
        f104568d = ipvVar4;
        ipv ipvVar5 = new ipv("FollowClicked", 4);
        f104569e = ipvVar5;
        f104570f = new ipv[]{ipvVar, ipvVar2, ipvVar3, ipvVar4, ipvVar5};
    }

    public static ipv valueOf(String str) {
        return (ipv) Enum.valueOf(ipv.class, str);
    }

    public static ipv[] values() {
        return (ipv[]) f104570f.clone();
    }
}
