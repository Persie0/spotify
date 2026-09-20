package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum g3a1 implements od50 {
    UNLINK_ACTION_STATE_UNSPECIFIED(0),
    UNLINK_ACTION_STATE_ENABLED(1),
    UNLINK_ACTION_STATE_DISABLED_ON_FAMILY_PLAN(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f76162a;

    g3a1(int i) {
        this.f76162a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f76162a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
