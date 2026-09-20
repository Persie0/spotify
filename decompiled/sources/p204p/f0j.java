package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class f0j {

    /* JADX INFO: renamed from: a */
    public static final f0j f64672a;

    /* JADX INFO: renamed from: b */
    public static final f0j f64673b;

    /* JADX INFO: renamed from: c */
    public static final f0j f64674c;

    /* JADX INFO: renamed from: d */
    public static final f0j f64675d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ f0j[] f64676e;

    static {
        f0j f0jVar = new f0j("BLUETOOTH", 0);
        f64672a = f0jVar;
        f0j f0jVar2 = new f0j("WIRED", 1);
        f64673b = f0jVar2;
        f0j f0jVar3 = new f0j("BLUETOOTH_AND_WIRED", 2);
        f64674c = f0jVar3;
        f0j f0jVar4 = new f0j("NOTHING", 3);
        f64675d = f0jVar4;
        f64676e = new f0j[]{f0jVar, f0jVar2, f0jVar3, f0jVar4};
    }

    public static f0j valueOf(String str) {
        return (f0j) Enum.valueOf(f0j.class, str);
    }

    public static f0j[] values() {
        return (f0j[]) f64676e.clone();
    }
}
