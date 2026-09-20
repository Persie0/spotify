package p204p;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzhg;
import io.reactivex.rxjava3.functions.Function;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: classes11.dex */
public final class sqe1 implements Function, r7l0, r9w0, w7f1 {

    /* JADX INFO: renamed from: a */
    public Object f213087a;

    /* JADX INFO: renamed from: b */
    public Object f213088b;

    public sqe1() {
    }

    /* JADX INFO: renamed from: a */
    public i8f1 m78947a() {
        fhv0 fhv0Var;
        a8e0 a8e0Var = (a8e0) this.f213087a;
        if (a8e0Var != null && (fhv0Var = (fhv0) this.f213088b) != null) {
            return new i8f1(a8e0Var, fhv0Var);
        }
        StringBuilder sb = new StringBuilder();
        if (((a8e0) this.f213087a) == null) {
            sb.append(" status");
        }
        if (((fhv0) this.f213088b) == null) {
            sb.append(" recordingInfo");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // p204p.r9w0
    public void accept(Object obj, Object obj2) {
        w4g1 w4g1Var = new w4g1((bqg1) this.f213087a, (ev61) obj2);
        wdf1 wdf1Var = (wdf1) ((yrg1) obj).m37438q();
        j45 j45VarM44803n = gif1.m44803n();
        String[] strArr = (String[]) this.f213088b;
        Parcel parcelM43604d2 = wdf1Var.m43604d2();
        fmf1.m42108c(parcelM43604d2, w4g1Var);
        parcelM43604d2.writeStringArray(strArr);
        fmf1.m42107b(parcelM43604d2, j45VarM44803n);
        wdf1Var.m43607g2(5, parcelM43604d2);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        return new fxx(tuo0.m81591c((tuo0) this.f213087a, (YourLibraryResponse) obj, (roa) this.f213088b), null, null, null);
    }

    @Override // p204p.w7f1
    /* JADX INFO: renamed from: b */
    public void mo29654b(gu30 gu30Var, ev61 ev61Var) {
        gu30Var.mo40021N0((Bundle) this.f213088b, new p6f1((k8f1) this.f213087a, ev61Var, 3));
    }

    /* JADX INFO: renamed from: c */
    public i890 m78948c() {
        return (i890) this.f213087a;
    }

    /* JADX INFO: renamed from: d */
    public void m78949d(fhv0 fhv0Var) {
        if (fhv0Var == null) {
            throw new NullPointerException("Null recordingInfo");
        }
        this.f213088b = fhv0Var;
    }

    /* JADX INFO: renamed from: e */
    public void m78950e(a8e0 a8e0Var) {
        this.f213087a = a8e0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public Object m78951f(fff1 fff1Var, ibk ibkVar) throws zzhg {
        sog1 sog1Var;
        if (ibkVar instanceof sog1) {
            sog1Var = (sog1) ibkVar;
            int i = sog1Var.f211193c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sog1Var.f211193c = i - Integer.MIN_VALUE;
            } else {
                sog1Var = new sog1(this, ibkVar);
            }
        } else {
            sog1Var = new sog1(this, ibkVar);
        }
        Object objM45436a = sog1Var.f211191a;
        int i2 = sog1Var.f211193c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM45436a);
                gqg1 gqg1Var = (gqg1) this.f213088b;
                String str = (String) ((sef0) this.f213087a).f208288e;
                byte[] bArrM55800d = fff1Var.m55800d();
                sog1Var.f211193c = 1;
                objM45436a = gqg1Var.m45436a(str, bArrM55800d, sog1Var);
                yuk yukVar = yuk.f276404a;
                if (objM45436a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM45436a);
            }
            return ((jqg1) objM45436a).m54091b(gff1.m44615y());
        } catch (zzhg e) {
            throw e;
        } catch (Exception e2) {
            throw new zzhg(zz11.f287826e2, zz11.f287781L0, e2.getMessage(), 8);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m78952g(omd0 omd0Var, zkf1 zkf1Var) {
        if (((zmd0) this.f213088b) == null) {
            this.f213088b = zmd0.m96428d((Context) this.f213087a);
        }
        ((zmd0) this.f213088b).m96432a(omd0Var, zkf1Var, 4);
    }

    /* JADX INFO: renamed from: h */
    public void m78953h(qmd0 qmd0Var) {
        if (((zmd0) this.f213088b) == null) {
            this.f213088b = zmd0.m96428d((Context) this.f213087a);
        }
        zmd0 zmd0Var = (zmd0) this.f213088b;
        if (zmd0Var != null) {
            zmd0Var.m96433e(qmd0Var);
        }
    }

    @Override // p204p.r7l0
    public void onComplete(Task task) {
        dsg1 dsg1Var = (dsg1) this.f213087a;
        ev61 ev61Var = (ev61) this.f213088b;
        synchronized (dsg1Var.f52574f) {
            dsg1Var.f52573e.remove(ev61Var);
        }
    }

    public sqe1(Context context) {
        this.f213087a = context;
    }

    public /* synthetic */ sqe1(Object obj, Object obj2) {
        this.f213087a = obj;
        this.f213088b = obj2;
    }

    public sqe1(zim zimVar, u1v0 u1v0Var, C2445u9 c2445u9) {
        this.f213087a = c2445u9;
        this.f213088b = new wg61(new cyc1(zimVar, u1v0Var, this, 8));
    }
}
