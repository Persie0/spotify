package p204p;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.spotify.allboarding.entrypoint.EntryPoint;
import com.spotify.allboarding.model.p020v2.proto.OnboardingResponse;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class c961 implements a49, df0, Function, ant, InterfaceC1667ah, SingleOnSubscribe, n58, t6l0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35410a;

    /* JADX INFO: renamed from: b */
    public Object f35411b;

    public /* synthetic */ c961(Object obj, int i) {
        this.f35410a = i;
        this.f35411b = obj;
    }

    /* JADX INFO: renamed from: c */
    public static c961 m31864c(boolean z, int i, int i2, int i3, int i4) {
        return new c961(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z), 2);
    }

    /* JADX INFO: renamed from: a */
    public boolean m31865a() {
        return ((AccessibilityNodeInfo.CollectionItemInfo) this.f35411b).isHeading();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Completable completableFlatMapCompletable;
        switch (this.f35410a) {
            case 5:
                return ((uu0) this.f35411b).f234053b.mo48412a((h8p0) obj).ignoreElement();
            case 6:
                return new nya0(((dz0) this.f35411b).f54476j.f225056n, ((s6x0) obj).f206218a);
            case 9:
                gqy0 gqy0Var = (gqy0) obj;
                tu1 tu1Var = (tu1) this.f35411b;
                String str = gqy0Var.f83579d;
                if (str.length() != 0) {
                    return g0b1.m43282x(dau.f47107a, new l1v0((n1v0) tu1Var.f223741b, gqy0Var.f83581f, null, 0)).m23293d(Observable.just(new ety0(str, gqy0Var.f83580e)));
                }
                Observable observableEmpty = Observable.empty();
                wj50.m88279p(observableEmpty);
                return observableEmpty;
            case 12:
                return new s6x0(rqg1.m76242m((OnboardingResponse) obj, (EntryPoint) this.f35411b));
            case 17:
                return Single.create(new egb1((eh4) this.f35411b, 15));
            case 22:
                c06 c06Var = (c06) this.f35411b;
                return new d07(((wb11) c06Var.f32694b).mo35842b((Context) c06Var.f32696d, (String) obj), (xz6) c06Var.f32695c);
            case 23:
                return ((cu5) this.f35411b).m33877s((ta10) obj);
            case 24:
                MessagePresentationStatus messagePresentationStatus = (MessagePresentationStatus) obj;
                messagePresentationStatus.toString();
                tf7 tf7Var = ((uf7) this.f35411b).f229707b;
                Single single = tf7Var.f219873c;
                if (messagePresentationStatus instanceof MessagePresentationStatus.Presented) {
                    completableFlatMapCompletable = single.flatMapCompletable(new hd41(tf7Var, 24));
                } else if (messagePresentationStatus instanceof MessagePresentationStatus.Dismissed) {
                    DismissReason dismissReason = ((MessagePresentationStatus.Dismissed) messagePresentationStatus).getDismissReason();
                    if ((dismissReason instanceof DismissReason.MessageButtonTapped) && wj50.m88271j(((DismissReason.MessageButtonTapped) dismissReason).getButton().getIdentifier(), "Primary")) {
                        completableFlatMapCompletable = single.flatMapCompletable(new brl0(tf7Var, 27));
                    } else {
                        completableFlatMapCompletable = CompletableEmpty.f7437a;
                        wj50.m88279p(completableFlatMapCompletable);
                    }
                } else {
                    completableFlatMapCompletable = CompletableEmpty.f7437a;
                }
                return completableFlatMapCompletable.m23293d(Observable.just(w2a1.f247311a));
            default:
                b040 b040Var = (b040) obj;
                return b040Var instanceof zz30 ? Single.timer(1L, TimeUnit.SECONDS).flatMap(new yic1((d97) this.f35411b, 27)) : Single.just(b040Var);
        }
    }

    @Override // p204p.df0
    /* JADX INFO: renamed from: b */
    public void mo31866b(Object obj) {
        ((hg0) this.f35411b).mo24737a(obj);
    }

    @Override // p204p.a49
    /* JADX INFO: renamed from: g */
    public void mo24685g(xt60 xt60Var, x4b x4bVar, xuk xukVar, C2401t5 c2401t5, C2148n1 c2148n1) {
        if (xt60Var.f265775a.isEmpty()) {
            return;
        }
        di41 di41VarM89578u = x0h1.m89578u(xukVar, null, 0, new C2272px(x4bVar, xt60Var, c2148n1, c2401t5, null, 0), 3);
        synchronized (((ArrayList) this.f35411b)) {
            ((ArrayList) this.f35411b).add(di41VarM89578u);
        }
    }

    @Override // p204p.a49
    /* JADX INFO: renamed from: i */
    public void mo24686i() {
        synchronized (((ArrayList) this.f35411b)) {
            try {
                Iterator it = ((ArrayList) this.f35411b).iterator();
                while (it.hasNext()) {
                    ((tf60) it.next()).mo26601e(null);
                }
                ((ArrayList) this.f35411b).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p204p.InterfaceC1667ah
    /* JADX INFO: renamed from: q */
    public boolean mo1561q(View view) {
        ((eh00) this.f35411b).invoke();
        return true;
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        bji bjiVar;
        bji bjiVar2;
        bji bjiVar3;
        bji bjiVar4;
        bji bjiVar5;
        switch (this.f35410a) {
            case 15:
                w54 w54Var = (w54) this.f35411b;
                fnk0 fnk0Var = w54Var.f247990i;
                if (fnk0Var == null || !fnk0Var.m42228h("android-feature-nowplaying-queue-bottom-sheet.enable_mft_plus_queue")) {
                    bjiVar = fnk0Var;
                    bjiVar = w54Var.f247991j;
                }
                if (bjiVar != null) {
                }
                break;
            case 16:
                d94 d94Var = (d94) this.f35411b;
                fnk0 fnk0Var2 = d94Var.f46665b;
                if (fnk0Var2 == null || !fnk0Var2.m42228h("android-genalpha-limitedexperienceindicator.enabled")) {
                    bjiVar2 = fnk0Var2;
                    bjiVar2 = d94Var.f46666c;
                }
                if (bjiVar2 != null) {
                }
                break;
            case 17:
            default:
                gi5 gi5Var = (gi5) this.f35411b;
                fnk0 fnk0Var3 = gi5Var.f80068r;
                if (fnk0Var3 == null || !fnk0Var3.m42228h("apps-music-libs-eventsender.send_events_on_bcd_event")) {
                    bjiVar5 = fnk0Var3;
                    bjiVar5 = gi5Var.f80069s;
                }
                if (bjiVar5 != null) {
                }
                break;
            case 18:
                hp4 hp4Var = (hp4) this.f35411b;
                fnk0 fnk0Var4 = hp4Var.f93694b;
                if (fnk0Var4 == null || !fnk0Var4.m42228h("android-shuffle-settings-algorithm.settings_item_visible")) {
                    bjiVar3 = fnk0Var4;
                    bjiVar3 = hp4Var.f93695c;
                }
                if (bjiVar3 != null) {
                }
                break;
            case 19:
                zh5 zh5Var = (zh5) this.f35411b;
                fnk0 fnk0Var5 = zh5Var.f282806d;
                if (fnk0Var5 == null || !fnk0Var5.m42228h("apps-music-features-remoteconfiguration.button_color")) {
                    bjiVar4 = fnk0Var5;
                    bjiVar4 = zh5Var.f282807e;
                }
                if (bjiVar4 != null) {
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        String string;
        String string2;
        gug1 x21Var;
        String string3;
        String strConcat;
        String strM77246e;
        String strConcat2;
        int i;
        a11 a11Var = (a11) obj;
        d31 d31Var = (d31) this.f35411b;
        PublishSubject publishSubject = d31Var.f44731Z;
        boolean z = d31Var.f44736e;
        r0e1 r0e1Var = d31Var.f44732a;
        View view = d31Var.f44722L0;
        if (a11Var != null) {
            String str = a11Var.f11228b;
            int i2 = a11Var.f11227a;
            rk7 rk7Var = a11Var.f11230d;
            z01 z01Var = a11Var.f11229c;
            boolean z2 = z01Var instanceof c01;
            if (z2) {
                string = ((c01) z01Var).getTitle();
            } else {
                string = z01Var instanceof h01 ? ((h01) z01Var).f86096a : view.getContext().getString(R.string.error_dialog_generic_error);
            }
            String string4 = "";
            if (z2) {
                string2 = ((c01) z01Var).mo31065g();
            } else if (z01Var instanceof h01) {
                string2 = g6f.m43753y0(((h01) z01Var).f86097b, "\n", null, null, null, 62);
            } else if (z01Var instanceof r01) {
                string2 = view.getContext().getString(R.string.error_dialog_network_body);
            } else if (z01Var instanceof g01) {
                string2 = ((g01) z01Var).f75231a ? view.getContext().getString(R.string.error_dialog_network_body) : "";
                wj50.m88279p(string2);
            } else {
                string2 = "";
            }
            String str2 = "adaptive_authentication";
            if (z01Var instanceof e01) {
                x21Var = new p21(string, string2);
            } else {
                if (z01Var instanceof g01) {
                    x21Var = ((g01) z01Var).f75231a ? new x21(string, string2, rk7Var) : new o21(string, string2, rk7Var, false);
                } else if ((z01Var instanceof w01) || (z01Var instanceof x01) || (z01Var instanceof r01)) {
                    x21Var = new x21(string, string2, rk7Var);
                } else if (z01Var instanceof s01) {
                    x21Var = new u21(((s01) z01Var).f204280a);
                } else if (z01Var instanceof h01) {
                    x21Var = new o21(string, string2, rk7Var, false);
                } else if (z01Var instanceof y01) {
                    x21Var = new o21(string, string2, null, true);
                } else if (z01Var instanceof i01) {
                    rk7 rk7Var2 = ((i01) z01Var).f97088a;
                    int i3 = rk7Var2 == null ? -1 : z21.f278460a[rk7Var2.ordinal()];
                    if (i3 == 1 || i3 == 2) {
                        string3 = view.getContext().getString(R.string.error_incorrect_credentials_email);
                    } else if (i3 == 3) {
                        string3 = view.getContext().getString(R.string.magiclink_error_dialog_text_link_expired);
                    } else if (i3 == 4) {
                        string3 = view.getContext().getString(R.string.qr_code_expired_dialog_title);
                    } else if (i3 != 5) {
                        string3 = view.getContext().getString(R.string.error_dialog_generic_error);
                    } else {
                        string3 = z ? view.getContext().getString(R.string.qr_code_expired_fma_upgrade_dialog_title) : view.getContext().getString(R.string.qr_code_expired_dialog_title);
                    }
                    wj50.m88279p(string3);
                    int i4 = rk7Var2 == null ? -1 : z21.f278460a[rk7Var2.ordinal()];
                    if (i4 == 4) {
                        string4 = view.getContext().getString(R.string.qr_code_expired_dialog_body_text);
                    } else if (i4 == 5) {
                        string4 = z ? view.getContext().getString(R.string.qr_code_expired_fma_upgrade_dialog_body) : view.getContext().getString(R.string.qr_code_expired_dialog_body_text);
                    }
                    wj50.m88279p(string4);
                    x21Var = new q21(string3, string4, rk7Var2);
                } else if (z01Var instanceof j01) {
                    x21Var = new r21(view.getContext().getString(R.string.error_dialog_title_invalid_phone_number), view.getContext().getString(R.string.error_dialog_body_invalid_phone_number));
                } else {
                    boolean z3 = z01Var instanceof u01;
                    m21 m21Var = m21.f139180b;
                    if (z3) {
                        ((ubq0) r0e1Var.f194478b).mo59114a(new pbq0(str2, "session_terminated_during_authentication", 4, ((u01) z01Var).f225343a));
                        publishSubject.onNext(new b21(null));
                    } else if (z01Var instanceof f01) {
                        publishSubject.onNext(((f01) z01Var).f64523a ? z11.f278201a : new b21(null));
                    } else if (z01Var instanceof t01) {
                        t661 t661Var = ((t01) z01Var).f215711a;
                        if (t661Var instanceof l661) {
                            x21Var = new o21(string, string2, null, false);
                        } else {
                            if (wj50.m88271j(t661Var, m661.f140398a)) {
                                string = view.getContext().getString(R.string.error_registration_disabled_title_facebook);
                            } else if (wj50.m88271j(t661Var, n661.f150719a)) {
                                string = view.getContext().getString(R.string.error_registration_disabled_title_google);
                            } else if (wj50.m88271j(t661Var, q661.f185694a)) {
                                string = view.getContext().getString(R.string.error_registration_disabled_title_naver);
                            } else if (wj50.m88271j(t661Var, r661.f196181a)) {
                                string = view.getContext().getString(R.string.error_registration_disabled_title_phone_number);
                            } else {
                                wj50.m88271j(t661Var, l661.f130240a);
                            }
                            wj50.m88279p(string);
                            x21Var = new v21(string, t661Var, rk7Var);
                        }
                    } else if (z01Var instanceof o01) {
                        x21Var = new s21(((o01) z01Var).f160206a);
                    } else if (z01Var instanceof q01) {
                        x21Var = new o21(string, string2, null, true);
                    } else {
                        Map map = null;
                        if (z01Var instanceof p01) {
                            ((ubq0) r0e1Var.f194478b).mo59114a(new qbq0(str2, 4, map, "missing_challenge"));
                            x21Var = new o21(string, string2, null, true);
                        } else if (z01Var instanceof v01) {
                            x21Var = new w21(string, string2, d31Var.f44733b || d31Var.f44734c);
                        } else {
                            if (!(z01Var instanceof d01)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            d01 d01Var = (d01) z01Var;
                            x21Var = new n21(d01Var.f43692a, d01Var.f43693b);
                        }
                    }
                    x21Var = m21Var;
                }
            }
            d31.m34795a(d31Var, x21Var);
            ubq0 ubq0Var = (ubq0) r0e1Var.f194478b;
            String str3 = "adaptiveauth_failed_challenge";
            String str4 = "otp_request_failure";
            String str5 = "email";
            String str6 = "phone_number";
            switch (edb.m38547C(i2)) {
                case 0:
                    return;
                case 1:
                    int i5 = rk7Var != null ? ly0.f137922a[rk7Var.ordinal()] : -1;
                    if (i5 == 1) {
                        str6 = "email";
                    } else if (i5 != 2) {
                        if (i5 != 3) {
                            str6 = i5 != 4 ? null : "graduation_email";
                        } else {
                            str6 = "google";
                        }
                    }
                    if (str6 == null || (strConcat = "adaptive_auth_api_create_".concat(str6)) == null) {
                        strConcat = "adaptive_auth_api_create";
                    }
                    ubq0Var.mo59114a(new pbq0("adaptive_authentication", strConcat, "none", str));
                    return;
                case 2:
                    r0e1Var.m74385p(24, str);
                    return;
                case 3:
                    Map map2 = null;
                    int i6 = 4;
                    r0e1Var.m74385p(23, str);
                    if (wj50.m88271j(str, "failure")) {
                        ubq0Var.mo59114a(new qbq0(str2, i6, map2, str3));
                        return;
                    }
                    return;
                case 4:
                    int i7 = rk7Var != null ? ly0.f137922a[rk7Var.ordinal()] : -1;
                    if (i7 != 1) {
                        if (i7 != 2) {
                            str5 = i7 != 3 ? null : "google";
                        } else {
                            str5 = "phone_number";
                        }
                    }
                    boolean z4 = z01Var instanceof i01;
                    String str7 = "region_mismatch";
                    String str8 = "invalid_credentials";
                    if (z4) {
                        strM77246e = "invalid_credentials";
                    } else if (z01Var instanceof r01) {
                        Integer num = ((r01) z01Var).f194345a;
                        if (num == null || (strM77246e = s571.m77246e(num.intValue(), "network_")) == null) {
                            strM77246e = "network";
                        }
                    } else if (z01Var instanceof j01) {
                        strM77246e = "invalid_phone_number";
                    } else if (z01Var instanceof x01) {
                        Integer num2 = ((x01) z01Var).f256749a;
                        if (num2 == null || (strM77246e = s571.m77246e(num2.intValue(), "unexpected_")) == null) {
                            strM77246e = "unexpected";
                        }
                    } else {
                        strM77246e = ((z01Var instanceof o01) && wj50.m88271j(((o01) z01Var).f160206a, m01.f138483a)) ? "region_mismatch" : null;
                    }
                    if (str5 == null || (strConcat2 = "error_sdk_auth-client_start_".concat(str5)) == null) {
                        strConcat2 = "error_sdk_auth-client_start";
                    }
                    ubq0Var.mo59114a(new pbq0("adaptive_authentication", strConcat2, "none", strM77246e));
                    if (z4) {
                        if (((i01) z01Var).f97088a != rk7.f200008b) {
                            i = 4;
                        } else {
                            if (ly0.f137923b[edb.m38547C(i2)] != 1) {
                                throw new IllegalStateException("Unsupported Error Source");
                            }
                            i = 4;
                            ubq0Var.mo59114a(new pbq0(str2, "error_sdk_auth-client-authenticate_one-time-token", i, str8));
                        }
                        ubq0Var.mo59114a(new qbq0(str2, i, null, str8));
                        return;
                    }
                    String str9 = null;
                    Object[] objArr = 0;
                    if (z01Var instanceof q01) {
                        ubq0Var.mo59114a(new pbq0(str2, "login_while_session_already_exists", 12, str9));
                        return;
                    } else {
                        if ((z01Var instanceof o01) && (((o01) z01Var).f160206a instanceof m01)) {
                            ubq0Var.mo59114a(new qbq0(str2, 4, objArr == true ? 1 : 0, str7));
                            return;
                        }
                        return;
                    }
                case 5:
                    r0e1Var.m74385p(25, null);
                    return;
                case 6:
                    r0e1Var.m74385p(26, null);
                    return;
                case 7:
                    ubq0Var.mo59114a(new qbq0(str2, 4, null, str3));
                    return;
                case 8:
                    ubq0Var.mo59114a(new qbq0(str2, 4, null, str4));
                    return;
                case 9:
                    int i8 = 4;
                    ubq0Var.mo59114a(new qbq0(str2, i8, null, str4));
                    ubq0Var.mo59114a(new pbq0(str2, "error_sdk_auth-client_resend-code", i8, str));
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public swd1 mo24684x(View view, swd1 swd1Var) {
        p19 p19Var = (p19) this.f35411b;
        p19Var.f172999h = swd1Var.m79537a();
        p19Var.f173000i = swd1Var.m79538b();
        p19Var.f173001j = swd1Var.m79539c();
        p19Var.m68780f();
        return swd1Var;
    }

    public c961(fc6 fc6Var) {
        this.f35410a = 14;
        this.f35411b = new mjc0(bzf1.m31021m(fc6Var.f68013b), 1);
    }

    public c961(int i) {
        this.f35410a = i;
        switch (i) {
            case 29:
                break;
            default:
                this.f35411b = new ArrayList();
                break;
        }
    }
}
