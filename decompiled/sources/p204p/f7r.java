package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes.dex */
public final class f7r extends lg01 {

    /* JADX INFO: renamed from: a */
    public final t4j f66765a;

    /* JADX INFO: renamed from: b */
    public final q831 f66766b;

    /* JADX INFO: renamed from: c */
    public final i4t0 f66767c;

    /* JADX INFO: renamed from: d */
    public final j8r f66768d;

    /* JADX INFO: renamed from: e */
    public final vjz f66769e = oyf1.m68486s(nxf1.m65828g(new qhk(this, null, 28)), new ic0(15));

    public f7r(t4j t4jVar, q831 q831Var, slq slqVar, j8r j8rVar) {
        this.f66765a = t4jVar;
        this.f66766b = q831Var;
        this.f66767c = slqVar;
        this.f66768d = j8rVar;
    }

    @Override // p204p.lg01
    public final fiz getValue() {
        return this.f66769e;
    }

    @Override // p204p.lg01
    public final /* bridge */ /* synthetic */ Object setValue(Object obj, Object obj2, d850 d850Var, fbk fbkVar) {
        return setValue((Boolean) obj, ((Boolean) obj2).booleanValue(), d850Var, fbkVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object setValue(Boolean bool, boolean z, d850 d850Var, fbk fbkVar) {
        e7r e7rVar;
        Object objM87200b;
        if (fbkVar instanceof e7r) {
            e7rVar = (e7r) fbkVar;
            int i = e7rVar.f56992d;
            if ((i & Integer.MIN_VALUE) != 0) {
                e7rVar.f56992d = i - Integer.MIN_VALUE;
            } else {
                e7rVar = new e7r(this, (ibk) fbkVar);
            }
        } else {
            e7rVar = new e7r(this, (ibk) fbkVar);
        }
        Object obj = e7rVar.f56990b;
        int i2 = e7rVar.f56992d;
        if (i2 == 0) {
            bga.m29073P(obj);
            String strM64013f = nap.m64013f(3);
            e7rVar.f56989a = z;
            e7rVar.f56992d = 1;
            objM87200b = ((w4j) this.f66765a).m87200b("settings", strM64013f, e7rVar, z);
            yuk yukVar = yuk.f276404a;
            if (objM87200b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = e7rVar.f56989a;
            bga.m29073P(obj);
            objM87200b = ((s6x0) obj).f206218a;
        }
        if (s6x0.m77348a(objM87200b) != null) {
            return new dd01(0, null);
        }
        if (!z) {
            g631 g631VarM52392q = t0j.m79824e(R.string.settings_device_location_consent_revoked_snackbar).m52392q();
            q831 q831Var = this.f66766b;
            if (q831Var.m72301f()) {
                q831Var.m72305j(g631VarM52392q);
            } else {
                q831Var.m72307m(g631VarM52392q);
            }
        }
        return new ed01(qyg1.m74178H(z));
    }
}
