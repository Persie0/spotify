package p204p;

import com.google.protobuf.Duration;
import com.spotify.musicquizservice.p113v1.GetResultsRequest;
import com.spotify.musicquizservice.p113v1.GetResultsResponse;
import com.spotify.musicquizservice.p113v1.LottieAnimation;
import com.spotify.musicquizservice.p113v1.Result;
import com.spotify.musicquizservice.p113v1.ResultAnimations;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class e8x0 {

    /* JADX INFO: renamed from: a */
    public final p8x0 f57302a;

    public e8x0(p8x0 p8x0Var) {
        this.f57302a = p8x0Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005f A[PHI: r7
      0x005f: PHI (r7v3 int) = (r7v2 int), (r7v5 int) binds: [B:12:0x0054, B:17:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: b */
    public static i8x0 m38129b(GetResultsResponse getResultsResponse) {
        String strM15838t = getResultsResponse.m15838t();
        String strM15839u = getResultsResponse.m15839u();
        kva1 kva1VarM38130c = m38130c(getResultsResponse.m15840v());
        int iM15835q = getResultsResponse.m15835q();
        int i = iM15835q == 0 ? -1 : c8x0.f35330b[edb.m38547C(iM15835q)];
        int i2 = 1;
        vlg1 wufVar = xuf.f266101c;
        if (i != 1) {
            int i3 = 2;
            if (i == 2) {
                kva1 kva1VarM38130c2 = m38130c(getResultsResponse.m15834p().m15797o());
                String strM15798p = getResultsResponse.m15834p().m15798p();
                int i4 = c8x0.f35329a[getResultsResponse.m15834p().m15799q().ordinal()];
                if (i4 == 1) {
                    i2 = i3;
                } else if (i4 == 2) {
                    i2 = 3;
                } else if (i4 != 3) {
                    i3 = 4;
                    if (i4 == 4) {
                        i2 = i3;
                    }
                }
                wufVar = new wuf(new ojc(kva1VarM38130c2, strM15798p, i2, new qjc(getResultsResponse.m15834p().m15800r().m15802o())));
            }
        }
        vlg1 vlg1Var = wufVar;
        String strM15833o = getResultsResponse.m15833o();
        boolean zM15836r = getResultsResponse.m15836r();
        ResultAnimations resultAnimationsM15832n = getResultsResponse.m15832n();
        LottieAnimation lottieAnimationM15922p = resultAnimationsM15832n.m15922p();
        i8b0 i8b0Var = new i8b0(lottieAnimationM15922p.m15864p(), lottieAnimationM15922p.m15863o());
        LottieAnimation lottieAnimationM15921n = resultAnimationsM15832n.m15921n();
        return new i8x0(strM15838t, strM15839u, kva1VarM38130c, vlg1Var, strM15833o, zM15836r, new e7x0(i8b0Var, new i8b0(lottieAnimationM15921n.m15864p(), lottieAnimationM15921n.m15863o())), getResultsResponse.m15837s());
    }

    /* JADX INFO: renamed from: c */
    public static kva1 m38130c(Result result) {
        Integer numValueOf;
        int iM15928o = result.m15918p().m15928o();
        if (result.m15919q()) {
            Duration durationM15917n = result.m15917n();
            numValueOf = Integer.valueOf((int) ((TimeUnit.NANOSECONDS.toMillis(durationM15917n.m1931q()) + TimeUnit.SECONDS.toMillis(durationM15917n.m1932r())) / ((long) 1000)));
        } else {
            numValueOf = null;
        }
        return new kva1(iM15928o, numValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public final Object m38131a(String str, ibk ibkVar) {
        d8x0 d8x0Var;
        if (ibkVar instanceof d8x0) {
            d8x0Var = (d8x0) ibkVar;
            int i = d8x0Var.f46549c;
            if ((i & Integer.MIN_VALUE) != 0) {
                d8x0Var.f46549c = i - Integer.MIN_VALUE;
            } else {
                d8x0Var = new d8x0(this, ibkVar);
            }
        } else {
            d8x0Var = new d8x0(this, ibkVar);
        }
        Object objM69342a = d8x0Var.f46547a;
        int i2 = d8x0Var.f46549c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM69342a);
                db10 db10VarM15831o = GetResultsRequest.m15831o();
                db10VarM15831o.m35517m(str);
                GetResultsRequest getResultsRequest = (GetResultsRequest) db10VarM15831o.build();
                p8x0 p8x0Var = this.f57302a;
                wj50.m88279p(getResultsRequest);
                d8x0Var.f46549c = 1;
                objM69342a = p8x0Var.m69342a(getResultsRequest, d8x0Var);
                yuk yukVar = yuk.f276404a;
                if (objM69342a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM69342a);
            }
            o2x0 o2x0Var = (o2x0) objM69342a;
            if (o2x0Var.f161171a.f149852O0) {
                Object obj = o2x0Var.f161172b;
                if (obj != null) {
                    return m38129b((GetResultsResponse) obj);
                }
                throw new IllegalArgumentException("Response body is null");
            }
            return new c6x0(new Exception("Failed to get results: HTTP " + o2x0Var.f161171a.f149860d));
        } catch (Exception e) {
            return new c6x0(e);
        }
    }
}
