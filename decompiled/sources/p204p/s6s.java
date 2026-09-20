package p204p;

import com.spotify.contentdelivery.downloadimpl.NullTransportException;
import com.spotify.download.esperanto.proto.C0706a;
import com.spotify.download.esperanto.proto.C0707b;
import com.spotify.download.esperanto.proto.C0708c;
import com.spotify.download.esperanto.proto.EsDownload$GetFirstCachedSegmentIndexParams;
import com.spotify.download.esperanto.proto.EsDownload$GetFirstCachedSegmentIndexResponse;
import com.spotify.download.esperanto.proto.EsDownload$GetMediaHandleParams;
import com.spotify.download.esperanto.proto.EsDownload$IsFileFullyCachedParams;
import com.spotify.download.esperanto.proto.EsDownload$MediaManifestParams;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class s6s implements n2s, uwy {

    /* JADX INFO: renamed from: a */
    public final d3s f206185a;

    /* JADX INFO: renamed from: b */
    public final rp4 f206186b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f206187c;

    /* JADX INFO: renamed from: d */
    public final CompositeDisposable f206188d = new CompositeDisposable();

    public s6s(d3s d3sVar, rp4 rp4Var, Scheduler scheduler) {
        this.f206185a = d3sVar;
        this.f206186b = rp4Var;
        this.f206187c = scheduler;
    }

    /* JADX INFO: renamed from: a */
    public final int m77343a(ArrayList arrayList, whj whjVar) {
        ckw ckwVar;
        bkw bkwVar;
        gkw gkwVarM9507q = EsDownload$GetFirstCachedSegmentIndexParams.m9507q();
        gkwVarM9507q.m45079m(arrayList);
        int iM38547C = edb.m38547C(2);
        if (iM38547C == 0) {
            ckwVar = ckw.AUDIO;
        } else {
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            ckwVar = ckw.VIDEO;
        }
        gkwVarM9507q.m45081r(ckwVar);
        int iOrdinal = whjVar.ordinal();
        if (iOrdinal == 0) {
            bkwVar = bkw.LONG;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            bkwVar = bkw.SHORT;
        }
        gkwVarM9507q.m45080q(bkwVar);
        try {
            byte[] bArrCallSync = this.f206185a.callSync("spotify.download.esperanto.proto.Download", "GetFirstCachedSegmentIndex", (EsDownload$GetFirstCachedSegmentIndexParams) gkwVarM9507q.build());
            try {
                return EsDownload$GetFirstCachedSegmentIndexResponse.m9508n(bArrCallSync).getIndex();
            } catch (Exception e) {
                throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.download.esperanto.proto.EsDownload.GetFirstCachedSegmentIndexResponse: '", Base64.getEncoder().encodeToString(bArrCallSync), "' (Base64)"), e);
            }
        } catch (NullTransportException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Single m77344b(String str, String str2, int i, String str3) {
        mkw mkwVar;
        lkw lkwVar;
        kkw kkwVarM9528s = EsDownload$MediaManifestParams.m9528s();
        kkwVarM9528s.m56744m(str);
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            mkwVar = mkw.INTERACTIVE;
        } else if (iM38547C == 1) {
            mkwVar = mkw.PREFETCH;
        } else {
            if (iM38547C != 2) {
                throw new NoWhenBranchMatchedException();
            }
            mkwVar = mkw.OTHER;
        }
        kkwVarM9528s.m56747s(mkwVar);
        int iM38547C2 = edb.m38547C(1);
        if (iM38547C2 == 0) {
            lkwVar = lkw.VIDEO;
        } else {
            if (iM38547C2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            lkwVar = lkw.AUDIO;
        }
        kkwVarM9528s.m56745q(lkwVar);
        if (str2 != null) {
            kkwVarM9528s.m56746r(str2);
        }
        if (str3 != null) {
            kkwVarM9528s.m56748t(str3);
        }
        return this.f206185a.callSingle("spotify.download.esperanto.proto.Download", "GetMediaManifest", (EsDownload$MediaManifestParams) kkwVarM9528s.build()).map(u0o0.f225554Y0).onErrorResumeNext(new C2617yl(str, 4)).flatMap(use.f233602X0);
    }

    /* JADX INFO: renamed from: c */
    public final Observable m77345c(int i, String str) {
        ikw ikwVar;
        hkw hkwVarM9514p = EsDownload$GetMediaHandleParams.m9514p();
        hkwVarM9514p.m47856m(str);
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            ikwVar = ikw.VIDEO;
        } else {
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            ikwVar = ikw.AUDIO;
        }
        hkwVarM9514p.m47857q(ikwVar);
        EsDownload$GetMediaHandleParams esDownload$GetMediaHandleParams = (EsDownload$GetMediaHandleParams) hkwVarM9514p.build();
        nlv0 nlv0Var = new nlv0();
        wj50.m88279p(esDownload$GetMediaHandleParams);
        return this.f206185a.callStream("spotify.download.esperanto.proto.Download", "GetMediaHandleId", esDownload$GetMediaHandleParams).map(t0o0.f215933Y0).timeout(30L, TimeUnit.SECONDS).concatMap(new t5p(nlv0Var, 18)).takeUntil(uwk.f234677X0).onErrorResumeNext(new nfp(nlv0Var, 14));
    }

    /* JADX INFO: renamed from: d */
    public final Single m77346d(URL url) {
        C0707b c0707bM9519o = EsDownload$IsFileFullyCachedParams.ProgressiveFileParams.m9519o();
        c0707bM9519o.m9573m(url.toString());
        C0706a c0706aM9517p = EsDownload$IsFileFullyCachedParams.m9517p();
        c0706aM9517p.m9571m(c0707bM9519o);
        return this.f206185a.callSingle("spotify.download.esperanto.proto.Download", "IsFileFullyCached", (EsDownload$IsFileFullyCachedParams) c0706aM9517p.build()).map(lew0.f132746Y0).map(l6q.f130444W0).onErrorResumeNext(crs.f41387W0);
    }

    /* JADX INFO: renamed from: e */
    public final Single m77347e(String str, whj whjVar) {
        bkw bkwVar;
        C0708c c0708cM9522p = EsDownload$IsFileFullyCachedParams.SegmentFileParams.m9522p();
        c0708cM9522p.m9575q(str);
        int iOrdinal = whjVar.ordinal();
        if (iOrdinal == 0) {
            bkwVar = bkw.LONG;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            bkwVar = bkw.SHORT;
        }
        c0708cM9522p.m9574m(bkwVar);
        C0706a c0706aM9517p = EsDownload$IsFileFullyCachedParams.m9517p();
        c0706aM9517p.m9572q(c0708cM9522p);
        return this.f206185a.callSingle("spotify.download.esperanto.proto.Download", "IsFileFullyCached", (EsDownload$IsFileFullyCachedParams) c0706aM9517p.build()).map(lew0.f132746Y0).map(tp20.f222393V0).onErrorResumeNext(mc40.f142040U0);
    }
}
