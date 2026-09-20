package p204p;

import com.google.protobuf.Timestamp;
import com.spotify.base.java.logging.Logger;
import com.spotify.listeningactivity.p097v1.AudienceRequest;
import com.spotify.listeningactivity.p097v1.AudienceResponse;
import com.spotify.listeningactivity.p097v1.AudienceUser;
import com.spotify.listeningactivity.p097v1.AudienceUserRequest;
import com.spotify.listeningactivity.p097v1.AudienceUserResponse;
import com.spotify.listeningactivity.p097v1.AudienceUsersRequest;
import com.spotify.listeningactivity.p097v1.AudienceUsersResponse;
import com.spotify.listeningactivity.p097v1.C0833c;
import com.spotify.listeningactivity.p097v1.C0834d;
import com.spotify.listeningactivity.p097v1.FeedActivity;
import com.spotify.listeningactivity.p097v1.FeedEntityWrapper;
import com.spotify.listeningactivity.p097v1.GetFeedRequest;
import com.spotify.listeningactivity.p097v1.GetFeedResponse;
import com.spotify.listeningactivity.p097v1.GetMyActivityRequest;
import com.spotify.listeningactivity.p097v1.GetMyActivityResponse;
import com.spotify.listeningactivity.p097v1.GetUserHiddenStateRequest;
import com.spotify.listeningactivity.p097v1.GetUserHiddenStateResponse;
import com.spotify.listeningactivity.p097v1.GroupMember;
import com.spotify.listeningactivity.p097v1.HideUserActivityRequest;
import com.spotify.listeningactivity.p097v1.RestrictAudienceUserRequest;
import com.spotify.listeningactivity.p097v1.UserActivity;
import com.spotify.listeningactivity.p097v1.UserSubscription;
import com.spotify.listeningactivity.p097v1.UsersActivityRequest;
import com.spotify.listeningactivity.p097v1.UsersActivityResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes7.dex */
public final class gc90 implements ob90 {

    /* JADX INFO: renamed from: a */
    public final g5t0 f78515a;

    /* JADX INFO: renamed from: b */
    public final wc90 f78516b;

    /* JADX INFO: renamed from: c */
    public final i4t0 f78517c;

    /* JADX INFO: renamed from: d */
    public final fk60 f78518d;

    /* JADX INFO: renamed from: e */
    public final c9k f78519e;

    /* JADX INFO: renamed from: f */
    public final ConcurrentHashMap f78520f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: g */
    public final hb11 f78521g = j0g1.m52092t(0, 1, 0, 5);

    public gc90(g5t0 g5t0Var, wc90 wc90Var, ron ronVar, luk lukVar, fk60 fk60Var) {
        this.f78515a = g5t0Var;
        this.f78516b = wc90Var;
        this.f78517c = ronVar;
        this.f78518d = fk60Var;
        this.f78519e = AbstractC0000a.m16o(lukVar);
    }

