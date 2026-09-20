package com.spotify.home.evopage.mobius;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p204p.cvw;
import p204p.dvw;
import p204p.edb;
import p204p.g6f;
import p204p.gbu;
import p204p.hi11;
import p204p.i3a0;
import p204p.k330;
import p204p.kaa0;
import p204p.kkc0;
import p204p.lau;
import p204p.mp10;
import p204p.ovh0;
import p204p.pqm0;
import p204p.qmb1;
import p204p.qur;
import p204p.ru11;
import p204p.s601;
import p204p.t3x0;
import p204p.wj50;
import p204p.wl51;

/* JADX INFO: renamed from: com.spotify.home.evopage.mobius.b */
/* JADX INFO: loaded from: classes7.dex */
public final class C0785b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v37, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: a */
    public static Next m11788a(State state, Event event) {
        Next nextM15605a;
        String str;
        Object objCopy$default;
        Object objCopy$default2;
        ovh0 model;
        boolean z = event instanceof cvw;
        int i = -1;
        Set setM15571a = gbu.f78413a;
        kaa0 kaa0Var = kaa0.f120850c;
        List<String> list = lau.f131415a;
        String refreshToken = null;
        list = null;
        List list2 = null;
        String refreshToken2 = null;
        if (z) {
            cvw cvwVar = (cvw) event;
            ?? r8 = cvwVar.f42555a;
            i3a0 i3a0Var = cvwVar.f42561g;
            boolean z2 = cvwVar.f42560f;
            boolean z3 = state instanceof State.Content;
            Object[] objArr = z3 && !z2;
            State.Content content = z3 ? (State.Content) state : null;
            List<String> loadingHistory = content != null ? content.getLoadingHistory() : null;
            ovh0 ovh0Var = new ovh0(r8, cvwVar.f42556b, cvwVar.f42557c, cvwVar.f42558d, list, AbstractC0784a.m11785b(state));
            boolean z4 = cvwVar.f42560f;
            String str2 = cvwVar.f42565k;
            String str3 = cvwVar.f42566l;
            List listSingletonList = Collections.singletonList(i3a0Var.name());
            if (loadingHistory != null) {
                list = loadingHistory;
            }
            State.Content content2 = new State.Content(ovh0Var, z4, str2, str3, g6f.m43700N0(list, listSingletonList));
            if (mp10.f145825a[cvwVar.f42564j.ordinal()] != 1) {
                t3x0 t3x0Var = cvwVar.f42559e;
                Iterator it = content2.getModel().f170502a.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    if (((k330) it.next()) instanceof hi11) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
                setM15571a = Collections.singleton(new Effect.TryAddingBrandAdPreview(Math.max(0, i), t3x0Var));
            } else if (z2) {
                setM15571a = Collections.singleton(new Effect.LoadHomeStructure(kaa0Var, null, AbstractC0784a.m11785b(state), 2, null));
            }
            Set setM43734m1 = g6f.m43734m1(setM15571a);
            State.Content content3 = z3 ? (State.Content) state : null;
            if (content3 != null && (model = content3.getModel()) != null) {
                list2 = model.f170502a;
            }
            if (!wj50.m88271j(list2, r8)) {
                setM43734m1.add(new Effect.UpdateOnDemandSet(i3a0Var, cvwVar.f42562h, cvwVar.f42563i));
            }
            nextM15605a = objArr != false ? Next.m15607i(State.Content.copy$default(content2, ovh0.m68131a(content2.getModel(), null, null, null, AbstractC0784a.m11786c(state).getModel().f170506e, null, 47), false, null, null, null, 30, null), setM43734m1) : Next.m15607i(content2, setM43734m1);
        } else if (event instanceof Event.GotSlotBasedHomeContent) {
            Event.GotSlotBasedHomeContent gotSlotBasedHomeContent = (Event.GotSlotBasedHomeContent) event;
            boolean z5 = (state instanceof State.Content) && !gotSlotBasedHomeContent.isConnected();
            State.Content content4 = new State.Content(new ovh0(gotSlotBasedHomeContent.getSectionDataList(), gotSlotBasedHomeContent.getDismissedSectionUris(), gotSlotBasedHomeContent.getTempAdDismissedSectionUris(), gotSlotBasedHomeContent.getEagerLoadedTraits(), list, AbstractC0784a.m11785b(state)), gotSlotBasedHomeContent.isConnected(), gotSlotBasedHomeContent.getPageToken(), gotSlotBasedHomeContent.getRefreshToken(), null, 16, null);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = content4.getModel().f170502a.iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                if (((k330) it2.next()) instanceof hi11) {
                    i = i3;
                    break;
                }
                i3++;
            }
            linkedHashSet.add(new Effect.TryAddingBrandAdPreview(Math.max(0, i), gotSlotBasedHomeContent.getResponseInstrumentationData()));
            nextM15605a = z5 ? Next.m15607i(State.Content.copy$default(content4, ovh0.m68131a(content4.getModel(), null, null, null, AbstractC0784a.m11786c(state).getModel().f170506e, null, 47), false, null, null, null, 30, null), linkedHashSet) : Next.m15607i(content4, linkedHashSet);
        } else {
            boolean z6 = event instanceof Event.FailedToLoadHomeStructure;
            kaa0 kaa0Var2 = kaa0.f120853f;
            if (z6) {
                Event.FailedToLoadHomeStructure failedToLoadHomeStructure = (Event.FailedToLoadHomeStructure) event;
                if (failedToLoadHomeStructure.getLoadingStrategy() == kaa0.f120848a) {
                    nextM15605a = Next.m15605a(Collections.singleton(new Effect.LoadHomeStructure(kaa0Var, null, AbstractC0784a.m11785b(state), 2, null)));
                } else if (failedToLoadHomeStructure.isConnected() || !wj50.m88271j(failedToLoadHomeStructure.getFilterValue(), "default") || failedToLoadHomeStructure.getLoadingStrategy() == kaa0Var2) {
                    Throwable error = failedToLoadHomeStructure.getError();
                    if (state instanceof State.Content) {
                        refreshToken2 = ((State.Content) state).getRefreshToken();
                    } else if (state instanceof State.Error) {
                        refreshToken2 = ((State.Error) state).getRefreshToken();
                    }
                    nextM15605a = Next.m15606h(new State.Error(error, refreshToken2, AbstractC0784a.m11785b(state)));
                } else {
                    nextM15605a = Next.m15605a(Collections.singleton(new Effect.OfflineFallbackResponse(failedToLoadHomeStructure.getFilterValue())));
                }
            } else if (event instanceof Event.ExplicitFeedbackListChanged) {
                Event.ExplicitFeedbackListChanged explicitFeedbackListChanged = (Event.ExplicitFeedbackListChanged) event;
                State.Content content5 = state instanceof State.Content ? (State.Content) state : null;
                if (content5 == null) {
                    nextM15605a = Next.m15608j();
                } else {
                    ovh0 model2 = content5.getModel();
                    Set set = content5.getModel().f170503b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : set) {
                        if (((com.spotify.home.evopage.structureapi.DismissedEntity) obj).getType() != com.spotify.home.evopage.structureapi.DismissedEntity.Type.EXPLICIT_FEEDBACK) {
                            arrayList.add(obj);
                        }
                    }
                    Set setM43736n1 = g6f.m43736n1(arrayList);
                    Map mapM11787d = AbstractC0784a.m11787d(model2.f170502a);
                    Set<String> entityUris = explicitFeedbackListChanged.getEntityUris();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it3 = entityUris.iterator();
                    while (it3.hasNext()) {
                        k330 k330Var = (k330) mapM11787d.get((String) it3.next());
                        com.spotify.home.evopage.structureapi.DismissedEntity dismissedEntity = (k330Var == null || (k330Var instanceof ru11)) ? null : new com.spotify.home.evopage.structureapi.DismissedEntity(k330Var.getId(), com.spotify.home.evopage.structureapi.DismissedEntity.Type.EXPLICIT_FEEDBACK);
                        if (dismissedEntity != null) {
                            arrayList2.add(dismissedEntity);
                        }
                    }
                    nextM15605a = Next.m15606h(State.Content.copy$default(content5, ovh0.m68131a(model2, null, s601.m77309l0(setM43736n1, arrayList2), null, null, null, 61), false, null, null, null, 30, null));
                }
            } else if (event instanceof Event.ConsumptionStateChanged) {
                Event.ConsumptionStateChanged consumptionStateChanged = (Event.ConsumptionStateChanged) event;
                State.Content content6 = state instanceof State.Content ? (State.Content) state : null;
                if (content6 == null) {
                    nextM15605a = Next.m15608j();
                } else {
                    ovh0 model3 = content6.getModel();
                    Map<String, Boolean> entityUriToWasPlayed = consumptionStateChanged.getEntityUriToWasPlayed();
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry<String, Boolean> entry : entityUriToWasPlayed.entrySet()) {
                        String key = entry.getKey();
                        Boolean value = entry.getValue();
                        value.getClass();
                        k330 k330Var2 = (k330) AbstractC0784a.m11787d(model3.f170502a).get(key);
                        pqm0 pqm0Var = k330Var2 == null ? null : new pqm0(k330Var2.getId(), value);
                        if (pqm0Var != null) {
                            arrayList3.add(pqm0Var);
                        }
                    }
                    Map mapM56705r0 = kkc0.m56705r0(arrayList3);
                    Set setM43734m2 = g6f.m43734m1(model3.f170503b);
                    for (Map.Entry entry2 : mapM56705r0.entrySet()) {
                        String str4 = (String) entry2.getKey();
                        boolean zBooleanValue = ((Boolean) entry2.getValue()).booleanValue();
                        com.spotify.home.evopage.structureapi.DismissedEntity dismissedEntity2 = new com.spotify.home.evopage.structureapi.DismissedEntity(str4, com.spotify.home.evopage.structureapi.DismissedEntity.Type.MARKED_AS_PLAYED);
                        if (zBooleanValue) {
                            setM43734m2.add(dismissedEntity2);
                        } else {
                            setM43734m2.remove(dismissedEntity2);
                        }
                    }
                    nextM15605a = Next.m15606h(State.Content.copy$default(content6, ovh0.m68131a(model3, null, g6f.m43736n1(setM43734m2), null, null, null, 61), false, null, null, null, 30, null));
                }
            } else if (event instanceof Event.DismissSection) {
                Event.DismissSection dismissSection = (Event.DismissSection) event;
                State.Content content7 = state instanceof State.Content ? (State.Content) state : null;
                if (content7 == null) {
                    nextM15605a = Next.m15608j();
                } else {
                    ovh0 model4 = content7.getModel();
                    Set setM43734m3 = g6f.m43734m1(model4.f170503b);
                    setM43734m3.add(dismissSection.getEntity());
                    nextM15605a = Next.m15606h(State.Content.copy$default(content7, ovh0.m68131a(model4, null, g6f.m43736n1(setM43734m3), null, null, null, 61), false, null, null, null, 30, null));
                }
            } else if (event instanceof Event.UndoDismissSection) {
                Event.UndoDismissSection undoDismissSection = (Event.UndoDismissSection) event;
                State.Content content8 = state instanceof State.Content ? (State.Content) state : null;
                if (content8 == null) {
                    nextM15605a = Next.m15608j();
                } else {
                    ovh0 model5 = content8.getModel();
                    if (model5.f170503b.contains(undoDismissSection.getEntity())) {
                        Set setM43734m4 = g6f.m43734m1(model5.f170503b);
                        setM43734m4.remove(undoDismissSection.getEntity());
                        nextM15605a = Next.m15606h(State.Content.copy$default(content8, ovh0.m68131a(model5, null, setM43734m4, null, null, null, 61), false, null, null, null, 30, null));
                    } else {
                        nextM15605a = Next.m15608j();
                    }
                }
            } else if (event instanceof Event.ConnectivityChanged) {
                Event.ConnectivityChanged connectivityChanged = (Event.ConnectivityChanged) event;
                if (state instanceof State.Content) {
                    State.Content content9 = (State.Content) state;
                    if (content9.isOnline() != connectivityChanged.isConnected()) {
                        setM15571a = Effects.m15571a(new Effect.LoadHomeStructure(connectivityChanged.getLoadingStrategy(), null, AbstractC0784a.m11785b(state), 2, null));
                    }
                    nextM15605a = Next.m15607i(State.Content.copy$default(content9, null, connectivityChanged.isConnected(), null, null, null, 29, null), setM15571a);
                } else if ((state instanceof State.Error) && connectivityChanged.isConnected()) {
                    State.Error error2 = (State.Error) state;
                    nextM15605a = Next.m15607i(new State.Loading(error2.getSessionId()), Collections.singleton(new Effect.LoadHomeStructure(connectivityChanged.getLoadingStrategy(), null, error2.getSessionId(), 2, null)));
                } else {
                    nextM15605a = Next.m15608j();
                }
            } else if (event instanceof Event.GotOfflineItems) {
                Event.GotOfflineItems gotOfflineItems = (Event.GotOfflineItems) event;
                if (state instanceof State.Content) {
                    State.Content content10 = (State.Content) state;
                    nextM15605a = Next.m15606h(State.Content.copy$default(content10, ovh0.m68131a(content10.getModel(), null, null, null, gotOfflineItems.getOfflineHomeItems(), null, 47), false, null, null, null, 30, null));
                } else {
                    nextM15605a = Next.m15608j();
                }
            } else if (event instanceof Event.FailedToLoadOfflineItems) {
                nextM15605a = Next.m15606h(new State.Error(((Event.FailedToLoadOfflineItems) event).getError(), null, AbstractC0784a.m11785b(state), 2, null));
            } else if (event instanceof Event.GotHomeFeatureType) {
                Event.GotHomeFeatureType gotHomeFeatureType = (Event.GotHomeFeatureType) event;
                State.Content content11 = state instanceof State.Content ? (State.Content) state : null;
                if (content11 == null || gotHomeFeatureType.getHomeFeatureType() == null) {
                    nextM15605a = Next.m15608j();
                } else {
                    List list3 = content11.getModel().f170502a;
                    if ((gotHomeFeatureType.getHomeFeatureType() instanceof qmb1) || (gotHomeFeatureType.getHomeFeatureType() instanceof qur)) {
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj2 : list3) {
                            k330 k330Var3 = (k330) obj2;
                            if (!(k330Var3 instanceof qmb1) && !(k330Var3 instanceof qur)) {
                                arrayList4.add(obj2);
                            }
                        }
                        list3 = arrayList4;
                    }
                    ArrayList arrayList5 = new ArrayList(list3);
                    try {
                        arrayList5.add(gotHomeFeatureType.getInjectionIndex(), gotHomeFeatureType.getHomeFeatureType());
                    } catch (IndexOutOfBoundsException unused) {
                        arrayList5.add(gotHomeFeatureType.getHomeFeatureType());
                    }
                    nextM15605a = Next.m15606h(State.Content.copy$default((State.Content) state, ovh0.m68131a(content11.getModel(), arrayList5, null, null, null, null, 62), false, null, null, null, 30, null));
                }
            } else if (event instanceof Event.TempDismissedEntitiesChanged) {
                Event.TempDismissedEntitiesChanged tempDismissedEntitiesChanged = (Event.TempDismissedEntitiesChanged) event;
                State.Content content12 = state instanceof State.Content ? (State.Content) state : null;
                nextM15605a = content12 == null ? Next.m15608j() : Next.m15606h(State.Content.copy$default(content12, ovh0.m68131a(content12.getModel(), null, null, tempDismissedEntitiesChanged.getDismissedEntities(), null, null, 59), false, null, null, null, 30, null));
            } else if (event instanceof Event.Foregrounded) {
                nextM15605a = Next.m15607i(state, Effects.m15571a(Effect.CheckForceReload.INSTANCE));
            } else if (event instanceof Event.PageBecameFocused) {
                String strM11784a = AbstractC0784a.m11784a();
                if (state instanceof State.Content) {
                    State.Content content13 = (State.Content) state;
                    objCopy$default2 = State.Content.copy$default(content13, ovh0.m68131a(content13.getModel(), null, null, null, null, strM11784a, 31), false, null, null, null, 30, null);
                } else if (state instanceof State.Loading) {
                    objCopy$default2 = ((State.Loading) state).copy(strM11784a);
                } else {
                    if (!(state instanceof State.Error)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objCopy$default2 = State.Error.copy$default((State.Error) state, null, null, strM11784a, 3, null);
                }
                nextM15605a = Next.m15606h(objCopy$default2);
            } else if (event instanceof Event.ForceReloadChecked) {
                Event.ForceReloadChecked forceReloadChecked = (Event.ForceReloadChecked) event;
                nextM15605a = forceReloadChecked.getShouldReload() ? Next.m15605a(Effects.m15571a(new Effect.LoadHomeStructure(forceReloadChecked.getLoadingStrategy(), null, AbstractC0784a.m11785b(state), 2, null))) : Next.m15608j();
            } else if (event instanceof Event.LoadMore) {
                if (state instanceof State.Content) {
                    State.Content content14 = (State.Content) state;
                    nextM15605a = !wl51.m88460J0(content14.getPageToken()) ? Next.m15605a(Effects.m15571a(new Effect.LoadMoreHomeStructure(content14.getPageToken()))) : Next.m15608j();
                } else {
                    nextM15605a = Next.m15608j();
                }
            } else if (event instanceof Event.FailedToLoadMoreHomeStructure) {
                nextM15605a = Next.m15608j();
            } else if (event instanceof dvw) {
                dvw dvwVar = (dvw) event;
                if (state instanceof State.Content) {
                    State.Content content15 = (State.Content) state;
                    nextM15605a = Next.m15606h(State.Content.copy$default(content15, ovh0.m68131a(content15.getModel(), g6f.m43700N0(dvwVar.f53553a, content15.getModel().f170502a), null, null, null, null, 62), dvwVar.f53554b, dvwVar.f53556d, null, null, 24, null));
                } else {
                    nextM15605a = Next.m15608j();
                }
            } else if (event instanceof Event.Refresh) {
                String strM11784a2 = AbstractC0784a.m11784a();
                boolean z7 = state instanceof State.Content;
                if (z7) {
                    State.Content content16 = (State.Content) state;
                    str = strM11784a2;
                    objCopy$default = State.Content.copy$default(content16, ovh0.m68131a(content16.getModel(), null, null, null, null, strM11784a2, 31), false, null, null, null, 30, null);
                } else {
                    str = strM11784a2;
                    if (state instanceof State.Loading) {
                        objCopy$default = ((State.Loading) state).copy(str);
                    } else {
                        if (!(state instanceof State.Error)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objCopy$default = State.Error.copy$default((State.Error) state, null, null, str, 3, null);
                    }
                }
                if (z7) {
                    refreshToken = ((State.Content) state).getRefreshToken();
                } else if (state instanceof State.Error) {
                    refreshToken = ((State.Error) state).getRefreshToken();
                }
                nextM15605a = Next.m15607i(objCopy$default, Collections.singleton(new Effect.LoadHomeStructure(kaa0Var2, refreshToken, str)));
            } else {
                if (!(event instanceof Event.VideoSettingsChanged)) {
                    throw new NoWhenBranchMatchedException();
                }
                nextM15605a = Next.m15605a(Effects.m15571a(new Effect.LoadHomeStructure(kaa0Var2, null, AbstractC0784a.m11785b(state), 2, null)));
            }
        }
        String strBreadcrumb = event.breadcrumb();
        String strBreadcrumb2 = state.breadcrumb();
        String strBreadcrumb3 = nextM15605a.m15610d() ? ((State) nextM15605a.m15613g()).breadcrumb() : "empty";
        StringBuilder sbM38573v = edb.m38573v("EvoPage :: event: ", strBreadcrumb, ", oldModel: ", strBreadcrumb2, ", newModel: ");
        sbM38573v.append(strBreadcrumb3);
        Logger.m3965a(sbM38573v.toString(), new Object[0]);
        return nextM15605a;
    }
}
