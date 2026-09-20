package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class joo {

    /* JADX INFO: renamed from: a */
    public static final joo f114465a;

    /* JADX INFO: renamed from: b */
    public static final joo f114466b;

    /* JADX INFO: renamed from: c */
    public static final joo f114467c;

    /* JADX INFO: renamed from: d */
    public static final joo f114468d;

    /* JADX INFO: renamed from: e */
    public static final joo f114469e;

    /* JADX INFO: renamed from: f */
    public static final joo f114470f;

    /* JADX INFO: renamed from: g */
    public static final joo f114471g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ joo[] f114472h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ nzv f114473i;

    static {
        joo jooVar = new joo("SUNDAY", 0);
        f114465a = jooVar;
        joo jooVar2 = new joo("MONDAY", 1);
        f114466b = jooVar2;
        joo jooVar3 = new joo("TUESDAY", 2);
        f114467c = jooVar3;
        joo jooVar4 = new joo("WEDNESDAY", 3);
        f114468d = jooVar4;
        joo jooVar5 = new joo("THURSDAY", 4);
        f114469e = jooVar5;
        joo jooVar6 = new joo("FRIDAY", 5);
        f114470f = jooVar6;
        joo jooVar7 = new joo("SATURDAY", 6);
        f114471g = jooVar7;
        joo[] jooVarArr = {jooVar, jooVar2, jooVar3, jooVar4, jooVar5, jooVar6, jooVar7};
        f114472h = jooVarArr;
        f114473i = new nzv(jooVarArr);
    }

    public static joo valueOf(String str) {
        return (joo) Enum.valueOf(joo.class, str);
    }

    public static joo[] values() {
        return (joo[]) f114472h.clone();
    }

    /* JADX INFO: renamed from: a */
    public final int m53892a() {
        return ordinal() + 1;
    }
}
