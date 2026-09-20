package p204p;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.spotify.jam.internal.socialconnect.models.ActiveJoinRequest;
import com.spotify.jam.internal.socialconnect.models.CancelJoinRequest;
import com.spotify.libs.sociallistening.events.proto.SocialConnectInviteNotificationCriteriaMetV1;
import com.spotify.music.R;
import com.spotify.player.model.PlayerState;
import com.spotify.share.linkpreview.impl.proto.SetLinkPreviewRequest;
import com.spotify.share.linkpreview.impl.proto.SetLinkPreviewResponse;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class po10 implements kdl0, w111, Function, rdc1, Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f179558a;

    /* JADX INFO: renamed from: b */
    public final Object f179559b;

    /* JADX INFO: renamed from: c */
    public Object f179560c;

    public /* synthetic */ po10(int i, Object obj, Object obj2) {
        this.f179558a = i;
        this.f179559b = obj;
        this.f179560c = obj2;
    }

    /* JADX INFO: renamed from: a */
    public static final n0v0 m70453a(po10 po10Var, f0v0 f0v0Var) {
        po10Var.getClass();
        return new n0v0(f0v0Var.getUri(), f0v0Var.mo31344b(), f0v0Var.mo31343a(), new is9(lau.f131415a, false), f0v0Var.getPosition(), f0v0Var.mo31345d());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a A[Catch: IOException -> 0x006d, TryCatch #0 {IOException -> 0x006d, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x005b), top: B:30:0x0000 }] */
    /* JADX INFO: renamed from: i */
    public static po10 m70454i(String... strArr) {
        String str;
        try {
            iva[] ivaVarArr = new iva[strArr.length];
            npa npaVar = new npa();
            for (int i = 0; i < strArr.length; i++) {
                String str2 = strArr[i];
                String[] strArr2 = yl60.f273920e;
                npaVar.m65298J(34);
                int length = str2.length();
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    char cCharAt = str2.charAt(i3);
                    if (cCharAt < 128) {
                        str = strArr2[cCharAt];
                        if (str != null) {
                            if (i2 < i3) {
                                npaVar.m65303P(i2, i3, str2);
                            }
                            npaVar.m65304Q(str);
                            i2 = i3 + 1;
                        }
                    } else {
                        if (cCharAt == 8232) {
                            str = "\\u2028";
                        } else if (cCharAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i2 < i3) {
                            npaVar.m65303P(i2, i3, str2);
                        }
                        npaVar.m65304Q(str);
                        i2 = i3 + 1;
                    }
                }
                if (i2 < length) {
                    npaVar.m65303P(i2, length, str2);
                }
                npaVar.m65298J(34);
                npaVar.readByte();
                ivaVarArr[i] = npaVar.mo45417J0(npaVar.f156904b);
            }
            return new po10(18, (String[]) strArr.clone(), vbg1.m85153x(ivaVarArr));
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f179558a) {
            case 4:
                return x09.m89520l((x09) ((khy0) this.f179559b).f122742b, new CancelJoinRequest(((d830) obj).f46349c), null, 2, null).map(new cdv((p0i0) this.f179560c, 17)).onErrorReturn(mly.f144971f).toObservable();
            case 5:
                pqm0 pqm0Var = (pqm0) obj;
                u730 u730Var = (u730) pqm0Var.f180350a;
                u730 u730Var2 = (u730) pqm0Var.f180351b;
                mvo mvoVar = (mvo) this.f179559b;
                ActiveJoinRequest activeJoinRequest = (ActiveJoinRequest) this.f179560c;
                return new d930(new s730(u730Var, u730Var2, mvoVar.m62966b(activeJoinRequest.playbackDeviceInfo), activeJoinRequest.rawPlaybackControl));
            case 8:
                return ((FlowableElementAtSingle) this.f179559b).flatMapCompletable(new u6x((j331) this.f179560c, 21)).m23307y();
            case 9:
                tes0 tes0Var = (tes0) this.f179560c;
                qal qalVar = (qal) this.f179559b;
                if (((Boolean) obj).booleanValue()) {
                    Observable observableFlatMapObservable = vjf1.m85770t(dau.f47107a, new f620(qalVar, tes0Var, null, 19)).flatMapObservable(new xyx(20, qalVar, tes0Var));
                    wj50.m88279p(observableFlatMapObservable);
                    return observableFlatMapObservable;
                }
                Observable observableJust = Observable.just(khs0.f122718a);
                wj50.m88279p(observableJust);
                return observableJust;
            case 14:
                PlayerState playerState = (PlayerState) obj;
                jo50 jo50Var = (jo50) this.f179559b;
                String str = (String) this.f179560c;
                jo50Var.getClass();
                return Boolean.valueOf(playerState.isPlaying() && !playerState.isPaused() && hdi.m47210B(playerState).equals(str));
            case 16:
                String str2 = (String) this.f179560c;
                xul0 xul0Var = (xul0) obj;
                okj0 okj0Var = (okj0) ((yho) this.f179559b).f272932g;
                if (!((cx50) xul0Var.mo49278b()).f42915i.f286925d) {
                    okj0.m67207P(okj0Var, str2, null, 22);
                    return Boolean.FALSE;
                }
                String str3 = ((cx50) xul0Var.mo49278b()).f42907a;
                t6v t6vVar = (t6v) okj0Var.f166384e;
                dd31 dd31VarM12863p = SocialConnectInviteNotificationCriteriaMetV1.m12863p();
                dd31VarM12863p.m35692m(str3);
                dd31VarM12863p.m35693q(str2);
                SocialConnectInviteNotificationCriteriaMetV1 socialConnectInviteNotificationCriteriaMetV1 = (SocialConnectInviteNotificationCriteriaMetV1) dd31VarM12863p.build();
                qre0 qre0Var = t6vVar.f217611a;
                wj50.m88279p(socialConnectInviteNotificationCriteriaMetV1);
                qre0Var.m73616a(socialConnectInviteNotificationCriteriaMetV1);
                return Boolean.TRUE;
            case 19:
                c570 c570Var = (c570) obj;
                if (!(c570Var instanceof a570)) {
                    if (c570Var instanceof b570) {
                        return Single.just(Boolean.FALSE);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                ((a570) c570Var).f12454a.m83184a(((u570) this.f179559b).f226927a, true);
                FlowableFilter flowableFilterM23360y = ((z470) this.f179560c).f279153f.m23360y(y4y.f269273i);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                return flowableFilterM23360y.m23344Y(5L, Flowable.m23326x(new TimeoutException())).m23331J(fby.f67946i).m23361z(Boolean.FALSE);
            case 26:
                List list = (List) obj;
                ae80 ae80Var = (ae80) this.f179559b;
                String str4 = ae80Var.f14811k.f204979a;
                int i = ae80Var.f14807g.f152688e;
                z2c z2cVar = new z2c(list, !list.isEmpty(), null, gbu.f78413a, ae80Var.f14807g);
                z2c z2cVarM95186q = z2cVar.mo34825c((List) this.f179560c);
                if ((2 & 1) == 0) {
                    z2cVar = z2cVarM95186q;
                }
                if ((2 & 2) == 0) {
                    i = 0;
                }
                return Collections.singletonMap(str4, new rnm0(z2cVar, i));
            case 28:
                ugz.m83056o((ugz) this.f179559b, false, (Context) this.f179560c);
                return CompletableEmpty.f7437a;
            default:
                q6n0 q6n0Var = (q6n0) obj;
                gf41 gf41Var = (gf41) this.f179560c;
                nm90 nm90Var = (nm90) this.f179559b;
                wns wnsVar = nm90Var.f155328b;
                String str5 = q6n0Var.f185865a;
                Long l = q6n0Var.f185866b;
                if (str5 == null || l == null) {
                    Observable observableJust2 = Observable.just(new r6n0(0L, "inferred-party-end"));
                    wj50.m88279p(observableJust2);
                    return observableJust2;
                }
                Observable observableMerge = Observable.merge(wnsVar.mo61021a(nm90Var.f155329c, str5, gf41Var.toString()).map(new csy(nm90Var, l)), wnsVar.mo61024d(str5, gf41Var.toString()).filter(yby.f271297X).map(new ykq(nm90Var, l.longValue(), 4)));
                wj50.m88279p(observableMerge);
                return observableMerge;
        }
    }

    /* JADX INFO: renamed from: b */
    public m6d0 m70455b() {
        return (m6d0) ((yum0) this.f179560c).getValue();
    }

    /* JADX INFO: renamed from: c */
    public jkj m70456c(h6z0 h6z0Var, zbv zbvVar, int i, rcm0 rcm0Var, String str, String str2, String str3, String str4) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f179560c;
        String str5 = h6z0Var.f88297a;
        y64 y64Var = (y64) this.f179559b;
        if (y64Var.m92912j0()) {
            return new mjj(m70457d(h6z0Var, zbvVar, i, rcm0Var, str, str2, str3, 1, str4));
        }
        boolean z = y64Var.m92887U() && !linkedHashSet.contains(str5);
        linkedHashSet.add(str5);
        return new njj(new k150(h6z0Var.f88300d, m70457d(h6z0Var, zbvVar, i, rcm0Var, str, str2, str3, 2, str4), z));
    }

    /* JADX INFO: renamed from: d */
    public i150 m70457d(h6z0 h6z0Var, zbv zbvVar, int i, rcm0 rcm0Var, String str, String str2, String str3, int i2, String str4) {
        String str5 = zbvVar.f281397b;
        String str6 = zbvVar.f281398c;
        String str7 = zbvVar.f281396a;
        String str8 = h6z0Var.f88297a;
        String strM38566o = edb.m38566o("spotify:internal:search:prompt:generate:", Uri.encode(str2), ":", Uri.encode(str5));
        int iOrdinal = ((y64) this.f179559b).m92906g0().ordinal();
        int i3 = 1;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i3 = 2;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = 3;
            }
        }
        if ((2048 & 16) != 0) {
            i3 = 1;
        }
        return new i150(str5, str6, str7, i2, i3, rcm0Var, i, str8, str, strM38566o, (2048 & 1024) != 0 ? null : str3, false, (2048 & 4096) != 0 ? null : str4);
    }

    /* JADX INFO: renamed from: e */
    public int m70458e(int i) {
        m6d0 m6d0VarM70455b = m70455b();
        lp70 lp70Var = (lp70) this.f179559b;
        return m6d0VarM70455b.mo24774d(lp70Var.f135674c1.f263386d, lp70Var.m59637n(), i);
    }

    /* JADX INFO: renamed from: f */
    public int m70459f(int i) {
        m6d0 m6d0VarM70455b = m70455b();
        lp70 lp70Var = (lp70) this.f179559b;
        return m6d0VarM70455b.mo24772b(lp70Var.f135674c1.f263386d, lp70Var.m59637n(), i);
    }

    /* JADX INFO: renamed from: g */
    public int m70460g(int i) {
        m6d0 m6d0VarM70455b = m70455b();
        lp70 lp70Var = (lp70) this.f179559b;
        return m6d0VarM70455b.mo24773c(lp70Var.f135674c1.f263386d, lp70Var.m59637n(), i);
    }

    @Override // p204p.rdc1
    public View getRoot() {
        return (FrameLayout) this.f179559b;
    }

    /* JADX INFO: renamed from: h */
    public int m70461h(int i) {
        m6d0 m6d0VarM70455b = m70455b();
        lp70 lp70Var = (lp70) this.f179559b;
        return m6d0VarM70455b.mo24775e(lp70Var.f135674c1.f263386d, lp70Var.m59637n(), i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r8 == r4) goto L22;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m70462j(qm80 qm80Var, ibk ibkVar) {
        jm80 jm80Var;
        km80 km80Var;
        if (ibkVar instanceof jm80) {
            jm80Var = (jm80) ibkVar;
            int i = jm80Var.f113791d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jm80Var.f113791d = i - Integer.MIN_VALUE;
            } else {
                jm80Var = new jm80(this, ibkVar);
            }
        } else {
            jm80Var = new jm80(this, ibkVar);
        }
        Object objM56896a = jm80Var.f113789b;
        int i2 = jm80Var.f113791d;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                km80Var = jm80Var.f113788a;
                bga.m29073P(objM56896a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM56896a);
            }
            SetLinkPreviewResponse setLinkPreviewResponse = (SetLinkPreviewResponse) objM56896a;
            return new sm80(setLinkPreviewResponse.getPreviewId(), setLinkPreviewResponse.getImageUrl());
        }
        bga.m29073P(objM56896a);
        km80 km80Var2 = (km80) this.f179559b;
        C1668ai c1668ai = (C1668ai) this.f179560c;
        jm80Var.f113788a = km80Var2;
        jm80Var.f113791d = 1;
        Object objM26042u = c1668ai.m26042u(qm80Var, jm80Var);
        if (objM26042u != yukVar) {
            objM56896a = objM26042u;
            km80Var = km80Var2;
        }
        return yukVar;
        jm80Var.f113788a = null;
        jm80Var.f113791d = 2;
        objM56896a = km80Var.m56896a((SetLinkPreviewRequest) objM56896a, jm80Var);
    }

    /* JADX INFO: renamed from: k */
    public void m70463k(m6d0 m6d0Var) {
        ((yum0) this.f179560c).setValue(m6d0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.w111
    /* JADX INFO: renamed from: l */
    public Object mo28227l(eo01 eo01Var, fbk fbkVar) throws Throwable {
        ww20 ww20Var;
        e2r e2rVar;
        String str;
        if (fbkVar instanceof ww20) {
            ww20Var = (ww20) fbkVar;
            int i = ww20Var.f255678d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ww20Var.f255678d = i - Integer.MIN_VALUE;
            } else {
                ww20Var = new ww20(this, (ibk) fbkVar);
            }
        } else {
            ww20Var = new ww20(this, (ibk) fbkVar);
        }
        Object objM89557A = ww20Var.f255676b;
        int i2 = ww20Var.f255678d;
        fbk fbkVar2 = null;
        if (i2 == 0) {
            bga.m29073P(objM89557A);
            qw20 qw20Var = (qw20) zn91.m96523K(eo01Var.f61265b, "highlightsstats.share.loader_params", qw20.class);
            if (qw20Var == null || (e2rVar = (e2r) zn91.m96523K(eo01Var.f61265b, "highlightsstats.share.destination_list_configuration", e2r.class)) == null) {
                return null;
            }
            sw20 sw20Var = (sw20) this.f179560c;
            ww20Var.f255675a = e2rVar;
            ww20Var.f255678d = 1;
            objM89557A = x0h1.m89557A(sw20Var.f214566d, new dbz(sw20Var, qw20Var, fbkVar2, 29), ww20Var);
            yuk yukVar = yuk.f276404a;
            if (objM89557A == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e2rVar = ww20Var.f255675a;
            bga.m29073P(objM89557A);
        }
        List list = (List) objM89557A;
        fgz fgzVar = (fgz) ((Optional) ((jw20) this.f179559b).m54399a().blockingFirst()).orElse(null);
        int i3 = fgzVar == null ? -1 : vw20.f245381a[fgzVar.ordinal()];
        if (i3 == -1) {
            str = "listeningstats";
        } else if (i3 != 1) {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "listeningstats";
        } else {
            str = "your-sound-capsule";
        }
        return new e211(list, 0, new gji(new ku01(e2rVar)), str);
    }

    @Override // p204p.kdl0
    public void onSuccess(Object obj) {
        weg1 weg1Var = (weg1) obj;
        hqb hqbVar = (hqb) this.f179559b;
        try {
            qo10 qo10Var = (qo10) this.f179560c;
            wj50.m88279p(weg1Var);
            hqbVar.resumeWith(qo10.m73363b(qo10Var, weg1Var));
        } catch (Exception e) {
            hqbVar.resumeWith(new e851(5, 1, e));
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        return wj50.m88271j(playerState.contextUri(), ((lrg1) this.f179559b).mo27974l()) || wj50.m88271j(playerState.contextUri(), (String) this.f179560c);
    }

    public po10(Activity activity) {
        this.f179558a = 6;
        this.f179560c = activity;
        TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(new int[]{R.attr.pasteColorPlaceholderBackground});
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        this.f179559b = drawable;
    }

    public po10(ViewGroup viewGroup) {
        this.f179558a = 22;
        while (!wj50.m88271j(viewGroup.getTag(), Integer.valueOf(R.id.now_playing_container_tag))) {
            ViewParent parent = viewGroup.getParent();
            viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup == null) {
                viewGroup = null;
                break;
            }
        }
        if (viewGroup != null) {
            View viewFindViewById = viewGroup.findViewById(R.id.carousel_item_safe_barrier_bottom);
            if (viewFindViewById == null) {
                throw new IllegalStateException("Failed to find carousel_item_safe_barrier_bottom");
            }
            this.f179559b = viewFindViewById;
            return;
        }
        throw new IllegalStateException("Failed to find parent");
    }

    public po10(y64 y64Var) {
        this.f179558a = 10;
        this.f179559b = y64Var;
        this.f179560c = new LinkedHashSet();
    }

    public po10(lp70 lp70Var, m6d0 m6d0Var) {
        this.f179558a = 12;
        this.f179559b = lp70Var;
        this.f179560c = sam.m77645B(m6d0Var);
    }

    public po10() {
        this.f179558a = 20;
        this.f179559b = new ArrayList(0);
        this.f179560c = new ArrayList(0);
    }
}
