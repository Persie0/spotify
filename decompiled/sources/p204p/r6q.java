package p204p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import spotify.transcript_search.p213v1.DebugInfo;
import spotify.transcript_search.p213v1.Match;
import spotify.transcript_search.p213v1.SearchRequest;
import spotify.transcript_search.p213v1.SearchResponse;
import spotify.transcript_search.p213v1.TimeOffsetHighlight;

/* JADX INFO: loaded from: classes6.dex */
public final class r6q {

    /* JADX INFO: renamed from: a */
    public final wg61 f196341a;

    public r6q() {
        this.f196341a = new wg61(iam.f100286W0);
    }

    /* JADX INFO: renamed from: a */
    public vl11 m74868a(String str) {
        vl11 vl11Var = (vl11) this.f196341a.getValue();
        return new vl11(vl11Var.f242346a, vl11Var.f242347b, vl11Var.f242348c, vl11Var.f242349d, vl11Var.f242350e, vl11Var.f242351f, vl11Var.f242352g, vl11Var.f242353h, vl11Var.f242354i, vl11Var.f242355j, vl11Var.f242356k, vl11Var.f242357l, vl11Var.f242358m, str, vl11Var.f242360o, vl11Var.f242361p, vl11Var.f242362q, vl11Var.f242363r);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: b */
    public Object m74869b(ArrayList arrayList, String str, Long l, n391 n391Var, ibk ibkVar) {
        mld1 mld1Var;
        p391 p391Var;
        s1d0 s1d0Var;
        String strM69093g;
        o391 o391Var;
        if (ibkVar instanceof mld1) {
            mld1Var = (mld1) ibkVar;
            int i = mld1Var.f144820c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mld1Var.f144820c = i - Integer.MIN_VALUE;
            } else {
                mld1Var = new mld1(this, ibkVar);
            }
        } else {
            mld1Var = new mld1(this, ibkVar);
        }
        Object objM59306a = mld1Var.f144818a;
        int i2 = mld1Var.f144820c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM59306a);
                lzy0 lzy0VarM98088r = SearchRequest.m98088r();
                lzy0VarM98088r.m60392m(arrayList);
                if (str != null) {
                    lzy0VarM98088r.m60394r(str);
                }
                if (l != null) {
                    jn71 jn71VarM98094o = TimeOffsetHighlight.m98094o();
                    jn71VarM98094o.m53815m(l.longValue());
                    lzy0VarM98088r.m60395s((TimeOffsetHighlight) jn71VarM98094o.build());
                }
                if (n391Var != null) {
                    int iOrdinal = n391Var.ordinal();
                    if (iOrdinal == 0) {
                        s1d0Var = s1d0.MATCH_BOUNDARIES_UNSPECIFIED;
                    } else if (iOrdinal == 1) {
                        s1d0Var = s1d0.MATCH_BOUNDARIES_EXPANDED;
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        s1d0Var = s1d0.MATCH_BOUNDARIES_DYNAMIC;
                    }
                    lzy0VarM98088r.m60393q(s1d0Var);
                }
                lld1 lld1Var = (lld1) this.f196341a.getValue();
                SearchRequest searchRequest = (SearchRequest) lzy0VarM98088r.build();
                mld1Var.f144820c = 1;
                objM59306a = lld1Var.m59306a(searchRequest, mld1Var);
                yuk yukVar = yuk.f276404a;
                if (objM59306a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM59306a);
            }
            o2x0 o2x0Var = (o2x0) objM59306a;
            if (!o2x0Var.f161171a.f149852O0) {
                p3x0 p3x0Var = o2x0Var.f161173c;
                if (p3x0Var == null || (strM69093g = p3x0Var.m69093g()) == null) {
                    strM69093g = "";
                }
                if (wl51.m88460J0(strM69093g)) {
                    strM69093g = "Transcript Search Api responded with " + o2x0Var.f161171a.f149860d;
                }
                return new p391(strM69093g);
            }
            SearchResponse searchResponse = (SearchResponse) o2x0Var.f161172b;
            if (searchResponse == null) {
                return new p391("Empty response");
            }
            if (!searchResponse.m98092q()) {
                return searchResponse.m98091p() ? new p391(searchResponse.m98089n().getMessage()) : new p391("Unknown error");
            }
            Match matchM98090o = searchResponse.m98090o();
            long jM98083p = matchM98090o.m98070n().m98083p();
            String strM98076u = matchM98090o.m98076u();
            String strM98073r = matchM98090o.m98073r();
            String strM98075t = matchM98090o.m98075t();
            s391 s391Var = matchM98090o.m98077v() ? new s391(matchM98090o.m98070n().m98083p(), matchM98090o.m98070n().m98082o()) : null;
            long jM98059n = matchM98090o.m98078w() ? matchM98090o.m98071o().m98059n() : 0L;
            q391 q391Var = matchM98090o.m98080y() ? new q391(matchM98090o.m98074s().m98068p(), matchM98090o.m98074s().m98067o()) : null;
            if (matchM98090o.m98079x()) {
                DebugInfo debugInfoM98072p = matchM98090o.m98072p();
                String strM98061o = debugInfoM98072p.m98061o();
                if (!debugInfoM98072p.m98063q()) {
                    strM98061o = null;
                }
                o391Var = new o391(strM98061o, debugInfoM98072p.m98064r() ? debugInfoM98072p.m98062p() : null);
            } else {
                o391Var = null;
            }
            return new r391(strM98076u, strM98073r, strM98075t, jM98083p, s391Var, jM98059n, q391Var, o391Var);
        } catch (IOException e) {
            String message = e.getMessage();
            p391Var = new p391(message != null ? message : "Unknown error");
            return p391Var;
        } catch (IllegalStateException e2) {
            String message2 = e2.getMessage();
            p391Var = new p391(message2 != null ? message2 : "Unknown error");
            return p391Var;
        }
    }

    public r6q(RetrofitMaker retrofitMaker) {
        this.f196341a = new wg61(new ixb1(retrofitMaker, 24));
    }
}
