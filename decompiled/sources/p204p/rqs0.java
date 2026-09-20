package p204p;

import android.content.res.Resources;
import android.util.Base64;
import com.google.protobuf.Any;
import com.google.protobuf.Timestamp;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import spotify.spotbot.p212v2.promptable_playlist.Promptableplaylist$AttributeUpdate;
import spotify.spotbot.p212v2.promptable_playlist.Promptableplaylist$CreatePromptablePlaylistRequest;
import spotify.spotbot.p212v2.promptable_playlist.Promptableplaylist$CreatePromptablePlaylistResponse;
import spotify.spotbot.p212v2.promptable_playlist.Promptableplaylist$EditPromptablePlaylistRequest;
import spotify.spotbot.p212v2.promptable_playlist.Promptableplaylist$EditPromptablePlaylistResponse;
import spotify.spotbot.p212v2.promptable_playlist.Promptableplaylist$GetPromptablePlaylistRequest;
import spotify.spotbot.p212v2.promptable_playlist.Promptableplaylist$PromptablePlaylistError;
import spotify.spotbot.p212v2.promptable_playlist.Promptableplaylist$RefreshMetadata;
import spotify.spotbot.p212v2.promptable_playlist.Promptableplaylist$RefreshPromptablePlaylistRequest;
import spotify.spotbot.p212v2.promptable_playlist.Promptableplaylist$Status;
import spotify.spotbot.p212v2.promptable_playlist.Promptableplaylist$Suggestion;
import spotify.spotbot.p212v2.promptable_playlist.Promptableplaylist$SuggestionChild;
import spotify.spotbot.p212v2.promptable_playlist.Promptableplaylist$SuggestionResponse;

/* JADX INFO: loaded from: classes10.dex */
public final class rqs0 {

    /* JADX INFO: renamed from: a */
    public final sws0 f201879a;

    /* JADX INFO: renamed from: b */
    public final gcu0 f201880b;

    /* JADX INFO: renamed from: c */
    public final Resources f201881c;

    public rqs0(sws0 sws0Var, gcu0 gcu0Var, Resources resources) {
        this.f201879a = sws0Var;
        this.f201880b = gcu0Var;
        this.f201881c = resources;
    }

