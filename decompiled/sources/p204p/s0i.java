package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class s0i {

    /* JADX INFO: renamed from: a */
    public static final s0i f204415a;

    /* JADX INFO: renamed from: b */
    public static final s0i f204416b;

    /* JADX INFO: renamed from: c */
    public static final s0i f204417c;

    /* JADX INFO: renamed from: d */
    public static final s0i f204418d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ s0i[] f204419e;

    static {
        s0i s0iVar = new s0i("LEARN_MORE", 0);
        f204415a = s0iVar;
        s0i s0iVar2 = new s0i("SEE_TICKETS", 1);
        f204416b = s0iVar2;
        s0i s0iVar3 = new s0i("JOIN_WAITLIST", 2);
        s0i s0iVar4 = new s0i("JOINED_WAITLIST", 3);
        s0i s0iVar5 = new s0i("VIEW", 4);
        f204417c = s0iVar5;
        s0i s0iVar6 = new s0i("NONE", 5);
        f204418d = s0iVar6;
        f204419e = new s0i[]{s0iVar, s0iVar2, s0iVar3, s0iVar4, s0iVar5, s0iVar6};
    }

    public static s0i valueOf(String str) {
        return (s0i) Enum.valueOf(s0i.class, str);
    }

    public static s0i[] values() {
        return (s0i[]) f204419e.clone();
    }
}
