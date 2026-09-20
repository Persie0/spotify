package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum pco0 implements od50 {
    PLAN_TYPE_UNSUPPORTED(0),
    PLAN_TYPE_INDIVIDUAL(1),
    PLAN_TYPE_STUDENT(2),
    PLAN_TYPE_DUO(3),
    PLAN_TYPE_FAMILY(4),
    PLAN_TYPE_BASIC(5),
    PLAN_TYPE_MINI(6),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f176188a;

    pco0(int i) {
        this.f176188a = i;
    }

    /* JADX INFO: renamed from: a */
    public static pco0 m69598a(int i) {
        switch (i) {
            case 0:
                return PLAN_TYPE_UNSUPPORTED;
            case 1:
                return PLAN_TYPE_INDIVIDUAL;
            case 2:
                return PLAN_TYPE_STUDENT;
            case 3:
                return PLAN_TYPE_DUO;
            case 4:
                return PLAN_TYPE_FAMILY;
            case 5:
                return PLAN_TYPE_BASIC;
            case 6:
                return PLAN_TYPE_MINI;
            default:
                return null;
        }
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f176188a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