    /* JADX INFO: renamed from: a */
    public static final ArrayList m44295a(gc90 gc90Var, ae50 ae50Var) {
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50Var, 10));
        Iterator<E> it = ae50Var.iterator();
        while (it.hasNext()) {
            UserActivity userActivity = (UserActivity) it.next();
            arrayList.add(new nb90(userActivity.getUsername(), m44300p(userActivity)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m44296b(String str, List list) {
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            C0833c c0833cM12978p = UserSubscription.m12978p();
            c0833cM12978p.m12994q(str2);
            C0834d c0834dM12980o = UserSubscription.PusherChannel.m12980o();
            c0834dM12980o.m12995m(str);
            c0833cM12978p.m12993m((UserSubscription.PusherChannel) c0834dM12980o.build());
            arrayList.add((UserSubscription) c0833cM12978p.build());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public static int m44297m(zr6 zr6Var) {
        int iOrdinal = zr6Var.ordinal();
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? 1 : 3;
        }
        return 2;
    }

    /* JADX INFO: renamed from: n */
    public static ygy m44298n(FeedActivity feedActivity) {
        return new ygy(feedActivity.hasTimestamp() ? Long.valueOf(m44301q(feedActivity.m12923r())) : null, feedActivity.m12921p(), feedActivity.m12924s() ? feedActivity.m12920n() : null, feedActivity.m12922q());
    }

    /* JADX INFO: renamed from: o */
    public static miy m44299o(FeedEntityWrapper feedEntityWrapper) {
        if (feedEntityWrapper.m12930s()) {
            return new liy(feedEntityWrapper.m12927p().getUri(), m44298n(feedEntityWrapper.m12927p().m12975n()));
        }
        if (feedEntityWrapper.m12928q()) {
            return new iiy(feedEntityWrapper.m12925n().getUri(), m44298n(feedEntityWrapper.m12925n().m12932n()));
        }
        if (!feedEntityWrapper.m12929r()) {
            return null;
        }
        String name = feedEntityWrapper.m12926o().getName();
        String strM12948n = feedEntityWrapper.m12926o().m12948n();
        ae50<GroupMember> ae50VarM12949p = feedEntityWrapper.m12926o().m12949p();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM12949p, 10));
        for (GroupMember groupMember : ae50VarM12949p) {
            wj50.m88279p(groupMember);
            arrayList.add(new jiy(groupMember.getUri(), groupMember.m12951o() ? m44298n(groupMember.m12950n()) : null));
        }
        return new kiy(name, strM12948n, arrayList);
    }

    /* JADX INFO: renamed from: p */
    public static mb90 m44300p(UserActivity userActivity) {
        if (!userActivity.m12973o()) {
            return null;
        }
        return new mb90(userActivity.m12972n().hasTimestamp() ? Long.valueOf(m44301q(userActivity.m12972n().m12960r())) : null, userActivity.m12972n().m12958p(), userActivity.m12972n().m12961s() ? userActivity.m12972n().m12957n() : null, userActivity.m12972n().m12959q());
    }

    /* JADX INFO: renamed from: q */
    public static long m44301q(Timestamp timestamp) {
        return (timestamp.m1969s() * ((long) 1000)) + ((long) (timestamp.m1968r() / 1000000));
    }

    /* JADX INFO: renamed from: r */
    public static ArrayList m44302r(Set set) {
        niy niyVar;
        Set set2 = set;
        ArrayList arrayList = new ArrayList(i6f.m49804T(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            int iOrdinal = ((yiy) it.next()).ordinal();
            if (iOrdinal == 0) {
                niyVar = niy.FEED_ENTITY_SOURCE_DM;
            } else if (iOrdinal == 1) {
                niyVar = niy.FEED_ENTITY_SOURCE_GROUP;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                niyVar = niy.FEED_ENTITY_SOURCE_FOLLOWING;
            }
            arrayList.add(niyVar);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Serializable m44303c(ibk ibkVar) {
        xb90 xb90Var;
        if (ibkVar instanceof xb90) {
            xb90Var = (xb90) ibkVar;
            int i = xb90Var.f259873c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xb90Var.f259873c = i - Integer.MIN_VALUE;
            } else {
                xb90Var = new xb90(this, ibkVar);
            }
        } else {
            xb90Var = new xb90(this, ibkVar);
        }
        Object objM87710h = xb90Var.f259871a;
        int i2 = xb90Var.f259873c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM87710h);
                wc90 wc90Var = this.f78516b;
                yr6 yr6VarM12906p = AudienceRequest.m12906p();
                yr6VarM12906p.m94411m();
                AudienceRequest audienceRequest = (AudienceRequest) yr6VarM12906p.build();
                xb90Var.f259873c = 1;
                objM87710h = wc90Var.m87710h(audienceRequest, xb90Var);
                yuk yukVar = yuk.f276404a;
                if (objM87710h == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM87710h);
            }
            ae50<AudienceUser> ae50VarM12907n = ((AudienceResponse) objM87710h).m12907n();
            ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM12907n, 10));
            for (AudienceUser audienceUser : ae50VarM12907n) {
                arrayList.add(new as6(audienceUser.getUsername(), audienceUser.m12909o(), m44297m(audienceUser.m12910p())));
            }
            return arrayList;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3966b(tfe.m80650h(e2, "BUZZ: ListeningActivityDataLoader.getAudience failure with exception: "), new Object[0]);
            return lau.f131415a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m44304d(String str, ibk ibkVar) {
        yb90 yb90Var;
        if (ibkVar instanceof yb90) {
            yb90Var = (yb90) ibkVar;
            int i = yb90Var.f271112c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yb90Var.f271112c = i - Integer.MIN_VALUE;
            } else {
                yb90Var = new yb90(this, ibkVar);
            }
        } else {
            yb90Var = new yb90(this, ibkVar);
        }
        Object objM87703a = yb90Var.f271110a;
        int i2 = yb90Var.f271112c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM87703a);
                wc90 wc90Var = this.f78516b;
                bs6 bs6VarM12913p = AudienceUserRequest.m12913p();
                bs6VarM12913p.m30354m(str);
                AudienceUserRequest audienceUserRequest = (AudienceUserRequest) bs6VarM12913p.build();
                yb90Var.f271112c = 1;
                objM87703a = wc90Var.m87703a(audienceUserRequest, yb90Var);
                yuk yukVar = yuk.f276404a;
                if (objM87703a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM87703a);
            }
            AudienceUserResponse audienceUserResponse = (AudienceUserResponse) objM87703a;
            if (audienceUserResponse.hasUser()) {
                return new as6(audienceUserResponse.m12914n().getUsername(), audienceUserResponse.m12914n().m12909o(), m44297m(audienceUserResponse.m12914n().m12910p()));
            }
            return null;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3966b(tfe.m80650h(e2, "BUZZ: ListeningActivityDataLoader.getAudienceUser failure with exception: "), new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Serializable m44305e(ArrayList arrayList, ibk ibkVar) throws Exception {
        zb90 zb90Var;
        if (ibkVar instanceof zb90) {
            zb90Var = (zb90) ibkVar;
            int i = zb90Var.f281284c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zb90Var.f281284c = i - Integer.MIN_VALUE;
            } else {
                zb90Var = new zb90(this, ibkVar);
            }
        } else {
            zb90Var = new zb90(this, ibkVar);
        }
        Object objM87712j = zb90Var.f281282a;
        int i2 = zb90Var.f281284c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM87712j);
                if (arrayList.isEmpty()) {
                    return lau.f131415a;
                }
                wc90 wc90Var = this.f78516b;
                rs6 rs6VarM12917p = AudienceUsersRequest.m12917p();
                rs6VarM12917p.m76311m(arrayList);
                AudienceUsersRequest audienceUsersRequest = (AudienceUsersRequest) rs6VarM12917p.build();
                zb90Var.f281284c = 1;
                objM87712j = wc90Var.m87712j(audienceUsersRequest, zb90Var);
                yuk yukVar = yuk.f276404a;
                if (objM87712j == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM87712j);
            }
            ae50<AudienceUser> ae50VarM12918n = ((AudienceUsersResponse) objM87712j).m12918n();
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(ae50VarM12918n, 10));
            for (AudienceUser audienceUser : ae50VarM12918n) {
                arrayList2.add(new as6(audienceUser.getUsername(), audienceUser.m12909o(), m44297m(audienceUser.m12910p())));
            }
            return arrayList2;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3966b(tfe.m80650h(e2, "BUZZ: ListeningActivityDataLoader.getAudienceUsers failure with exception: "), new Object[0]);
            throw e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Serializable m44306f(Set set, ibk ibkVar) {
        ac90 ac90Var;
        if (ibkVar instanceof ac90) {
            ac90Var = (ac90) ibkVar;
            int i = ac90Var.f14300c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ac90Var.f14300c = i - Integer.MIN_VALUE;
            } else {
                ac90Var = new ac90(this, ibkVar);
            }
        } else {
            ac90Var = new ac90(this, ibkVar);
        }
        Object objM87705c = ac90Var.f14298a;
        int i2 = ac90Var.f14300c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM87705c);
                v810 v810VarM12936q = GetFeedRequest.m12936q();
                v810VarM12936q.m84901q();
                v810VarM12936q.m84900m(m44302r(set));
                GetFeedRequest getFeedRequest = (GetFeedRequest) v810VarM12936q.build();
                wc90 wc90Var = this.f78516b;
                wj50.m88279p(getFeedRequest);
                ac90Var.f14300c = 1;
                objM87705c = wc90Var.m87705c(getFeedRequest, ac90Var);
                yuk yukVar = yuk.f276404a;
                if (objM87705c == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM87705c);
            }
            ae50<FeedEntityWrapper> ae50VarM12937n = ((GetFeedResponse) objM87705c).m12937n();
            ArrayList arrayList = new ArrayList();
            for (FeedEntityWrapper feedEntityWrapper : ae50VarM12937n) {
                wj50.m88279p(feedEntityWrapper);
                miy miyVarM44299o = m44299o(feedEntityWrapper);
                if (miyVarM44299o != null) {
                    arrayList.add(miyVarM44299o);
                }
            }
            return arrayList;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3966b(tfe.m80650h(e2, "BUZZ: ListeningActivityDataLoader.getFeed failure with exception: "), new Object[0]);
            return new c6x0(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Serializable m44307g(List list, ibk ibkVar) {
        bc90 bc90Var;
        if (ibkVar instanceof bc90) {
            bc90Var = (bc90) ibkVar;
            int i = bc90Var.f25811c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bc90Var.f25811c = i - Integer.MIN_VALUE;
            } else {
                bc90Var = new bc90(this, ibkVar);
            }
        } else {
            bc90Var = new bc90(this, ibkVar);
        }
        Object objM87709g = bc90Var.f25809a;
        int i2 = bc90Var.f25811c;
        lau lauVar = lau.f131415a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM87709g);
                if (list.isEmpty()) {
                    return lauVar;
                }
                hza1 hza1VarM12983p = UsersActivityRequest.m12983p();
                hza1VarM12983p.m49259m(list);
                UsersActivityRequest usersActivityRequest = (UsersActivityRequest) hza1VarM12983p.build();
                wc90 wc90Var = this.f78516b;
                wj50.m88279p(usersActivityRequest);
                bc90Var.f25811c = 1;
                objM87709g = wc90Var.m87709g(usersActivityRequest, bc90Var);
                yuk yukVar = yuk.f276404a;
                if (objM87709g == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM87709g);
            }
            ae50<UserActivity> ae50VarM12984n = ((UsersActivityResponse) objM87709g).m12984n();
            ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM12984n, 10));
            for (UserActivity userActivity : ae50VarM12984n) {
                arrayList.add(new nb90(userActivity.getUsername(), m44300p(userActivity)));
            }
            return arrayList;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3966b(tfe.m80650h(e2, "BUZZ: ListeningActivityDataLoader.getListeningActivityForUsers failure with exception: "), new Object[0]);
            return lauVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m44308h(ibk ibkVar) {
        cc90 cc90Var;
        if (ibkVar instanceof cc90) {
            cc90Var = (cc90) ibkVar;
            int i = cc90Var.f36353c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cc90Var.f36353c = i - Integer.MIN_VALUE;
            } else {
                cc90Var = new cc90(this, ibkVar);
            }
        } else {
            cc90Var = new cc90(this, ibkVar);
        }
        Object objM87707e = cc90Var.f36351a;
        int i2 = cc90Var.f36353c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM87707e);
                w910 w910VarM12940p = GetMyActivityRequest.m12940p();
                w910VarM12940p.m87480m();
                GetMyActivityRequest getMyActivityRequest = (GetMyActivityRequest) w910VarM12940p.build();
                wc90 wc90Var = this.f78516b;
                wj50.m88279p(getMyActivityRequest);
                cc90Var.f36353c = 1;
                objM87707e = wc90Var.m87707e(getMyActivityRequest, cc90Var);
                yuk yukVar = yuk.f276404a;
                if (objM87707e == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM87707e);
            }
            GetMyActivityResponse getMyActivityResponse = (GetMyActivityResponse) objM87707e;
            if (!getMyActivityResponse.m12942o()) {
                return null;
            }
            return new mb90(getMyActivityResponse.m12941n().hasTimestamp() ? new Long(m44301q(getMyActivityResponse.m12941n().m12960r())) : null, getMyActivityResponse.m12941n().m12958p(), getMyActivityResponse.m12941n().m12961s() ? getMyActivityResponse.m12941n().m12957n() : null, getMyActivityResponse.m12941n().m12959q());
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3966b(tfe.m80650h(e2, "BUZZ: ListeningActivityDataLoader.getMyActivity failure with exception: "), new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Enum m44309i(String str, ibk ibkVar) {
        dc90 dc90Var;
        gc90 gc90Var;
        if (ibkVar instanceof dc90) {
            dc90Var = (dc90) ibkVar;
            int i = dc90Var.f47463d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dc90Var.f47463d = i - Integer.MIN_VALUE;
            } else {
                dc90Var = new dc90(this, ibkVar);
            }
        } else {
            dc90Var = new dc90(this, ibkVar);
        }
        Object objM87714l = dc90Var.f47461b;
        int i2 = dc90Var.f47463d;
        sla1 sla1Var = sla1.f210346c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM87714l);
                wc90 wc90Var = this.f78516b;
                mc10 mc10VarM12945p = GetUserHiddenStateRequest.m12945p();
                mc10VarM12945p.m61434m(str);
                GetUserHiddenStateRequest getUserHiddenStateRequest = (GetUserHiddenStateRequest) mc10VarM12945p.build();
                dc90Var.f47460a = this;
                dc90Var.f47463d = 1;
                objM87714l = wc90Var.m87714l(getUserHiddenStateRequest, dc90Var);
                yuk yukVar = yuk.f276404a;
                if (objM87714l == yukVar) {
                    return yukVar;
                }
                gc90Var = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gc90Var = dc90Var.f47460a;
                bga.m29073P(objM87714l);
            }
            hr20 hr20VarM12946n = ((GetUserHiddenStateResponse) objM87714l).m12946n();
            gc90Var.getClass();
            int iOrdinal = hr20VarM12946n.ordinal();
            if (iOrdinal != 1) {
                return iOrdinal != 2 ? sla1Var : sla1.f210345b;
            }
            return sla1.f210344a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3966b(tfe.m80650h(e2, "BUZZ: ListeningActivityDataLoader.getUserActivityHiddenState failure with exception: "), new Object[0]);
            return sla1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m44310j(String str, ibk ibkVar, boolean z) throws Exception {
        ec90 ec90Var;
        if (ibkVar instanceof ec90) {
            ec90Var = (ec90) ibkVar;
            int i = ec90Var.f58272e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ec90Var.f58272e = i - Integer.MIN_VALUE;
            } else {
                ec90Var = new ec90(this, ibkVar);
            }
        } else {
            ec90Var = new ec90(this, ibkVar);
        }
        Object obj = ec90Var.f58270c;
        int i2 = ec90Var.f58272e;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                wc90 wc90Var = this.f78516b;
                sr20 sr20VarM12955q = HideUserActivityRequest.m12955q();
                sr20VarM12955q.m78987q(str);
                sr20VarM12955q.m78986m(z);
                HideUserActivityRequest hideUserActivityRequest = (HideUserActivityRequest) sr20VarM12955q.build();
                ec90Var.f58268a = str;
                ec90Var.f58269b = z;
                ec90Var.f58272e = 1;
                Object objM87706d = wc90Var.m87706d(hideUserActivityRequest, ec90Var);
                yuk yukVar = yuk.f276404a;
                if (objM87706d == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = ec90Var.f58269b;
                str = ec90Var.f58268a;
                bga.m29073P(obj);
            }
            if (!z) {
                this.f78521g.mo46962a(str);
            }
            return w2a1.f247311a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3966b(tfe.m80650h(e2, "BUZZ: ListeningActivityDataLoader.hideUserActivity failure with exception: "), new Object[0]);
            throw e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m44311k(String str, ibk ibkVar, boolean z) {
        fc90 fc90Var;
        if (ibkVar instanceof fc90) {
            fc90Var = (fc90) ibkVar;
            int i = fc90Var.f68037c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fc90Var.f68037c = i - Integer.MIN_VALUE;
            } else {
                fc90Var = new fc90(this, ibkVar);
            }
        } else {
            fc90Var = new fc90(this, ibkVar);
        }
        Object obj = fc90Var.f68035a;
        int i2 = fc90Var.f68037c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                wc90 wc90Var = this.f78516b;
                z3x0 z3x0VarM12966q = RestrictAudienceUserRequest.m12966q();
                z3x0VarM12966q.m95297q(str);
                z3x0VarM12966q.m95296m(z);
                RestrictAudienceUserRequest restrictAudienceUserRequest = (RestrictAudienceUserRequest) z3x0VarM12966q.build();
                fc90Var.f68037c = 1;
                Object objM87704b = wc90Var.m87704b(restrictAudienceUserRequest, fc90Var);
                yuk yukVar = yuk.f276404a;
                if (objM87704b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            return w2a1.f247311a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3966b(tfe.m80650h(e2, "BUZZ: ListeningActivityDataLoader.restrictAudienceUser failure with exception: "), new Object[0]);
            throw e2;
        }
    }

    /* JADX INFO: renamed from: l */
    public final fiz m44312l(List list) {
        if (list.isEmpty()) {
            return new ysk(new s6x0(lau.f131415a), 27);
        }
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            arrayList.add((fiz) this.f78520f.computeIfAbsent(str, new wb90(str, 0, this)));
        }
        return new v78((fiz[]) g6f.m43728j1(arrayList).toArray(new fiz[0]), 21);
    }
}
