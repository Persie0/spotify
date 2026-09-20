package p204p;

import com.google.protobuf.Duration;
import com.spotify.userhighlight.p177v1.CreateUserHighlightRequest;
import com.spotify.userhighlight.p177v1.CreateUserHighlightResponse;
import com.spotify.userhighlight.p177v1.EntityReference;
import com.spotify.userhighlight.p177v1.UserHighlightChange;

/* JADX INFO: loaded from: classes6.dex */
public final class qqa1 {

    /* JADX INFO: renamed from: a */
    public final tqa1 f191516a;

    public qqa1(tqa1 tqa1Var) {
        this.f191516a = tqa1Var;
    }

    /* JADX INFO: renamed from: b */
    public static CreateUserHighlightRequest m73512b(wcl wclVar) {
        oqa1 oqa1VarM22125s = UserHighlightChange.m22125s();
        uov uovVarM22116o = EntityReference.m22116o();
        uovVarM22116o.m83634m(wclVar.f250067a);
        oqa1VarM22125s.m67611q((EntityReference) uovVarM22116o.build());
        long j = wclVar.f250068b;
        long j2 = 1000;
        long j3 = 1000000;
        bks bksVarM1929s = Duration.m1929s();
        bksVarM1929s.m29723q(j / j2);
        bksVarM1929s.m29722m((int) ((j % j2) * j3));
        oqa1VarM22125s.m67612r((Duration) bksVarM1929s.build());
        long j4 = wclVar.f250069c;
        long j5 = j4 / j2;
        int i = (int) ((j4 % j2) * j3);
        bks bksVarM1929s2 = Duration.m1929s();
        bksVarM1929s2.m29723q(j5);
        bksVarM1929s2.m29722m(i);
        oqa1VarM22125s.m67610m((Duration) bksVarM1929s2.build());
        vcl vclVarM22114o = CreateUserHighlightRequest.m22114o();
        vclVarM22114o.m85193m((UserHighlightChange) oqa1VarM22125s.build());
        return (CreateUserHighlightRequest) vclVarM22114o.build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m73513a(wcl wclVar, ibk ibkVar) {
        pqa1 pqa1Var;
        if (ibkVar instanceof pqa1) {
            pqa1Var = (pqa1) ibkVar;
            int i = pqa1Var.f180248c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pqa1Var.f180248c = i - Integer.MIN_VALUE;
            } else {
                pqa1Var = new pqa1(this, ibkVar);
            }
        } else {
            pqa1Var = new pqa1(this, ibkVar);
        }
        Object objM81310a = pqa1Var.f180246a;
        int i2 = pqa1Var.f180248c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM81310a);
                CreateUserHighlightRequest createUserHighlightRequestM73512b = m73512b(wclVar);
                tqa1 tqa1Var = this.f191516a;
                pqa1Var.f180248c = 1;
                objM81310a = tqa1Var.m81310a(createUserHighlightRequestM73512b, pqa1Var);
                yuk yukVar = yuk.f276404a;
                if (objM81310a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM81310a);
            }
            return new xcl(((CreateUserHighlightResponse) objM81310a).getUri());
        } catch (Throwable th) {
            return new c6x0(th);
        }
    }
}
