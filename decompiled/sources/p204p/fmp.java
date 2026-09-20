package p204p;

import android.app.Activity;
import com.spotify.connect.esperanto.proto.ConnectMessages$SetPreferredIncarnationRequest;
import io.reactivex.rxjava3.core.Single;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class fmp {

    /* JADX INFO: renamed from: a */
    public final pri f71091a;

    /* JADX INFO: renamed from: b */
    public final Activity f71092b;

    /* JADX INFO: renamed from: c */
    public final k5m0 f71093c;

    /* JADX INFO: renamed from: d */
    public final d8q f71094d;

    /* JADX INFO: renamed from: e */
    public final uw00 f71095e;

    /* JADX INFO: renamed from: f */
    public final luk f71096f;

    /* JADX INFO: renamed from: g */
    public final c9k f71097g;

    public fmp(pri priVar, Activity activity, k5m0 k5m0Var, d8q d8qVar, uw00 uw00Var, luk lukVar) {
        this.f71091a = priVar;
        this.f71092b = activity;
        this.f71093c = k5m0Var;
        this.f71094d = d8qVar;
        this.f71095e = uw00Var;
        this.f71096f = lukVar;
        this.f71097g = kk40.m56661c(mlg1.m62205A(njg1.m64613f(), lukVar).mo26608y(new g12(1)));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0099 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    public final Object m42165a(String str, d850 d850Var, ibk ibkVar) throws Throwable {
        dmp dmpVar;
        String str2;
        d850 d850Var2;
        if (ibkVar instanceof dmp) {
            dmpVar = (dmp) ibkVar;
            int i = dmpVar.f50592e;
            if ((i & Integer.MIN_VALUE) != 0) {
                dmpVar.f50592e = i - Integer.MIN_VALUE;
            } else {
                dmpVar = new dmp(this, ibkVar);
            }
        } else {
            dmpVar = new dmp(this, ibkVar);
        }
        dmp dmpVar2 = dmpVar;
        Object objM96567o = dmpVar2.f50590c;
        int i2 = dmpVar2.f50592e;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            Single singleM84079a = this.f71095e.m84079a();
            dmpVar2.f50588a = str;
            dmpVar2.f50589b = d850Var;
            dmpVar2.f50592e = 1;
            objM96567o = zn91.m96567o(singleM84079a, dmpVar2);
            if (objM96567o != yukVar) {
                str2 = str;
                d850Var2 = d850Var;
            }
            return yukVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                bga.m29073P(objM96567o);
                return w2a1Var;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
            return w2a1Var;
        }
        d850 d850Var3 = dmpVar2.f50589b;
        String str3 = dmpVar2.f50588a;
        bga.m29073P(objM96567o);
        d850Var2 = d850Var3;
        str2 = str3;
        boolean zBooleanValue = ((Boolean) objM96567o).booleanValue();
        luk lukVar = this.f71096f;
        fbk fbkVar = null;
        if (zBooleanValue) {
            shh shhVar = new shh(this, d850Var2, str2, fbkVar, 15);
            dmpVar2.f50588a = null;
            dmpVar2.f50589b = null;
            dmpVar2.f50592e = 2;
            if (x0h1.m89557A(lukVar, shhVar, dmpVar2) == yukVar) {
                return yukVar;
            }
            return w2a1Var;
        }
        dmpVar2.f50588a = null;
        dmpVar2.f50589b = null;
        dmpVar2.f50592e = 3;
        Object objM89557A = x0h1.m89557A(lukVar, new lw2(this, str2, fbkVar, 12), dmpVar2);
        if (objM89557A != yukVar) {
            objM89557A = w2a1Var;
        }
        if (objM89557A == yukVar) {
            return yukVar;
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m42166b(String str, cn40 cn40Var, ibk ibkVar) {
        emp empVar;
        cze1 cze1Var;
        dti dtiVar;
        if (ibkVar instanceof emp) {
            empVar = (emp) ibkVar;
            int i = empVar.f60960e;
            if ((i & Integer.MIN_VALUE) != 0) {
                empVar.f60960e = i - Integer.MIN_VALUE;
            } else {
                empVar = new emp(this, ibkVar);
            }
        } else {
            empVar = new emp(this, ibkVar);
        }
        Object obj = empVar.f60958c;
        int i2 = empVar.f60960e;
        w2a1 w2a1Var = w2a1.f247311a;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            int iOrdinal = cn40Var.ordinal();
            if (iOrdinal == 0) {
                cze1Var = null;
            } else if (iOrdinal == 1) {
                cze1Var = cze1.f43545a;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                cze1Var = cze1.f43546b;
            }
            yse yseVar = new yse(this, fbkVar, 20);
            empVar.f60956a = str;
            empVar.f60957b = cze1Var;
            empVar.f60960e = 1;
            if (x0h1.m89557A(this.f71096f, yseVar, empVar) != yukVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return w2a1Var;
        }
        cze1 cze1Var2 = empVar.f60957b;
        String str2 = empVar.f60956a;
        bga.m29073P(obj);
        cze1Var = cze1Var2;
        str = str2;
        empVar.f60956a = null;
        empVar.f60957b = null;
        empVar.f60960e = 2;
        tri triVar = (tri) this.f71091a;
        triVar.getClass();
        mti mtiVarM7371p = ConnectMessages$SetPreferredIncarnationRequest.m7371p();
        mtiVarM7371p.m62825m(str);
        if (cze1Var != null) {
            int iOrdinal2 = cze1Var.ordinal();
            if (iOrdinal2 == 0) {
                dtiVar = dti.CONNECT;
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                dtiVar = dti.CAST;
            }
            mtiVarM7371p.m62826q(dtiVar);
        }
        Object objM81352c = triVar.m81352c("SetPreferredIncarnation endpoint", empVar, new gs3(triVar, mtiVarM7371p, fbkVar, 17));
        if (objM81352c != yukVar) {
            objM81352c = w2a1Var;
        }
        return objM81352c == yukVar ? yukVar : w2a1Var;
    }
}
