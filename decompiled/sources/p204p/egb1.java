package p204p;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.spotify.fitness.workoutimpl.domain.effecthandlers.CueAudioPlaybackCancelledException;
import com.spotify.mobius.functions.Consumer;
import com.spotify.pam.p118v2.Action;
import com.spotify.pam.p118v2.AstroMember;
import com.spotify.pam.p118v2.BenefitListItems;
import com.spotify.pam.p118v2.GetAstroOnManagementRequest;
import com.spotify.pam.p118v2.GetAstroOnManagementResponse;
import com.spotify.playlist.p126ai.creation.p127v2.GetPusherMessageResponse;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class egb1 implements Function, InterfaceC1667ah, jg0, ant, InterfaceC2207oa, BiFunction, SingleOnSubscribe, uq7, lmr, n19 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59298a;

    /* JADX INFO: renamed from: b */
    public Object f59299b;

    public /* synthetic */ egb1(Object obj, int i) {
        this.f59298a = i;
        this.f59299b = obj;
    }

    @Override // p204p.jg0
    /* JADX INFO: renamed from: V */
    public df0 mo38841V(hsg1 hsg1Var, gh00 gh00Var, gh00 gh00Var2) {
        return new c961(((zf0) this.f59299b).mo34131f0(new ag0(gh00Var2), hsg1Var), 4);
    }

    @Override // p204p.lmr
    /* JADX INFO: renamed from: a */
    public void mo38842a() {
        Consumer consumer = (Consumer) ((q58) this.f59299b).f185456b;
        if (consumer != null) {
            consumer.accept(z48.f279162a);
        }
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return ((od4) this.f59299b).m66740a() && ((ihi) obj).f102295b;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public /* synthetic */ Object apply(Object obj, Object obj2) {
        return ((va1) this.f59299b).invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: b */
    public void m38843b() {
        n95 n95Var = (n95) this.f59299b;
        n95Var.getClass();
        if (p2l.f173365a.contains(n95Var)) {
            return;
        }
        try {
            b95.m28453c(1);
        } catch (Throwable th) {
            p2l.m68953a(n95Var, th);
        }
    }

    @Override // p204p.uq7
    /* JADX INFO: renamed from: c */
    public xul0 mo37748c(Uri uri, ar7 ar7Var) {
        ((e45) this.f59299b).getClass();
        return C2244p5.f174033a;
    }

    @Override // p204p.uq7
    /* JADX INFO: renamed from: d */
    public Bundle mo37749d(String str, String str2, int i, String str3) {
        return ((e45) this.f59299b).mo37749d(str, str2, i, str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: e */
    public Object m38844e(String str, ibk ibkVar) {
        nj8 nj8Var;
        Integer numM29807r0;
        if (ibkVar instanceof nj8) {
            nj8Var = (nj8) ibkVar;
            int i = nj8Var.f154466c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nj8Var.f154466c = i - Integer.MIN_VALUE;
            } else {
                nj8Var = new nj8(this, ibkVar);
            }
        } else {
            nj8Var = new nj8(this, ibkVar);
        }
        Object objM45569n = nj8Var.f154464a;
        int i2 = nj8Var.f154466c;
        if (i2 == 0) {
            bga.m29073P(objM45569n);
            yl6 yl6VarM94152a = yl6.m94152a((str == null || (numM29807r0 = bm51.m29807r0(str)) == null) ? 0 : numM29807r0.intValue());
            grm0.f83795a.getClass();
            grm0 grm0Var = (grm0) this.f59299b;
            p610 p610VarM16446p = GetAstroOnManagementRequest.m16446p();
            p610VarM16446p.m69175q();
            p610VarM16446p.m69174m(yl6VarM94152a);
            GetAstroOnManagementRequest getAstroOnManagementRequest = (GetAstroOnManagementRequest) p610VarM16446p.build();
            nj8Var.f154466c = 1;
            objM45569n = grm0Var.m45569n(getAstroOnManagementRequest, nj8Var);
            yuk yukVar = yuk.f276404a;
            if (objM45569n == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM45569n);
        }
        GetAstroOnManagementResponse getAstroOnManagementResponse = (GetAstroOnManagementResponse) objM45569n;
        String strM16450q = getAstroOnManagementResponse.m16450q();
        String title = getAstroOnManagementResponse.getTitle();
        String description = getAstroOnManagementResponse.getDescription();
        String strM16449p = getAstroOnManagementResponse.m16449p();
        w00 w00Var = new w00(null, null, getAstroOnManagementResponse.m16453t().getTitle(), null, getAstroOnManagementResponse.m16453t().getUri(), 11);
        String title2 = getAstroOnManagementResponse.m16451r().getTitle();
        ae50<AstroMember> ae50VarM16405o = getAstroOnManagementResponse.m16451r().m16405o();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM16405o, 10));
        for (AstroMember astroMember : ae50VarM16405o) {
            Action actionM16402s = astroMember.m16402s();
            if (getAstroOnManagementResponse.m16454u()) {
                actionM16402s = astroMember.m16398o().getTitle().length() > 0 ? astroMember.m16398o() : astroMember.m16397n();
            }
            String strM16400q = astroMember.m16400q();
            String name = astroMember.getName();
            String description2 = astroMember.getDescription();
            String strM16399p = astroMember.m16399p();
            String str2 = strM16399p.length() == 0 ? "#FFFFFF" : strM16399p;
            String strM16393p = actionM16402s.m16393p();
            String strM16392n = actionM16402s.m16392n();
            arrayList.add(new wf1(strM16400q, name, description2, str2, new w00(strM16393p, strM16392n.length() == 0 ? "#FFFFFF" : strM16392n, actionM16402s.getTitle(), null, actionM16402s.getUri(), 8), astroMember.m16401r()));
        }
        String strM16393p2 = getAstroOnManagementResponse.m16451r().m16404n().m16393p();
        String strM16392n2 = getAstroOnManagementResponse.m16451r().m16404n().m16392n();
        xf1 xf1Var = new xf1(title2, arrayList, new w00(strM16393p2, strM16392n2.length() == 0 ? "#FFFFFF" : strM16392n2, getAstroOnManagementResponse.m16451r().m16404n().getTitle(), null, getAstroOnManagementResponse.m16451r().m16404n().getUri(), 8));
        String title3 = getAstroOnManagementResponse.m16447n().getTitle();
        ae50<BenefitListItems> ae50VarM16416n = getAstroOnManagementResponse.m16447n().m16416n();
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(ae50VarM16416n, 10));
        for (BenefitListItems benefitListItems : ae50VarM16416n) {
            arrayList2.add(new w00(benefitListItems.m16419n(), null, benefitListItems.m16421p(), null, null, 26));
        }
        return new kf1(strM16450q, title, description, xf1Var, new ld1(title3, arrayList2, new w00(null, null, getAstroOnManagementResponse.m16447n().m16417o(), null, getAstroOnManagementResponse.m16447n().m16418p(), 11)), strM16449p, w00Var, new zf1(getAstroOnManagementResponse.m16452s().getTitle(), getAstroOnManagementResponse.m16452s().m16547o(), getAstroOnManagementResponse.m16452s().m16548p()), getAstroOnManagementResponse.m16454u(), new w00(getAstroOnManagementResponse.m16448o().m16395n().m16393p(), null, getAstroOnManagementResponse.m16448o().m16395n().getTitle(), getAstroOnManagementResponse.m16448o().m16395n().getSubtitle(), getAstroOnManagementResponse.m16448o().m16395n().getUri(), 2));
    }

    /* JADX INFO: renamed from: f */
    public ByteBuffer m38845f() {
        return ((Image.Plane) this.f59299b).getBuffer();
    }

    @Override // p204p.uq7
    /* JADX INFO: renamed from: g */
    public Intent mo37750g(zew zewVar, String str, String str2) {
        return ((e45) this.f59299b).mo37750g(zewVar, str, str2);
    }

    /* JADX INFO: renamed from: h */
    public int m38846h() {
        return ((Image.Plane) this.f59299b).getPixelStride();
    }

    @Override // p204p.uq7
    /* JADX INFO: renamed from: i */
    public Bundle mo37751i(String str, String str2, String str3) {
        Bundle bundleM93449h = ydj.m93449h("CODE", str, "RESPONSE_TYPE", "code");
        bundleM93449h.putString("STATE", str2);
        return bundleM93449h;
    }

    @Override // p204p.uq7
    /* JADX INFO: renamed from: j */
    public Intent mo37752j(Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtras(bundle);
        return intent;
    }

    /* JADX INFO: renamed from: k */
    public int m38847k() {
        return ((Image.Plane) this.f59299b).getRowStride();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public Object m38848l(w4e1 w4e1Var, ibk ibkVar) {
        m07 m07Var;
        if (ibkVar instanceof m07) {
            m07Var = (m07) ibkVar;
            int i = m07Var.f138553d;
            if ((i & Integer.MIN_VALUE) != 0) {
                m07Var.f138553d = i - Integer.MIN_VALUE;
            } else {
                m07Var = new m07(this, ibkVar);
            }
        } else {
            m07Var = new m07(this, ibkVar);
        }
        Object obj = m07Var.f138551b;
        int i2 = m07Var.f138553d;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                d0m d0mVar = (d0m) this.f59299b;
                byte[] bArr = w4e1Var.f247799a;
                m07Var.f138550a = w4e1Var;
                m07Var.f138553d = 1;
                Object objM24419d = ((a14) d0mVar).m24419d(bArr, m07Var);
                yuk yukVar = yuk.f276404a;
                if (objM24419d == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                w4e1Var = m07Var.f138550a;
                bga.m29073P(obj);
            }
            return new y5e1(w4e1Var.f247800b);
        } catch (CueAudioPlaybackCancelledException unused) {
            return new w5e1(w4e1Var.f247800b);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            r0m r0mVarM76887a = s0m.m76887a(5, e2);
            String message = e2.getMessage();
            if (message == null) {
                message = "Audio playback failed";
            }
            return new x5e1(message, w4e1Var.f247800b, r0mVarM76887a.f194523a);
        }
    }

    @Override // p204p.uq7
    /* JADX INFO: renamed from: m */
    public xul0 mo37753m(Uri uri, zew zewVar, String str) {
        ((e45) this.f59299b).getClass();
        return C2244p5.f174033a;
    }

    @Override // p204p.InterfaceC1667ah
    /* JADX INFO: renamed from: q */
    public boolean mo1561q(View view) {
        return ((View) this.f59299b).callOnClick();
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        bji bjiVar;
        switch (this.f59298a) {
            case 15:
                eh4 eh4Var = (eh4) this.f59299b;
                singleEmitter.onSuccess(new dh4(((Boolean) Single.create(new s5f1(eh4Var, 18)).blockingGet()).booleanValue(), ((Boolean) Single.create(new ckx0(eh4Var, 19)).blockingGet()).booleanValue()));
                break;
            default:
                gi5 gi5Var = (gi5) this.f59299b;
                fnk0 fnk0Var = gi5Var.f80068r;
                if (fnk0Var == null || !fnk0Var.m42228h("apps-music-libs-eventsender.background_worker_send_on_stop")) {
                    bjiVar = fnk0Var;
                    bjiVar = gi5Var.f80069s;
                }
                if (bjiVar != null) {
                }
                break;
        }
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        x11 x11Var = (x11) obj;
        d31 d31Var = (d31) this.f59299b;
        r0e1 r0e1Var = d31Var.f44732a;
        PublishSubject publishSubject = d31Var.f44731Z;
        String str = "adaptive_authentication";
        Map map = null;
        if (x11Var instanceof k11) {
            if (((k11) x11Var).f118183c instanceof f11) {
                ((ubq0) r0e1Var.f194478b).mo59114a(new qbq0(str, 4, map, "adaptiveauth_successful_challenge"));
                d31.m34795a(d31Var, t21.f216400b);
                d31Var.f44725O0.onNext(ag61.f15301a);
                return;
            }
            return;
        }
        if (x11Var instanceof p11) {
            b01 b01Var = ((p11) x11Var).f172910a;
            if (b01Var instanceof a01) {
                publishSubject.onNext(new d21(((a01) b01Var).f10973a));
                ((ubq0) r0e1Var.f194478b).mo59114a(new rbq0("adaptive_authentication", "web_challenge_launcher"));
                return;
            } else if (b01Var instanceof yz0) {
                yz0 yz0Var = (yz0) b01Var;
                publishSubject.onNext(new h21(yz0Var.f277649a, yz0Var.f277650b, yz0Var.f277651c, yz0Var.f277652d));
                return;
            } else {
                if (!(b01Var instanceof xz0)) {
                    throw new NoWhenBranchMatchedException();
                }
                xz0 xz0Var = (xz0) b01Var;
                publishSubject.onNext(new e21(xz0Var.f267488a, xz0Var.f267489b, xz0Var.f267490c, xz0Var.f267491d, xz0Var.f267492e, xz0Var.f267493f, xz0Var.f267494g, xz0Var.f267495h, xz0Var.f267496i));
                return;
            }
        }
        if (x11Var instanceof w11) {
            publishSubject.onNext(new j21(((w11) x11Var).f246922a, null));
            return;
        }
        if (x11Var instanceof n11) {
            n11 n11Var = (n11) x11Var;
            publishSubject.onNext(new a21(n11Var.f149260a, n11Var.f149261b, n11Var.f149262c));
            return;
        }
        boolean z = x11Var instanceof o11;
        m21 m21Var = m21.f139180b;
        if (z) {
            d31.m34795a(d31Var, m21Var);
            o11 o11Var = (o11) x11Var;
            publishSubject.onNext(o11Var.f160562a ? z11.f278201a : new b21(o11Var.f160563b));
        } else if (x11Var instanceof v11) {
            d31.m34795a(d31Var, m21Var);
            publishSubject.onNext(new f21(((v11) x11Var).f236216a));
        } else if (x11Var instanceof m11) {
            d31.m34795a(d31Var, m21Var);
            publishSubject.onNext(new i21(((m11) x11Var).f138789a));
        }
    }

    public egb1(int i) {
        this.f59298a = i;
        switch (i) {
            case 26:
                break;
            default:
                this.f59299b = new e45(1);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f59298a) {
            case 1:
                ((Boolean) obj).getClass();
                ((C2062kq) this.f59299b).f125178h = true;
                return CompletableEmpty.f7437a;
            case 4:
                return ((vu0) this.f59299b).f244800b.mo48412a((h8p0) obj).ignoreElement();
            case 5:
                dz0 dz0Var = (dz0) this.f59299b;
                return vjf1.m85770t(dau.f47107a, new C2241p2(dz0Var, (kya0) obj, null, 5)).map(new c961(dz0Var, 6)).toObservable();
            case 7:
                k1v0 k1v0Var = ((tu1) this.f59299b).f223741b;
                String str = ((qg51) obj).f188383e;
                return g0b1.m43282x(dau.f47107a, new l1v0((n1v0) k1v0Var, str, null, 0)).m23299p(Functions.f7232h).m23293d(Observable.just(new wg51(str)));
            case 9:
                GetPusherMessageResponse getPusherMessageResponse = (GetPusherMessageResponse) obj;
                return lt2.m59855b((lt2) this.f59299b, new dt2(getPusherMessageResponse.getMessageId(), getPusherMessageResponse.getStatus(), getPusherMessageResponse.hasPlaylist() ? getPusherMessageResponse.getPlaylist() : null, getPusherMessageResponse.getSubmitTimestamp(), getPusherMessageResponse.getUpdatedTimestamp(), new mke0(g6f.m43724h1(getPusherMessageResponse.getMessagePreferences().getExcludedUrisList()), g6f.m43724h1(getPusherMessageResponse.getMessagePreferences().getIncludedUrisList()))), Observable.empty());
            case 12:
                return Single.create(new s5f1((yx3) this.f59299b, 15));
            case 13:
                return Single.create(new s5f1((w84) this.f59299b, 16));
            case 19:
                xrl0 xrl0Var = (xrl0) obj;
                qv5 qv5Var = (qv5) this.f59299b;
                return new kv5(new d2k0(qv5Var.f192875d.f236405a.m57999d(qv5Var.f192872a), new j6x(xrl0Var.f265371a, xrl0Var.f265372b)));
            case 28:
                ((ia9) this.f59299b).f100199y1 = (z99) obj;
                return CompletableEmpty.f7437a;
            default:
                return ((cl9) ((vk9) this.f59299b).f242171b).m33257c().onErrorReturnItem(new om50()).toObservable();
        }
    }

    public egb1(ip10 ip10Var, r46 r46Var) {
        this.f59298a = 10;
        this.f59299b = ip10Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a A[PHI: r10
      0x002a: PHI (r10v1 int) = (r10v0 int), (r10v3 int), (r10v4 int) binds: [B:5:0x001a, B:10:0x0023, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    public egb1(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        this.f59298a = 18;
        int i2 = 1;
        int length = fArr.length - 1;
        ji5[][] ji5VarArr = new ji5[length][];
        int i3 = 1;
        int i4 = 1;
        int i5 = 0;
        while (i5 < length) {
            int i6 = iArr[i5];
            int i7 = 3;
            if (i6 == 0) {
                i = i7;
            } else if (i6 == i2) {
                i3 = i2;
                i = i3;
            } else {
                if (i6 != 2) {
                    if (i6 != 3) {
                        i7 = 4;
                        if (i6 != 4) {
                            i7 = 5;
                            if (i6 != 5) {
                                i = i4;
                            } else {
                                i = i7;
                            }
                        } else {
                            i = i7;
                        }
                    } else {
                        if (i3 != i2) {
                            i3 = i2;
                        }
                        i = i3;
                    }
                }
                i3 = 2;
                i = i3;
            }
            float[] fArr3 = fArr2[i5];
            int i8 = i5 + 1;
            float[] fArr4 = fArr2[i8];
            float f = fArr[i5];
            float f2 = fArr[i8];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            ji5[] ji5VarArr2 = new ji5[length2];
            int i9 = 0;
            while (i9 < length2) {
                int i10 = i9 * 2;
                int i11 = i9;
                int i12 = i10 + 1;
                ji5VarArr2[i11] = new ji5(i, f, f2, fArr3[i10], fArr3[i12], fArr4[i10], fArr4[i12]);
                i9 = i11 + 1;
            }
            ji5VarArr[i5] = ji5VarArr2;
            i5 = i8;
            i4 = i;
            i2 = 1;
        }
        this.f59299b = ji5VarArr;
    }

    public egb1(Context context) {
        this.f59298a = 16;
        this.f59299b = new n95(context, (String) null);
    }
}
