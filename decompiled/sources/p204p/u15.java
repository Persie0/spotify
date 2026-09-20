package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum u15 {
    NO_ARGUMENTS(3),
    /* JADX INFO: Fake field, exist only in values array */
    UNLESS_EMPTY(2),
    /* JADX INFO: Fake field, exist only in values array */
    ALWAYS_PARENTHESIZED(true, true);


    /* JADX INFO: renamed from: a */
    public final boolean f225683a;

    /* JADX INFO: renamed from: b */
    public final boolean f225684b;

    /* synthetic */ u15(int i) {
        this((i & 1) == 0, false);
    }

    u15(boolean z, boolean z2) {
        this.f225683a = z;
        this.f225684b = z2;
    }
}
