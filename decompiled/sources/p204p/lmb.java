package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.campfire.datasource.impl.ChatFetchException;
import com.spotify.campfire.datasource.impl.ChatsFetchException;
import com.spotify.campfire.datasource.impl.proto.ActivityRequest;
import com.spotify.campfire.datasource.impl.proto.AddActivity;
import com.spotify.campfire.datasource.impl.proto.AddContribution;
import com.spotify.campfire.datasource.impl.proto.AddContributionForGroup;
import com.spotify.campfire.datasource.impl.proto.AddMembers;
import com.spotify.campfire.datasource.impl.proto.AddMembersRequest;
import com.spotify.campfire.datasource.impl.proto.AddMembersResponse;
import com.spotify.campfire.datasource.impl.proto.Asset;
import com.spotify.campfire.datasource.impl.proto.CanMessageUsersRequest;
import com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponse;
import com.spotify.campfire.datasource.impl.proto.ClaimInviteRequest;
import com.spotify.campfire.datasource.impl.proto.ClientNode;
import com.spotify.campfire.datasource.impl.proto.ClientNodeRequest;
import com.spotify.campfire.datasource.impl.proto.ClientNodeResponse;
import com.spotify.campfire.datasource.impl.proto.ContributionMetadata;
import com.spotify.campfire.datasource.impl.proto.ContributionPayload;
import com.spotify.campfire.datasource.impl.proto.CreateGroupOptions;
import com.spotify.campfire.datasource.impl.proto.CreateGroupRequest;
import com.spotify.campfire.datasource.impl.proto.CreateGroupResponse;
import com.spotify.campfire.datasource.impl.proto.CreateInviteRequest;
import com.spotify.campfire.datasource.impl.proto.CreateInviteResponse;
import com.spotify.campfire.datasource.impl.proto.CreateNew;
import com.spotify.campfire.datasource.impl.proto.DeleteContribution;
import com.spotify.campfire.datasource.impl.proto.EmojiReaction;
import com.spotify.campfire.datasource.impl.proto.FreeText;
import com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsRequest;
import com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponse;
import com.spotify.campfire.datasource.impl.proto.GiphyAgeRating;
import com.spotify.campfire.datasource.impl.proto.GiphyGif;
import com.spotify.campfire.datasource.impl.proto.GroupDetail;
import com.spotify.campfire.datasource.impl.proto.Hierarchy;
import com.spotify.campfire.datasource.impl.proto.HierarchyIdentifier;
import com.spotify.campfire.datasource.impl.proto.HierarchyRequest;
import com.spotify.campfire.datasource.impl.proto.HierarchyType;
import com.spotify.campfire.datasource.impl.proto.HierarchyUserParticipationStatus;
import com.spotify.campfire.datasource.impl.proto.InviteLinkOpenRequest;
import com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponse;
import com.spotify.campfire.datasource.impl.proto.InviteOptions;
import com.spotify.campfire.datasource.impl.proto.LatestNodeResponse;
import com.spotify.campfire.datasource.impl.proto.ListeningActivity;
import com.spotify.campfire.datasource.impl.proto.MessagePayload;
import com.spotify.campfire.datasource.impl.proto.MessageRequest;
import com.spotify.campfire.datasource.impl.proto.NodeRequest;
import com.spotify.campfire.datasource.impl.proto.OffplatformOpenRequest;
import com.spotify.campfire.datasource.impl.proto.OffplatformOpenResponse;
import com.spotify.campfire.datasource.impl.proto.PlaylistInvitation;
import com.spotify.campfire.datasource.impl.proto.PlaylistMessage;
import com.spotify.campfire.datasource.impl.proto.PlaylistReaction;
import com.spotify.campfire.datasource.impl.proto.PlaylistReply;
import com.spotify.campfire.datasource.impl.proto.ReceiptType;
import com.spotify.campfire.datasource.impl.proto.RemoveMember;
import com.spotify.campfire.datasource.impl.proto.RemoveMemberRequest;
import com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequest;
import com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeResponse;
import com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequest;
import com.spotify.campfire.datasource.impl.proto.RetrieveNodeResponse;
import com.spotify.campfire.datasource.impl.proto.RichMedia;
import com.spotify.campfire.datasource.impl.proto.SetParticipationStatus;
import com.spotify.campfire.datasource.impl.proto.SharedHierarchies;
import com.spotify.campfire.datasource.impl.proto.SharedHierarchyEntry;
import com.spotify.campfire.datasource.impl.proto.SortOrder;
import com.spotify.campfire.datasource.impl.proto.Sticker;
import com.spotify.campfire.datasource.impl.proto.TrackedShare;
import com.spotify.campfire.datasource.impl.proto.TrackedShareContext;
import com.spotify.campfire.datasource.impl.proto.UGC;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class lmb implements znb {

    /* JADX INFO: renamed from: a */
    public final omb f134842a;

    /* JADX INFO: renamed from: b */
    public final bob f134843b;

    public lmb(omb ombVar, bob bobVar, zfx0 zfx0Var) {
        this.f134842a = ombVar;
        this.f134843b = bobVar;
    }

    /* JADX INFO: renamed from: d */
    public static ContributionPayload.Builder m59320d(dlb dlbVar) {
        ContributionPayload.Builder freeText = ContributionPayload.newBuilder().setFreeText(FreeText.newBuilder().setMessageText(dlbVar.m36353b()));
        if (dlbVar.m36352a() != null) {
            freeText.setMetadata(ContributionMetadata.newBuilder().setMessageEnvelope(dlbVar.m36352a()));
        }
        wj50.m88279p(freeText);
        return freeText;
    }

    /* JADX INFO: renamed from: f */
    public static ContributionPayload.Builder m59321f(String str, String str2, mlb mlbVar, String str3, String str4) {
        TrackedShare.Builder uri = TrackedShare.newBuilder().setUri(str);
        if (str2 != null && !wl51.m88460J0(str2)) {
            uri.setPreviewId(str2);
        }
        if (str4 != null && !wl51.m88460J0(str4)) {
            uri.setShareCardConfigId(str4);
        }
        if (mlbVar != null) {
            if (mlbVar instanceof hlb) {
                hlb hlbVar = (hlb) mlbVar;
                uri.setContext(TrackedShareContext.newBuilder().setListeningActivity(ListeningActivity.newBuilder().setReaction(hlbVar.m47876b()).setListeningUsername(hlbVar.m47875a())));
            } else if (mlbVar instanceof jlb) {
                jlb jlbVar = (jlb) mlbVar;
                String strM53668a = jlbVar.m53668a();
                bga.m29094p(2, 2);
                int length = strM53668a.length();
                ArrayList<String> arrayList = new ArrayList((length / 2) + (length % 2 == 0 ? 0 : 1));
                int i = 0;
                while (i >= 0 && i < length) {
                    int i2 = i + 2;
                    arrayList.add(strM53668a.subSequence(i, (i2 < 0 || i2 > length) ? length : i2).toString());
                    i = i2;
                }
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                for (String str5 : arrayList) {
                    zn91.m96584x(16);
                    arrayList2.add(Byte.valueOf((byte) Integer.parseInt(str5, 16)));
                }
                byte[] bArrM43718e1 = g6f.m43718e1(arrayList2);
                uri.setContext(TrackedShareContext.newBuilder().setPlaylistReaction(PlaylistReaction.newBuilder().setReaction(jlbVar.m53670c()).setPlaylistUri(jlbVar.m53669b()).setItemId(gva.m45886d(0, bArrM43718e1, bArrM43718e1.length))));
            } else if (mlbVar instanceof llb) {
                llb llbVar = (llb) mlbVar;
                String strM59304a = llbVar.m59304a();
                bga.m29094p(2, 2);
                int length2 = strM59304a.length();
                ArrayList<String> arrayList3 = new ArrayList((length2 / 2) + (length2 % 2 == 0 ? 0 : 1));
                int i3 = 0;
                while (i3 >= 0 && i3 < length2) {
                    int i4 = i3 + 2;
                    arrayList3.add(strM59304a.subSequence(i3, (i4 < 0 || i4 > length2) ? length2 : i4).toString());
                    i3 = i4;
                }
                ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList3, 10));
                for (String str6 : arrayList3) {
                    zn91.m96584x(16);
                    arrayList4.add(Byte.valueOf((byte) Integer.parseInt(str6, 16)));
                }
                byte[] bArrM43718e2 = g6f.m43718e1(arrayList4);
                uri.setContext(TrackedShareContext.newBuilder().setPlaylistReply(PlaylistReply.newBuilder().setPlaylistUri(llbVar.m59305b()).setItemId(gva.m45886d(0, bArrM43718e2, bArrM43718e2.length))));
            } else if (mlbVar instanceof klb) {
                uri.setContext(TrackedShareContext.newBuilder().setPlaylistMessage(PlaylistMessage.newBuilder().setPlaylistUri(((klb) mlbVar).m56821a())));
            } else {
                if (!(mlbVar instanceof ilb)) {
                    throw new NoWhenBranchMatchedException();
                }
                uri.setContext(TrackedShareContext.newBuilder().setPlaylistInvitation(PlaylistInvitation.newBuilder().setPlaylistInvitationUri(((ilb) mlbVar).m51007a())));
            }
        }
        ContributionPayload.Builder trackedShare = ContributionPayload.newBuilder().setTrackedShare(uri);
        if (str3 != null) {
            trackedShare.setMetadata(ContributionMetadata.newBuilder().setMessageEnvelope(str3));
        }
        wj50.m88279p(trackedShare);
        return trackedShare;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: A */
    public final Object m59322A(String str, boolean z, ContributionPayload.Builder[] builderArr, ibk ibkVar) {
        imb imbVar;
        lmb lmbVar;
        if (ibkVar instanceof imb) {
            imbVar = (imb) ibkVar;
            int i = imbVar.f103661d;
            if ((i & Integer.MIN_VALUE) != 0) {
                imbVar.f103661d = i - Integer.MIN_VALUE;
            } else {
                imbVar = new imb(this, ibkVar);
            }
        } else {
            imbVar = new imb(this, ibkVar);
        }
        Object objM59325D = imbVar.f103659b;
        int i2 = imbVar.f103661d;
        if (i2 == 0) {
            ArrayList arrayListM93485o = yds.m93485o(objM59325D);
            for (ContributionPayload.Builder builder : builderArr) {
                arrayListM93485o.add(NodeRequest.newBuilder().setMessageRequest(MessageRequest.newBuilder().setAddContribution(AddContribution.newBuilder().setParentNodePathId(str).setPayload(builder))));
            }
            NodeRequest.Builder[] builderArr2 = (NodeRequest.Builder[]) arrayListM93485o.toArray(new NodeRequest.Builder[0]);
            NodeRequest.Builder[] builderArr3 = (NodeRequest.Builder[]) Arrays.copyOf(builderArr2, builderArr2.length);
            boolean z2 = !z;
            imbVar.f103658a = this;
            imbVar.f103661d = 1;
            objM59325D = m59325D(builderArr3, z2, z2, imbVar);
            yuk yukVar = yuk.f276404a;
            if (objM59325D == yukVar) {
                return yukVar;
            }
            lmbVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lmbVar = imbVar.f103658a;
            bga.m29073P(objM59325D);
        }
        rvc rvcVarM30077d = lmbVar.f134843b.m30077d((ClientNodeResponse) objM59325D);
        if (rvcVarM30077d != null) {
            return rvcVarM30077d;
        }
        throw new IllegalStateException("Invalid chat after sending contributions");
    }

    /* JADX INFO: renamed from: B */
    public final Object m59323B(String str, glb[] glbVarArr, boolean z, a3p a3pVar) {
        ContributionPayload.Builder builderM59329e;
        ArrayList arrayList = new ArrayList(glbVarArr.length);
        for (glb glbVar : glbVarArr) {
            if (glbVar instanceof dlb) {
                builderM59329e = m59320d((dlb) glbVar);
            } else if (glbVar instanceof flb) {
                flb flbVar = (flb) glbVar;
                builderM59329e = m59321f(flbVar.m41989b(), flbVar.m41991d(), flbVar.m41988a(), flbVar.m41990c(), flbVar.m41992e());
            } else {
                if (!(glbVar instanceof elb)) {
                    throw new NoWhenBranchMatchedException();
                }
                builderM59329e = m59329e(((elb) glbVar).m39359a());
            }
            arrayList.add(builderM59329e);
        }
        ContributionPayload.Builder[] builderArr = (ContributionPayload.Builder[]) arrayList.toArray(new ContributionPayload.Builder[0]);
        return m59322A(str, z, (ContributionPayload.Builder[]) Arrays.copyOf(builderArr, builderArr.length), a3pVar);
    }

    /* JADX INFO: renamed from: C */
    public final Object m59324C(boolean z, GroupDetail.Builder builder, CreateGroupOptions createGroupOptions, ContributionPayload.Builder[] builderArr, ibk ibkVar) {
        ArrayList arrayList = new ArrayList();
        for (ContributionPayload.Builder builder2 : builderArr) {
            AddContributionForGroup.Builder payload = AddContributionForGroup.newBuilder().setGroupDetail(builder).setPayload(builder2);
            if (createGroupOptions == null) {
                payload.setCreateNewHierarchy(z);
            } else {
                payload.setCreateGroupOptions(createGroupOptions);
            }
            arrayList.add(NodeRequest.newBuilder().setMessageRequest(MessageRequest.newBuilder().setAddContributionForGroup(payload)));
        }
        NodeRequest.Builder[] builderArr2 = (NodeRequest.Builder[]) arrayList.toArray(new NodeRequest.Builder[0]);
        return m59325D((NodeRequest.Builder[]) Arrays.copyOf(builderArr2, builderArr2.length), false, false, ibkVar);
    }

    /* JADX INFO: renamed from: D */
    public final Object m59325D(NodeRequest.Builder[] builderArr, boolean z, boolean z2, ibk ibkVar) {
        ClientNodeRequest.Builder builderNewBuilder = ClientNodeRequest.newBuilder();
        for (NodeRequest.Builder builder : builderArr) {
            builderNewBuilder.addNodeRequest(builder);
        }
        builderNewBuilder.setOmitPubsubEvents(z);
        builderNewBuilder.setOmitLatestNodeUpdates(z2);
        return this.f134842a.m67339r((ClientNodeRequest) builderNewBuilder.build(), ibkVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: E */
    public final Object m59326E(String str, String str2, ibk ibkVar, boolean z) {
        jmb jmbVar;
        lmb lmbVar;
        if (ibkVar instanceof jmb) {
            jmbVar = (jmb) ibkVar;
            int i = jmbVar.f113812d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jmbVar.f113812d = i - Integer.MIN_VALUE;
            } else {
                jmbVar = new jmb(this, ibkVar);
            }
        } else {
            jmbVar = new jmb(this, ibkVar);
        }
        Object objM59325D = jmbVar.f113810b;
        int i2 = jmbVar.f113812d;
        if (i2 == 0) {
            bga.m29073P(objM59325D);
            ActivityRequest.Builder emojiReaction = ActivityRequest.newBuilder().setEmojiReaction(EmojiReaction.newBuilder().setEmojiUtf8(str2));
            jmbVar.f113809a = this;
            jmbVar.f113812d = 1;
            MessageRequest.Builder addActivity = MessageRequest.newBuilder().setAddActivity(AddActivity.newBuilder().setParentNodePathId(str).setRequest(emojiReaction));
            wj50.m88279p(addActivity);
            NodeRequest.Builder messageRequest = NodeRequest.newBuilder().setMessageRequest(addActivity);
            wj50.m88279p(messageRequest);
            boolean z2 = !z;
            objM59325D = m59325D(new NodeRequest.Builder[]{messageRequest}, z2, z2, jmbVar);
            yuk yukVar = yuk.f276404a;
            if (objM59325D == yukVar) {
                return yukVar;
            }
            lmbVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lmbVar = jmbVar.f113809a;
            bga.m29073P(objM59325D);
        }
        pcu0 pcu0VarM30080g = lmbVar.f134843b.m30080g((ClientNode) g6f.m43741q0(((ClientNodeResponse) objM59325D).getClientNodeList()));
        if (pcu0VarM30080g != null) {
            return pcu0VarM30080g;
        }
        throw new IllegalStateException("Invalid reaction");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: F */
    public final Object m59327F(String str, HierarchyUserParticipationStatus hierarchyUserParticipationStatus, ibk ibkVar) {
        kmb kmbVar;
        lmb lmbVar;
        if (ibkVar instanceof kmb) {
            kmbVar = (kmb) ibkVar;
            int i = kmbVar.f124100d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kmbVar.f124100d = i - Integer.MIN_VALUE;
            } else {
                kmbVar = new kmb(this, ibkVar);
            }
        } else {
            kmbVar = new kmb(this, ibkVar);
        }
        Object objM59325D = kmbVar.f124098b;
        int i2 = kmbVar.f124100d;
        if (i2 == 0) {
            bga.m29073P(objM59325D);
            NodeRequest.Builder[] builderArr = {NodeRequest.newBuilder().setHierarchyRequest(HierarchyRequest.newBuilder().setParticipationStatus(SetParticipationStatus.newBuilder().setHierarchyId(str).setUserParticipationStatus(hierarchyUserParticipationStatus)))};
            kmbVar.f124097a = this;
            kmbVar.f124100d = 1;
            objM59325D = m59325D(builderArr, false, false, kmbVar);
            yuk yukVar = yuk.f276404a;
            if (objM59325D == yukVar) {
                return yukVar;
            }
            lmbVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lmbVar = kmbVar.f124097a;
            bga.m29073P(objM59325D);
        }
        rvc rvcVarM30077d = lmbVar.f134843b.m30077d((ClientNodeResponse) objM59325D);
        if (rvcVarM30077d != null) {
            return rvcVarM30077d;
        }
        throw new IllegalStateException("Invalid chat after deleting contribution");
    }

    @Override // p204p.znb
    /* JADX INFO: renamed from: b */
    public final rvc mo30076b(Hierarchy hierarchy, List list, pcu0 pcu0Var) {
        return this.f134843b.mo30076b(hierarchy, list, pcu0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m59328c(String str, ArrayList arrayList, ibk ibkVar) {
        olb olbVar;
        lmb lmbVar;
        agw agwVarM30075c;
        rvc rvcVarM96587a;
        if (ibkVar instanceof olb) {
            olbVar = (olb) ibkVar;
            int i = olbVar.f166809d;
            if ((i & Integer.MIN_VALUE) != 0) {
                olbVar.f166809d = i - Integer.MIN_VALUE;
            } else {
                olbVar = new olb(this, ibkVar);
            }
        } else {
            olbVar = new olb(this, ibkVar);
        }
        Object objM67325d = olbVar.f166807b;
        int i2 = olbVar.f166809d;
        if (i2 == 0) {
            bga.m29073P(objM67325d);
            AddMembersRequest addMembersRequest = (AddMembersRequest) AddMembersRequest.newBuilder().setAddMembers(AddMembers.newBuilder().setHierarchyId(str).addAllMemberUsername(arrayList)).build();
            olbVar.f166806a = this;
            olbVar.f166809d = 1;
            objM67325d = this.f134842a.m67325d(addMembersRequest, olbVar);
            yuk yukVar = yuk.f276404a;
            if (objM67325d == yukVar) {
                return yukVar;
            }
            lmbVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lmbVar = olbVar.f166806a;
            bga.m29073P(objM67325d);
        }
        o2x0 o2x0Var = (o2x0) objM67325d;
        bob bobVar = lmbVar.f134843b;
        bobVar.getClass();
        ev1 ev1Var = net.f153097e;
        n2x0 n2x0Var = o2x0Var.f161171a;
        if (!n2x0Var.f149852O0) {
            return (n2x0Var.f149860d != 403 || (agwVarM30075c = bob.m30075c(o2x0Var)) == null) ? ev1Var : new ev1(agwVarM30075c);
        }
        AddMembersResponse addMembersResponse = (AddMembersResponse) o2x0Var.f161172b;
        return (addMembersResponse == null || (rvcVarM96587a = znb.m96587a(bobVar, addMembersResponse.getHierarchy(), null, null, 3)) == null) ? ev1Var : new fv1(rvcVarM96587a);
    }

    /* JADX INFO: renamed from: e */
    public final ContributionPayload.Builder m59329e(pdj pdjVar) {
        RichMedia.Builder builderNewBuilder = RichMedia.newBuilder();
        wj50.m88279p(builderNewBuilder);
        if (pdjVar instanceof kdj) {
            builderNewBuilder.setGiphyGif(GiphyGif.newBuilder().setGifId(((kdj) pdjVar).getId()).setAgeRating(GiphyAgeRating.GIPHY_RATING_G));
        } else if (pdjVar instanceof xdj) {
            builderNewBuilder.setSticker(Sticker.newBuilder().setStickerId(((xdj) pdjVar).getId()));
        } else {
            if (!(pdjVar instanceof aej)) {
                throw new NoWhenBranchMatchedException();
            }
            UGC.Builder builderNewBuilder2 = UGC.newBuilder();
            for (zdj zdjVar : ((aej) pdjVar).getItems()) {
                int iM38547C = edb.m38547C(zdjVar.m95945c());
                if (iM38547C == 0) {
                    builderNewBuilder2.addImage(Asset.newBuilder().setAssetRef(zdjVar.getId()));
                } else {
                    if (iM38547C != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    builderNewBuilder2.addVideo(Asset.newBuilder().setAssetRef(zdjVar.getId()));
                }
            }
            builderNewBuilder.setUgc(builderNewBuilder2);
        }
        return ContributionPayload.newBuilder().setRichMedia(builderNewBuilder);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Serializable m59330g(List list, ibk ibkVar) {
        plb plbVar;
        List<SharedHierarchyEntry> hierarchiesList;
        Object next;
        HierarchyIdentifier identifier;
        if (ibkVar instanceof plb) {
            plbVar = (plb) ibkVar;
            int i = plbVar.f178688c;
            if ((i & Integer.MIN_VALUE) != 0) {
                plbVar.f178688c = i - Integer.MIN_VALUE;
            } else {
                plbVar = new plb(this, ibkVar);
            }
        } else {
            plbVar = new plb(this, ibkVar);
        }
        Object objM67332k = plbVar.f178686a;
        int i2 = plbVar.f178688c;
        if (i2 == 0) {
            bga.m29073P(objM67332k);
            CanMessageUsersRequest canMessageUsersRequest = (CanMessageUsersRequest) CanMessageUsersRequest.newBuilder().addAllTargetUsernames(list).setSharedHierarchyTypeFilter(HierarchyType.HIERARCHY_TYPE_DM).build();
            plbVar.f178688c = 1;
            objM67332k = this.f134842a.m67332k(canMessageUsersRequest, plbVar);
            yuk yukVar = yuk.f276404a;
            if (objM67332k == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM67332k);
        }
        CanMessageUsersResponse canMessageUsersResponse = (CanMessageUsersResponse) objM67332k;
        Map<String, Boolean> resultsMap = canMessageUsersResponse.getResultsMap();
        ArrayList arrayList = new ArrayList(resultsMap.size());
        for (Map.Entry<String, Boolean> entry : resultsMap.entrySet()) {
            String key = entry.getKey();
            Boolean value = entry.getValue();
            SharedHierarchies sharedHierarchies = canMessageUsersResponse.getSharedHierarchiesMap().get(key);
            String uri = null;
            if (sharedHierarchies != null && (hierarchiesList = sharedHierarchies.getHierarchiesList()) != null) {
                Iterator<T> it = hierarchiesList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((SharedHierarchyEntry) next).getType() != HierarchyType.HIERARCHY_TYPE_DM);
                SharedHierarchyEntry sharedHierarchyEntry = (SharedHierarchyEntry) next;
                if (sharedHierarchyEntry != null && (identifier = sharedHierarchyEntry.getIdentifier()) != null) {
                    uri = identifier.getUri();
                }
            }
            wj50.m88279p(key);
            wj50.m88279p(value);
            arrayList.add(new lob(key, uri, value.booleanValue()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m59331h(int i, String str, ibk ibkVar) {
        qlb qlbVar;
        if (ibkVar instanceof qlb) {
            qlbVar = (qlb) ibkVar;
            int i2 = qlbVar.f189813d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qlbVar.f189813d = i2 - Integer.MIN_VALUE;
            } else {
                qlbVar = new qlb(this, ibkVar);
            }
        } else {
            qlbVar = new qlb(this, ibkVar);
        }
        Object objM59341r = qlbVar.f189811b;
        int i3 = qlbVar.f189813d;
        try {
            if (i3 == 0) {
                bga.m29073P(objM59341r);
                RetrieveNodeRequest.Builder sortOrder = RetrieveNodeRequest.newBuilder().setHierarchyId(str).setSortOrder(SortOrder.SORT_ORDER_DESCENDING_OCCURRED_AT);
                if (i > 0) {
                    sortOrder.setPrevLimit(i);
                }
                wj50.m88279p(sortOrder);
                qlbVar.f189810a = str;
                qlbVar.f189813d = 1;
                objM59341r = m59341r(sortOrder, qlbVar);
                Object obj = yuk.f276404a;
                if (objM59341r == obj) {
                    return obj;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = qlbVar.f189810a;
                bga.m29073P(objM59341r);
            }
            return (rvc) objM59341r;
        } catch (Exception e) {
            Logger.m3967c(e, edb.m38564m("Campfire: RetrieveHierarchy response for chat ", str), new Object[0]);
            throw new ChatFetchException(e, edb.m38564m("Failed to fetch chat ", str));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m59332i(String str, ibk ibkVar) {
        rlb rlbVar;
        if (ibkVar instanceof rlb) {
            rlbVar = (rlb) ibkVar;
            int i = rlbVar.f200264d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rlbVar.f200264d = i - Integer.MIN_VALUE;
            } else {
                rlbVar = new rlb(this, ibkVar);
            }
        } else {
            rlbVar = new rlb(this, ibkVar);
        }
        Object objM59341r = rlbVar.f200262b;
        int i2 = rlbVar.f200264d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM59341r);
                RetrieveNodeRequest.Builder sortOrder = RetrieveNodeRequest.newBuilder().setNodePathId(str).setSortOrder(SortOrder.SORT_ORDER_DESCENDING_OCCURRED_AT);
                rlbVar.f200261a = str;
                rlbVar.f200264d = 1;
                objM59341r = m59341r(sortOrder, rlbVar);
                Object obj = yuk.f276404a;
                if (objM59341r == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = rlbVar.f200261a;
                bga.m29073P(objM59341r);
            }
            return (rvc) objM59341r;
        } catch (Exception e) {
            Logger.m3967c(e, edb.m38564m("Campfire: RetrieveHierarchy response for contribution ", str), new Object[0]);
            throw new ChatFetchException(e, edb.m38564m("Failed to fetch chat for contribution ", str));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m59333j(String str, Integer num, ibk ibkVar) {
        slb slbVar;
        String str2;
        lmb lmbVar;
        n0d n0dVar;
        if (ibkVar instanceof slb) {
            slbVar = (slb) ibkVar;
            int i = slbVar.f210352e;
            if ((i & Integer.MIN_VALUE) != 0) {
                slbVar.f210352e = i - Integer.MIN_VALUE;
            } else {
                slbVar = new slb(this, ibkVar);
            }
        } else {
            slbVar = new slb(this, ibkVar);
        }
        Object objM67340s = slbVar.f210350c;
        int i2 = slbVar.f210352e;
        if (i2 == 0) {
            bga.m29073P(objM67340s);
            RetrieveNodeRequest.Builder sortOrder = RetrieveNodeRequest.newBuilder().setHierarchyId(str).setSortOrder(SortOrder.SORT_ORDER_DESCENDING_OCCURRED_AT);
            if (num != null) {
                sortOrder.setPrevLimit(num.intValue());
            }
            RetrieveNodeRequest retrieveNodeRequest = (RetrieveNodeRequest) sortOrder.build();
            slbVar.f210348a = str;
            slbVar.f210349b = this;
            slbVar.f210352e = 1;
            objM67340s = this.f134842a.m67340s(retrieveNodeRequest, slbVar);
            yuk yukVar = yuk.f276404a;
            if (objM67340s == yukVar) {
                return yukVar;
            }
            str2 = str;
            lmbVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lmbVar = slbVar.f210349b;
            str2 = slbVar.f210348a;
            bga.m29073P(objM67340s);
        }
        RetrieveNodeResponse retrieveNodeResponse = (RetrieveNodeResponse) objM67340s;
        rvc rvcVarM30078e = lmbVar.f134843b.m30078e(retrieveNodeResponse);
        if (rvcVarM30078e == null) {
            n0dVar = null;
        } else {
            List listM76471g = rvcVarM30078e.m76471g();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM76471g) {
                if (((pck) obj).m69592h() instanceof wdj) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((pck) it.next());
            }
            n0dVar = new n0d(rvcVarM30078e.getId(), retrieveNodeResponse.getHierarchy().getHierarchyMetadata().getCurrentUserChannelMuted(), rvcVarM30078e.m76474k(), rvcVarM30078e.m76473j(), rvcVarM30078e.m76472h(), arrayList2);
        }
        if (n0dVar != null) {
            return n0dVar;
        }
        throw new IllegalStateException(("Invalid chat details for chat " + str2).toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m59334k(String str, String str2, ibk ibkVar) {
        tlb tlbVar;
        lmb lmbVar;
        agw agwVarM30075c;
        if (ibkVar instanceof tlb) {
            tlbVar = (tlb) ibkVar;
            int i = tlbVar.f221434d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tlbVar.f221434d = i - Integer.MIN_VALUE;
            } else {
                tlbVar = new tlb(this, ibkVar);
            }
        } else {
            tlbVar = new tlb(this, ibkVar);
        }
        Object objM67328g = tlbVar.f221432b;
        int i2 = tlbVar.f221434d;
        if (i2 == 0) {
            bga.m29073P(objM67328g);
            ClaimInviteRequest claimInviteRequest = (ClaimInviteRequest) ClaimInviteRequest.newBuilder().setUri(str).setPermissionToken(str2).build();
            tlbVar.f221431a = this;
            tlbVar.f221434d = 1;
            objM67328g = this.f134842a.m67328g(claimInviteRequest, tlbVar);
            yuk yukVar = yuk.f276404a;
            if (objM67328g == yukVar) {
                return yukVar;
            }
            lmbVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lmbVar = tlbVar.f221431a;
            bga.m29073P(objM67328g);
        }
        o2x0 o2x0Var = (o2x0) objM67328g;
        lmbVar.f134843b.getClass();
        bn50 bn50Var = hsy.f94853g;
        n2x0 n2x0Var = o2x0Var.f161171a;
        if (n2x0Var.f149852O0) {
            return cn50.f39893a;
        }
        return (n2x0Var.f149860d != 403 || (agwVarM30075c = bob.m30075c(o2x0Var)) == null) ? bn50Var : new bn50(agwVarM30075c);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: l */
    public final Object m59335l(String str, glb[] glbVarArr, ibk ibkVar) {
        ulb ulbVar;
        lmb lmbVar;
        ContributionPayload.Builder builderM59329e;
        if (ibkVar instanceof ulb) {
            ulbVar = (ulb) ibkVar;
            int i = ulbVar.f231501d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ulbVar.f231501d = i - Integer.MIN_VALUE;
            } else {
                ulbVar = new ulb(this, ibkVar);
            }
        } else {
            ulbVar = new ulb(this, ibkVar);
        }
        ulb ulbVar2 = ulbVar;
        Object objM59324C = ulbVar2.f231499b;
        int i2 = ulbVar2.f231501d;
        if (i2 == 0) {
            bga.m29073P(objM59324C);
            GroupDetail.Builder builderAddAllMemberUsername = GroupDetail.newBuilder().addAllMemberUsername(bk5.m29609f0(new String[]{str}));
            ArrayList arrayList = new ArrayList(glbVarArr.length);
            for (glb glbVar : glbVarArr) {
                if (glbVar instanceof dlb) {
                    builderM59329e = m59320d((dlb) glbVar);
                } else if (glbVar instanceof flb) {
                    flb flbVar = (flb) glbVar;
                    builderM59329e = m59321f(flbVar.m41989b(), flbVar.m41991d(), null, null, flbVar.m41992e());
                } else {
                    if (!(glbVar instanceof elb)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    builderM59329e = m59329e(((elb) glbVar).m39359a());
                }
                arrayList.add(builderM59329e);
            }
            ContributionPayload.Builder[] builderArr = (ContributionPayload.Builder[]) arrayList.toArray(new ContributionPayload.Builder[0]);
            ContributionPayload.Builder[] builderArr2 = (ContributionPayload.Builder[]) Arrays.copyOf(builderArr, builderArr.length);
            ulbVar2.f231498a = this;
            ulbVar2.f231501d = 1;
            objM59324C = m59324C(false, builderAddAllMemberUsername, null, builderArr2, ulbVar2);
            yuk yukVar = yuk.f276404a;
            if (objM59324C == yukVar) {
                return yukVar;
            }
            lmbVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lmbVar = ulbVar2.f231498a;
            bga.m29073P(objM59324C);
        }
        rvc rvcVarM30077d = lmbVar.f134843b.m30077d((ClientNodeResponse) objM59324C);
        if (rvcVarM30077d != null) {
            return rvcVarM30077d;
        }
        throw new IllegalStateException("Invalid chat after creating DM");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Object m59336m(String str, ibk ibkVar, boolean z) {
        vlb vlbVar;
        lmb lmbVar;
        if (ibkVar instanceof vlb) {
            vlbVar = (vlb) ibkVar;
            int i = vlbVar.f242418d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vlbVar.f242418d = i - Integer.MIN_VALUE;
            } else {
                vlbVar = new vlb(this, ibkVar);
            }
        } else {
            vlbVar = new vlb(this, ibkVar);
        }
        Object objM59325D = vlbVar.f242416b;
        int i2 = vlbVar.f242418d;
        if (i2 == 0) {
            bga.m29073P(objM59325D);
            CreateNew.Builder builderAddMemberUsername = CreateNew.newBuilder().setHierarchyType(HierarchyType.HIERARCHY_TYPE_DM).addMemberUsername(str);
            if (z) {
                builderAddMemberUsername.setFriendRequest(true);
            }
            NodeRequest.Builder[] builderArr = {NodeRequest.newBuilder().setHierarchyRequest(HierarchyRequest.newBuilder().setCreateNew(builderAddMemberUsername))};
            vlbVar.f242415a = this;
            vlbVar.f242418d = 1;
            objM59325D = m59325D(builderArr, false, false, vlbVar);
            yuk yukVar = yuk.f276404a;
            if (objM59325D == yukVar) {
                return yukVar;
            }
            lmbVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lmbVar = vlbVar.f242415a;
            bga.m29073P(objM59325D);
        }
        rvc rvcVarM30077d = lmbVar.f134843b.m30077d((ClientNodeResponse) objM59325D);
        if (rvcVarM30077d != null) {
            return rvcVarM30077d;
        }
        throw new IllegalStateException("Invalid chat after creating DM");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public final Object m59337n(List list, ibk ibkVar) {
        wlb wlbVar;
        lmb lmbVar;
        if (ibkVar instanceof wlb) {
            wlbVar = (wlb) ibkVar;
            int i = wlbVar.f252504d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wlbVar.f252504d = i - Integer.MIN_VALUE;
            } else {
                wlbVar = new wlb(this, ibkVar);
            }
        } else {
            wlbVar = new wlb(this, ibkVar);
        }
        Object objM67322a = wlbVar.f252502b;
        int i2 = wlbVar.f252504d;
        if (i2 == 0) {
            bga.m29073P(objM67322a);
            CreateGroupRequest createGroupRequest = (CreateGroupRequest) CreateGroupRequest.newBuilder().addAllMemberUsername(list).build();
            wlbVar.f252501a = this;
            wlbVar.f252504d = 1;
            objM67322a = this.f134842a.m67322a(createGroupRequest, wlbVar);
            yuk yukVar = yuk.f276404a;
            if (objM67322a == yukVar) {
                return yukVar;
            }
            lmbVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lmbVar = wlbVar.f252501a;
            bga.m29073P(objM67322a);
        }
        rvc rvcVarM96587a = znb.m96587a(lmbVar, ((CreateGroupResponse) objM67322a).getHierarchy(), lau.f131415a, null, 2);
        if (rvcVarM96587a != null) {
            return rvcVarM96587a;
        }
        throw new IllegalStateException("Invalid chat after creating group chat");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: o */
    public final Object m59338o(List list, String str, String str2, String str3, glb[] glbVarArr, ibk ibkVar) {
        xlb xlbVar;
        lmb lmbVar;
        ContributionPayload.Builder builderM59329e;
        if (ibkVar instanceof xlb) {
            xlbVar = (xlb) ibkVar;
            int i = xlbVar.f263088d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xlbVar.f263088d = i - Integer.MIN_VALUE;
            } else {
                xlbVar = new xlb(this, ibkVar);
            }
        } else {
            xlbVar = new xlb(this, ibkVar);
        }
        xlb xlbVar2 = xlbVar;
        Object objM59324C = xlbVar2.f263086b;
        int i2 = xlbVar2.f263088d;
        if (i2 == 0) {
            bga.m29073P(objM59324C);
            String[] strArr = (String[]) list.toArray(new String[0]);
            GroupDetail.Builder builderAddAllMemberUsername = GroupDetail.newBuilder().addAllMemberUsername(bk5.m29609f0((String[]) Arrays.copyOf(strArr, strArr.length)));
            if (str != null && !wl51.m88460J0(str)) {
                builderAddAllMemberUsername.setName(str);
            }
            CreateGroupOptions createGroupOptions = (str2 == null || str3 == null) ? null : (CreateGroupOptions) CreateGroupOptions.newBuilder().setHierarchyId(str2).setRequestToken(str3).build();
            ArrayList arrayList = new ArrayList(glbVarArr.length);
            for (glb glbVar : glbVarArr) {
                if (glbVar instanceof dlb) {
                    builderM59329e = m59320d((dlb) glbVar);
                } else if (glbVar instanceof flb) {
                    flb flbVar = (flb) glbVar;
                    builderM59329e = m59321f(flbVar.m41989b(), flbVar.m41991d(), null, null, flbVar.m41992e());
                } else {
                    if (!(glbVar instanceof elb)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    builderM59329e = m59329e(((elb) glbVar).m39359a());
                }
                arrayList.add(builderM59329e);
            }
            ContributionPayload.Builder[] builderArr = (ContributionPayload.Builder[]) arrayList.toArray(new ContributionPayload.Builder[0]);
            ContributionPayload.Builder[] builderArr2 = (ContributionPayload.Builder[]) Arrays.copyOf(builderArr, builderArr.length);
            xlbVar2.f263085a = this;
            xlbVar2.f263088d = 1;
            objM59324C = m59324C(true, builderAddAllMemberUsername, createGroupOptions, builderArr2, xlbVar2);
            yuk yukVar = yuk.f276404a;
            if (objM59324C == yukVar) {
                return yukVar;
            }
            lmbVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lmbVar = xlbVar2.f263085a;
            bga.m29073P(objM59324C);
        }
        rvc rvcVarM30077d = lmbVar.f134843b.m30077d((ClientNodeResponse) objM59324C);
        if (rvcVarM30077d != null) {
            return rvcVarM30077d;
        }
        throw new IllegalStateException("Invalid chat after creating group chat");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public final Object m59339p(int i, String str, ibk ibkVar) {
        ylb ylbVar;
        if (ibkVar instanceof ylb) {
            ylbVar = (ylb) ibkVar;
            int i2 = ylbVar.f273972c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ylbVar.f273972c = i2 - Integer.MIN_VALUE;
            } else {
                ylbVar = new ylb(this, ibkVar);
            }
        } else {
            ylbVar = new ylb(this, ibkVar);
        }
        Object objM67334m = ylbVar.f273970a;
        int i3 = ylbVar.f273972c;
        if (i3 == 0) {
            bga.m29073P(objM67334m);
            CreateInviteRequest createInviteRequest = (CreateInviteRequest) CreateInviteRequest.newBuilder().setUri(str).setOptions((InviteOptions) InviteOptions.newBuilder().setMaxUsageCount(i).build()).build();
            ylbVar.f273972c = 1;
            objM67334m = this.f134842a.m67334m(createInviteRequest, ylbVar);
            yuk yukVar = yuk.f276404a;
            if (objM67334m == yukVar) {
                return yukVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM67334m);
        }
        return ((CreateInviteResponse) objM67334m).getPermissionToken();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: q */
    public final Object m59340q(String str, ibk ibkVar, boolean z) {
        zlb zlbVar;
        lmb lmbVar;
        if (ibkVar instanceof zlb) {
            zlbVar = (zlb) ibkVar;
            int i = zlbVar.f283970d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zlbVar.f283970d = i - Integer.MIN_VALUE;
            } else {
                zlbVar = new zlb(this, ibkVar);
            }
        } else {
            zlbVar = new zlb(this, ibkVar);
        }
        Object objM59325D = zlbVar.f283968b;
        int i2 = zlbVar.f283970d;
        if (i2 == 0) {
            bga.m29073P(objM59325D);
            NodeRequest.Builder[] builderArr = {NodeRequest.newBuilder().setMessageRequest(MessageRequest.newBuilder().setDeleteContribution(DeleteContribution.newBuilder().setNodePathId(str).setDeleteForAll(!z)))};
            zlbVar.f283967a = this;
            zlbVar.f283970d = 1;
            objM59325D = m59325D(builderArr, false, false, zlbVar);
            yuk yukVar = yuk.f276404a;
            if (objM59325D == yukVar) {
                return yukVar;
            }
            lmbVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lmbVar = zlbVar.f283967a;
            bga.m29073P(objM59325D);
        }
        rvc rvcVarM30077d = lmbVar.f134843b.m30077d((ClientNodeResponse) objM59325D);
        if (rvcVarM30077d != null) {
            return rvcVarM30077d;
        }
        throw new IllegalStateException("Invalid chat after deleting contribution");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public final Object m59341r(RetrieveNodeRequest.Builder builder, ibk ibkVar) {
        amb ambVar;
        lmb lmbVar;
        if (ibkVar instanceof amb) {
            ambVar = (amb) ibkVar;
            int i = ambVar.f17080d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ambVar.f17080d = i - Integer.MIN_VALUE;
            } else {
                ambVar = new amb(this, ibkVar);
            }
        } else {
            ambVar = new amb(this, ibkVar);
        }
        Object objM67336o = ambVar.f17078b;
        int i2 = ambVar.f17080d;
        if (i2 == 0) {
            bga.m29073P(objM67336o);
            RetrieveNodeRequest retrieveNodeRequest = (RetrieveNodeRequest) builder.build();
            ambVar.f17077a = this;
            ambVar.f17080d = 1;
            objM67336o = this.f134842a.m67336o(retrieveNodeRequest, ambVar);
            yuk yukVar = yuk.f276404a;
            if (objM67336o == yukVar) {
                return yukVar;
            }
            lmbVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lmbVar = ambVar.f17077a;
            bga.m29073P(objM67336o);
        }
        rvc rvcVarM30078e = lmbVar.f134843b.m30078e((RetrieveNodeResponse) objM67336o);
        if (rvcVarM30078e != null) {
            return rvcVarM30078e;
        }
        throw new IllegalStateException("Invalid chat after deleting contribution");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: s */
    public final Object m59342s(String str, int i, String str2, List list, gvd gvdVar, ibk ibkVar) {
        bmb bmbVar;
        SortOrder sortOrder;
        if (ibkVar instanceof bmb) {
            bmbVar = (bmb) ibkVar;
            int i2 = bmbVar.f28489c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bmbVar.f28489c = i2 - Integer.MIN_VALUE;
            } else {
                bmbVar = new bmb(this, ibkVar);
            }
        } else {
            bmbVar = new bmb(this, ibkVar);
        }
        Object objM67340s = bmbVar.f28487a;
        int i3 = bmbVar.f28489c;
        if (i3 == 0) {
            bga.m29073P(objM67340s);
            RetrieveNodeRequest.Builder pageSize = RetrieveNodeRequest.newBuilder().setHierarchyId(str).setPageSize(i);
            int iOrdinal = gvdVar.ordinal();
            if (iOrdinal == 0) {
                sortOrder = SortOrder.SORT_ORDER_DESCENDING_OCCURRED_AT;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                sortOrder = SortOrder.SORT_ORDER_ASCENDING_OCCURRED_AT;
            }
            RetrieveNodeRequest.Builder sortOrder2 = pageSize.setSortOrder(sortOrder);
            if (str2 != null) {
                sortOrder2.setPageToken(str2);
            }
            sortOrder2.setFilter(RetrieveNodeRequest.Filter.newBuilder().addAllUriKinds(list));
            RetrieveNodeRequest retrieveNodeRequest = (RetrieveNodeRequest) sortOrder2.build();
            wj50.m88279p(retrieveNodeRequest);
            bmbVar.f28489c = 1;
            objM67340s = this.f134842a.m67340s(retrieveNodeRequest, bmbVar);
            yuk yukVar = yuk.f276404a;
            if (objM67340s == yukVar) {
                return yukVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM67340s);
        }
        RetrieveNodeResponse retrieveNodeResponse = (RetrieveNodeResponse) objM67340s;
        List listM30081h = this.f134843b.m30081h(retrieveNodeResponse);
        String nextPageToken = retrieveNodeResponse.getNextPageToken();
        wj50.m88279p(nextPageToken);
        if (wl51.m88460J0(nextPageToken)) {
            nextPageToken = null;
        }
        return new avd(listM30081h, nextPageToken);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: t */
    public final Serializable m59343t(String str, ibk ibkVar) {
        cmb cmbVar;
        lzu0 lzu0Var;
        if (ibkVar instanceof cmb) {
            cmbVar = (cmb) ibkVar;
            int i = cmbVar.f39637c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cmbVar.f39637c = i - Integer.MIN_VALUE;
            } else {
                cmbVar = new cmb(this, ibkVar);
            }
        } else {
            cmbVar = new cmb(this, ibkVar);
        }
        Object objM67337p = cmbVar.f39635a;
        int i2 = cmbVar.f39637c;
        if (i2 == 0) {
            bga.m29073P(objM67337p);
            GetHierarchySettingsRequest getHierarchySettingsRequest = (GetHierarchySettingsRequest) GetHierarchySettingsRequest.newBuilder().setHierarchyId(str).build();
            cmbVar.f39637c = 1;
            objM67337p = this.f134842a.m67337p(getHierarchySettingsRequest, cmbVar);
            yuk yukVar = yuk.f276404a;
            if (objM67337p == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM67337p);
        }
        List<ReceiptType> disabledReceiptTypesList = ((GetHierarchySettingsResponse) objM67337p).getDisabledReceiptTypesList();
        ArrayList arrayList = new ArrayList();
        for (ReceiptType receiptType : disabledReceiptTypesList) {
            int i3 = receiptType == null ? -1 : nlb.f155036a[receiptType.ordinal()];
            if (i3 == 1) {
                lzu0Var = lzu0.f138454a;
            } else if (i3 != 2) {
                lzu0Var = i3 != 3 ? null : lzu0.f138456c;
            } else {
                lzu0Var = lzu0.f138455b;
            }
            if (lzu0Var != null) {
                arrayList.add(lzu0Var);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: u */
    public final Object m59344u(String str, ibk ibkVar) {
        dmb dmbVar;
        lmb lmbVar;
        agw agwVarM30075c;
        if (ibkVar instanceof dmb) {
            dmbVar = (dmb) ibkVar;
            int i = dmbVar.f50484d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dmbVar.f50484d = i - Integer.MIN_VALUE;
            } else {
                dmbVar = new dmb(this, ibkVar);
            }
        } else {
            dmbVar = new dmb(this, ibkVar);
        }
        Object objM67338q = dmbVar.f50482b;
        int i2 = dmbVar.f50484d;
        if (i2 == 0) {
            bga.m29073P(objM67338q);
            InviteLinkOpenRequest inviteLinkOpenRequest = (InviteLinkOpenRequest) InviteLinkOpenRequest.newBuilder().setShareId(str).build();
            dmbVar.f50481a = this;
            dmbVar.f50484d = 1;
            objM67338q = this.f134842a.m67338q(inviteLinkOpenRequest, dmbVar);
            yuk yukVar = yuk.f276404a;
            if (objM67338q == yukVar) {
                return yukVar;
            }
            lmbVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lmbVar = dmbVar.f50481a;
            bga.m29073P(objM67338q);
        }
        o2x0 o2x0Var = (o2x0) objM67338q;
        lmbVar.f134843b.getClass();
        n2x0 n2x0Var = o2x0Var.f161171a;
        if (n2x0Var.f149852O0) {
            InviteLinkOpenResponse inviteLinkOpenResponse = (InviteLinkOpenResponse) o2x0Var.f161172b;
            if (inviteLinkOpenResponse != null && inviteLinkOpenResponse.hasRedirect()) {
                return new in50(new gn50(inviteLinkOpenResponse.getRedirect().getHierarchyId(), inviteLinkOpenResponse.getRedirect().getNodePathId()));
            }
        } else if (n2x0Var.f149860d == 403 && (agwVarM30075c = bob.m30075c(o2x0Var)) != null) {
            return new in50(new fn50(agwVarM30075c));
        }
        return in50.f103869b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: v */
    public final Object m59345v(String str, ibk ibkVar) {
        emb embVar;
        if (ibkVar instanceof emb) {
            embVar = (emb) ibkVar;
            int i = embVar.f60865c;
            if ((i & Integer.MIN_VALUE) != 0) {
                embVar.f60865c = i - Integer.MIN_VALUE;
            } else {
                embVar = new emb(this, ibkVar);
            }
        } else {
            embVar = new emb(this, ibkVar);
        }
        Object objM67337p = embVar.f60863a;
        int i2 = embVar.f60865c;
        if (i2 == 0) {
            bga.m29073P(objM67337p);
            GetHierarchySettingsRequest getHierarchySettingsRequest = (GetHierarchySettingsRequest) GetHierarchySettingsRequest.newBuilder().setHierarchyId(str).build();
            embVar.f60865c = 1;
            objM67337p = this.f134842a.m67337p(getHierarchySettingsRequest, embVar);
            yuk yukVar = yuk.f276404a;
            if (objM67337p == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM67337p);
        }
        return qyg1.m74178H(((GetHierarchySettingsResponse) objM67337p).getMutedForCurrentUser());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: w */
    public final Object m59346w(ibk ibkVar) {
        fmb fmbVar;
        lmb lmbVar;
        rvc rvcVarM96587a;
        if (ibkVar instanceof fmb) {
            fmbVar = (fmb) ibkVar;
            int i = fmbVar.f71006d;
            if ((i & Integer.MIN_VALUE) != 0) {
                fmbVar.f71006d = i - Integer.MIN_VALUE;
            } else {
                fmbVar = new fmb(this, ibkVar);
            }
        } else {
            fmbVar = new fmb(this, ibkVar);
        }
        Object objM67343v = fmbVar.f71004b;
        int i2 = fmbVar.f71006d;
        if (i2 == 0) {
            bga.m29073P(objM67343v);
            RetrieveLatestNodeRequest retrieveLatestNodeRequest = (RetrieveLatestNodeRequest) RetrieveLatestNodeRequest.newBuilder().setSortOrder(SortOrder.SORT_ORDER_DESCENDING_OCCURRED_AT).build();
            fmbVar.f71003a = this;
            fmbVar.f71006d = 1;
            objM67343v = this.f134842a.m67343v(retrieveLatestNodeRequest, fmbVar);
            yuk yukVar = yuk.f276404a;
            if (objM67343v == yukVar) {
                return yukVar;
            }
            lmbVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lmbVar = fmbVar.f71003a;
            bga.m29073P(objM67343v);
        }
        o2x0 o2x0Var = (o2x0) objM67343v;
        bob bobVar = lmbVar.f134843b;
        bobVar.getClass();
        n2x0 n2x0Var = o2x0Var.f161171a;
        if (n2x0Var.f149852O0) {
            RetrieveLatestNodeResponse retrieveLatestNodeResponse = (RetrieveLatestNodeResponse) o2x0Var.f161172b;
            if (retrieveLatestNodeResponse != null) {
                List<LatestNodeResponse> latestNodeResponseList = retrieveLatestNodeResponse.getLatestNodeResponseList();
                ArrayList arrayList = new ArrayList();
                for (LatestNodeResponse latestNodeResponse : latestNodeResponseList) {
                    wj50.m88279p(latestNodeResponse);
                    if (latestNodeResponse.hasClientNode()) {
                        MessagePayload.CmpCase cmpCase = latestNodeResponse.getClientNode().getMessagePayload().getCmpCase();
                        rvcVarM96587a = (cmpCase == null ? -1 : aob.f17628a[cmpCase.ordinal()]) == 1 ? znb.m96587a(bobVar, latestNodeResponse.getHierarchy(), null, bobVar.m30080g(latestNodeResponse.getClientNode()), 1) : znb.m96587a(bobVar, latestNodeResponse.getHierarchy(), h6f.m46716M(bobVar.m30079f(latestNodeResponse.getClientNode(), latestNodeResponse.getHierarchy().getHierarchyIdentifier().getHierarchyId())), null, 2);
                    } else {
                        rvcVarM96587a = znb.m96587a(bobVar, latestNodeResponse.getHierarchy(), null, null, 3);
                    }
                    if (rvcVarM96587a != null) {
                        arrayList.add(rvcVarM96587a);
                    }
                }
                return arrayList;
            }
        } else {
            int i3 = n2x0Var.f149860d;
            if (!(400 <= i3 && i3 < 500)) {
                throw new ChatsFetchException(s571.m77246e(i3, "Failed to fetch chats. Error code: "));
            }
            if (i3 == 403 && wj50.m88271j(bob.m30075c(o2x0Var), tfw.f220061a)) {
                throw new ChatsFetchException("Failed to fetch chats. User opted out.");
            }
        }
        return lau.f131415a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: x */
    public final Serializable m59347x(int i, String str, String str2, ibk ibkVar) {
        gmb gmbVar;
        lmb lmbVar;
        if (ibkVar instanceof gmb) {
            gmbVar = (gmb) ibkVar;
            int i2 = gmbVar.f81356e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gmbVar.f81356e = i2 - Integer.MIN_VALUE;
            } else {
                gmbVar = new gmb(this, ibkVar);
            }
        } else {
            gmbVar = new gmb(this, ibkVar);
        }
        Object objM67340s = gmbVar.f81354c;
        int i3 = gmbVar.f81356e;
        if (i3 == 0) {
            bga.m29073P(objM67340s);
            RetrieveNodeRequest retrieveNodeRequest = (RetrieveNodeRequest) RetrieveNodeRequest.newBuilder().setHierarchyId(str).setNodePathId(str2).setSortOrder(SortOrder.SORT_ORDER_DESCENDING_OCCURRED_AT).setPrevLimit(i).build();
            wj50.m88279p(retrieveNodeRequest);
            gmbVar.f81352a = str2;
            gmbVar.f81353b = this;
            gmbVar.f81356e = 1;
            objM67340s = this.f134842a.m67340s(retrieveNodeRequest, gmbVar);
            yuk yukVar = yuk.f276404a;
            if (objM67340s == yukVar) {
                return yukVar;
            }
            lmbVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lmbVar = gmbVar.f81353b;
            str2 = gmbVar.f81352a;
            bga.m29073P(objM67340s);
        }
        List listM30081h = lmbVar.f134843b.m30081h((RetrieveNodeResponse) objM67340s);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM30081h) {
            if (!wj50.m88271j(((pck) obj).getId(), str2)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: y */
    public final Object m59348y(String str, ibk ibkVar) {
        hmb hmbVar;
        lmb lmbVar;
        agw agwVarM30075c;
        if (ibkVar instanceof hmb) {
            hmbVar = (hmb) ibkVar;
            int i = hmbVar.f92881d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hmbVar.f92881d = i - Integer.MIN_VALUE;
            } else {
                hmbVar = new hmb(this, ibkVar);
            }
        } else {
            hmbVar = new hmb(this, ibkVar);
        }
        Object objM67335n = hmbVar.f92879b;
        int i2 = hmbVar.f92881d;
        if (i2 == 0) {
            bga.m29073P(objM67335n);
            OffplatformOpenRequest offplatformOpenRequest = (OffplatformOpenRequest) OffplatformOpenRequest.newBuilder().setOffplatformShareId(str).build();
            hmbVar.f92878a = this;
            hmbVar.f92881d = 1;
            objM67335n = this.f134842a.m67335n(offplatformOpenRequest, hmbVar);
            yuk yukVar = yuk.f276404a;
            if (objM67335n == yukVar) {
                return yukVar;
            }
            lmbVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lmbVar = hmbVar.f92878a;
            bga.m29073P(objM67335n);
        }
        o2x0 o2x0Var = (o2x0) objM67335n;
        lmbVar.f134843b.getClass();
        n2x0 n2x0Var = o2x0Var.f161171a;
        if (n2x0Var.f149852O0) {
            OffplatformOpenResponse offplatformOpenResponse = (OffplatformOpenResponse) o2x0Var.f161172b;
            if (offplatformOpenResponse != null) {
                return new btk0(new zsk0(offplatformOpenResponse.getHierarchyId(), offplatformOpenResponse.getRedirectToChat(), offplatformOpenResponse.getNodePathId(), offplatformOpenResponse.getHierarchyExisted()));
            }
        } else if (n2x0Var.f149860d == 403 && (agwVarM30075c = bob.m30075c(o2x0Var)) != null) {
            return new btk0(new ysk0(agwVarM30075c));
        }
        return btk0.f30888b;
    }

    /* JADX INFO: renamed from: z */
    public final Object m59349z(String str, String str2, ibk ibkVar) {
        Object objM67324c = this.f134842a.m67324c((RemoveMemberRequest) RemoveMemberRequest.newBuilder().setRemoveMember(RemoveMember.newBuilder().setHierarchyId(str).setMemberUsername(str2)).build(), ibkVar);
        return objM67324c == yuk.f276404a ? objM67324c : w2a1.f247311a;
    }
}
