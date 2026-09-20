package p204p;

import android.content.res.Resources;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public final class m61 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ x61 f140331a;

    public m61(x61 x61Var) {
        this.f140331a = x61Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        l61 l61Var;
        Object c6x0Var;
        pqm0 pqm0Var;
        if (ibkVar instanceof l61) {
            l61Var = (l61) ibkVar;
            int i = l61Var.f130137b;
            if ((i & Integer.MIN_VALUE) != 0) {
                l61Var.f130137b = i - Integer.MIN_VALUE;
            } else {
                l61Var = new l61(this, ibkVar);
            }
        } else {
            l61Var = new l61(this, ibkVar);
        }
        Object obj2 = l61Var.f130136a;
        int i2 = l61Var.f130137b;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
            return w2a1Var;
        }
        bga.m29073P(obj2);
        l51 l51Var = (l51) obj;
        a61 a61Var = this.f140331a.f258554a;
        String str = l51Var.f129788b;
        ss8 ss8Var = l51Var.f129789c;
        ss8 ss8Var2 = l51Var.f129790d;
        nh61 nh61Var = a61Var.f12666f;
        Resources resources = (Resources) nh61Var.f153884b;
        ss8 ss8Var3 = ss8.f213525b;
        fiz nzx0Var = gau.f78095a;
        if (ss8Var != ss8Var3) {
            try {
                c6x0Var = new gf41(str);
            } catch (Throwable th) {
                c6x0Var = new c6x0(th);
            }
            if (c6x0Var instanceof c6x0) {
                c6x0Var = null;
            }
            gf41 gf41Var = (gf41) c6x0Var;
            if (gf41Var != null) {
                df41 df41Var = gf41Var.f79270c;
                df41 df41Var2 = df41.ARTIST;
                upg0 upg0Var = upg0.ADD_TO_APPROVED;
                ss8 ss8Var4 = ss8.f213527d;
                if (df41Var == df41Var2 && ss8Var == ss8Var4) {
                    pqm0Var = new pqm0(resources.getString(R.string.add_blocked_content_snackbar_success_artist_approved), upg0Var);
                } else {
                    upg0 upg0Var2 = upg0.ADD_TO_BLOCKED;
                    ss8 ss8Var5 = ss8.f213526c;
                    if (df41Var == df41Var2 && ss8Var == ss8Var5) {
                        pqm0Var = new pqm0(resources.getString(R.string.add_blocked_content_snackbar_success_artist_blocked), upg0Var2);
                    } else {
                        df41 df41Var3 = df41.TRACK;
                        if (df41Var == df41Var3 && ss8Var == ss8Var4) {
                            pqm0Var = new pqm0(resources.getString(R.string.add_blocked_content_snackbar_success_track_approved), upg0Var);
                        } else if (df41Var == df41Var3 && ss8Var == ss8Var5) {
                            pqm0Var = new pqm0(resources.getString(R.string.add_blocked_content_snackbar_success_track_blocked), upg0Var2);
                        }
                    }
                }
                nzx0Var = new nzx0(new nd0(nh61Var, str, (upg0) pqm0Var.f180351b, (String) pqm0Var.f180350a, (fbk) null));
            }
        }
        h61 h61Var = new h61(bqz0Var, 2);
        l61Var.f130137b = 1;
        Object objCollect = nzx0Var.collect(new w51(h61Var, str, ss8Var2, 0), l61Var);
        yuk yukVar = yuk.f276404a;
        if (objCollect != yukVar) {
            objCollect = w2a1Var;
        }
        return objCollect == yukVar ? yukVar : w2a1Var;
    }
}
