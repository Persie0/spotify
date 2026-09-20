package p204p;

import android.app.Activity;
import android.os.Build;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class wrl implements rrl {

    /* JADX INFO: renamed from: e */
    public static final cbm0 f254380e;

    /* JADX INFO: renamed from: a */
    public final Activity f254381a;

    /* JADX INFO: renamed from: b */
    public final qya0 f254382b;

    /* JADX INFO: renamed from: c */
    public final ju91 f254383c;

    /* JADX INFO: renamed from: d */
    public final nrl f254384d;

    static {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        f254380e = xgg1.m90606F1();
    }

    public wrl(Activity activity, qya0 qya0Var, ju91 ju91Var) {
        this.f254381a = activity;
        this.f254382b = qya0Var;
        this.f254383c = ju91Var;
        this.f254384d = mc40.m61443f(activity);
    }

    /* JADX INFO: renamed from: c */
    public static String m88862c() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, "ro.build.version.oneui");
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public final pph m88863a(String str, bsl bslVar) {
        ro80 ro80VarM44508o = geg1.m44508o();
        if (bslVar == bsl.f30348a) {
            ro80VarM44508o.add(new aa10());
        }
        if (str != null && this.f254382b.f193860a.m49757s() && stg1.m79278s()) {
            ro80VarM44508o.add(new aa10(str));
        }
        return new pph(geg1.m44506m(ro80VarM44508o), bslVar != bsl.f30349b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m88864b(String str, ibk ibkVar) {
        srl srlVar;
        if (ibkVar instanceof srl) {
            srlVar = (srl) ibkVar;
            int i = srlVar.f213336c;
            if ((i & Integer.MIN_VALUE) != 0) {
                srlVar.f213336c = i - Integer.MIN_VALUE;
            } else {
                srlVar = new srl(this, ibkVar);
            }
        } else {
            srlVar = new srl(this, ibkVar);
        }
        Object objM65482a = srlVar.f213334a;
        int i2 = srlVar.f213336c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM65482a);
                ybl yblVar = new ybl(str);
                nrl nrlVar = this.f254384d;
                Activity activity = this.f254381a;
                srlVar.f213336c = 1;
                objM65482a = nrlVar.m65482a(activity, yblVar, srlVar);
                yuk yukVar = yuk.f276404a;
                if (objM65482a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM65482a);
            }
            return new gal(((zbl) ((x5l) objM65482a)).m95846a());
        } catch (CreateCredentialCancellationException unused) {
            return eal.f57695a;
        } catch (CreateCredentialException e) {
            return new fal(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m88865d(String str, bsl bslVar, ibk ibkVar) {
        trl trlVar;
        if (ibkVar instanceof trl) {
            trlVar = (trl) ibkVar;
            int i = trlVar.f223085c;
            if ((i & Integer.MIN_VALUE) != 0) {
                trlVar.f223085c = i - Integer.MIN_VALUE;
            } else {
                trlVar = new trl(this, ibkVar);
            }
        } else {
            trlVar = new trl(this, ibkVar);
        }
        Object objM65481b = trlVar.f223083a;
        int i2 = trlVar.f223085c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM65481b);
                if (this.f254382b.f193860a.m49743e() || grg1.m45503r()) {
                    return muw0.f147445a;
                }
                this.f254383c.m54333a(f254380e, null, (6 & 4) != 0 ? null : null);
                pph pphVarM88863a = m88863a(str, bslVar);
                nrl nrlVar = this.f254384d;
                Activity activity = this.f254381a;
                trlVar.f223085c = 1;
                nrlVar.getClass();
                objM65481b = nrl.m65481b(activity, pphVarM88863a, trlVar);
                yuk yukVar = yuk.f276404a;
                if (objM65481b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM65481b);
            }
            AbstractC1895gf abstractC1895gfM92979a = ((y710) objM65481b).m92979a();
            if (!(abstractC1895gfM92979a instanceof y8n0)) {
                return abstractC1895gfM92979a instanceof m5t0 ? new luw0(((m5t0) abstractC1895gfM92979a).m60888t()) : nuw0.f158721a;
            }
            y8n0 y8n0Var = (y8n0) abstractC1895gfM92979a;
            return new ouw0(y8n0Var.m93121t(), y8n0Var.m93122u());
        } catch (GetCredentialException e) {
            return new kuw0(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m88866e(ibk ibkVar) {
        url urlVar;
        if (ibkVar instanceof url) {
            urlVar = (url) ibkVar;
            int i = urlVar.f233399c;
            if ((i & Integer.MIN_VALUE) != 0) {
                urlVar.f233399c = i - Integer.MIN_VALUE;
            } else {
                urlVar = new url(this, ibkVar);
            }
        } else {
            urlVar = new url(this, ibkVar);
        }
        Object objM65481b = urlVar.f233397a;
        int i2 = urlVar.f233399c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM65481b);
                aa10 aa10VarM50028k = new ia7(12).m50028k();
                jw4 jw4Var = new jw4(3);
                jw4Var.m54400a(aa10VarM50028k);
                pph pphVarM54403e = jw4Var.m54403e();
                nrl nrlVar = this.f254384d;
                Activity activity = this.f254381a;
                urlVar.f233399c = 1;
                nrlVar.getClass();
                objM65481b = nrl.m65481b(activity, pphVarM54403e, urlVar);
                yuk yukVar = yuk.f276404a;
                if (objM65481b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM65481b);
            }
            ap10 ap10Var = ap10.f17802a;
            AbstractC1895gf abstractC1895gfM92979a = ((y710) objM65481b).m92979a();
            if (!(abstractC1895gfM92979a instanceof x9m) || !wj50.m88271j(abstractC1895gfM92979a.m44557m(), "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL")) {
                return ap10Var;
            }
            try {
                return new yo10(AbstractC2254pf.m69759b(abstractC1895gfM92979a.m44551g()));
            } catch (GoogleIdTokenParsingException e) {
                return new zo10(e);
            }
        } catch (GetCredentialException e2) {
            return new zo10(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m88867f(String str, String str2, ibk ibkVar) {
        vrl vrlVar;
        if (ibkVar instanceof vrl) {
            vrlVar = (vrl) ibkVar;
            int i = vrlVar.f244224c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vrlVar.f244224c = i - Integer.MIN_VALUE;
            } else {
                vrlVar = new vrl(this, ibkVar);
            }
        } else {
            vrlVar = new vrl(this, ibkVar);
        }
        Object objM65482a = vrlVar.f244222a;
        int i2 = vrlVar.f244224c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM65482a);
                if ((bm51.m29797h0(Build.MANUFACTURER, d6n0.f45731d, true) && m88862c().length() > 0 && Float.parseFloat(m88862c()) / 10000 == 6.0f) || this.f254382b.f193860a.m49743e() || str.length() == 0 || str2.length() == 0) {
                    return u7y0.f227771a;
                }
                ial ialVar = new ial(str, str2);
                nrl nrlVar = this.f254384d;
                Activity activity = this.f254381a;
                vrlVar.f244224c = 1;
                objM65482a = nrlVar.m65482a(activity, ialVar, vrlVar);
                yuk yukVar = yuk.f276404a;
                if (objM65482a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM65482a);
            }
            return v7y0.f238343a;
        } catch (CreateCredentialException e) {
            return new t7y0(e);
        }
    }
}
