package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class r5k {

    /* JADX INFO: renamed from: a */
    public static final r5k f196067a;

    /* JADX INFO: renamed from: b */
    public static final r5k f196068b;

    /* JADX INFO: renamed from: c */
    public static final r5k f196069c;

    /* JADX INFO: renamed from: d */
    public static final r5k f196070d;

    /* JADX INFO: renamed from: e */
    public static final r5k f196071e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ r5k[] f196072f;

    static {
        r5k r5kVar = new r5k("Puffin", 0);
        f196067a = r5kVar;
        r5k r5kVar2 = new r5k("Lossless", 1);
        f196068b = r5kVar2;
        r5k r5kVar3 = new r5k("ConnectLogout", 2);
        f196069c = r5kVar3;
        r5k r5kVar4 = new r5k("ConnectThirdParty", 3);
        f196070d = r5kVar4;
        r5k r5kVar5 = new r5k("ConnectIncarnation", 4);
        f196071e = r5kVar5;
        f196072f = new r5k[]{r5kVar, r5kVar2, r5kVar3, r5kVar4, r5kVar5};
    }

    public static r5k valueOf(String str) {
        return (r5k) Enum.valueOf(r5k.class, str);
    }

    public static r5k[] values() {
        return (r5k[]) f196072f.clone();
    }
}
