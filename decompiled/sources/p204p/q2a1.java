package p204p;

import androidx.car.app.model.Alert;
import com.spotify.cosmos.util.policy.proto.EpisodeCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeSyncDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy;
import com.spotify.cosmos.util.proto.EpisodeCollectionState;
import com.spotify.cosmos.util.proto.EpisodeMetadata;
import com.spotify.cosmos.util.proto.EpisodePlayState;
import com.spotify.cosmos.util.proto.EpisodeSyncState;
import com.spotify.cosmos.util.proto.Extension;
import com.spotify.cosmos.util.proto.ImageGroup;
import com.spotify.cosmos.util.proto.PlayabilityRestriction;
import com.spotify.cosmos.util.proto.ShowCollectionState;
import com.spotify.cosmos.util.proto.ShowMetadata;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import spotify.collection.esperanto.proto.CollectionEpisode;
import spotify.collection.esperanto.proto.CollectionEpisodeDecorationPolicy;
import spotify.collection.esperanto.proto.CollectionGetUnplayedEpisodesRequest;
import spotify.collection.esperanto.proto.CollectionGetUnplayedEpisodesResponse;
import spotify.collection.esperanto.proto.CollectionShow;
import spotify.collection.esperanto.proto.CollectionShowDecorationPolicy;
import spotify.collection.esperanto.proto.UnplayedEpisodeItem;

/* JADX INFO: loaded from: classes2.dex */
public final class q2a1 {

    /* JADX INFO: renamed from: a */
    public final n5f f184575a;

    /* JADX INFO: renamed from: b */
    public final xpx f184576b;

    public q2a1(n5f n5fVar, xpx xpxVar) {
        this.f184575a = n5fVar;
        this.f184576b = xpxVar;
    }