    /* JADX INFO: renamed from: b */
    public static List m76262b(o2x0 o2x0Var) {
        xrs0 prs0Var;
        String strM78534b = o2x0Var.f161171a.f149862f.m78534b("grpc-status-details-bin");
        if (strM78534b == null) {
            strM78534b = null;
        }
        if (strM78534b == null) {
            return Collections.singletonList(new srs0());
        }
        ae50 ae50VarM98044n = Promptableplaylist$Status.m98043o(Base64.decode(strM78534b, 0)).m98044n();
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = ae50VarM98044n.iterator();
        while (it.hasNext()) {
            Promptableplaylist$PromptablePlaylistError promptableplaylist$PromptablePlaylistErrorM98031q = Promptableplaylist$PromptablePlaylistError.m98031q(((Any) it.next()).m1913r());
            int i = mqs0.f146350a[promptableplaylist$PromptablePlaylistErrorM98031q.m98033o().ordinal()];
            if (i == 1) {
                prs0Var = new prs0(promptableplaylist$PromptablePlaylistErrorM98031q.m98032n());
            } else if (i == 2) {
                prs0Var = new urs0(promptableplaylist$PromptablePlaylistErrorM98031q.m98032n());
            } else if (i == 3) {
                prs0Var = new wrs0(promptableplaylist$PromptablePlaylistErrorM98031q.m98032n());
            } else if (i != 4) {
                prs0Var = i != 5 ? new srs0(promptableplaylist$PromptablePlaylistErrorM98031q.m98032n()) : new srs0(promptableplaylist$PromptablePlaylistErrorM98031q.m98032n());
            } else {
                String strM98032n = promptableplaylist$PromptablePlaylistErrorM98031q.m98032n();
                Timestamp timestampM98036o = promptableplaylist$PromptablePlaylistErrorM98031q.m98034p().m98036o();
                z050 z050VarM95041q6 = z050.m95041q6(timestampM98036o.m1969s(), timestampM98036o.m1968r());
                z050VarM95041q6.getClass();
                prs0Var = new rrs0(strM98032n, bno.f28902k.m30060a(z050VarM95041q6));
            }
            arrayList.add(prs0Var);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m76263a(String str, String str2, ibk ibkVar, boolean z) {
        nqs0 nqs0Var;
        if (ibkVar instanceof nqs0) {
            nqs0Var = (nqs0) ibkVar;
            int i = nqs0Var.f157329c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nqs0Var.f157329c = i - Integer.MIN_VALUE;
            } else {
                nqs0Var = new nqs0(this, ibkVar);
            }
        } else {
            nqs0Var = new nqs0(this, ibkVar);
        }
        Object objM79560c = nqs0Var.f157327a;
        int i2 = nqs0Var.f157329c;
        if (i2 == 0) {
            bga.m29073P(objM79560c);
            sos0 sos0VarM98024q = Promptableplaylist$EditPromptablePlaylistRequest.m98024q();
            sos0VarM98024q.m78838r(str);
            qos0 qos0VarM98010o = Promptableplaylist$AttributeUpdate.m98010o();
            qos0VarM98010o.m73403m(str2);
            sos0VarM98024q.m78836m((Promptableplaylist$AttributeUpdate) qos0VarM98010o.build());
            sos0VarM98024q.m78837q(z);
            Promptableplaylist$EditPromptablePlaylistRequest promptableplaylist$EditPromptablePlaylistRequest = (Promptableplaylist$EditPromptablePlaylistRequest) sos0VarM98024q.build();
            wj50.m88279p(promptableplaylist$EditPromptablePlaylistRequest);
            nqs0Var.f157329c = 1;
            objM79560c = this.f201879a.m79560c(promptableplaylist$EditPromptablePlaylistRequest, nqs0Var);
            yuk yukVar = yuk.f276404a;
            if (objM79560c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM79560c);
        }
        o2x0 o2x0Var = (o2x0) objM79560c;
        if (!o2x0Var.f161171a.f149852O0) {
            return new i7t(m76262b(o2x0Var));
        }
        Object obj = o2x0Var.f161172b;
        if (obj == null) {
            throw new IllegalArgumentException("Response body is null for successful edit playlist response");
        }
        Promptableplaylist$EditPromptablePlaylistResponse promptableplaylist$EditPromptablePlaylistResponse = (Promptableplaylist$EditPromptablePlaylistResponse) obj;
        return new j7t(promptableplaylist$EditPromptablePlaylistResponse.m98026o(), promptableplaylist$EditPromptablePlaylistResponse.m98025n());
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00de A[Catch: Exception -> 0x00fa, TryCatch #1 {Exception -> 0x00fa, blocks: (B:50:0x0113, B:52:0x011b, B:54:0x012e, B:37:0x00d5, B:39:0x00de, B:41:0x00e2, B:45:0x00fc, B:46:0x0103, B:47:0x0104, B:34:0x00c3), top: B:68:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e2 A[Catch: Exception -> 0x00fa, TryCatch #1 {Exception -> 0x00fa, blocks: (B:50:0x0113, B:52:0x011b, B:54:0x012e, B:37:0x00d5, B:39:0x00de, B:41:0x00e2, B:45:0x00fc, B:46:0x0103, B:47:0x0104, B:34:0x00c3), top: B:68:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00fc A[Catch: Exception -> 0x00fa, TryCatch #1 {Exception -> 0x00fa, blocks: (B:50:0x0113, B:52:0x011b, B:54:0x012e, B:37:0x00d5, B:39:0x00de, B:41:0x00e2, B:45:0x00fc, B:46:0x0103, B:47:0x0104, B:34:0x00c3), top: B:68:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0104 A[Catch: Exception -> 0x00fa, TryCatch #1 {Exception -> 0x00fa, blocks: (B:50:0x0113, B:52:0x011b, B:54:0x012e, B:37:0x00d5, B:39:0x00de, B:41:0x00e2, B:45:0x00fc, B:46:0x0103, B:47:0x0104, B:34:0x00c3), top: B:68:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0112  */
    /* JADX WARN: Code duplicated, block: B:52:0x011b A[Catch: Exception -> 0x00fa, TryCatch #1 {Exception -> 0x00fa, blocks: (B:50:0x0113, B:52:0x011b, B:54:0x012e, B:37:0x00d5, B:39:0x00de, B:41:0x00e2, B:45:0x00fc, B:46:0x0103, B:47:0x0104, B:34:0x00c3), top: B:68:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x012e A[Catch: Exception -> 0x00fa, TRY_LEAVE, TryCatch #1 {Exception -> 0x00fa, blocks: (B:50:0x0113, B:52:0x011b, B:54:0x012e, B:37:0x00d5, B:39:0x00de, B:41:0x00e2, B:45:0x00fc, B:46:0x0103, B:47:0x0104, B:34:0x00c3), top: B:68:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0144, code lost:
    
        if (r4 == r13) goto L58;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m76264c(String str, String str2, zus0 zus0Var, boolean z, String str3, boolean z2, ibk ibkVar) {
        oqs0 oqs0Var;
        o2x0 o2x0Var;
        Object obj;
        vos0 vos0Var;
        boolean z3 = z;
        boolean z4 = z2;
        if (ibkVar instanceof oqs0) {
            oqs0Var = (oqs0) ibkVar;
            int i = oqs0Var.f168380f;
            if ((i & Integer.MIN_VALUE) != 0) {
                oqs0Var.f168380f = i - Integer.MIN_VALUE;
            } else {
                oqs0Var = new oqs0(this, ibkVar);
            }
        } else {
            oqs0Var = new oqs0(this, ibkVar);
        }
        Object objM44323e = oqs0Var.f168378d;
        int i2 = oqs0Var.f168380f;
        Resources resources = this.f201881c;
        gcu0 gcu0Var = this.f201880b;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM44323e);
            ros0 ros0VarM98017t = Promptableplaylist$CreatePromptablePlaylistRequest.m98017t();
            ros0VarM98017t.m76080s(str);
            ros0VarM98017t.m76082u(str2);
            wos0 wos0VarM98039p = Promptableplaylist$RefreshMetadata.m98039p();
            int iM38547C = edb.m38547C(zus0Var.f286515a);
            if (iM38547C == 0) {
                vos0Var = vos0.NEVER;
            } else if (iM38547C == 1) {
                vos0Var = vos0.DAILY;
            } else {
                if (iM38547C != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                vos0Var = vos0.WEEKLY;
            }
            wos0VarM98039p.m88664m(vos0Var);
            wos0VarM98039p.m88665q(edb.m38547C(zus0Var.f286516b));
            ros0VarM98017t.m76081t((Promptableplaylist$RefreshMetadata) wos0VarM98039p.build());
            ros0VarM98017t.m76079r(!z3);
            ros0VarM98017t.m76078q(str3);
            ros0VarM98017t.m76077m(z4);
            Promptableplaylist$CreatePromptablePlaylistRequest promptableplaylist$CreatePromptablePlaylistRequest = (Promptableplaylist$CreatePromptablePlaylistRequest) ros0VarM98017t.build();
            try {
                sws0 sws0Var = this.f201879a;
                wj50.m88279p(promptableplaylist$CreatePromptablePlaylistRequest);
                oqs0Var.f168376b = z3;
                oqs0Var.f168377c = z4;
                oqs0Var.f168380f = 1;
                objM44323e = sws0Var.m79561d(promptableplaylist$CreatePromptablePlaylistRequest, oqs0Var);
                if (objM44323e != yukVar) {
                    o2x0Var = (o2x0) objM44323e;
                    if (o2x0Var.f161171a.f149852O0) {
                        obj = o2x0Var.f161172b;
                        if (obj != null) {
                            throw new IllegalArgumentException("Response body is null for successful generate playlist response");
                        }
                        Promptableplaylist$CreatePromptablePlaylistResponse promptableplaylist$CreatePromptablePlaylistResponse = (Promptableplaylist$CreatePromptablePlaylistResponse) obj;
                        return new cvs0(promptableplaylist$CreatePromptablePlaylistResponse.m98019o(), promptableplaylist$CreatePromptablePlaylistResponse.m98020p(), promptableplaylist$CreatePromptablePlaylistResponse.m98018n().m98030o());
                    }
                    oqs0Var.f168375a = o2x0Var;
                    oqs0Var.f168376b = z3;
                    oqs0Var.f168377c = z4;
                    oqs0Var.f168380f = 2;
                    objM44323e = gcu0Var.m44323e(oqs0Var);
                    if (objM44323e == yukVar) {
                    }
                    if (((Boolean) objM44323e).booleanValue()) {
                    }
                }
            } catch (Exception e) {
                e = e;
                oqs0Var.f168375a = e;
                oqs0Var.f168376b = z3;
                oqs0Var.f168377c = z4;
                oqs0Var.f168380f = 3;
                objM44323e = gcu0Var.m44323e(oqs0Var);
            }
            return yukVar;
        }
        try {
            if (i2 == 1) {
                boolean z5 = oqs0Var.f168377c;
                boolean z6 = oqs0Var.f168376b;
                bga.m29073P(objM44323e);
                z4 = z5;
                z3 = z6;
                o2x0Var = (o2x0) objM44323e;
                if (o2x0Var.f161171a.f149852O0) {
                    obj = o2x0Var.f161172b;
                    if (obj != null) {
                        throw new IllegalArgumentException("Response body is null for successful generate playlist response");
                    }
                    Promptableplaylist$CreatePromptablePlaylistResponse promptableplaylist$CreatePromptablePlaylistResponse2 = (Promptableplaylist$CreatePromptablePlaylistResponse) obj;
                    return new cvs0(promptableplaylist$CreatePromptablePlaylistResponse2.m98019o(), promptableplaylist$CreatePromptablePlaylistResponse2.m98020p(), promptableplaylist$CreatePromptablePlaylistResponse2.m98018n().m98030o());
                }
                oqs0Var.f168375a = o2x0Var;
                oqs0Var.f168376b = z3;
                oqs0Var.f168377c = z4;
                oqs0Var.f168380f = 2;
                objM44323e = gcu0Var.m44323e(oqs0Var);
                if (objM44323e == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e = (Exception) oqs0Var.f168375a;
                    bga.m29073P(objM44323e);
                    if (((Boolean) objM44323e).booleanValue()) {
                        return new bvs0(Collections.singletonList(new trs0(resources.getString(R.string.magpie_error_network_offline))));
                    }
                    String message = e.getMessage();
                    if (message == null) {
                        message = "Unknown error";
                    }
                    return new bvs0(Collections.singletonList(new srs0(message)));
                }
                boolean z7 = oqs0Var.f168377c;
                boolean z8 = oqs0Var.f168376b;
                o2x0Var = (o2x0) oqs0Var.f168375a;
                bga.m29073P(objM44323e);
            }
            return ((Boolean) objM44323e).booleanValue() ? new bvs0(Collections.singletonList(new trs0(resources.getString(R.string.magpie_error_network_offline)))) : new bvs0(m76262b(o2x0Var));
        } catch (Exception e2) {
            e = e2;
            z4 = z3;
            z3 = z4;
            oqs0Var.f168375a = e;
            oqs0Var.f168376b = z3;
            oqs0Var.f168377c = z4;
            oqs0Var.f168380f = 3;
            objM44323e = gcu0Var.m44323e(oqs0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m76265d(ibk ibkVar) {
        pqs0 pqs0Var;
        if (ibkVar instanceof pqs0) {
            pqs0Var = (pqs0) ibkVar;
            int i = pqs0Var.f180417c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pqs0Var.f180417c = i - Integer.MIN_VALUE;
            } else {
                pqs0Var = new pqs0(this, ibkVar);
            }
        } else {
            pqs0Var = new pqs0(this, ibkVar);
        }
        Object objM79562e = pqs0Var.f180415a;
        int i2 = pqs0Var.f180417c;
        if (i2 == 0) {
            bga.m29073P(objM79562e);
            tos0 tos0VarM98028o = Promptableplaylist$GetPromptablePlaylistRequest.m98028o();
            tos0VarM98028o.m81219m();
            Promptableplaylist$GetPromptablePlaylistRequest promptableplaylist$GetPromptablePlaylistRequest = (Promptableplaylist$GetPromptablePlaylistRequest) tos0VarM98028o.build();
            wj50.m88279p(promptableplaylist$GetPromptablePlaylistRequest);
            pqs0Var.f180417c = 1;
            objM79562e = this.f201879a.m79562e(promptableplaylist$GetPromptablePlaylistRequest, pqs0Var);
            yuk yukVar = yuk.f276404a;
            if (objM79562e == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM79562e);
        }
        o2x0 o2x0Var = (o2x0) objM79562e;
        if (!o2x0Var.f161171a.f149852O0) {
            return new c261(lau.f131415a);
        }
        Object obj = o2x0Var.f161172b;
        if (obj == null) {
            throw new IllegalArgumentException("Response body is null for successful get suggestions response");
        }
        ae50<Promptableplaylist$Suggestion> ae50VarM98048n = ((Promptableplaylist$SuggestionResponse) obj).m98048n();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM98048n, 10));
        for (Promptableplaylist$Suggestion promptableplaylist$Suggestion : ae50VarM98048n) {
            String strM98045n = promptableplaylist$Suggestion.m98045n();
            ae50 ae50VarM98046o = promptableplaylist$Suggestion.m98046o();
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(ae50VarM98046o, 10));
            Iterator<E> it = ae50VarM98046o.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Promptableplaylist$SuggestionChild) it.next()).m98047n());
            }
            arrayList.add(new b261(strM98045n, arrayList2));
        }
        return new c261(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m76266e(String str, avs0 avs0Var, ibk ibkVar) {
        qqs0 qqs0Var;
        yos0 yos0Var;
        if (ibkVar instanceof qqs0) {
            qqs0Var = (qqs0) ibkVar;
            int i = qqs0Var.f191648c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qqs0Var.f191648c = i - Integer.MIN_VALUE;
            } else {
                qqs0Var = new qqs0(this, ibkVar);
            }
        } else {
            qqs0Var = new qqs0(this, ibkVar);
        }
        Object objM79558a = qqs0Var.f191646a;
        int i2 = qqs0Var.f191648c;
        if (i2 == 0) {
            bga.m29073P(objM79558a);
            xos0 xos0VarM98042p = Promptableplaylist$RefreshPromptablePlaylistRequest.m98042p();
            xos0VarM98042p.m91563q(str);
            int iOrdinal = avs0Var.ordinal();
            if (iOrdinal == 0) {
                yos0Var = yos0.UNSPECIFIED;
            } else if (iOrdinal == 1) {
                yos0Var = yos0.MANUAL;
            } else if (iOrdinal == 2) {
                yos0Var = yos0.SCHEDULED;
            } else if (iOrdinal == 3) {
                yos0Var = yos0.OUTDATED_PROMPT_VERSION_TRIGGER;
            } else {
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                yos0Var = yos0.OVERDUE_SCHEDULED_PLAYLIST_OPENED;
            }
            xos0VarM98042p.m91562m(yos0Var);
            Promptableplaylist$RefreshPromptablePlaylistRequest promptableplaylist$RefreshPromptablePlaylistRequest = (Promptableplaylist$RefreshPromptablePlaylistRequest) xos0VarM98042p.build();
            wj50.m88279p(promptableplaylist$RefreshPromptablePlaylistRequest);
            qqs0Var.f191648c = 1;
            objM79558a = this.f201879a.m79558a(promptableplaylist$RefreshPromptablePlaylistRequest, qqs0Var);
            yuk yukVar = yuk.f276404a;
            if (objM79558a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM79558a);
        }
        o2x0 o2x0Var = (o2x0) objM79558a;
        return o2x0Var.f161171a.f149852O0 ? mrv0.f146621a : new lrv0(m76262b(o2x0Var));
    }
}
