package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class vrx {

    /* JADX INFO: renamed from: a */
    public static final vrx f244273a;

    /* JADX INFO: renamed from: b */
    public static final vrx f244274b;

    /* JADX INFO: renamed from: c */
    public static final vrx f244275c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ vrx[] f244276d;

    static {
        vrx vrxVar = new vrx("Idle", 0);
        f244273a = vrxVar;
        vrx vrxVar2 = new vrx("Paused", 1);
        f244274b = vrxVar2;
        vrx vrxVar3 = new vrx("Playing", 2);
        f244275c = vrxVar3;
        f244276d = new vrx[]{vrxVar, vrxVar2, vrxVar3};
    }

    public static vrx valueOf(String str) {
        return (vrx) Enum.valueOf(vrx.class, str);
    }

    public static vrx[] values() {
        return (vrx[]) f244276d.clone();
    }
}
