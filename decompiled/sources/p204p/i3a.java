package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class i3a {

    /* JADX INFO: renamed from: a */
    public static final i3a f98073a;

    /* JADX INFO: renamed from: b */
    public static final i3a f98074b;

    /* JADX INFO: renamed from: c */
    public static final i3a f98075c;

    /* JADX INFO: renamed from: d */
    public static final i3a f98076d;

    /* JADX INFO: renamed from: e */
    public static final i3a f98077e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ i3a[] f98078f;

    static {
        i3a i3aVar = new i3a("OFF", 0);
        f98073a = i3aVar;
        i3a i3aVar2 = new i3a("TURNING_OFF", 1);
        f98074b = i3aVar2;
        i3a i3aVar3 = new i3a("ON", 2);
        f98075c = i3aVar3;
        i3a i3aVar4 = new i3a("TURNING_ON", 3);
        f98076d = i3aVar4;
        i3a i3aVar5 = new i3a("UNKNOWN", 4);
        f98077e = i3aVar5;
        f98078f = new i3a[]{i3aVar, i3aVar2, i3aVar3, i3aVar4, i3aVar5};
    }

    public static i3a valueOf(String str) {
        return (i3a) Enum.valueOf(i3a.class, str);
    }

    public static i3a[] values() {
        return (i3a[]) f98078f.clone();
    }
}