    /* JADX INFO: renamed from: a */
    public static final nmw0 m71992a(q2a1 q2a1Var, CollectionGetUnplayedEpisodesResponse collectionGetUnplayedEpisodesResponse) {
        xj11 xj11VarM78246a;
        yzv yzvVar;
        b0w b0wVar;
        int i;
        d0w d0wVarM92498c;
        ae50 ae50VarM97515n = collectionGetUnplayedEpisodesResponse.m97515n();
        ArrayList arrayList = new ArrayList();
        for (Iterator it = ae50VarM97515n.iterator(); it.hasNext(); it = it) {
            UnplayedEpisodeItem unplayedEpisodeItem = (UnplayedEpisodeItem) it.next();
            CollectionEpisode collectionEpisodeM97546n = unplayedEpisodeItem.m97546n();
            String strM97547o = unplayedEpisodeItem.m97547o();
            if (strM97547o == null || strM97547o.length() == 0) {
                EpisodeMetadata episodeMetadataM97488q = collectionEpisodeM97546n.m97488q();
                EpisodeSyncState episodeSyncStateM97489r = collectionEpisodeM97546n.m97489r();
                EpisodePlayState episodePlayStateM97490s = collectionEpisodeM97546n.m97490s();
                EpisodeCollectionState episodeCollectionStateM97487p = collectionEpisodeM97546n.m97487p();
                vzk vzkVarM71993b = m71993b(episodeMetadataM97488q.hasCovers() ? episodeMetadataM97488q.getCovers() : null);
                vzk vzkVarM71993b2 = m71993b(episodeMetadataM97488q.hasFreezeFrames() ? episodeMetadataM97488q.getFreezeFrames() : null);
                CollectionShow collectionShowM97491t = collectionEpisodeM97546n.m97491t();
                if (collectionShowM97491t == null || !collectionShowM97491t.m97524s()) {
                    xj11VarM78246a = new sj11().m78246a();
                } else {
                    ShowMetadata showMetadataM97522q = collectionShowM97491t.m97522q();
                    vzk vzkVarM71993b3 = m71993b(showMetadataM97522q.hasCovers() ? showMetadataM97522q.getCovers() : null);
                    sj11 sj11Var = new sj11();
                    sj11Var.m78249d(vzkVarM71993b3);
                    sj11Var.m78270y(collectionShowM97491t.getLink());
                    sj11Var.m78262q(showMetadataM97522q.getName());
                    String publisher = showMetadataM97522q.getPublisher();
                    if (publisher == null) {
                        publisher = "";
                    }
                    sj11Var.m78267v(publisher);
                    ShowCollectionState showCollectionStateM97521p = collectionShowM97491t.m97521p();
                    boolean z = false;
                    if (showCollectionStateM97521p != null && showCollectionStateM97521p.getIsInCollection()) {
                        z = true;
                    }
                    sj11Var.m78253h(z);
                    xj11VarM78246a = sj11Var.m78246a();
                }
                if (episodeMetadataM97488q.hasMediaTypeEnum()) {
                    EpisodeMetadata.MediaType mediaTypeEnum = episodeMetadataM97488q.getMediaTypeEnum();
                    int i2 = mediaTypeEnum == null ? -1 : p2a1.f173312c[mediaTypeEnum.ordinal()];
                    if (i2 == 1) {
                        yzvVar = yzv.f277903a;
                    } else if (i2 != 2) {
                        yzvVar = i2 != 3 ? yzv.f277906d : yzv.f277905c;
                    } else {
                        yzvVar = yzv.f277904b;
                    }
                } else {
                    yzvVar = yzv.f277906d;
                }
                if (episodeMetadataM97488q.hasEpisodeType()) {
                    EpisodeMetadata.EpisodeType episodeType = episodeMetadataM97488q.getEpisodeType();
                    int i3 = episodeType == null ? -1 : p2a1.f173311b[episodeType.ordinal()];
                    if (i3 == 1) {
                        b0wVar = b0w.f22115c;
                    } else if (i3 != 2) {
                        b0wVar = i3 != 3 ? b0w.f22116d : b0w.f22113a;
                    } else {
                        b0wVar = b0w.f22114b;
                    }
                } else {
                    b0wVar = b0w.f22116d;
                }
                xpx xpxVar = q2a1Var.f184576b;
                List<Extension> extensionList = episodeMetadataM97488q.getExtensionList();
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(extensionList, 10));
                Iterator it2 = extensionList.iterator();
                while (it2.hasNext()) {
                    Extension extension = (Extension) it2.next();
                    arrayList2.add(new ptx(extension.getData().m45891s(), extension.getExtensionKind().getNumber()));
                    it2 = it2;
                    episodeMetadataM97488q = episodeMetadataM97488q;
                }
                EpisodeMetadata episodeMetadata = episodeMetadataM97488q;
                upx upxVarM91727a = xpxVar.m91727a(arrayList2);
                xzv xzvVarM96196h = zi5.m96196h();
                xzvVarM96196h.m92492C(xj11VarM78246a);
                xzvVarM96196h.m92499d(vzkVarM71993b);
                xzvVarM96196h.m92494E(b0wVar);
                xzvVarM96196h.m92495F(episodeMetadata.getLink());
                xzvVarM96196h.m92516u(episodeMetadata.getName());
                xzvVarM96196h.m92515t(yzvVar);
                xzvVarM96196h.m92505j(vzkVarM71993b2);
                xzvVarM96196h.m92513r(episodeMetadata.getLength());
                xzvVarM96196h.m92520y(episodeMetadata.getPreviewId());
                xzvVarM96196h.m92502g(episodeMetadata.getIsExplicit());
                xzvVarM96196h.m92507l(episodeMetadata.getIs19PlusOnly());
                xzvVarM96196h.m92508m(episodeMetadata.getIsBookChapter());
                xzvVarM96196h.m92490A((int) episodeMetadata.getPublishDate());
                xzvVarM96196h.m92497b(episodeMetadata.getBackgroundable());
                xzvVarM96196h.m92496a(episodeMetadata.getAvailable());
                String manifestId = episodeMetadata.getManifestId();
                if (manifestId == null) {
                    manifestId = "";
                }
                xzvVarM96196h.m92514s(manifestId);
                String description = episodeMetadata.getDescription();
                if (description == null) {
                    description = "";
                }
                xzvVarM96196h.m92501f(description);
                xzvVarM96196h.m92519x(episodePlayStateM97490s.getIsPlayed());
                xzvVarM96196h.m92491B(episodeCollectionStateM97487p.getIsInListenLater());
                String previewManifestId = episodeMetadata.getPreviewManifestId();
                xzvVarM96196h.m92521z(previewManifestId != null ? previewManifestId : "");
                xzvVarM96196h.m92511p(episodeCollectionStateM97487p.getIsNew());
                xzvVarM96196h.m92504i(episodeCollectionStateM97487p.getIsFollowingShow());
                xzvVarM96196h.m92510o(episodeMetadata.getIsMusicAndTalk());
                xzvVarM96196h.m92509n(episodeMetadata.getIsCurated());
                xzvVarM96196h.m92500e(episodePlayStateM97490s.getIsPlayable());
                PlayabilityRestriction playabilityRestriction = episodePlayStateM97490s.getPlayabilityRestriction();
                int i4 = playabilityRestriction == null ? -1 : p2a1.f173310a[playabilityRestriction.ordinal()];
                if (i4 == 1) {
                    i = 4;
                } else if (i4 == 2) {
                    i = 3;
                } else if (i4 != 3) {
                    i = i4 != 4 ? 1 : 5;
                } else {
                    i = 2;
                }
                xzvVarM96196h.m92518w(i);
                xzvVarM96196h.m92512q(Long.valueOf(episodePlayStateM97490s.getLastPlayedAt()));
                xzvVarM96196h.m92493D((!episodePlayStateM97490s.hasTimeLeft() || episodePlayStateM97490s.getTimeLeft() < 0) ? null : Integer.valueOf(episodePlayStateM97490s.getTimeLeft()));
                xzvVarM96196h.m92517v(y85.m93070o(episodeSyncStateM97489r.getSyncProgress(), episodeSyncStateM97489r.getOfflineState()));
                xzvVarM96196h.m92503h(upxVarM91727a);
                d0wVarM92498c = xzvVarM96196h.m92498c();
            } else {
                xzv xzvVarM96196h2 = zi5.m96196h();
                xzvVarM96196h2.m92506k(strM97547o);
                d0wVarM92498c = xzvVarM96196h2.m92498c();
            }
            arrayList.add(d0wVarM92498c);
        }
        return new nmw0(arrayList, collectionGetUnplayedEpisodesResponse);
    }

    /* JADX INFO: renamed from: b */
    public static vzk m71993b(ImageGroup imageGroup) {
        if (imageGroup == null) {
            return pmf0.m70326l().m68646a();
        }
        ozk ozkVarM70326l = pmf0.m70326l();
        String standardLink = imageGroup.getStandardLink();
        if (standardLink == null) {
            standardLink = "";
        }
        ozkVarM70326l.m68649d(standardLink);
        String smallLink = imageGroup.getSmallLink();
        if (smallLink == null) {
            smallLink = "";
        }
        ozkVarM70326l.m68648c(smallLink);
        String largeLink = imageGroup.getLargeLink();
        if (largeLink == null) {
            largeLink = "";
        }
        ozkVarM70326l.m68647b(largeLink);
        String xlargeLink = imageGroup.getXlargeLink();
        ozkVarM70326l.m68650e(xlargeLink != null ? xlargeLink : "");
        return ozkVarM70326l.m68646a();
    }

    /* JADX INFO: renamed from: c */
    public static CollectionGetUnplayedEpisodesRequest m71994c(n2a1 n2a1Var) {
        a4f a4fVarM97513u = CollectionGetUnplayedEpisodesRequest.m97513u();
        g5u0 g5u0VarM63552f = n2a1Var.m63552f();
        pqm0 pqm0VarM69840u = pft0.m69840u(0, Integer.valueOf(g5u0VarM63552f != null ? g5u0VarM63552f.f76771a : Alert.DURATION_SHOW_INDEFINITELY));
        int iIntValue = ((Number) pqm0VarM69840u.f180350a).intValue();
        int iIntValue2 = ((Number) pqm0VarM69840u.f180351b).intValue();
        a4fVarM97513u.m24698u(iIntValue);
        a4fVarM97513u.m24696s(iIntValue2);
        gs31 gs31VarM63553g = n2a1Var.m63553g();
        if (gs31VarM63553g != null) {
            a4fVarM97513u.m24697t(ms31.m62699b(gs31VarM63553g));
        }
        Integer numM63554h = n2a1Var.m63554h();
        if (numM63554h != null) {
            a4fVarM97513u.m24699v(numM63554h.intValue());
        }
        Boolean boolM63555i = n2a1Var.m63555i();
        if (boolM63555i != null) {
            a4fVarM97513u.m24695r(boolM63555i.booleanValue());
        }
        ArrayList arrayList = new ArrayList();
        Boolean boolM63547a = n2a1Var.m63547a();
        if (boolM63547a != null) {
            arrayList.add("available eq " + boolM63547a.booleanValue());
        }
        Boolean boolM63549c = n2a1Var.m63549c();
        if (boolM63549c != null) {
            arrayList.add("isPlayed eq " + boolM63549c.booleanValue());
        }
        m2a1 m2a1VarM63550d = n2a1Var.m63550d();
        if (m2a1VarM63550d != null) {
            if (!(m2a1VarM63550d instanceof m2a1)) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add("timeLeft gt 0");
        }
        l2a1 l2a1VarM63548b = n2a1Var.m63548b();
        if (l2a1VarM63548b != null) {
            if (!(l2a1VarM63548b instanceof l2a1)) {
                throw new NoWhenBranchMatchedException();
            }
            yzv yzvVar = yzv.f277903a;
            arrayList.add("mediaTypeEnum ne 2");
        }
        if (!arrayList.isEmpty()) {
            a4fVarM97513u.m24694q(g6f.m43753y0(arrayList, ",", null, null, null, 62));
        }
        q3f q3fVarM63551e = n2a1Var.m63551e();
        if (q3fVarM63551e != null) {
            n3f n3fVarM58003a = q3fVarM63551e.m72117a().m58003a();
            Map mapM63609a = n3fVarM58003a.m63609a();
            HashMap mapM77134a = n3fVarM58003a.m63611c().m77134a();
            EpisodeDecorationPolicy.Builder builderNewBuilder = EpisodeDecorationPolicy.newBuilder();
            Object obj = mapM63609a.get("link");
            Boolean bool = Boolean.TRUE;
            EpisodeDecorationPolicy.Builder manifestId = builderNewBuilder.setLink(wj50.m88271j(obj, bool)).setName(wj50.m88271j(mapM63609a.get("name"), bool)).setLength(wj50.m88271j(mapM63609a.get("length"), bool)).setDescription(wj50.m88271j(mapM63609a.get("description"), bool)).setPublishDate(wj50.m88271j(mapM63609a.get("publishDate"), bool)).setCovers(wj50.m88271j(mapM63609a.get("covers"), bool)).setFreezeFrames(wj50.m88271j(mapM63609a.get("freezeFrames"), bool)).setAvailable(wj50.m88271j(mapM63609a.get("available"), bool)).setMediaTypeEnum(wj50.m88271j(mapM63609a.get("mediaTypeEnum"), bool)).setBackgroundable(wj50.m88271j(mapM63609a.get("backgroundable"), bool)).setIsExplicit(wj50.m88271j(mapM63609a.get("isExplicit"), bool)).setIs19PlusOnly(wj50.m88271j(mapM63609a.get("is19PlusOnly"), bool)).setIsBookChapter(wj50.m88271j(mapM63609a.get("isBookChapter"), bool)).setIsMusicAndTalk(wj50.m88271j(mapM63609a.get("isMusicAndTalk"), bool)).setIsCurated(wj50.m88271j(mapM63609a.get("isCurated"), bool)).setManifestId(wj50.m88271j(mapM63609a.get("manifestId"), bool));
            manifestId.addAllExtensionValue(n3fVarM58003a.m63610b());
            i3f i3fVarM97499u = CollectionEpisodeDecorationPolicy.m97499u();
            i3fVarM97499u.m49614q();
            i3fVarM97499u.m49615r((EpisodeDecorationPolicy) manifestId.build());
            i3fVarM97499u.m49613m((EpisodeCollectionDecorationPolicy) EpisodeCollectionDecorationPolicy.newBuilder().setIsFollowingShow(wj50.m88271j(mapM63609a.get("isFollowingShow"), bool)).setIsInListenLater(wj50.m88271j(mapM63609a.get("isInListenLater"), bool)).setIsNew(wj50.m88271j(mapM63609a.get("isNew"), bool)).build());
            i3fVarM97499u.m49619v((EpisodeSyncDecorationPolicy) EpisodeSyncDecorationPolicy.newBuilder().setOffline(wj50.m88271j(mapM63609a.get("offline"), bool)).build());
            i3fVarM97499u.m49617t((EpisodePlayedStateDecorationPolicy) EpisodePlayedStateDecorationPolicy.newBuilder().setTimeLeft(wj50.m88271j(mapM63609a.get("timeLeft"), bool)).setIsPlayed(wj50.m88271j(mapM63609a.get("isPlayed"), bool)).setPlayable(wj50.m88271j(mapM63609a.get("playable"), bool)).setPlayabilityRestriction(wj50.m88271j(mapM63609a.get("playabilityRestriction"), bool)).build());
            u5f u5fVarM97529r = CollectionShowDecorationPolicy.m97529r();
            u5fVarM97529r.m82404s((ShowDecorationPolicy) ShowDecorationPolicy.newBuilder().setLink(wj50.m88271j(mapM77134a.get("link"), bool)).setName(wj50.m88271j(mapM77134a.get("name"), bool)).setCovers(wj50.m88271j(mapM77134a.get("covers"), bool)).build());
            i3fVarM97499u.m49618u((CollectionShowDecorationPolicy) u5fVarM97529r.build());
            a4fVarM97513u.m24693m((CollectionEpisodeDecorationPolicy) i3fVarM97499u.build());
        }
        return (CollectionGetUnplayedEpisodesRequest) a4fVarM97513u.build();
    }
}
