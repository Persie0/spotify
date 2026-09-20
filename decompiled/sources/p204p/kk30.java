package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kk30 {
    private static final lk30 DUMMY = new abz(13);

    private kk30() {
    }

    public static lk30 dummy() {
        return DUMMY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$single$2(String str, int i, fk30 fk30Var) {
        if (fk30Var.componentId().mo29575id().equals(str)) {
            return i;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(fk30 fk30Var) {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$withFallback$1(lk30 lk30Var, lk30 lk30Var2, fk30 fk30Var) {
        int iMo25406k = lk30Var.mo25406k(fk30Var);
        return iMo25406k == 0 ? lk30Var2.mo25406k(fk30Var) : iMo25406k;
    }

    public static lk30 single(String str, int i) {
        str.getClass();
        return new afp(str, i, 1);
    }

    public static lk30 withFallback(lk30 lk30Var, lk30 lk30Var2) {
        lk30Var.getClass();
        lk30Var2.getClass();
        lk30 lk30Var3 = DUMMY;
        if (lk30Var == lk30Var3) {
            return lk30Var2;
        }
        return lk30Var2 == lk30Var3 ? lk30Var : new m94(29, lk30Var, lk30Var2);
    }
}
