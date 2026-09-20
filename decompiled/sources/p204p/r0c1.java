package p204p;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.core.corefullimpl.NativeFullAuthenticatedScopeImpl;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoremobile.component.icons.IconVideo;
import com.spotify.music.R;
import com.spotify.thestage.vtec.logic.VtecAndroidToWebMessage$CompleteEditProfile;
import com.spotify.watchfeed.uiusecases.element.videothumbnail.VideoThumbnailView;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class r0c1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f194429a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f194430b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0c1(Object obj, int i) {
        super(1);
        this.f194429a = i;
        this.f194430b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0332  */
    /* JADX WARN: Type inference failed for: r0v23, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, p.gh00] */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        a7c1 z6c1Var;
        String string;
        switch (this.f194429a) {
            case 0:
                VideoSurfaceView videoSurfaceView = new VideoSurfaceView((Context) obj);
                mac1 mac1Var = (mac1) this.f194430b;
                videoSurfaceView.setSupportsSurfaceView(false);
                videoSurfaceView.setBufferingThrobberEnabled(false);
                videoSurfaceView.setScaleType(mac1Var);
                return videoSurfaceView;
            case 1:
                rvw0 rvw0Var = (rvw0) this.f194430b;
                return new zux(mvl0.m62953p(k0e1.m54985d((Observable) rvw0Var.f203142d)), mvl0.m62953p(((x1p0) rvw0Var.f203145g).m89662I(null)), new jl0(3, 27, null), 1);
            case 2:
                ((icp) obj).f100858d = new fop0((zab0) this.f194430b, (fbk) null, 27);
                return w2a1.f247311a;
            case 3:
                g7a g7aVar = (g7a) this.f194430b;
                return fag1.m41151B(g7aVar.f77219b, g7aVar.f77220c, (z5c1) obj);
            case 4:
                return (ex80) this.f194430b;
            case 5:
                Bundle bundle = (Bundle) obj;
                String str = ((l7c1) ((be41) this.f194430b).f26280c).f130623a;
                if (bundle == null || (string = bundle.getString("selection_type")) == null) {
                    z6c1Var = y6c1.f269730a;
                } else {
                    int iHashCode = string.hashCode();
                    if (iHashCode != 96673) {
                        if (iHashCode == 1191572123 && string.equals("selected")) {
                            ArrayList<String> stringArrayList = bundle.getStringArrayList("selected_ids");
                            ig40 ig40VarM67576z = stringArrayList != null ? opo.m67576z(stringArrayList) : null;
                            if (ig40VarM67576z == null || ig40VarM67576z.isEmpty()) {
                                z6c1Var = y6c1.f269730a;
                            } else {
                                z6c1Var = new z6c1(ig40VarM67576z);
                            }
                        } else {
                            z6c1Var = y6c1.f269730a;
                        }
                    } else if (string.equals("all")) {
                        z6c1Var = x6c1.f258638a;
                    } else {
                        z6c1Var = y6c1.f269730a;
                    }
                }
                return new b7c1(str, lv21.f137205b, z6c1Var, false);
            case 6:
                f7c1 f7c1Var = (f7c1) this.f194430b;
                return fag1.m41151B(f7c1Var.f66646a, f7c1Var.f66648c, (c7c1) obj);
            case 7:
                String str2 = ((tac1) obj).f218540a;
                if (str2.length() <= 0) {
                    return new ysk("", 27);
                }
                hgc hgcVar = (hgc) this.f194430b;
                return new phw0(fag1.m41151B(hgcVar.f91116b, (tjo) hgcVar.f91120f, str2), 14);
            case 8:
                g66 g66Var = (g66) obj;
                VideoThumbnailView videoThumbnailView = (VideoThumbnailView) this.f194430b;
                oa81 oa81Var = videoThumbnailView.f6933a;
                if (g66Var instanceof c66) {
                    Integer num = ((c66) g66Var).f34400a;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        ?? r0 = videoThumbnailView.f6936d;
                        if (r0 != 0) {
                            r0.invoke(new pac1(iIntValue));
                        }
                    }
                } else if (g66Var instanceof d66) {
                    videoThumbnailView.f6934b = true;
                    ((ArtworkView) oa81Var.f163267d).setVisibility(0);
                    ((IconVideo) oa81Var.f163266c).setVisibility(4);
                } else {
                    if (!(g66Var instanceof f66)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((ArtworkView) oa81Var.f163267d).setVisibility(4);
                    ((IconVideo) oa81Var.f163266c).setVisibility(0);
                }
                return w2a1.f247311a;
            case 9:
                return new mgq0((lg21) this.f194430b, 19);
            case 10:
                ((icp) obj).f100858d = new r4w0((fdc1) this.f194430b, null, 21);
                return w2a1.f247311a;
            case 11:
                return new mgq0((tpb1) this.f194430b, 20);
            case 12:
                return ((nju) this.f194430b).mo26174a(null);
            case 13:
                return ((mx91) ((oyp0) this.f194430b).f171833c).mo41789e();
            case 14:
                return (wte0) this.f194430b;
            case 15:
                return Boolean.valueOf(wj50.m88271j(((rza) ((pqm0) obj).f180350a).f204102a, ((mya) this.f194430b).f148373a));
            case 16:
                return (Boolean) ((fhc1) this.f194430b).invoke((pqm0) obj);
            case 17:
                return Boolean.valueOf(wj50.m88271j(((rza) ((pqm0) obj).f180350a).f204102a, ((zqq0) ((xhf1) this.f194430b)).f285433d.f204102a));
            case 18:
                yte0 yte0Var = (yte0) this.f194430b;
                return new xte0(yte0Var.f276108a, yte0Var.f276109b);
            case 19:
                return new k701(Integer.valueOf(R.string.view_others_listening_activity_dialog_title), Integer.valueOf(R.string.view_others_listening_activity_dialog_message), Integer.valueOf(android.R.string.ok), new bm21((iqp0) this.f194430b, (fbk) null, 13), new j701(new f6w0(8, 4), new jhy0(9, hhc1.f91353f), i401.f98384c));
            case 20:
                ((icp) obj).f100858d = new r4w0((C1790du) this.f194430b, null, 22);
                return w2a1.f247311a;
            case 21:
                hgc hgcVar2 = (hgc) this.f194430b;
                return fag1.m41151B(hgcVar2.f91116b, (tjo) hgcVar2.f91120f, obj);
            case 22:
                int iIntValue2 = ((Number) obj).intValue();
                ana0 ana0Var = (ana0) this.f194430b;
                boolean z = iIntValue2 > 50;
                if (ana0Var.f17349b != z) {
                    ana0Var.f17350c.invoke(Boolean.valueOf(z));
                }
                ana0Var.f17349b = z;
                return w2a1.f247311a;
            case 23:
                wpr0 wpr0Var = ((y5d1) this.f194430b).f269414a;
                return new VtecAndroidToWebMessage$CompleteEditProfile(null, bk5.m29582E0(new String[]{wpr0Var.f253828a ? "name" : null, wpr0Var.f253829b ? "image" : null}), 1, null);
            case 24:
                return new ex80(((pvf0) ((be41) this.f194430b).f26279b).f181735a, null, Collections.singleton(new jt80((String) obj)), null, 10);
            case 25:
                NativeFullAuthenticatedScopeImpl nativeFullAuthenticatedScopeImpl = ((csk) ((afq0) obj).mo25828e()).f41636W0;
                if (nativeFullAuthenticatedScopeImpl != null) {
                    ((h7d1) this.f194430b).f88440a.onNext(xul0.m92201d(nativeFullAuthenticatedScopeImpl.contentDeliveryIOTransport()));
                    return w2a1.f247311a;
                }
                wj50.m88260d0("authenticatedScopeImpl");
                throw null;
            case 26:
                b450 b450Var = (b450) obj;
                bsa bsaVar = (bsa) ((hr81) this.f194430b).f94377d;
                bsaVar.getClass();
                Set setM43736n1 = g6f.m43736n1(b450Var);
                Set setM43736n2 = g6f.m43736n1((b450) bsaVar.f30270f);
                Set setM77305h0 = s601.m77305h0(setM43736n2, setM43736n1);
                Set setM77305h1 = s601.m77305h0(setM43736n1, setM43736n2);
                Iterator it = setM77305h0.iterator();
                while (it.hasNext()) {
                    int iIntValue3 = ((Number) it.next()).intValue();
                    hjv0 adapter = ((RecyclerView) bsaVar.f30267c).getAdapter();
                    if (iIntValue3 < (adapter != null ? adapter.mo1617e() : 0)) {
                        ((thq) bsaVar.f30269e).invoke(Integer.valueOf(iIntValue3));
                    }
                }
                bsaVar.f30270f = b450Var;
                if (bsaVar.f30266b) {
                    Iterator it2 = setM77305h1.iterator();
                    while (it2.hasNext()) {
                        ((thq) bsaVar.f30268d).invoke(Integer.valueOf(((Number) it2.next()).intValue()));
                    }
                }
                return w2a1.f247311a;
            case 27:
                return fag1.m41174w((pgo) ((kk1) this.f194430b).f123471b, p9d1.f175217a, (n9d1) obj);
            case 28:
                return fag1.m41174w((ago) ((ucs0) this.f194430b).f229103c, ns5.f157685w, (r9d1) obj);
            default:
                return ((zad1) this.f194430b).f281042a;
        }
    }
}
