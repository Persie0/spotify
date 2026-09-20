package p204p;

import android.content.res.Resources;
import android.view.View;
import com.spotify.encoreconsumermobile.elements.entityaction.EntityActionView;
import com.spotify.encoreconsumermobile.elements.entitymetadata.EntityMetadataView;
import com.spotify.encoremobile.component.listrow.EncoreListRow;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.mobius.functions.Consumer;
import com.spotify.music.R;
import java.util.Arrays;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class vas extends ri00 implements gh00 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f239322h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vas(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f239322h = i4;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) throws Throwable {
        String string;
        eh00 eh00VarM65830i;
        Object value;
        ozt oztVar;
        String string2;
        switch (this.f239322h) {
            case 0:
                uas uasVar = (uas) obj;
                Resources resources = ((was) this.f78014b).f249592a.getResources();
                wj50.m88279p(resources);
                xas xasVar = uasVar.f228543c;
                String str = uasVar.f228542b;
                if (xasVar == xas.f259754c) {
                    string = resources.getString(R.string.download_upsell_liked_songs_title);
                    wj50.m88279p(string);
                } else if (str == null || str.length() == 0) {
                    string = resources.getString(R.string.download_upsell_default_title);
                    wj50.m88279p(string);
                } else {
                    string = resources.getString(R.string.download_upsell_entity_title, str);
                    wj50.m88279p(string);
                }
                return new qo41(string, resources.getString(R.string.download_upsell_subtitle), resources.getString(R.string.download_upsell_explore_premium), resources.getString(R.string.download_upsell_dismiss), true, uasVar.f228541a);
            case 1:
                lys lysVar = (lys) this.f78014b;
                lysVar.getClass();
                gys gysVar = ((jys) obj).f117473i;
                return pp91.m70529j(new pqm0("edit_playlist_items_model_state", new kys(gysVar.f85696a, gysVar.f85697b, (Set) lysVar.f138104a.f40373b.f158717a.getValue())));
            case 2:
                ((v1t) this.f78014b).getClass();
                return pp91.m70529j(new pqm0("restorable_state", new u1t(((t1t) obj).f216351b)));
            case 3:
                ((j3t) this.f78014b).getClass();
                return pp91.m70529j(new pqm0("restorable_state", new i3t(((h3t) obj).f87311a)));
            case 4:
                Throwable th = (Throwable) obj;
                hxt hxtVar = (hxt) this.f78014b;
                gh00 gh00Var = hxtVar.f96294g;
                Object obj2 = hxtVar.f96293f;
                wj50.m88279p(obj2);
                Object objInvoke = gh00Var.invoke(obj2);
                u4l0 u4l0Var = hxtVar.f96308u;
                zuj0.m97048k(th, objInvoke, u4l0Var != null ? ((m12) u4l0Var.f226773c).m60498M() : null, hxtVar.f96288a.mo29380b());
                throw null;
            case 5:
                Throwable th2 = (Throwable) obj;
                hxt hxtVar2 = (hxt) this.f78014b;
                gh00 gh00Var2 = hxtVar2.f96294g;
                Object obj3 = hxtVar2.f96293f;
                wj50.m88279p(obj3);
                Object objInvoke2 = gh00Var2.invoke(obj3);
                u4l0 u4l0Var2 = hxtVar2.f96308u;
                zuj0.m97048k(th2, objInvoke2, u4l0Var2 != null ? ((m12) u4l0Var2.f226773c).m60498M() : null, hxtVar2.f96288a.mo29380b());
                throw null;
            case 6:
                siv0 siv0Var = (siv0) obj;
                hxt hxtVar3 = (hxt) this.f78014b;
                loi0 loi0Var = hxtVar3.f96295h;
                if (loi0Var.f135436c.containsKey(hxt.f96286w)) {
                    b250 b250VarM30652c = hxtVar3.f96296i.m30652c();
                    if (b250VarM30652c == null || (eh00VarM65830i = nxf1.m65830i(b250VarM30652c)) == null) {
                        eh00VarM65830i = hxtVar3.f96309v;
                    } else {
                        hxtVar3.f96309v = eh00VarM65830i;
                    }
                    siv0 siv0Var2 = (siv0) eh00VarM65830i.invoke();
                    if (siv0Var2 == null) {
                        siv0Var2 = siv0.f209669e;
                    }
                    loi0Var.m59570b(qpv0.f191387a.mo54112b(axt.class), new axt(siv0Var, siv0Var2));
                }
                return w2a1.f247311a;
            case 7:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                zv41 zv41Var = ((pzt) this.f78014b).f183803g;
                do {
                    value = zv41Var.getValue();
                    oztVar = (ozt) value;
                } while (!zv41Var.m97089k(value, ozt.m68665a(oztVar, !(oztVar.f172359c instanceof hzt), zBooleanValue, null, null, 12)));
                return w2a1.f247311a;
            case 8:
                ((eh00) this.f78014b).invoke();
                return w2a1.f247311a;
            case 9:
                ((Consumer) this.f78014b).accept((g4v) obj);
                return w2a1.f247311a;
            case 10:
                return ((pst) ((sx0) this.f78014b)).m70888a((fbk) obj);
            case 11:
                return ((mst) ((rx0) this.f78014b)).m62777a((fbk) obj);
            case 12:
                wcv.m87763a((EntityActionView) ((wcv) this.f78014b).f250123a.f280845d, (ncv) obj);
                return w2a1.f247311a;
            case 13:
                pcv pcvVar = (pcv) obj;
                wcv wcvVar = (wcv) this.f78014b;
                wcvVar.setContentDescription(pcvVar != null ? lzg1.m60313g(pcvVar, wcvVar.getContext()) : null);
                return w2a1.f247311a;
            case 14:
                wcv.m87763a((EntityActionView) ((wcv) this.f78014b).f250123a.f280846e, (ncv) obj);
                return w2a1.f247311a;
            case 15:
                wcv.m87763a((EntityActionView) ((wcv) this.f78014b).f250123a.f280844c, (ncv) obj);
                return w2a1.f247311a;
            case 16:
                wcv.m87763a((EntityActionView) ((wcv) this.f78014b).f250123a.f280847f, (ncv) obj);
                return w2a1.f247311a;
            case 17:
                wcv.m87763a((EntityActionView) ((wcv) this.f78014b).f250123a.f280848g, (ncv) obj);
                return w2a1.f247311a;
            case 18:
                ((EntityActionView) ((adv) this.f78014b).f14686a.f265666d).mo2820d((ncv) obj);
                return w2a1.f247311a;
            case 19:
                ((EntityActionView) ((adv) this.f78014b).f14686a.f265665c).mo2820d((ncv) obj);
                return w2a1.f247311a;
            case 20:
                EntityActionView.m9616a((EntityActionView) this.f78014b, (ncv) obj);
                return w2a1.f247311a;
            case 21:
                mdv.m61530z((mdv) this.f78014b, (String) obj);
                return w2a1.f247311a;
            case 22:
                kmv kmvVar = (kmv) obj;
                q6u q6uVar = ((mdv) this.f78014b).f142501S0;
                if (kmvVar != null) {
                    ((EntityMetadataView) ((wg61) q6uVar.f185927d).getValue()).mo2820d(kmvVar);
                    ((EntityMetadataView) ((wg61) q6uVar.f185927d).getValue()).setVisibility(0);
                } else {
                    ((EntityMetadataView) ((wg61) q6uVar.f185927d).getValue()).setVisibility(8);
                }
                return w2a1.f247311a;
            case 23:
                mdv mdvVar = (mdv) this.f78014b;
                mdvVar.getClass();
                float f = wj50.m88271j((Boolean) obj, Boolean.TRUE) ? 0.3f : 1.0f;
                int i = 0;
                while (i < mdvVar.getChildCount()) {
                    int i2 = i + 1;
                    View childAt = mdvVar.getChildAt(i);
                    if (childAt == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    if (!childAt.equals(((mdv) mdvVar.f142501S0.f185925b).findViewById(R.id.content_information_banner_slot))) {
                        childAt.setAlpha(f);
                    }
                    i = i2;
                }
                return w2a1.f247311a;
            case 24:
                ((t290) this.f78014b).invoke((ig3) obj);
                return w2a1.f247311a;
            case 25:
                ((EncoreTextView) ((rhv) this.f78014b).f199360a.f157064c).setText((String) obj);
                return w2a1.f247311a;
            case 26:
                rhv rhvVar = (rhv) this.f78014b;
                rhvVar.getClass();
                rhvVar.setAlpha(wj50.m88271j((Boolean) obj, Boolean.TRUE) ? 0.3f : 1.0f);
                return w2a1.f247311a;
            case 27:
                iyu iyuVar = (iyu) obj;
                EncoreListRow encoreListRow = ((hlv) this.f78014b).f92753c;
                if (encoreListRow.getLayoutSize() != iyuVar) {
                    encoreListRow.setLayoutSize(iyuVar);
                }
                return w2a1.f247311a;
            case 28:
                ((hlv) this.f78014b).f92753c.setMediaAspectRatio((nfu) obj);
                return w2a1.f247311a;
            default:
                bjv bjvVar = (bjv) obj;
                hlv hlvVar = (hlv) this.f78014b;
                EncoreListRow encoreListRow2 = hlvVar.f92753c;
                hlvVar.f92755e = bjvVar;
                if (bjvVar instanceof ajv) {
                    encoreListRow2.setEnabled(true);
                    ytg1 ytg1Var = ((ajv) bjvVar).f16358a;
                    if (ytg1Var instanceof wiv) {
                        string2 = hlvVar.f92751a.getString(R.string.content_description_for_disabled, Arrays.copyOf(((wiv) ytg1Var).f251754b, 0));
                    } else {
                        if (!(ytg1Var instanceof xiv)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        string2 = "";
                    }
                    wj50.m88279p(string2);
                    encoreListRow2.getBinding().m30904a().setContentDescription(string2);
                } else {
                    if (!wj50.m88271j(bjvVar, ziv.f283247a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    encoreListRow2.getBinding().m30904a().setContentDescription(null);
                    encoreListRow2.setEnabled(true);
                }
                return w2a1.f247311a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vas(EntityActionView entityActionView) {
        super(1, entityActionView, EntityActionView.class, "updateAction", "updateAction(Lcom/spotify/encoreconsumermobile/elements/entityaction/EntityAction$Model;)V", 0, 0);
        this.f239322h = 20;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vas(Object obj, int i) {
        super(1, obj, v1t.class, "serialize", "serialize(Lcom/spotify/playlistediting/privacypage/domain/model/EditPlaylistsPrivacyModel;)Landroid/os/Bundle;", 0, 0);
        this.f239322h = i;
        switch (i) {
            case 3:
                super(1, obj, j3t.class, "serialize", "serialize(Lcom/spotify/playlistediting/profilevisibilitypage/domain/model/EditPlaylistsProfileVisibilityModel;)Landroid/os/Bundle;", 0, 0);
                break;
            case 10:
                super(1, obj, sx0.class, "loadAdapterRecentlyPlayed", "loadAdapterRecentlyPlayed(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0);
                break;
            case 11:
                super(1, obj, rx0.class, "loadAdapterHome", "loadAdapterHome(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vas(lys lysVar) {
        super(1, lysVar, lys.class, "serialize", "serialize(Lcom/spotify/playlistediting/itemspage/domain/model/EditPlaylistItemsModel;)Landroid/os/Bundle;", 0, 0);
        this.f239322h = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vas(hxt hxtVar, int i) {
        super(1, hxtVar, hxt.class, "addCrashContextAndRethrow", "addCrashContextAndRethrow(Ljava/lang/Throwable;)Ljava/lang/Void;", 0, 0);
        this.f239322h = i;
        switch (i) {
            case 5:
                super(1, hxtVar, hxt.class, "addCrashContextAndRethrow", "addCrashContextAndRethrow(Ljava/lang/Throwable;)Ljava/lang/Void;", 0, 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vas(adv advVar, int i) {
        super(1, advVar, adv.class, "renderStartAction", "renderStartAction(Lcom/spotify/encoreconsumermobile/elements/entityaction/EntityAction$Model;)V", 0, 0);
        this.f239322h = i;
        switch (i) {
            case 19:
                super(1, advVar, adv.class, "renderEndAction", "renderEndAction(Lcom/spotify/encoreconsumermobile/elements/entityaction/EntityAction$Model;)V", 0, 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vas(hlv hlvVar, int i) {
        super(1, hlvVar, hlv.class, "updateRowLayoutSize", "updateRowLayoutSize(Lcom/spotify/encoremobile/component/listrow/EncoreListRowLayoutSize;)V", 0, 0);
        this.f239322h = i;
        switch (i) {
            case 28:
                super(1, hlvVar, hlv.class, "updateMediaAspectRatio", "updateMediaAspectRatio(Lcom/spotify/encoremobile/component/aspectratio/EncoreAspectRatio;)V", 0, 0);
                break;
            case 29:
                super(1, hlvVar, hlv.class, "updateRowEnabledState", "updateRowEnabledState(Lcom/spotify/encoreconsumermobile/layout/entitylistrow/EntityListRow$EnabledState;)V", 0, 0);
                break;
            default:
                break;
        }
    }
}
