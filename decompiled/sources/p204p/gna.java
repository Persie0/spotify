package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.browse.clientnative.integration.services.structureapi.DismissedEntity;
import com.spotify.browse.clientnative.mobius.AbstractC0319c;
import com.spotify.browse.clientnative.mobius.BrowseEffect;
import com.spotify.browse.clientnative.mobius.BrowseEvent;
import com.spotify.browse.clientnative.mobius.BrowseState;
import com.spotify.browse.clientnative.mobius.Model;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gna implements Update {
    /* JADX WARN: Code duplicated, block: B:93:0x0236  */
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        Next nextM15608j;
        int iIntValue;
        Set setSingleton;
        Model model;
        BrowseState browseState = (BrowseState) obj;
        BrowseEvent browseEvent = (BrowseEvent) obj2;
        boolean z = browseEvent instanceof BrowseEvent.StructureLoaded;
        laa0 laa0Var = laa0.f131319b;
        if (z) {
            BrowseEvent.StructureLoaded structureLoaded = (BrowseEvent.StructureLoaded) browseEvent;
            gmr0 profile = structureLoaded.getProfile();
            Model browsitaContent = structureLoaded.getBrowsitaContent();
            BrowseState.Content contentM4051a = AbstractC0319c.m4051a(browseState);
            String dataSource = (contentM4051a == null || (model = contentM4051a.getModel()) == null) ? null : model.getDataSource();
            String dataSource2 = structureLoaded.getBrowsitaContent().getDataSource();
            if (wl51.m88460J0(dataSource2)) {
                dataSource2 = null;
            }
            Model modelCopy$default = Model.copy$default(browsitaContent, null, null, null, null, g6f.m43753y0(bk5.m29582E0(new String[]{dataSource, dataSource2}), null, null, null, null, 63), structureLoaded.getShouldShowDSABanner(), 15, null);
            BrowseState.Content contentM4051a2 = AbstractC0319c.m4051a(browseState);
            if (contentM4051a2 != null) {
                iIntValue = contentM4051a2.getColumnCount();
            } else {
                BrowseState.UIRendered uIRendered = browseState instanceof BrowseState.UIRendered ? (BrowseState.UIRendered) browseState : null;
                Integer numValueOf = uIRendered != null ? Integer.valueOf(uIRendered.getColumnCount()) : null;
                if (numValueOf == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                iIntValue = numValueOf.intValue();
            }
            BrowseState.Content content = new BrowseState.Content(profile, modelCopy$default, iIntValue);
            int iOrdinal = structureLoaded.getLoadingStrategy().ordinal();
            if (iOrdinal == 0) {
                setSingleton = Collections.singleton(new BrowseEffect.Load(laa0Var));
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                setSingleton = gbu.f78413a;
            }
            nextM15608j = Next.m15607i(content, setSingleton);
        } else if (browseEvent instanceof BrowseEvent.StructureLoadFailed) {
            BrowseEvent.StructureLoadFailed structureLoadFailed = (BrowseEvent.StructureLoadFailed) browseEvent;
            int iOrdinal2 = structureLoadFailed.getLoadingStrategy().ordinal();
            if (iOrdinal2 == 0) {
                nextM15608j = Next.m15605a(Collections.singleton(new BrowseEffect.Load(laa0Var)));
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                nextM15608j = !(browseState instanceof BrowseState.Content) ? Next.m15606h(new BrowseState.Error(structureLoadFailed.getThrowable())) : Next.m15608j();
            }
        } else if (browseEvent instanceof BrowseEvent.ExplicitFeedbackListChanged) {
            BrowseEvent.ExplicitFeedbackListChanged explicitFeedbackListChanged = (BrowseEvent.ExplicitFeedbackListChanged) browseEvent;
            BrowseState.Content content2 = browseState instanceof BrowseState.Content ? (BrowseState.Content) browseState : null;
            if (content2 == null) {
                nextM15608j = Next.m15608j();
            } else {
                Model model2 = content2.getModel();
                Set<DismissedEntity> dismissedSectionUris = content2.getModel().getDismissedSectionUris();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : dismissedSectionUris) {
                    if (((DismissedEntity) obj3).getType() != DismissedEntity.Type.EXPLICIT_FEEDBACK) {
                        arrayList.add(obj3);
                    }
                }
                Set setM43736n1 = g6f.m43736n1(arrayList);
                Map mapM4052b = AbstractC0319c.m4052b(model2.getSections());
                Set<String> entityUris = explicitFeedbackListChanged.getEntityUris();
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it = entityUris.iterator();
                while (it.hasNext()) {
                    wma wmaVar = (wma) mapM4052b.get((String) it.next());
                    DismissedEntity dismissedEntity = wmaVar == null ? null : new DismissedEntity(wmaVar.getId(), DismissedEntity.Type.EXPLICIT_FEEDBACK);
                    if (dismissedEntity != null) {
                        arrayList2.add(dismissedEntity);
                    }
                }
                nextM15608j = Next.m15606h(BrowseState.Content.copy$default(content2, null, Model.copy$default(model2, null, null, null, s601.m77309l0(setM43736n1, arrayList2), null, false, 55, null), 0, 5, null));
            }
        } else {
            boolean z2 = browseEvent instanceof sma;
            laa0 laa0Var2 = laa0.f131318a;
            if (z2) {
                nextM15608j = Next.m15605a(Collections.singleton(new BrowseEffect.Load(laa0Var2)));
            } else if (browseEvent instanceof tma) {
                nextM15608j = Next.m15607i(new BrowseState.UIRendered(((tma) browseEvent).f221639a), Collections.singleton(new BrowseEffect.Load(laa0Var2)));
            } else if (browseEvent instanceof vma) {
                vma vmaVar = (vma) browseEvent;
                BrowseState.Content content3 = browseState instanceof BrowseState.Content ? (BrowseState.Content) browseState : null;
                if (content3 == null) {
                    nextM15608j = Next.m15608j();
                } else {
                    Model model3 = content3.getModel();
                    nextM15608j = Next.m15606h(BrowseState.Content.copy$default(content3, null, Model.copy$default(model3, null, null, null, s601.m77308k0(new DismissedEntity(vmaVar.f242741a, DismissedEntity.Type.SHOWCASE), model3.getDismissedSectionUris()), null, false, 55, null), 0, 5, null));
                }
            } else if (browseEvent instanceof rma) {
                rma rmaVar = (rma) browseEvent;
                if (browseState instanceof BrowseState.Content) {
                    BrowseState.Content content4 = (BrowseState.Content) browseState;
                    int columnCount = content4.getColumnCount();
                    int i = rmaVar.f200486a;
                    if (columnCount != i) {
                        nextM15608j = Next.m15606h(BrowseState.Content.copy$default(content4, null, null, i, 3, null));
                    } else {
                        nextM15608j = Next.m15608j();
                    }
                } else {
                    nextM15608j = Next.m15608j();
                }
            } else {
                if (!(browseEvent instanceof uma)) {
                    throw new NoWhenBranchMatchedException();
                }
                uma umaVar = (uma) browseEvent;
                BrowseState.Content contentM4051a3 = AbstractC0319c.m4051a(browseState);
                nextM15608j = (contentM4051a3 == null || contentM4051a3.getModel().getShouldShowDSABanner() == umaVar.f231784a) ? Next.m15608j() : Next.m15607i(BrowseState.Content.copy$default(contentM4051a3, null, Model.copy$default(contentM4051a3.getModel(), null, null, null, null, null, umaVar.f231784a, 31, null), 0, 5, null), Collections.singleton(new BrowseEffect.Load(laa0Var2)));
            }
        }
        String strBreadcrumb = browseEvent.breadcrumb();
        String strBreadcrumb2 = browseState.breadcrumb();
        String strBreadcrumb3 = nextM15608j.m15610d() ? ((BrowseState) nextM15608j.m15613g()).breadcrumb() : "empty";
        StringBuilder sbM38573v = edb.m38573v("BrowsePage :: event: ", strBreadcrumb, ", oldModel: ", strBreadcrumb2, ", newModel: ");
        sbM38573v.append(strBreadcrumb3);
        Logger.m3965a(sbM38573v.toString(), new Object[0]);
        return nextM15608j;
    }
}
