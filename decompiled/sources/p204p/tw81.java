package p204p;

import io.reactivex.rxjava3.core.Single;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class tw81 {

    /* JADX INFO: renamed from: a */
    public final z6m f224374a;

    /* JADX INFO: renamed from: b */
    public final mi80 f224375b;

    /* JADX INFO: renamed from: c */
    public final pne1 f224376c;

    /* JADX INFO: renamed from: d */
    public final i7k f224377d;

    /* JADX INFO: renamed from: e */
    public final wg61 f224378e;

    /* JADX INFO: renamed from: f */
    public final tjo f224379f;

    public tw81(opx opxVar, z6m z6mVar, mi80 mi80Var, pne1 pne1Var, i7k i7kVar) {
        xgo xgoVar = new xgo(opxVar, 1);
        this.f224374a = z6mVar;
        this.f224375b = mi80Var;
        this.f224376c = pne1Var;
        this.f224377d = i7kVar;
        this.f224378e = new wg61(xgoVar);
        this.f224379f = pag1.m69487w(new rko(new jqx(qpv0.f191387a.mo54112b(n4m.class)), 1, qp81.f191196V0, new pko(i401.f98373V0), qp81.f191197W0), qp81.f191199X0);
    }

    /* JADX INFO: renamed from: a */
    public final x93 m81661a(n4m n4mVar) {
        sjf1 sjf1Var = n4mVar.f150384b;
        if (!(sjf1Var instanceof k4m)) {
            return null;
        }
        String str = ((k4m) sjf1Var).f119248e;
        this.f224375b.getClass();
        if (str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str.equals("spotify:collection:tracks") || str.equals("spotify:internal:collection:tracks") || (bm51.m29803n0(str, "spotify:user:", false) && bm51.m29796g0(str, ":collection", false))) {
            return x93.f259264a;
        }
        this.f224376c.getClass();
        if (pne1.m70445a(str)) {
            return x93.f259265b;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Enum m81662b(String str, n4m n4mVar, ibk ibkVar) {
        sw81 sw81Var;
        x93 x93VarM81661a;
        if (ibkVar instanceof sw81) {
            sw81Var = (sw81) ibkVar;
            int i = sw81Var.f214624c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sw81Var.f214624c = i - Integer.MIN_VALUE;
            } else {
                sw81Var = new sw81(this, ibkVar);
            }
        } else {
            sw81Var = new sw81(this, ibkVar);
        }
        Object objM96567o = sw81Var.f214622a;
        int i2 = sw81Var.f214624c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            Set set = dd41.f47702f;
            int iOrdinal = r46.m74726U(str).f47709c.ordinal();
            if (iOrdinal == 656) {
                if (n4mVar != null) {
                    return m81661a(n4mVar);
                }
                return null;
            }
            if (iOrdinal == 845) {
                return (n4mVar == null || (x93VarM81661a = m81661a(n4mVar)) == null) ? x93.f259265b : x93VarM81661a;
            }
            if (iOrdinal != 861) {
                if (iOrdinal != 925) {
                    return null;
                }
                return x93.f259264a;
            }
            Single singleM49871c = this.f224377d.m49871c(str);
            sw81Var.f214624c = 1;
            objM96567o = zn91.m96567o(singleM49871c, sw81Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        if (((Boolean) objM96567o).booleanValue()) {
            return x93.f259266c;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m81663c(String str, ibk ibkVar) {
        pw81 pw81Var;
        if (ibkVar instanceof pw81) {
            pw81Var = (pw81) ibkVar;
            int i = pw81Var.f181940c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pw81Var.f181940c = i - Integer.MIN_VALUE;
            } else {
                pw81Var = new pw81(this, ibkVar);
            }
        } else {
            pw81Var = new pw81(this, ibkVar);
        }
        Object objM76980u = pw81Var.f181938a;
        int i2 = pw81Var.f181940c;
        fbk fbkVar = null;
        try {
            if (i2 == 0) {
                bga.m29073P(objM76980u);
                if (this.f224374a.m95510a(str)) {
                    xw61 xw61Var = new xw61(this, str, fbkVar, 16);
                    pw81Var.f181940c = 1;
                    objM76980u = s1h1.m76980u(2000L, xw61Var, pw81Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM76980u == yukVar) {
                        return yukVar;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM76980u);
            return (ha3) objM76980u;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
    }
}
