package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class uiy {

    /* JADX INFO: renamed from: a */
    public static final uiy f230831a;

    /* JADX INFO: renamed from: b */
    public static final uiy f230832b;

    /* JADX INFO: renamed from: c */
    public static final uiy f230833c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ uiy[] f230834d;

    static {
        uiy uiyVar = new uiy("NEW_RELEASES", 0);
        f230831a = uiyVar;
        uiy uiyVar2 = new uiy("WRAPPED", 1);
        f230832b = uiyVar2;
        uiy uiyVar3 = new uiy("AUDIOBOOKS", 2);
        f230833c = uiyVar3;
        f230834d = new uiy[]{uiyVar, uiyVar2, uiyVar3};
    }

    public static uiy valueOf(String str) {
        return (uiy) Enum.valueOf(uiy.class, str);
    }

    public static uiy[] values() {
        return (uiy[]) f230834d.clone();
    }
}
