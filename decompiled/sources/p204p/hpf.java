package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum hpf implements od50 {
    OK(0),
    NOT_FOUND(1),
    INVALID_ARGUMENTS(2),
    BACKEND_FAILURE(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f93773a;

    hpf(int i) {
        this.f93773a = i;
    }

    /* JADX INFO: renamed from: a */
    public static hpf m48156a(int i) {
        if (i == 0) {
            return OK;
        }
        if (i == 1) {
            return NOT_FOUND;
        }
        if (i == 2) {
            return INVALID_ARGUMENTS;
        }
        if (i != 3) {
            return null;
        }
        return BACKEND_FAILURE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f93773a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
