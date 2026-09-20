package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a5j {

    /* JADX INFO: renamed from: a */
    public static final a5j f12524a;

    /* JADX INFO: renamed from: b */
    public static final a5j f12525b;

    /* JADX INFO: renamed from: c */
    public static final a5j f12526c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ a5j[] f12527d;

    static {
        a5j a5jVar = new a5j("NOT_ELIGIBLE", 0);
        f12524a = a5jVar;
        a5j a5jVar2 = new a5j("ELIGIBLE_NOT_GRANTED", 1);
        f12525b = a5jVar2;
        a5j a5jVar3 = new a5j("GRANTED", 2);
        f12526c = a5jVar3;
        f12527d = new a5j[]{a5jVar, a5jVar2, a5jVar3};
    }

    public static a5j valueOf(String str) {
        return (a5j) Enum.valueOf(a5j.class, str);
    }

    public static a5j[] values() {
        return (a5j[]) f12527d.clone();
    }
}
