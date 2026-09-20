package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public abstract class il30 implements bk30, lk30 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ il30[] f103276b = {new yk30("LARGE", 0, "glue2:cardLarge"), new zk30("REGULAR", 1, "glue2:card")};

    /* JADX INFO: renamed from: a */
    public final String f103277a;

    /* JADX INFO: Fake field, exist only in values array */
    il30 EF7;

    public il30(String str, int i, String str2) {
        super(str, i);
        this.f103277a = str2;
    }

    public static il30 valueOf(String str) {
        return (il30) Enum.valueOf(il30.class, str);
    }

    public static il30[] values() {
        return (il30[]) f103276b.clone();
    }

    @Override // p204p.bk30
    public final String category() {
        return xj30.CARD.f262032a;
    }

    @Override // p204p.bk30
    /* JADX INFO: renamed from: id */
    public final String mo29575id() {
        return this.f103277a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f103277a;
    }
}
