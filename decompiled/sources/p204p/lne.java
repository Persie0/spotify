package p204p;

import io.reactivex.rxjava3.core.Observable;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes6.dex */
public final class lne {

    /* JADX INFO: renamed from: a */
    public final boolean f135150a;

    /* JADX INFO: renamed from: b */
    public final boolean f135151b;

    /* JADX INFO: renamed from: c */
    public final epx f135152c;

    public lne(boolean z, boolean z2, epx epxVar) {
        this.f135150a = z;
        this.f135151b = z2;
        this.f135152c = epxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (r8 == r5) goto L31;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m59495a(String str, ibk ibkVar) {
        ine ineVar;
        if (ibkVar instanceof ine) {
            ineVar = (ine) ibkVar;
            int i = ineVar.f103959d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ineVar.f103959d = i - Integer.MIN_VALUE;
            } else {
                ineVar = new ine(this, ibkVar);
            }
        } else {
            ineVar = new ine(this, ibkVar);
        }
        Object objM59497c = ineVar.f103957b;
        int i2 = ineVar.f103959d;
        boolean z = false;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM59497c);
            ineVar.f103956a = str;
            ineVar.f103959d = 1;
            objM59497c = m59497c(str, ineVar);
            if (objM59497c != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            str = ineVar.f103956a;
            bga.m29073P(objM59497c);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM59497c);
        }
        if (((Boolean) objM59497c).booleanValue() || this.f135150a) {
            z = true;
        }
        return Boolean.valueOf(z);
        if (!((Boolean) objM59497c).booleanValue()) {
            return Boolean.FALSE;
        }
        Set set = dd41.f47702f;
        int iOrdinal = r46.m74726U(str).f47709c.ordinal();
        if (iOrdinal == 845) {
            ineVar.f103956a = null;
            ineVar.f103959d = 2;
            objM59497c = m59496b(str, ineVar);
        } else if (iOrdinal == 925) {
            z = this.f135151b;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m59496b(String str, ibk ibkVar) {
        jne jneVar;
        if (ibkVar instanceof jne) {
            jneVar = (jne) ibkVar;
            int i = jneVar.f114089c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jneVar.f114089c = i - Integer.MIN_VALUE;
            } else {
                jneVar = new jne(this, ibkVar);
            }
        } else {
            jneVar = new jne(this, ibkVar);
        }
        Object objM96571q = jneVar.f114087a;
        int i2 = jneVar.f114089c;
        boolean zBooleanValue = false;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96571q);
                Observable map = ((jpx) this.f135152c).m53978b(new C1668ai("clipPermissionCheckerImpl", false, (gh00) new rhd(str, 10))).filter(v4g1.f237149M0).map(new aqs(str, 6));
                jneVar.f114089c = 1;
                objM96571q = zn91.m96571q(map, 1, null, jneVar);
                yuk yukVar = yuk.f276404a;
                if (objM96571q == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96571q);
            }
            wj50.m88279p(objM96571q);
            zBooleanValue = ((Boolean) objM96571q).booleanValue();
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m59497c(String str, ibk ibkVar) {
        kne kneVar;
        if (ibkVar instanceof kne) {
            kneVar = (kne) ibkVar;
            int i = kneVar.f124396c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kneVar.f124396c = i - Integer.MIN_VALUE;
            } else {
                kneVar = new kne(this, ibkVar);
            }
        } else {
            kneVar = new kne(this, ibkVar);
        }
        Object objM96571q = kneVar.f124394a;
        int i2 = kneVar.f124396c;
        boolean zBooleanValue = false;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96571q);
                Observable map = ((jpx) this.f135152c).m53978b(new C1668ai("clipPermissionCheckerImpl", false, (gh00) new rhd(str, 11))).filter(v4g1.f237149M0).map(new vah1(str, 7));
                kneVar.f124396c = 1;
                objM96571q = zn91.m96571q(map, 1, null, kneVar);
                yuk yukVar = yuk.f276404a;
                if (objM96571q == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96571q);
            }
            wj50.m88279p(objM96571q);
            zBooleanValue = ((Boolean) objM96571q).booleanValue();
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
