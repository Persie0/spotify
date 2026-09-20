package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public abstract class hn30 implements bk30, lk30 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ hn30[] f93161a = {new en30("TRACK_CLOUD", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    hn30 EF5;

    public static hn30 valueOf(String str) {
        return (hn30) Enum.valueOf(hn30.class, str);
    }

    public static hn30[] values() {
        return (hn30[]) f93161a.clone();
    }

    @Override // p204p.bk30
    public final String category() {
        return xj30.ROW.f262032a;
    }

    @Override // p204p.bk30
    /* JADX INFO: renamed from: id */
    public final String mo29575id() {
        return "glue2:trackCloud";
    }
}
