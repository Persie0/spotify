package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class k9l0 {

    /* JADX INFO: renamed from: a */
    public final nc4 f120616a;

    /* JADX INFO: renamed from: b */
    public final e9l0 f120617b;

    /* JADX INFO: renamed from: c */
    public final ai91 f120618c;

    public k9l0(nc4 nc4Var, e9l0 e9l0Var, ai91 ai91Var) {
        this.f120616a = nc4Var;
        this.f120617b = e9l0Var;
        this.f120618c = ai91Var;
    }

    /* JADX INFO: renamed from: a */
    public final Object m55834a(ii91 ii91Var, ibk ibkVar) {
        Object objM47630d;
        ji91 ji91Var = ii91Var.f102483a;
        return (ji91Var == null || (objM47630d = ((hi91) this.f120618c).m47630d(ji91Var, ibkVar)) != yuk.f276404a) ? w2a1.f247311a : objM47630d;
    }

    /* JADX INFO: renamed from: b */
    public final fiz m55835b() {
        if (!this.f120616a.m64115g()) {
            return nxf1.m65834m(sg91.f208795e);
        }
        e9l0 e9l0Var = this.f120617b;
        return g0g1.m43299d(jsf1.m54238k(e9l0Var.f57470b), e9l0Var.m38250a(), new sgp(this, null, 2));
    }

    /* JADX INFO: renamed from: c */
    public final fiz m55836c(ii91 ii91Var) {
        e9l0 e9l0Var = this.f120617b;
        fiz fizVarM54238k = jsf1.m54238k(e9l0Var.f57470b);
        switch (ii91Var) {
            case DOWNLOAD_MENU_ITEM:
            case REMOTE_DOWNLOAD_MENU_ITEM:
            case OFFLINE_BACKUP_BANNER:
            case QUEUE_BANNER:
            case DOWNLOADS_SNACKBAR:
            case SHUFFLE_SNACKBAR:
                return fizVarM54238k;
            case JAM_MENU_ITEM:
            case JAM_BANNER:
                return g0g1.m43299d(fizVarM54238k, e9l0Var.m38250a(), h9l0.f88999h);
            case AUDIO_QUALITY_SETTINGS_ITEM:
            case AUDIO_QUALITY_BANNER:
                return this.f120616a.m64114f() ? g0g1.m43299d(fizVarM54238k, e9l0Var.m38250a(), i9l0.f100036h) : nxf1.m65834m(Boolean.FALSE);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m55837d(ii91 ii91Var, ibk ibkVar) {
        j9l0 j9l0Var;
        if (ibkVar instanceof j9l0) {
            j9l0Var = (j9l0) ibkVar;
            int i = j9l0Var.f110198d;
            if ((i & Integer.MIN_VALUE) != 0) {
                j9l0Var.f110198d = i - Integer.MIN_VALUE;
            } else {
                j9l0Var = new j9l0(this, ibkVar);
            }
        } else {
            j9l0Var = new j9l0(this, ibkVar);
        }
        Object objM86755t = j9l0Var.f110196b;
        int i2 = j9l0Var.f110198d;
        boolean z = false;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            if (!this.f120616a.m64115g()) {
                return qyg1.m74178H(false);
            }
            j9l0Var.f110195a = ii91Var;
            j9l0Var.f110198d = 1;
            objM86755t = vyf1.m86755t(m55836c(ii91Var), j9l0Var);
            if (objM86755t != yukVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
            return objM86755t;
        }
        ii91Var = j9l0Var.f110195a;
        bga.m29073P(objM86755t);
        boolean zBooleanValue = ((Boolean) objM86755t).booleanValue();
        ji91 ji91Var = ii91Var.f102483a;
        if (zBooleanValue) {
            if (ji91Var != null) {
                j9l0Var.f110195a = null;
                j9l0Var.f110198d = 2;
                Object objM47628a = ((hi91) this.f120618c).m47628a(ji91Var, j9l0Var);
                return objM47628a == yukVar ? yukVar : objM47628a;
            }
            z = true;
        }
        return qyg1.m74178H(z);
    }

    /* JADX INFO: renamed from: e */
    public final fiz m55838e(ii91 ii91Var) {
        if (!this.f120616a.m64115g()) {
            return nxf1.m65834m(Boolean.FALSE);
        }
        fiz fizVarM55836c = m55836c(ii91Var);
        ji91 ji91Var = ii91Var.f102483a;
        if (ji91Var == null) {
            return fizVarM55836c;
        }
        hi91 hi91Var = (hi91) this.f120618c;
        return g0g1.m43299d(fizVarM55836c, kyf1.m57709n(new vj61(new gt71(bzf1.m31020l(hi91Var.f91760d), ji91Var, 5), hi91Var, ji91Var, 7), new qt81(hi91Var, ji91Var, null, 6)), new p82());
    }
}
