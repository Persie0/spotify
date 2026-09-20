package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes11.dex */
public final class jv2 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f116227a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f116228b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f116229c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jv2(gh00 gh00Var, kqi0 kqi0Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f116227a = i;
        this.f116229c = gh00Var;
        this.f116228b = kqi0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f116227a) {
            case 0:
                return new jv2(this.f116228b, this.f116229c, fbkVar, 0);
            case 1:
                return new jv2(this.f116228b, this.f116229c, fbkVar, 1);
            case 2:
                return new jv2(this.f116229c, this.f116228b, fbkVar, 2);
            case 3:
                return new jv2(this.f116229c, this.f116228b, fbkVar, 3);
            default:
                return new jv2(this.f116229c, this.f116228b, fbkVar, 4);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f116227a) {
            case 0:
                jv2 jv2Var = (jv2) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                jv2Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            case 1:
                jv2 jv2Var2 = (jv2) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                jv2Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
            case 2:
                jv2 jv2Var3 = (jv2) create(xukVar, fbkVar);
                w2a1 w2a1Var3 = w2a1.f247311a;
                jv2Var3.invokeSuspend(w2a1Var3);
                return w2a1Var3;
            case 3:
                jv2 jv2Var4 = (jv2) create(xukVar, fbkVar);
                w2a1 w2a1Var4 = w2a1.f247311a;
                jv2Var4.invokeSuspend(w2a1Var4);
                return w2a1Var4;
            default:
                jv2 jv2Var5 = (jv2) create(xukVar, fbkVar);
                w2a1 w2a1Var5 = w2a1.f247311a;
                jv2Var5.invokeSuspend(w2a1Var5);
                return w2a1Var5;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f116227a) {
            case 0:
                bga.m29073P(obj);
                sms0 sms0Var = (sms0) this.f116228b.getValue();
                boolean z = sms0Var instanceof qms0;
                gh00 gh00Var = this.f116229c;
                if (z) {
                    qms0 qms0Var = (qms0) sms0Var;
                    gh00Var.invoke(new gv2(qms0Var.f190396a, qms0Var.f190397b, qms0Var.f190398c));
                } else if (sms0Var instanceof rms0) {
                    gh00Var.invoke(new gv2(((rms0) sms0Var).f200613a, null, null));
                }
                break;
            case 1:
                bga.m29073P(obj);
                Uri uri = ((lcl) this.f116228b.getValue()).f131947a;
                if (uri != null) {
                    this.f116229c.invoke(new tki(uri));
                }
                break;
            case 2:
                bga.m29073P(obj);
                this.f116229c.invoke(Boolean.valueOf(((String) this.f116228b.getValue()) != null));
                break;
            case 3:
                bga.m29073P(obj);
                this.f116229c.invoke(new e141((Float) this.f116228b.getValue()));
                break;
            default:
                bga.m29073P(obj);
                kqi0 kqi0Var = this.f116228b;
                if (!g450.m43520b(((g450) kqi0Var.getValue()).f76347a, 0L)) {
                    this.f116229c.invoke(new C2145mz((int) (((g450) kqi0Var.getValue()).f76347a >> 32)));
                }
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jv2(kqi0 kqi0Var, gh00 gh00Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f116227a = i;
        this.f116228b = kqi0Var;
        this.f116229c = gh00Var;
    }
}
