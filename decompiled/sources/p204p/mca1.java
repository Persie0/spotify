package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.functions.Consumer;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class mca1 implements Connectable {

    /* JADX INFO: renamed from: a */
    public final rqs0 f142116a;

    /* JADX INFO: renamed from: b */
    public final yts0 f142117b;

    /* JADX INFO: renamed from: c */
    public final oga0 f142118c;

    /* JADX INFO: renamed from: d */
    public final lja1 f142119d;

    /* JADX INFO: renamed from: e */
    public final jts0 f142120e;

    public mca1(rqs0 rqs0Var, yts0 yts0Var, oga0 oga0Var, lja1 lja1Var, jts0 jts0Var) {
        this.f142116a = rqs0Var;
        this.f142117b = yts0Var;
        this.f142118c = oga0Var;
        this.f142119d = lja1Var;
        this.f142120e = jts0Var;
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        kca1 kca1Var = new kca1(this);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(nca1.class), c1037x558fa59a.m15633a(kca1Var));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(oca1.class), new C1037x558fa59a().m15633a(new ica1(this)));
        return new C1044a(dau.f47107a, coroutinesSubtypeEffectHandlerBuilderM42464h).mo3269P(consumer);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0086, code lost:
    
        if (r9 == r6) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m61459a(nca1 nca1Var, ibk ibkVar) {
        lca1 lca1Var;
        String message;
        String str;
        hts0 hts0VarM54306a;
        Object objM76266e;
        if (ibkVar instanceof lca1) {
            lca1Var = (lca1) ibkVar;
            int i = lca1Var.f131890d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lca1Var.f131890d = i - Integer.MIN_VALUE;
            } else {
                lca1Var = new lca1(this, ibkVar);
            }
        } else {
            lca1Var = new lca1(this, ibkVar);
        }
        Object obj = lca1Var.f131888b;
        int i2 = lca1Var.f131890d;
        tca1 tca1Var = tca1.f219057a;
        jts0 jts0Var = this.f142120e;
        try {
            try {
                if (i2 == 0) {
                    bga.m29073P(obj);
                    String str2 = nca1Var.f152483b;
                    String str3 = nca1Var.f152482a;
                    if (str2 != null) {
                        this.f142117b.f276206a.put(str3, str2);
                    }
                    boolean z = nca1Var.f152484c;
                    rqs0 rqs0Var = this.f142116a;
                    yuk yukVar = yuk.f276404a;
                    if (z) {
                        oga0 oga0Var = this.f142118c;
                        lca1Var.f131890d = 1;
                        if (oga0Var.m66876b(true, str3, rqs0Var, lca1Var) != yukVar) {
                            return tca1Var;
                        }
                    } else {
                        hts0VarM54306a = jts0Var.f115963g.m54306a(str3);
                        avs0 avs0Var = avs0.f20255a;
                        lca1Var.f131887a = hts0VarM54306a;
                        lca1Var.f131890d = 2;
                        objM76266e = rqs0Var.m76266e(str3, avs0Var, lca1Var);
                    }
                    return yukVar;
                }
                if (i2 == 1) {
                    bga.m29073P(obj);
                    return tca1Var;
                }
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hts0VarM54306a = lca1Var.f131887a;
                bga.m29073P(obj);
                objM76266e = ((s6x0) obj).f206218a;
                if (s6x0.m77348a(objM76266e) != null) {
                    jts0Var.f115963g.m54307b(hts0VarM54306a);
                    return tca1Var;
                }
                nrv0 nrv0Var = (nrv0) objM76266e;
                if (!(nrv0Var instanceof mrv0)) {
                    if (!(nrv0Var instanceof lrv0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jts0Var.f115963g.m54307b(hts0VarM54306a);
                    return new uca1(((lrv0) nrv0Var).f136363a);
                }
                return tca1Var;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                message = e2.getMessage();
                str = "something went wrong while location refresh ";
                ydj.m93454m(str, message);
                return tca1Var;
            }
        } catch (CancellationException e3) {
            jts0Var.f115963g.m54307b(nca1Var);
            throw e3;
        } catch (Exception e4) {
            jts0Var.f115963g.m54307b(nca1Var);
            message = e4.getMessage();
            str = "something went wrong while refresh ";
            ydj.m93454m(str, message);
            return tca1Var;
        }
    }
}
