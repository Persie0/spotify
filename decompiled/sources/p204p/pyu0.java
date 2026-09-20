package p204p;

import com.google.android.recaptcha.RecaptchaException;

/* JADX INFO: loaded from: classes2.dex */
public final class pyu0 extends mb61 implements gh00 {

    /* JADX INFO: renamed from: a */
    public long f183524a;

    /* JADX INFO: renamed from: b */
    public int f183525b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tyu0 f183526c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ oe41 f183527d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pyu0(tyu0 tyu0Var, oe41 oe41Var, fbk fbkVar) {
        super(1, fbkVar);
        this.f183526c = tyu0Var;
        this.f183527d = oe41Var;
    }

    @Override // p204p.ly8
    public final fbk create(fbk fbkVar) {
        return new pyu0(this.f183526c, this.f183527d, fbkVar);
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        return ((pyu0) create((fbk) obj)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        long j;
        Object objM66790a;
        String message;
        yuk yukVar = yuk.f276404a;
        int i = this.f183525b;
        if (i == 0) {
            bga.m29073P(obj);
            ((wy3) this.f183526c.f225044b).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                oe41 oe41Var = this.f183527d;
                this.f183524a = jCurrentTimeMillis;
                this.f183525b = 1;
                objM66790a = oe41Var.m66790a(this);
                if (objM66790a == yukVar) {
                    return yukVar;
                }
                j = jCurrentTimeMillis;
            } catch (RecaptchaException e) {
                e = e;
                j = jCurrentTimeMillis;
                objM66790a = new c6x0(e);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.f183524a;
            try {
                bga.m29073P(obj);
                objM66790a = ((s6x0) obj).f206218a;
            } catch (RecaptchaException e2) {
                e = e2;
                objM66790a = new c6x0(e);
            }
        }
        long jM42463g = fr0.m42463g((wy3) this.f183526c.f225044b, j);
        if (objM66790a instanceof c6x0) {
            Throwable thM77348a = s6x0.m77348a(objM66790a);
            if (thM77348a == null || (message = thM77348a.getMessage()) == null) {
                message = "Unknown error";
            }
            azu0 azu0Var = this.f183526c.f225053k;
            if (azu0Var == null) {
                wj50.m88260d0("recaptchaTracker");
                throw null;
            }
            azu0Var.m27691y(jM42463g, this.f183526c.f225056n, message);
        } else {
            azu0 azu0Var2 = this.f183526c.f225053k;
            if (azu0Var2 == null) {
                wj50.m88260d0("recaptchaTracker");
                throw null;
            }
            azu0Var2.m27689w(jM42463g, this.f183526c.f225056n);
        }
        return new s6x0(objM66790a);
    }
}
