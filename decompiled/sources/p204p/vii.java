package p204p;

import com.spotify.playlist.policy.proto.AvailableConcepts;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Observable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class vii implements sii {

    /* JADX INFO: renamed from: e */
    public static final PlaylistRequestDecorationPolicy f241721e;

    /* JADX INFO: renamed from: a */
    public final rkz0 f241722a;

    /* JADX INFO: renamed from: b */
    public final js31 f241723b;

    /* JADX INFO: renamed from: c */
    public final zv41 f241724c;

    /* JADX INFO: renamed from: d */
    public final luu0 f241725d;

    static {
        top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
        bjp0 bjp0VarM18365h0 = PlaylistDecorationPolicy.m18365h0();
        p78 p78VarM18294q = AvailableConcepts.m18294q();
        p78VarM18294q.m69251q();
        p78VarM18294q.m69250m(0.7f);
        bjp0VarM18365h0.m29529s((AvailableConcepts) p78VarM18294q.build());
        top0VarM18421v.m81215w((PlaylistDecorationPolicy) bjp0VarM18365h0.build());
        f241721e = (PlaylistRequestDecorationPolicy) top0VarM18421v.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vii(wt80 wt80Var, i4t0 i4t0Var, jq4 jq4Var, xuk xukVar, rkz0 rkz0Var, js31 js31Var) {
        this.f241722a = rkz0Var;
        this.f241723b = js31Var;
        zv41 zv41VarM52819d = jag1.m52819d(new y5b(203, Integer.valueOf(jq4Var.m54032a())));
        this.f241724c = zv41VarM52819d;
        ((ewk0) i4t0Var.get()).getClass();
        mu80 mu80Var = (mu80) wt80Var;
        this.f241725d = bzf1.m31027s(new vjz(new r1a(mvl0.m62953p(new zux(new vjz(zv41VarM52819d, new rrd((Object) this, (fbk) (0 == true ? 1 : 0), 7)), bzf1.m31027s(mvl0.m62953p(new yxb(mu80Var.m62846k(ewk0.m40145a(), new st80(f241721e, null, null, false, null, null, null, 0, null, 510)), 24)), xukVar, hf11.m47320a(2, 5000L), 1), new C2278q2(3, 24, (fbk) (0 == true ? 1 : 0)), 1)), new wbe(this, 0 == true ? 1 : 0, 28), 8), new ju0((Object) this, (fbk) (0 == true ? 1 : 0), 8), 2), xukVar, hf11.m47320a(2, 5000L), 1);
    }

    /* JADX INFO: renamed from: a */
    public final Observable m85667a() {
        return k0e1.m54988g(this.f241725d, dau.f47107a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (r4.m75808c(r7, r0) == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (r4.m75806a(r0) == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        return r5;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m85668b(String str, ibk ibkVar) {
        tii tiiVar;
        List list;
        if (ibkVar instanceof tii) {
            tiiVar = (tii) ibkVar;
            int i = tiiVar.f220690d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tiiVar.f220690d = i - Integer.MIN_VALUE;
            } else {
                tiiVar = new tii(this, ibkVar);
            }
        } else {
            tiiVar = new tii(this, ibkVar);
        }
        Object obj = tiiVar.f220688b;
        int i2 = tiiVar.f220690d;
        if (i2 == 0) {
            bga.m29073P(obj);
            List listSingletonList = str.length() == 0 ? lau.f131415a : Collections.singletonList(str);
            int length = str.length();
            rkz0 rkz0Var = this.f241722a;
            yuk yukVar = yuk.f276404a;
            if (length > 0) {
                tiiVar.f220687a = listSingletonList;
                tiiVar.f220690d = 1;
            } else {
                tiiVar.f220687a = listSingletonList;
                tiiVar.f220690d = 2;
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = tiiVar.f220687a;
            bga.m29073P(obj);
        }
        zv41 zv41Var = this.f241724c;
        y5b y5bVarM92845c = y5b.m92845c((y5b) zv41Var.getValue(), null, list, 0, 251);
        zv41Var.getClass();
        zv41Var.m97091m(null, y5bVarM92845c);
        return w2a1.f247311a;
    }
}
