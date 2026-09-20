package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class tlw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tw70 f221531a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vvl0 f221532b;

    public tlw0(tw70 tw70Var, vvl0 vvl0Var) {
        this.f221531a = tw70Var;
        this.f221532b = vvl0Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m81078a() {
        return this.f221531a.f224325a;
    }

    /* JADX INFO: renamed from: b */
    public final long m81079b() {
        int i = this.f221531a.f224340p;
        int iOrdinal = this.f221532b.ordinal();
        if (iOrdinal == 0) {
            return (((long) i) & 4294967295L) | (((long) 0) << 32);
        }
        if (iOrdinal == 1) {
            return (((long) i) << 32) | (4294967295L & ((long) 0));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    public final long m81080c() {
        int i = this.f221531a.f224341q;
        int iOrdinal = this.f221532b.ordinal();
        if (iOrdinal == 0) {
            return (((long) i) & 4294967295L) | (((long) 0) << 32);
        }
        if (iOrdinal == 1) {
            return (((long) i) << 32) | (4294967295L & ((long) 0));
        }
        throw new NoWhenBranchMatchedException();
    }
}
