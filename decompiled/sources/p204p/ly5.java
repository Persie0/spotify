package p204p;

import android.net.Uri;
import android.os.SystemClock;
import com.spotify.accountswitching.p009v1.Account;
import com.spotify.accountswitching.p009v1.AccountProfile;
import com.spotify.accountswitching.p009v1.GetAddAccountPageResponse;
import com.spotify.cosmos.util.proto.ImageGroup;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import spotify.collection.esperanto.proto.CollectionArtist;
import spotify.collection.esperanto.proto.CollectionGetArtistViewResponse;

/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class ly5 implements Function, v3b, vd50, BiFunction, dt70, Predicate, Init, e411, uwj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f137958a;

    public /* synthetic */ ly5(int i) {
        this.f137958a = i;
    }

    /* JADX INFO: renamed from: a */
    public static long m60216a() {
        hvi0 hvi0Var = cks.f39079b;
        return jwg1.m54450E(SystemClock.elapsedRealtimeNanos(), ils.NANOSECONDS);
    }

    /* JADX INFO: renamed from: d */
    public static ilm0 m60217d(qly0 qly0Var, b450 b450Var) {
        float fM86437v = qly0Var.f189941a.m86437v();
        int i = b450Var.f278778a;
        return new ilm0(n0e1.m63436m((fM86437v - i) / (b450Var.f278779b - i), 0.0f, 1.0f), true, true);
    }

    /* JADX INFO: renamed from: h */
    public static long m60218h() {
        return n6f.f150862b;
    }

    /* JADX INFO: renamed from: i */
    public static long m60219i() {
        return n6f.f150868h;
    }

    /* JADX INFO: renamed from: j */
    public static long m60220j() {
        return n6f.f150864d;
    }

    /* JADX INFO: renamed from: k */
    public static long m60221k() {
        return Calendar.getInstance().getTimeInMillis();
    }

    /* JADX INFO: renamed from: l */
    public static long m60222l() {
        return n6f.f150867g;
    }

    /* JADX INFO: renamed from: m */
    public static long m60223m() {
        return n6f.f150870j;
    }

    /* JADX INFO: renamed from: n */
    public static long m60224n() {
        return n6f.f150871k;
    }

    /* JADX INFO: renamed from: o */
    public static long m60225o() {
        return n6f.f150866f;
    }

    /* JADX INFO: renamed from: p */
    public static float m60226p(float f, float f2, float f3, int i) {
        float f4 = ((f / 30.0f) + i) % 12.0f;
        return f3 - (Math.max(-1.0f, Math.min(f4 - 3, Math.min(9 - f4, 1.0f))) * (Math.min(f3, 1.0f - f3) * f2));
    }

    /* JADX INFO: renamed from: q */
    public static long m60227q(float f, float f2, float f3, float f4) {
        int i = n6f.f150872l;
        wdx0 wdx0Var = c9f.f35494e;
        if (0.0f > f || f > 360.0f || 0.0f > f2 || f2 > 1.0f || 0.0f > f3 || f3 > 1.0f) {
            lt40.m59869a("HSV (" + f + ", " + f2 + ", " + f3 + ") must be in range (0..360, 0..1, 0..1)");
        }
        return rfg1.m75431a(m60228r(f, f2, f3, 5), m60228r(f, f2, f3, 3), m60228r(f, f2, f3, 1), f4, wdx0Var);
    }

    /* JADX INFO: renamed from: r */
    public static float m60228r(float f, float f2, float f3, int i) {
        float f4 = ((f / 60.0f) + i) % 6.0f;
        return f3 - (Math.max(0.0f, Math.min(f4, Math.min(4 - f4, 1.0f))) * (f2 * f3));
    }

    /* JADX INFO: renamed from: t */
    public static Next m60229t(aty0 aty0Var) {
        return Next.m15605a(bk5.m29624m1(new w3z0[]{j3z0.f108528d, new k3z0(aty0Var.f19760a, aty0Var.f19762c, new s4y(aty0Var.f19761b, aty0Var.f19763d, aty0Var.f19764e), 8)}));
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        boolean z;
        String strM38000d0;
        switch (this.f137958a) {
            case 0:
                CollectionArtist collectionArtistM97505n = ((CollectionGetArtistViewResponse) obj).m97505n();
                String name = collectionArtistM97505n.m97453q().getName();
                int numExplicitlyLikedTracks = collectionArtistM97505n.m97452p().getNumExplicitlyLikedTracks();
                int numAlbumsInCollection = collectionArtistM97505n.m97452p().getNumAlbumsInCollection();
                String offline = collectionArtistM97505n.m97454r().getOffline();
                String collectionLink = collectionArtistM97505n.m97452p().getCollectionLink();
                ImageGroup portraits = collectionArtistM97505n.m97453q().getPortraits();
                return new ny5(name, numAlbumsInCollection, numExplicitlyLikedTracks, offline, collectionLink, h6f.m46715L(new taq0(portraits.getStandardLink(), 1), new taq0(portraits.getSmallLink(), 2), new taq0(portraits.getLargeLink(), 3), new taq0(portraits.getXlargeLink(), 4)));
            case 10:
                PlayerState playerState = (PlayerState) obj;
                ContextTrack contextTrack = (ContextTrack) playerState.track().mo49283h();
                pf40 pf40VarNextTracks = playerState.nextTracks();
                int i = 0;
                if (pf40VarNextTracks.isEmpty()) {
                    z = false;
                } else {
                    Iterator<E> it = pf40VarNextTracks.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ContextTrack contextTrack2 = (ContextTrack) it.next();
                            wj50.m88279p(contextTrack2);
                            if (e72.m37988V(contextTrack2)) {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                    }
                }
                if (contextTrack != null && e72.m37990X(contextTrack) && (strM38000d0 = e72.m38000d0(contextTrack, ContextTrack.Metadata.KEY_POINTER_URI)) != null && bm51.m29803n0(strM38000d0, "spotify:podcast-chapter:", false)) {
                    i = 1;
                } else if (contextTrack != null && e72.m37989W(contextTrack)) {
                    i = 2;
                }
                return new s4w(z, i);
            default:
                throw ei6.m39072i(obj);
        }
    }

    @Override // p204p.uwj
    /* JADX INFO: renamed from: b */
    public Object mo26622b(String str, fbk fbkVar) {
        return swj.f214674a;
    }

    @Override // p204p.v3b
    /* JADX INFO: renamed from: c */
    public String mo60230c(sjo sjoVar) {
        String str = sjoVar.f209892h;
        if (str != null) {
            return str;
        }
        Uri uri = sjoVar.f209885a;
        String path = uri.getPath();
        return (path == null || path.length() == 0) ? uri.toString() : path;
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        oje ojeVar;
        f510 f510Var;
        x6w0 x6w0Var;
        switch (this.f137958a) {
            case 2:
                if (i != 0) {
                    ojeVar = i != 1 ? null : oje.CAMPAIGN_CARD_RESERVED_SHARE_V1;
                } else {
                    ojeVar = oje.CLIENT_CAPABILITY_UNSPECIFIED;
                }
                return ojeVar == null ? oje.UNRECOGNIZED : ojeVar;
            case 4:
                zik zikVarM96221a = zik.m96221a(i);
                return zikVarM96221a == null ? zik.UNRECOGNIZED : zikVarM96221a;
            case 12:
                if (i == 0) {
                    f510Var = f510.GEOBLOCK_BLOCKING_TYPE_UNSPECIFIED;
                } else if (i == 1) {
                    f510Var = f510.GEOBLOCK_BLOCKING_TYPE_TITLE;
                } else if (i != 2) {
                    f510Var = i != 3 ? null : f510.GEOBLOCK_BLOCKING_TYPE_IMAGE;
                } else {
                    f510Var = f510.GEOBLOCK_BLOCKING_TYPE_DESCRIPTION;
                }
                return f510Var == null ? f510.UNRECOGNIZED : f510Var;
            default:
                if (i == 0) {
                    x6w0Var = x6w0.RELEASE_TAG_UNKNOWN;
                } else if (i != 1) {
                    x6w0Var = i != 2 ? null : x6w0.RELEASE_TAG_PRE_RELEASE;
                } else {
                    x6w0Var = x6w0.RELEASE_TAG_LATEST_RELEASE;
                }
                return x6w0Var == null ? x6w0.UNRECOGNIZED : x6w0Var;
        }
    }

    @Override // p204p.dt70
    public Object create() {
        ks30.Companion.getClass();
        return ks30.EMPTY.toBuilder().mo51486e().mo51484c();
    }

    @Override // p204p.uwj
    /* JADX INFO: renamed from: f */
    public Object mo26623f(gfj0 gfj0Var, fbk fbkVar) {
        return swj.f214674a;
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15574b((b4c0) obj);
    }

    @Override // p204p.e411
    /* JADX INFO: renamed from: g */
    public Object mo37705g(eo01 eo01Var, fbk fbkVar) {
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: s */
    public boolean mo60231s(CharSequence charSequence) {
        return false;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f137958a) {
            case 15:
                pj31 pj31Var = (pj31) obj;
                return pj31Var.f178144k == p301.REMOTE && pj31Var.f178143j == 7;
            default:
                PlayerState playerState = (PlayerState) obj;
                ContextTrack contextTrack = (ContextTrack) playerState.track().mo49283h();
                String strUri = contextTrack != null ? contextTrack.uri() : null;
                if (strUri == null) {
                    strUri = "";
                }
                ContextTrack contextTrack2 = (ContextTrack) playerState.track().mo49283h();
                Map mapMetadata = contextTrack2 != null ? contextTrack2.metadata() : null;
                if (mapMetadata == null) {
                    mapMetadata = nau.f152117a;
                }
                Set set = dd41.f47702f;
                return !((r46.m74708A(strUri, gn80.SHOW_EPISODE) && Boolean.parseBoolean((String) mapMetadata.get("has_companion_content"))) ? false : true);
        }
    }

    public /* synthetic */ ly5(Object obj, int i) {
        this.f137958a = i;
    }

    public /* synthetic */ ly5(son sonVar, otn otnVar, int i) {
        this.f137958a = i;
    }

    public /* synthetic */ ly5(boolean z, int i) {
        this.f137958a = i;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        f2h1 gfe0Var;
        boolean z;
        GetAddAccountPageResponse getAddAccountPageResponse = (GetAddAccountPageResponse) obj;
        List list = (List) obj2;
        ae50<Account> ae50VarM2249n = getAddAccountPageResponse.m2249n();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM2249n, 10));
        for (Account account : ae50VarM2249n) {
            wj50.m88279p(account);
            String username = account.getUsername();
            String displayName = account.m2242q().getDisplayName();
            String imageUrl = account.m2242q().getImageUrl();
            int iM2239n = account.m2239n();
            int i = iM2239n == 0 ? -1 : oby.f163770b[edb.m38547C(iM2239n)];
            if (i != -1) {
                if (i == 1) {
                    gfe0Var = new gfe0(account.m2241p().getChildId());
                } else if (i == 2) {
                    gfe0Var = new ffe0(account.m2240o().getChildId());
                } else if (i == 3) {
                    gfe0Var = new hfe0(account.m2244s().m2259o());
                } else if (i == 4) {
                    gfe0Var = new ife0(account.m2243r().m2257o());
                } else if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                AccountProfile accountProfileM2242q = account.m2242q();
                int value = accountProfileM2242q.hasColor() ? accountProfileM2242q.getColor().getValue() : 0;
                if (list.isEmpty()) {
                    z = false;
                    break;
                }
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                        break;
                    }
                    if (wj50.m88271j(((C1681av) it.next()).f20052a, account.getUsername())) {
                        z = true;
                        break;
                    }
                }
                arrayList.add(new j9o0(username, displayName, imageUrl, gfe0Var, value, z));
            }
            throw new IllegalStateException("Account type not supported");
        }
        boolean zM2250o = getAddAccountPageResponse.m2250o();
        boolean zM2261o = getAddAccountPageResponse.m2252q().m2261o();
        if (!getAddAccountPageResponse.m2253r()) {
            getAddAccountPageResponse = null;
        }
        return new q9o0(arrayList, zM2250o, zM2261o, getAddAccountPageResponse != null ? Integer.valueOf(getAddAccountPageResponse.m2251p()) : null);
    }
}
