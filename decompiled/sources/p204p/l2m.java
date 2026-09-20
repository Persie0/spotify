package p204p;

import android.content.Context;
import android.net.Uri;
import com.spotify.culturalmoments.stories.CulturalMomentsStoryActivity;
import com.spotify.culturalmoments.stories.p056v1.FeaturedCardStory;
import com.spotify.culturalmoments.stories.p056v1.FullscreenVideoStory;
import com.spotify.culturalmoments.stories.p056v1.GetStoriesRequest;
import com.spotify.culturalmoments.stories.p056v1.GetStoriesResponse;
import com.spotify.culturalmoments.stories.p056v1.ImageOnImageStory;
import com.spotify.culturalmoments.stories.p056v1.PlaylistStory;
import com.spotify.culturalmoments.stories.p056v1.Story;
import com.spotify.referrals.service.p143v1.GetContextualEntrypointCopyForJamRequest;
import com.spotify.referrals.service.p143v1.GetContextualEntrypointCopyForJamResponse;
import com.spotify.referrals.service.p143v1.JamMember;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class l2m implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f129037a;

    /* JADX INFO: renamed from: b */
    public final Object f129038b;

    /* JADX INFO: renamed from: c */
    public final Object f129039c;

    /* JADX INFO: renamed from: d */
    public final Object f129040d;

    /* JADX INFO: renamed from: e */
    public final Object f129041e;

    public /* synthetic */ l2m(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f129037a = i;
        this.f129038b = obj;
        this.f129039c = obj2;
        this.f129040d = obj3;
        this.f129041e = obj4;
    }

    /* JADX INFO: renamed from: a */
    public static final Object m57906a(l2m l2mVar, tx50 tx50Var, List list, String str, yv3 yv3Var) {
        q710 q710VarM20359q = GetContextualEntrypointCopyForJamRequest.m20359q();
        q710VarM20359q.m72267r(tx50Var.f224567c);
        q710VarM20359q.m72266q(str);
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tx50 tx50Var2 = (tx50) it.next();
            p460 p460VarM20364p = JamMember.m20364p();
            p460VarM20364p.m69098q(tx50Var2.f224567c);
            p460VarM20364p.m69097m(tx50Var2.f224566b);
            arrayList.add((JamMember) p460VarM20364p.build());
        }
        q710VarM20359q.m72265m(arrayList);
        GetContextualEntrypointCopyForJamRequest getContextualEntrypointCopyForJamRequest = (GetContextualEntrypointCopyForJamRequest) q710VarM20359q.build();
        nmv0 nmv0Var = (nmv0) l2mVar.f129039c;
        wj50.m88279p(getContextualEntrypointCopyForJamRequest);
        return nmv0Var.m65161b(getContextualEntrypointCopyForJamRequest, yv3Var);
    }

    /* JADX INFO: renamed from: e */
    public static final r660 m57907e(l2m l2mVar, GetContextualEntrypointCopyForJamResponse getContextualEntrypointCopyForJamResponse, String str) {
        l2mVar.getClass();
        return getContextualEntrypointCopyForJamResponse.getTitle().length() > 0 ? new q660(getContextualEntrypointCopyForJamResponse.getTitle(), getContextualEntrypointCopyForJamResponse.m20361o(), getContextualEntrypointCopyForJamResponse.m20360n(), str) : p660.f174302a;
    }

    /* JADX INFO: renamed from: f */
    public fiz m57908f() {
        if (!((un4) this.f129040d).m83512a()) {
            return new ysk(p660.f174302a, 27);
        }
        return new zux(new td5(new ner(new bmv0(null, null), ((mb80) ((p0p0) this.f129038b).f172721b).f141817b.current(), new vak0(3, 16, (fbk) null), 6), 4), ((vmz) this.f129041e).m86024a("referrals-entrypoint-eligible", false), new yv3(this, null), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public da51 m57909g(GetStoriesResponse getStoriesResponse) {
        by31 by31Var;
        ae50 ae50VarM9082o = getStoriesResponse.m9082o();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : ae50VarM9082o) {
            int i2 = i + 1;
            uc51 uc51Var = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            if (i < 0) {
                h6f.m46722S();
                throw null;
            }
            Story story = (Story) obj;
            int iM9099r = story.m9099r();
            int i3 = iM9099r == 0 ? -1 : k2m.f118664a[edb.m38547C(iM9099r)];
            if (i3 == -1) {
                by31Var = null;
            } else if (i3 == 1) {
                ImageOnImageStory imageOnImageStoryM9097p = story.m9097p();
                by31Var = new by31(new fg01(imageOnImageStoryM9097p, null), imageOnImageStoryM9097p.m9085o());
            } else if (i3 == 2) {
                FullscreenVideoStory fullscreenVideoStoryM9096o = story.m9096o();
                by31Var = new by31(new bm21((Object) fullscreenVideoStoryM9096o, (fbk) (objArr == true ? 1 : 0), 3), fullscreenVideoStoryM9096o.m9077n());
            } else if (i3 == 3) {
                FeaturedCardStory featuredCardStoryM9095n = story.m9095n();
                by31Var = new by31(new id51(featuredCardStoryM9095n, objArr2 == true ? 1 : 0, 1), featuredCardStoryM9095n.m9066n());
            } else if (i3 != 4) {
                if (i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                by31Var = null;
            } else {
                PlaylistStory playlistStoryM9098q = story.m9098q();
                by31Var = new by31(new id51(playlistStoryM9098q, objArr3 == true ? 1 : 0, 0), playlistStoryM9098q.m9089o());
            }
            if (by31Var != null) {
                ggn ggnVar = (ggn) this.f129041e;
                boolean z = i == h6f.m46714K(getStoriesResponse.m9082o());
                hmm hmmVar = ggnVar.f79705a;
                d03 d03Var = (d03) hmmVar.f93001d;
                son sonVar = (son) hmmVar.f93000c;
                CulturalMomentsStoryActivity culturalMomentsStoryActivity = (CulturalMomentsStoryActivity) d03Var.f43726b;
                z9j0 z9j0Var = (z9j0) ((hmm) d03Var.f43719R0).get();
                e940 e940Var = (e940) sonVar.f211626P7.get();
                cx21 cx21VarM34510v = d03Var.m34510v();
                son sonVar2 = (son) d03Var.f43727c;
                a531 a531Var = new a531((ra9) sonVar2.f212012d9.get(), new y0i0("culturalmoments-stories-video-content", (ra9) sonVar2.f212012d9.get()), (oe50) sonVar2.f211804Vn.get(), (l89) sonVar2.f211919a.f18672s1.get(), 6);
                bun0 bun0Var = new bun0((Context) sonVar2.f212437t1.f246642a, (InterfaceC2609yd) sonVar2.f212471u9.get());
                uc51Var = (uc51) by31Var.invoke(new wc51(culturalMomentsStoryActivity, z9j0Var, e940Var, cx21VarM34510v, z, a531Var, bun0Var));
            }
            if (uc51Var != null) {
                arrayList.add(uc51Var);
            }
            i = i2;
        }
        return new da51(arrayList);
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f129037a) {
            case 0:
                try {
                    pa51 pa51Var = (pa51) this.f129038b;
                    rb10 rb10VarM9080o = GetStoriesRequest.m9080o();
                    rb10VarM9080o.m75129m((String) this.f129039c);
                    GetStoriesResponse getStoriesResponseBlockingGet = pa51Var.m69434a((GetStoriesRequest) rb10VarM9080o.build()).blockingGet();
                    zb51 zb51Var = (zb51) this.f129040d;
                    String strM9081n = getStoriesResponseBlockingGet.m9081n();
                    Uri uri = null;
                    if (strM9081n != null) {
                        if (strM9081n.length() <= 0) {
                            strM9081n = null;
                        }
                        if (strM9081n != null) {
                            try {
                                uri = Uri.parse(strM9081n);
                                wj50.m88279p(uri);
                            } catch (Exception unused) {
                                throw new IllegalStateException("Error parsing uri: ".concat(strM9081n).toString());
                            }
                        }
                        break;
                    }
                    zb51Var.f281259d = uri;
                    return new fa51(m57909g(getStoriesResponseBlockingGet));
                } catch (Exception unused2) {
                    return ea51.f57588a;
                }
            case 1:
                return ((mcu0) this.f129041e).m61498e().flatMap(new h7u(this, 17));
            case 2:
                return m57908f();
            case 3:
                return ((Observable) ((ppk0) this.f129038b).invoke()).map(new m680(this, 29)).ignoreElements();
            case 4:
                return ((Observable) ((ppk0) this.f129038b).invoke()).switchMapSingle(new ucj0(this, 11)).onErrorReturn(y4y.f269255U0);
            default:
                return xtm0.m92074U(mvl0.m62953p(((ywo) this.f129040d).m94803b()), new x13((fbk) null, this, 13));
        }
    }
}
