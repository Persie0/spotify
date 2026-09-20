package p204p;

import com.spotify.cosmos.util.libs.proto.PlayabilityRestriction;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata$ProtoEpisodeMetadata;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata$ProtoEpisodeShowMetadata;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState$ProtoEpisodeCollectionState;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState$ProtoEpisodeOfflineState;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState$ProtoEpisodePlayState;
import com.spotify.mobile.android.spotlets.show.proto.Extension;
import com.spotify.mobile.android.spotlets.show.proto.ImageGroup$ProtoImageGroup;
import com.spotify.mobile.android.spotlets.show.proto.ShowDecorateRequest$ProtoDecorateResponse;
import com.spotify.mobile.android.spotlets.show.proto.ShowMetadata$ProtoFormatListAttribute;
import com.spotify.mobile.android.spotlets.show.proto.ShowMetadata$ProtoShowMetadata;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowRequest$ProtoShowRequestItem;
import com.spotify.mobile.android.spotlets.show.proto.ShowState$ProtoShowCollectionState;
import com.spotify.mobile.android.spotlets.show.proto.ShowState$ProtoShowOfflineState;
import com.spotify.mobile.android.spotlets.show.proto.ShowState$ProtoShowPlayState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class fe00 {

    /* JADX INFO: renamed from: a */
    public final xpx f68629a;

    public fe00(xpx xpxVar) {
        this.f68629a = xpxVar;
    }

    /* JADX INFO: renamed from: a */
    public static vzk m41398a(ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup) {
        if (imageGroup$ProtoImageGroup == null) {
            return pmf0.m70326l().m68646a();
        }
        ozk ozkVarM70326l = pmf0.m70326l();
        String standardLink = imageGroup$ProtoImageGroup.getStandardLink();
        if (standardLink == null) {
            standardLink = "";
        }
        ozkVarM70326l.m68649d(standardLink);
        String smallLink = imageGroup$ProtoImageGroup.getSmallLink();
        if (smallLink == null) {
            smallLink = "";
        }
        ozkVarM70326l.m68648c(smallLink);
        String largeLink = imageGroup$ProtoImageGroup.getLargeLink();
        if (largeLink == null) {
            largeLink = "";
        }
        ozkVarM70326l.m68647b(largeLink);
        String xlargeLink = imageGroup$ProtoImageGroup.getXlargeLink();
        ozkVarM70326l.m68650e(xlargeLink != null ? xlargeLink : "");
        return ozkVarM70326l.m68646a();
    }

    /* JADX INFO: renamed from: f */
    public static int m41399f(PlayabilityRestriction playabilityRestriction) {
        int i = ce00.f36984d[playabilityRestriction.ordinal()];
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 1 : 5;
        }
        return 2;
    }

    /* JADX INFO: renamed from: g */
    public static ArrayList m41400g(ae50 ae50Var) {
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50Var, 10));
        Iterator<E> it = ae50Var.iterator();
        while (it.hasNext()) {
            Extension extension = (Extension) it.next();
            arrayList.add(new ptx(extension.getData().m45891s(), extension.m15472n()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final d0w m41401b(EpisodeMetadata$ProtoEpisodeMetadata episodeMetadata$ProtoEpisodeMetadata, EpisodeState$ProtoEpisodeOfflineState episodeState$ProtoEpisodeOfflineState, EpisodeState$ProtoEpisodePlayState episodeState$ProtoEpisodePlayState, EpisodeState$ProtoEpisodeCollectionState episodeState$ProtoEpisodeCollectionState, String str) {
        xj11 xj11VarM78246a;
        yzv yzvVar;
        b0w b0wVar;
        if (str != null && str.length() != 0) {
            xzv xzvVarM96196h = zi5.m96196h();
            xzvVarM96196h.m92506k(str);
            return xzvVarM96196h.m92498c();
        }
        if (episodeMetadata$ProtoEpisodeMetadata == null) {
            return null;
        }
        ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroupM15460n = episodeMetadata$ProtoEpisodeMetadata.m15460n();
        if (!episodeMetadata$ProtoEpisodeMetadata.hasCovers()) {
            imageGroup$ProtoImageGroupM15460n = null;
        }
        vzk vzkVarM41398a = m41398a(imageGroup$ProtoImageGroupM15460n);
        ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroupM15462q = episodeMetadata$ProtoEpisodeMetadata.m15462q();
        if (!episodeMetadata$ProtoEpisodeMetadata.hasFreezeFrames()) {
            imageGroup$ProtoImageGroupM15462q = null;
        }
        vzk vzkVarM41398a2 = m41398a(imageGroup$ProtoImageGroupM15462q);
        EpisodeMetadata$ProtoEpisodeShowMetadata episodeMetadata$ProtoEpisodeShowMetadataM15464s = episodeMetadata$ProtoEpisodeMetadata.m15464s();
        if (!episodeMetadata$ProtoEpisodeMetadata.hasShow()) {
            episodeMetadata$ProtoEpisodeShowMetadataM15464s = null;
        }
        if (episodeMetadata$ProtoEpisodeShowMetadataM15464s == null) {
            xj11VarM78246a = new sj11().m78246a();
        } else {
            ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroupM15466n = episodeMetadata$ProtoEpisodeShowMetadataM15464s.m15466n();
            if (!episodeMetadata$ProtoEpisodeShowMetadataM15464s.hasCovers()) {
                imageGroup$ProtoImageGroupM15466n = null;
            }
            vzk vzkVarM41398a3 = m41398a(imageGroup$ProtoImageGroupM15466n);
            sj11 sj11Var = new sj11();
            sj11Var.m78249d(vzkVarM41398a3);
            sj11Var.m78270y(episodeMetadata$ProtoEpisodeShowMetadataM15464s.getLink());
            sj11Var.m78262q(episodeMetadata$ProtoEpisodeShowMetadataM15464s.getName());
            String publisher = episodeMetadata$ProtoEpisodeShowMetadataM15464s.getPublisher();
            if (publisher == null) {
                publisher = "";
            }
            sj11Var.m78267v(publisher);
            xj11VarM78246a = sj11Var.m78246a();
        }
        e5w e5wVarM15463r = episodeMetadata$ProtoEpisodeMetadata.m15463r();
        if (!episodeMetadata$ProtoEpisodeMetadata.hasMediaTypeEnum()) {
            e5wVarM15463r = null;
        }
        int i = e5wVarM15463r == null ? -1 : ce00.f36983c[e5wVarM15463r.ordinal()];
        if (i == 1) {
            yzvVar = yzv.f277903a;
        } else if (i != 2) {
            yzvVar = i != 3 ? yzv.f277906d : yzv.f277905c;
        } else {
            yzvVar = yzv.f277904b;
        }
        int iOrdinal = episodeMetadata$ProtoEpisodeMetadata.m15461p().ordinal();
        if (iOrdinal == 1) {
            b0wVar = b0w.f22113a;
        } else if (iOrdinal != 2) {
            b0wVar = iOrdinal != 3 ? b0w.f22116d : b0w.f22115c;
        } else {
            b0wVar = b0w.f22114b;
        }
        upx upxVarM91727a = this.f68629a.m91727a(m41400g((ae50) episodeMetadata$ProtoEpisodeMetadata.getExtensionList()));
        xzv xzvVarM96196h2 = zi5.m96196h();
        xzvVarM96196h2.m92492C(xj11VarM78246a);
        xzvVarM96196h2.m92499d(vzkVarM41398a);
        xzvVarM96196h2.m92494E(b0wVar);
        xzvVarM96196h2.m92495F(episodeMetadata$ProtoEpisodeMetadata.getLink());
        xzvVarM96196h2.m92516u(episodeMetadata$ProtoEpisodeMetadata.getName());
        xzvVarM96196h2.m92515t(yzvVar);
        xzvVarM96196h2.m92505j(vzkVarM41398a2);
        xzvVarM96196h2.m92513r(episodeMetadata$ProtoEpisodeMetadata.getLength());
        xzvVarM96196h2.m92520y(episodeMetadata$ProtoEpisodeMetadata.getPreviewId());
        xzvVarM96196h2.m92502g(episodeMetadata$ProtoEpisodeMetadata.getIsExplicit());
        xzvVarM96196h2.m92507l(episodeMetadata$ProtoEpisodeMetadata.getIs19PlusOnly());
        xzvVarM96196h2.m92508m(episodeMetadata$ProtoEpisodeMetadata.getIsBookChapter());
        xzvVarM96196h2.m92490A((int) episodeMetadata$ProtoEpisodeMetadata.getPublishDate());
        xzvVarM96196h2.m92497b(episodeMetadata$ProtoEpisodeMetadata.getBackgroundable());
        xzvVarM96196h2.m92496a(episodeMetadata$ProtoEpisodeMetadata.getAvailable());
        String manifestId = episodeMetadata$ProtoEpisodeMetadata.getManifestId();
        if (manifestId == null) {
            manifestId = "";
        }
        xzvVarM96196h2.m92514s(manifestId);
        String description = episodeMetadata$ProtoEpisodeMetadata.getDescription();
        if (description == null) {
            description = "";
        }
        xzvVarM96196h2.m92501f(description);
        xzvVarM96196h2.m92519x(episodeState$ProtoEpisodePlayState != null && episodeState$ProtoEpisodePlayState.getIsPlayed());
        xzvVarM96196h2.m92491B(episodeState$ProtoEpisodeCollectionState != null && episodeState$ProtoEpisodeCollectionState.getIsInListenLater());
        xzvVarM96196h2.m92509n(episodeMetadata$ProtoEpisodeMetadata.getIsCurated());
        String previewManifestId = episodeMetadata$ProtoEpisodeMetadata.getPreviewManifestId();
        xzvVarM96196h2.m92521z(previewManifestId != null ? previewManifestId : "");
        xzvVarM96196h2.m92511p(episodeState$ProtoEpisodeCollectionState != null && episodeState$ProtoEpisodeCollectionState.getIsNew());
        xzvVarM96196h2.m92504i(episodeState$ProtoEpisodeCollectionState != null && episodeState$ProtoEpisodeCollectionState.getIsFollowingShow());
        xzvVarM96196h2.m92510o(episodeMetadata$ProtoEpisodeMetadata.getIsMusicAndTalk());
        xzvVarM96196h2.m92500e(episodeState$ProtoEpisodePlayState != null && episodeState$ProtoEpisodePlayState.getIsPlayable());
        xzvVarM96196h2.m92518w(episodeState$ProtoEpisodePlayState != null ? m41399f(episodeState$ProtoEpisodePlayState.m15471p()) : 1);
        xzvVarM96196h2.m92512q(episodeState$ProtoEpisodePlayState != null ? Long.valueOf(episodeState$ProtoEpisodePlayState.m15470o()) : null);
        xzvVarM96196h2.m92493D((episodeState$ProtoEpisodePlayState == null || !episodeState$ProtoEpisodePlayState.hasTimeLeft() || episodeState$ProtoEpisodePlayState.getTimeLeft() < 0) ? null : Integer.valueOf(episodeState$ProtoEpisodePlayState.getTimeLeft()));
        xzvVarM96196h2.m92517v(y85.m93070o(episodeState$ProtoEpisodeOfflineState != null ? episodeState$ProtoEpisodeOfflineState.getSyncProgress() : 0, episodeState$ProtoEpisodeOfflineState != null ? episodeState$ProtoEpisodeOfflineState.getOfflineState() : null));
        xzvVarM96196h2.m92503h(upxVarM91727a);
        return xzvVarM96196h2.m92498c();
    }

    /* JADX INFO: renamed from: c */
    public final d0w m41402c(ShowShowRequest$ProtoShowRequestItem showShowRequest$ProtoShowRequestItem) {
        return m41401b(showShowRequest$ProtoShowRequestItem.m15526u() ? showShowRequest$ProtoShowRequestItem.m15521p() : null, showShowRequest$ProtoShowRequestItem.m15527v() ? showShowRequest$ProtoShowRequestItem.m15522q() : null, showShowRequest$ProtoShowRequestItem.m15528w() ? showShowRequest$ProtoShowRequestItem.m15523r() : null, showShowRequest$ProtoShowRequestItem.m15525t() ? showShowRequest$ProtoShowRequestItem.m15520o() : null, showShowRequest$ProtoShowRequestItem.m15529x() ? showShowRequest$ProtoShowRequestItem.m15524s() : null);
    }

    /* JADX INFO: renamed from: d */
    public final xj11 m41403d(ShowMetadata$ProtoShowMetadata showMetadata$ProtoShowMetadata, ShowState$ProtoShowCollectionState showState$ProtoShowCollectionState, ShowState$ProtoShowPlayState showState$ProtoShowPlayState, ShowState$ProtoShowOfflineState showState$ProtoShowOfflineState) {
        uj11 uj11Var;
        wj11 wj11Var;
        vj11 vj11Var;
        String latestPlayedEpisodeLink;
        String resumeEpisodeLink;
        if (showMetadata$ProtoShowMetadata == null) {
            return new sj11().m78246a();
        }
        upx upxVarM91727a = this.f68629a.m91727a(m41400g((ae50) showMetadata$ProtoShowMetadata.getExtensionList()));
        ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroupM15495o = showMetadata$ProtoShowMetadata.m15495o();
        if (!showMetadata$ProtoShowMetadata.hasCovers()) {
            imageGroup$ProtoImageGroupM15495o = null;
        }
        vzk vzkVarM41398a = m41398a(imageGroup$ProtoImageGroupM15495o);
        String consumptionOrder = showMetadata$ProtoShowMetadata.getConsumptionOrder();
        if ("episodic".equalsIgnoreCase(consumptionOrder)) {
            uj11Var = uj11.f230861b;
        } else if ("sequential".equalsIgnoreCase(consumptionOrder)) {
            uj11Var = uj11.f230862c;
        } else {
            uj11Var = "recent".equalsIgnoreCase(consumptionOrder) ? uj11.f230863d : uj11.f230860a;
        }
        Integer numValueOf = Integer.valueOf(showMetadata$ProtoShowMetadata.getMediaTypeEnum());
        if (!showMetadata$ProtoShowMetadata.hasMediaTypeEnum()) {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() == 0) {
            wj11Var = wj11.f251827a;
        } else if (numValueOf != null && numValueOf.intValue() == 1) {
            wj11Var = wj11.f251828b;
        } else {
            wj11Var = (numValueOf != null && numValueOf.intValue() == 2) ? wj11.f251829c : wj11.f251830d;
        }
        sj11 sj11Var = new sj11();
        sj11Var.m78249d(vzkVarM41398a);
        sj11Var.m78270y(showMetadata$ProtoShowMetadata.getLink());
        sj11Var.m78262q(showMetadata$ProtoShowMetadata.getName());
        sj11Var.m78261p(wj11Var);
        sj11Var.m78247b(uj11Var);
        if (showState$ProtoShowPlayState == null) {
            vj11Var = vj11.f241855a;
        } else {
            int i = ce00.f36982b[showState$ProtoShowPlayState.m15546o().ordinal()];
            if (i == 1) {
                vj11Var = vj11.f241856b;
            } else if (i != 2) {
                vj11Var = i != 3 ? vj11.f241855a : vj11.f241858d;
            } else {
                vj11Var = vj11.f241857c;
            }
        }
        sj11Var.m78258m(vj11Var);
        sj11Var.m78250e(showMetadata$ProtoShowMetadata.getDescription());
        sj11Var.m78248c(showMetadata$ProtoShowMetadata.m15494n());
        sj11Var.m78269x(showMetadata$ProtoShowMetadata.getTrailerUri());
        sj11Var.m78259n();
        sj11Var.m78251f(showMetadata$ProtoShowMetadata.getIsExplicit());
        sj11Var.m78253h(showState$ProtoShowCollectionState != null && showState$ProtoShowCollectionState.getIsInCollection());
        if (showState$ProtoShowPlayState == null || (latestPlayedEpisodeLink = showState$ProtoShowPlayState.getLatestPlayedEpisodeLink()) == null) {
            latestPlayedEpisodeLink = "";
        }
        sj11Var.m78260o(latestPlayedEpisodeLink);
        if (showState$ProtoShowPlayState == null || (resumeEpisodeLink = showState$ProtoShowPlayState.getResumeEpisodeLink()) == null) {
            resumeEpisodeLink = "";
        }
        sj11Var.m78268w(resumeEpisodeLink);
        sj11Var.m78265t(showState$ProtoShowPlayState != null ? showState$ProtoShowPlayState.getPlayedPercentage() : 0);
        sj11Var.m78266u(showState$ProtoShowPlayState != null ? showState$ProtoShowPlayState.getPlayedTime() : 0L);
        sj11Var.m78264s(showState$ProtoShowPlayState != null ? m41399f(showState$ProtoShowPlayState.m15547p()) : 1);
        sj11Var.m78263r(y85.m93070o(showState$ProtoShowOfflineState != null ? showState$ProtoShowOfflineState.getSyncProgress() : 0, showState$ProtoShowOfflineState != null ? showState$ProtoShowOfflineState.getOfflineState() : null));
        sj11Var.m78257l(showState$ProtoShowPlayState != null && showState$ProtoShowPlayState.getIsPlayable());
        String publisher = showMetadata$ProtoShowMetadata.getPublisher();
        if (publisher == null) {
            publisher = "";
        }
        sj11Var.m78267v(publisher);
        sj11Var.m78256k(showMetadata$ProtoShowMetadata.getIsMusicAndTalk());
        sj11Var.m78255j(showMetadata$ProtoShowMetadata.getIsBook());
        sj11Var.m78252g(upxVarM91727a);
        List<ShowMetadata$ProtoFormatListAttribute> formatListAttributesList = showMetadata$ProtoShowMetadata.getFormatListAttributesList();
        int iM31820L = c95.m31820L(i6f.m49804T(formatListAttributesList, 10));
        if (iM31820L < 16) {
            iM31820L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
        for (ShowMetadata$ProtoFormatListAttribute showMetadata$ProtoFormatListAttribute : formatListAttributesList) {
            String key = showMetadata$ProtoFormatListAttribute.getKey();
            if (key == null) {
                key = "";
            }
            String value = showMetadata$ProtoFormatListAttribute.getValue();
            if (value == null) {
                value = "";
            }
            pqm0 pqm0VarM69840u = pft0.m69840u(key, value);
            linkedHashMap.put(pqm0VarM69840u.f180350a, pqm0VarM69840u.f180351b);
        }
        sj11Var.m78254i(linkedHashMap);
        return sj11Var.m78246a();
    }

    /* JADX INFO: renamed from: e */
    public final Map m41404e(ShowDecorateRequest$ProtoDecorateResponse showDecorateRequest$ProtoDecorateResponse) {
        if (showDecorateRequest$ProtoDecorateResponse == null) {
            return null;
        }
        return kkc0.m56707t0(btz0.m30491O(a200.f11535Z0, new j691(new wpz(this, 16), new ek5(showDecorateRequest$ProtoDecorateResponse.m15483n(), 1))));
    }
}
