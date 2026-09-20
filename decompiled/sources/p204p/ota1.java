package p204p;

import com.spotify.base.java.logging.Logger;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class ota1 extends d6a0 {

    /* JADX INFO: renamed from: d */
    public final epx f169022d;

    /* JADX INFO: renamed from: e */
    public final sc90 f169023e;

    /* JADX INFO: renamed from: f */
    public final luk f169024f;

    /* JADX INFO: renamed from: g */
    public di41 f169025g;

    /* JADX INFO: renamed from: h */
    public final zv41 f169026h;

    public ota1(epx epxVar, sc90 sc90Var, luk lukVar) {
        this.f169022d = epxVar;
        this.f169023e = sc90Var;
        this.f169024f = lukVar;
        this.f169026h = jag1.m52819d(new lta1(sc90Var.f207662a, null, null, false));
    }

    /* JADX INFO: renamed from: l */
    public static String m67777l(eua1 eua1Var) {
        Object next;
        Iterator it = eua1Var.f62933e.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                o340 o340Var = (o340) next;
                int i = o340Var.f161281c * o340Var.f161280b;
                do {
                    Object next2 = it.next();
                    o340 o340Var2 = (o340) next2;
                    int i2 = o340Var2.f161281c * o340Var2.f161280b;
                    if (i < i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        o340 o340Var3 = (o340) next;
        if (o340Var3 != null) {
            return o340Var3.f161279a;
        }
        return null;
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: e */
    public final void mo25474e() {
        lta1 lta1Var = (lta1) this.f169026h.getValue();
        if (lta1Var.f136736b != null || lta1Var.f136738d) {
            m35106i();
            return;
        }
        m35107j();
        this.f169025g = x0h1.m89578u(kk40.m56661c(this.f169024f), null, 0, new wm81(this, null, 23), 3);
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: f */
    public final void mo25475f() {
        di41 di41Var = this.f169025g;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
    }

    /* JADX INFO: renamed from: k */
    public final xv41 m67778k() {
        return this.f169026h;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0081 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:24:0x0073, B:26:0x0081, B:28:0x008d), top: B:34:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x008d A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:24:0x0073, B:26:0x0081, B:28:0x008d), top: B:34:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x008d, please report this as an issue */
    /* JADX INFO: renamed from: m */
    public final Object m67779m(String str, ibk ibkVar) {
        nta1 nta1Var;
        String str2;
        Exception e;
        String str3;
        eua1 eua1Var;
        if (ibkVar instanceof nta1) {
            nta1Var = (nta1) ibkVar;
            int i = nta1Var.f158040e;
            if ((i & Integer.MIN_VALUE) != 0) {
                nta1Var.f158040e = i - Integer.MIN_VALUE;
            } else {
                nta1Var = new nta1(this, ibkVar);
            }
        } else {
            nta1Var = new nta1(this, ibkVar);
        }
        Object obj = nta1Var.f158038c;
        int i2 = nta1Var.f158040e;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = nta1Var.f158037b;
            str2 = nta1Var.f158036a;
            try {
                bga.m29073P(obj);
                eua1Var = (eua1) ((gqx) obj).mo45449a(eua1.class, str3).f72301b;
                if (eua1Var != null) {
                    return new lta1(str2, eua1Var.f62930b, m67777l(eua1Var), false);
                }
                Logger.m3973i("BUZZ: UserProfileV2 extension data is null for username: " + str2, new Object[0]);
                return new lta1(str2, null, null, true);
            } catch (Exception e2) {
                e = e2;
                Logger.m3973i(edb.m38564m("BUZZ: Failed to fetch user metadata for username: ", str2), e);
                return new lta1(str2, null, null, true);
            }
        }
        bga.m29073P(obj);
        try {
            String strM47325a = hf41.m47325a(str);
            in21 in21Var = new in21(k0e1.m54985d(((jpx) this.f169022d).m53978b(new C1668ai("listening-activity-user-metadata", false, (gh00) new mv81(strM47325a, 8)))), 10);
            nta1Var.f158036a = str;
            nta1Var.f158037b = strM47325a;
            nta1Var.f158040e = 1;
            Object objM86755t = vyf1.m86755t(in21Var, nta1Var);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
            str2 = str;
            str3 = strM47325a;
            obj = objM86755t;
            eua1Var = (eua1) ((gqx) obj).mo45449a(eua1.class, str3).f72301b;
            if (eua1Var != null) {
                return new lta1(str2, eua1Var.f62930b, m67777l(eua1Var), false);
            }
            Logger.m3973i("BUZZ: UserProfileV2 extension data is null for username: " + str2, new Object[0]);
            return new lta1(str2, null, null, true);
        } catch (Exception e3) {
            str2 = str;
            e = e3;
            Logger.m3973i(edb.m38564m("BUZZ: Failed to fetch user metadata for username: ", str2), e);
            return new lta1(str2, null, null, true);
        }
    }
}
