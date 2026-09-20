package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class wov {

    /* JADX INFO: renamed from: a */
    public final pev f253575a;

    public wov(pev pevVar) {
        this.f253575a = pevVar;
    }

    /* JADX INFO: renamed from: a */
    public final zxv m88666a(mhv mhvVar) {
        boolean z = mhvVar instanceof dhv;
        pev pevVar = this.f253575a;
        if (z) {
            dhv dhvVar = (dhv) mhvVar;
            xi3 xi3Var = dhvVar.f49175d;
            jev jevVar = dhvVar.f49173b.f29428e;
            int iOrdinal = xi3Var.ordinal();
            if (iOrdinal == 0) {
                switch (jevVar.ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        return zxv.f287406Z;
                    default:
                        na6.m63957e("Invalid entity, " + jevVar);
                        return pevVar.m69731b() ? zxv.f287404X : zxv.f287400N0;
                }
            }
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            switch (jevVar.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                    return zxv.f287410f;
                default:
                    na6.m63957e("Invalid entity, " + jevVar);
                    return pevVar.m69731b() ? zxv.f287409e : zxv.f287414t;
            }
        }
        if (mhvVar instanceof lhv) {
            return zxv.f287402P0;
        }
        if (mhvVar instanceof khv) {
            return zxv.f287401O0;
        }
        if (mhvVar instanceof ehv) {
            return zxv.f287411g;
        }
        if (mhvVar instanceof fhv) {
            return zxv.f287398L0;
        }
        if (mhvVar instanceof hhv) {
            return zxv.f287412h;
        }
        if (mhvVar instanceof jhv) {
            int iOrdinal2 = ((jhv) mhvVar).f112572b.ordinal();
            if (iOrdinal2 == 0) {
                return pevVar.m69731b() ? zxv.f287404X : zxv.f287400N0;
            }
            if (iOrdinal2 == 1) {
                return pevVar.m69731b() ? zxv.f287409e : zxv.f287414t;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(mhvVar instanceof ihv)) {
            if (mhvVar instanceof chv) {
                return zxv.f287405Y;
            }
            throw new NoWhenBranchMatchedException();
        }
        int iOrdinal3 = ((ihv) mhvVar).f102371d.ordinal();
        if (iOrdinal3 == 0) {
            return zxv.f287399M0;
        }
        if (iOrdinal3 == 1) {
            return zxv.f287413i;
        }
        throw new NoWhenBranchMatchedException();
    }
}
