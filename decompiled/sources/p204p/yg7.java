package p204p;

import com.comscore.streaming.WindowState;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$AuthenticateCredentials;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$AuthnPlatformCredential;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$EmailAddress;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$FacebookAccessToken;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$GoogleSignInCredentials;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$LegacyV3Password;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$NativePassword;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$NaverSignInCredentials;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$OneTimeToken;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$ParentChildCredentials;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$Password;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$PhoneNumber;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$SamsungSignInCredentials;
import com.spotify.authentication.login5esperanto.EsAuthenticateRequest$AuthenticateRequest;
import com.spotify.authentication.login5esperanto.EsAuthenticateResult$AuthenticateFailure;
import com.spotify.authentication.login5esperanto.EsAuthenticateResult$AuthenticateResult;
import com.spotify.authentication.login5esperanto.EsAuthenticateResult$AuthenticateSuccess;
import com.spotify.authentication.login5esperanto.EsAuthnPlatformRequired$AuthnPlatformRequired;
import com.spotify.authentication.login5esperanto.EsCodeRequired$CodeRequired;
import com.spotify.authentication.login5esperanto.EsInteractionRequired$InteractionRequired;
import com.spotify.authentication.login5esperanto.EsRecaptchaInfo$RecaptchaInfo;
import com.spotify.authentication.login5esperanto.EsSignupRequired$SignupRequired;
import com.spotify.connectivity.auth.common.esperanto.proto.EsAuthBlob$AuthBlob;
import com.spotify.connectivity.auth.common.esperanto.proto.EsUnencryptedStoredCredentials$UnencryptedStoredCredentials;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class yg7 implements mg7 {

    /* JADX INFO: renamed from: a */
    public final fta0 f272504a;

    public yg7(fta0 fta0Var) {
        this.f272504a = fta0Var;
    }

    /* JADX INFO: renamed from: a */
    public static String m93586a(ki7 ki7Var) {
        if (ki7Var instanceof ji7) {
            return "Success";
        }
        if (ki7Var instanceof ii7) {
            return "SignupRequired";
        }
        if (!(ki7Var instanceof hi7)) {
            if (!(ki7Var instanceof ai7)) {
                throw new NoWhenBranchMatchedException();
            }
            geg1 geg1Var = ((ai7) ki7Var).f15905a;
            if (geg1Var instanceof kg7) {
                return "SMSCodeChallenge";
            }
            if (geg1Var instanceof ig7) {
                return "EmailCodeChallenge";
            }
            if (geg1Var instanceof jg7) {
                return "InteractionRequiredChallenge";
            }
            if (geg1Var instanceof hg7) {
                return "AuthnPlatformRequiredChallenge";
            }
            throw new NoWhenBranchMatchedException();
        }
        hi7 hi7Var = (hi7) ki7Var;
        if (hi7Var.equals(bi7.f27347a)) {
            return "InvalidCredentials";
        }
        if (hi7Var.equals(ci7.f38245a)) {
            return "InvalidPhoneNumber";
        }
        if (hi7Var.equals(ei7.f59800a)) {
            return "RegionMismatch";
        }
        if (hi7Var.equals(fi7.f69799a)) {
            return "TooManyAttempts";
        }
        if (hi7Var instanceof di7) {
            nh7 nh7Var = ((di7) ki7Var).f49272a;
            return "Network, code: " + nh7Var.f153888a + ", message: " + nh7Var.f153889b;
        }
        if (!(hi7Var instanceof gi7)) {
            throw new NoWhenBranchMatchedException();
        }
        gi7 gi7Var = (gi7) ki7Var;
        return "UnexpectedError, code: " + gi7Var.m44787a().f153888a + ", message: " + gi7Var.m44787a().f153889b;
    }

    /* JADX INFO: renamed from: b */
    public final Single m93587b(xh7 xh7Var) {
        EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials;
        EsRecaptchaInfo$RecaptchaInfo esRecaptchaInfo$RecaptchaInfo;
        yh7 yh7Var = xh7Var.f261456b;
        diw diwVarM3560s = EsAuthenticateRequest$AuthenticateRequest.m3560s();
        seg1 seg1Var = xh7Var.f261455a;
        int i = 0;
        if (seg1Var.equals(ah7.f15632d)) {
            rhw rhwVarM3497A = EsAuthenticateCredentials$AuthenticateCredentials.m3497A();
            rhwVarM3497A.m75523m(EsAuthenticateCredentials$AuthnPlatformCredential.m3511n());
            esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) rhwVarM3497A.build();
        } else if (seg1Var instanceof jh7) {
            aiw aiwVarM3544p = EsAuthenticateCredentials$Password.m3544p();
            aiwVarM3544p.m26117m(((jh7) seg1Var).f112346d);
            rhw rhwVarM3497A2 = EsAuthenticateCredentials$AuthenticateCredentials.m3497A();
            rhwVarM3497A2.m75532y((EsAuthenticateCredentials$Password) aiwVarM3544p.build());
            esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) rhwVarM3497A2.build();
        } else {
            if (seg1Var instanceof kh7) {
                kh7 kh7Var = (kh7) seg1Var;
                biw biwVarM3549r = EsAuthenticateCredentials$PhoneNumber.m3549r();
                biwVarM3549r.m29356r(kh7Var.f122537d);
                String str = kh7Var.f122538e;
                if (str == null) {
                    str = "";
                }
                biwVarM3549r.m29355q(str);
                String str2 = kh7Var.f122539f;
                biwVarM3549r.m29354m(str2 != null ? str2 : "");
                EsAuthenticateCredentials$PhoneNumber esAuthenticateCredentials$PhoneNumber = (EsAuthenticateCredentials$PhoneNumber) biwVarM3549r.build();
                rhw rhwVarM3497A3 = EsAuthenticateCredentials$AuthenticateCredentials.m3497A();
                rhwVarM3497A3.m75533z(esAuthenticateCredentials$PhoneNumber);
                esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) rhwVarM3497A3.build();
            } else if (seg1Var instanceof hh7) {
                yhw yhwVarM3537p = EsAuthenticateCredentials$OneTimeToken.m3537p();
                yhwVarM3537p.m93695m(((hh7) seg1Var).f91299d);
                EsAuthenticateCredentials$OneTimeToken esAuthenticateCredentials$OneTimeToken = (EsAuthenticateCredentials$OneTimeToken) yhwVarM3537p.build();
                rhw rhwVarM3497A4 = EsAuthenticateCredentials$AuthenticateCredentials.m3497A();
                rhwVarM3497A4.m75530w(esAuthenticateCredentials$OneTimeToken);
                esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) rhwVarM3497A4.build();
            } else if (seg1Var instanceof dh7) {
                uhw uhwVarM3523r = EsAuthenticateCredentials$GoogleSignInCredentials.m3523r();
                ep10 ep10Var = ((dh7) seg1Var).f49003d;
                if (ep10Var instanceof cp10) {
                    cp10 cp10Var = (cp10) ep10Var;
                    uhwVarM3523r.m83168m(cp10Var.m33513c());
                    String strM33514g = cp10Var.m33514g();
                    uhwVarM3523r.m83170r(strM33514g != null ? strM33514g : "");
                } else {
                    if (!(ep10Var instanceof dp10)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    uhwVarM3523r.m83169q(((dp10) ep10Var).m36556c());
                }
                rhw rhwVarM3497A5 = EsAuthenticateCredentials$AuthenticateCredentials.m3497A();
                rhwVarM3497A5.m75526s((EsAuthenticateCredentials$GoogleSignInCredentials) uhwVarM3523r.build());
                esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) rhwVarM3497A5.build();
            } else if (seg1Var instanceof ih7) {
                ih7 ih7Var = (ih7) seg1Var;
                zhw zhwVarM3541q = EsAuthenticateCredentials$ParentChildCredentials.m3541q();
                zhwVarM3541q.m96180m(ih7Var.f102188d);
                upw upwVarM7486r = EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.m7486r();
                eg7 eg7Var = ih7Var.f102189e;
                upwVarM7486r.m83731q(eg7Var.f59234a);
                byte[] bArr = eg7Var.f59235b;
                cva cvaVar = gva.f84678b;
                upwVarM7486r.m83730m(gva.m45886d(0, bArr, bArr.length));
                zhwVarM3541q.m96181q((EsUnencryptedStoredCredentials$UnencryptedStoredCredentials) upwVarM7486r.build());
                EsAuthenticateCredentials$ParentChildCredentials esAuthenticateCredentials$ParentChildCredentials = (EsAuthenticateCredentials$ParentChildCredentials) zhwVarM3541q.build();
                rhw rhwVarM3497A6 = EsAuthenticateCredentials$AuthenticateCredentials.m3497A();
                rhwVarM3497A6.m75531x(esAuthenticateCredentials$ParentChildCredentials);
                esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) rhwVarM3497A6.build();
            } else if (seg1Var instanceof lh7) {
                lh7 lh7Var = (lh7) seg1Var;
                ciw ciwVarM3554r = EsAuthenticateCredentials$SamsungSignInCredentials.m3554r();
                ciwVarM3554r.m32905m(lh7Var.f133406d);
                ciwVarM3554r.m32906q();
                ciwVarM3554r.m32907r(lh7Var.f133407e);
                EsAuthenticateCredentials$SamsungSignInCredentials esAuthenticateCredentials$SamsungSignInCredentials = (EsAuthenticateCredentials$SamsungSignInCredentials) ciwVarM3554r.build();
                rhw rhwVarM3497A7 = EsAuthenticateCredentials$AuthenticateCredentials.m3497A();
                rhwVarM3497A7.m75521A(esAuthenticateCredentials$SamsungSignInCredentials);
                esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) rhwVarM3497A7.build();
            } else if (seg1Var instanceof gh7) {
                gh7 gh7Var = (gh7) seg1Var;
                xhw xhwVarM3534q = EsAuthenticateCredentials$NaverSignInCredentials.m3534q();
                xhwVarM3534q.m91066m(gh7Var.f79844d);
                String str3 = gh7Var.f79845e;
                xhwVarM3534q.m91067q(str3 != null ? str3 : "");
                EsAuthenticateCredentials$NaverSignInCredentials esAuthenticateCredentials$NaverSignInCredentials = (EsAuthenticateCredentials$NaverSignInCredentials) xhwVarM3534q.build();
                rhw rhwVarM3497A8 = EsAuthenticateCredentials$AuthenticateCredentials.m3497A();
                rhwVarM3497A8.m75529v(esAuthenticateCredentials$NaverSignInCredentials);
                esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) rhwVarM3497A8.build();
            } else if (seg1Var instanceof ch7) {
                ch7 ch7Var = (ch7) seg1Var;
                thw thwVarM3518q = EsAuthenticateCredentials$FacebookAccessToken.m3518q();
                thwVarM3518q.m80865m(ch7Var.f37941e);
                thwVarM3518q.m80866q(ch7Var.f37940d);
                EsAuthenticateCredentials$FacebookAccessToken esAuthenticateCredentials$FacebookAccessToken = (EsAuthenticateCredentials$FacebookAccessToken) thwVarM3518q.build();
                rhw rhwVarM3497A9 = EsAuthenticateCredentials$AuthenticateCredentials.m3497A();
                rhwVarM3497A9.m75525r(esAuthenticateCredentials$FacebookAccessToken);
                esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) rhwVarM3497A9.build();
            } else if (seg1Var instanceof eh7) {
                eh7 eh7Var = (eh7) seg1Var;
                vhw vhwVarM3526p = EsAuthenticateCredentials$LegacyV3Password.m3526p();
                vhwVarM3526p.m85576q(eh7Var.f59511e);
                vhwVarM3526p.m85575m(eh7Var.f59510d);
                EsAuthenticateCredentials$LegacyV3Password esAuthenticateCredentials$LegacyV3Password = (EsAuthenticateCredentials$LegacyV3Password) vhwVarM3526p.build();
                rhw rhwVarM3497A10 = EsAuthenticateCredentials$AuthenticateCredentials.m3497A();
                rhwVarM3497A10.m75527t(esAuthenticateCredentials$LegacyV3Password);
                esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) rhwVarM3497A10.build();
            } else if (seg1Var instanceof fh7) {
                fh7 fh7Var = (fh7) seg1Var;
                whw whwVarM3530q = EsAuthenticateCredentials$NativePassword.m3530q();
                whwVarM3530q.m88175m(fh7Var.m41648k());
                whwVarM3530q.m88176q(fh7Var.m41649l());
                EsAuthenticateCredentials$NativePassword esAuthenticateCredentials$NativePassword = (EsAuthenticateCredentials$NativePassword) whwVarM3530q.build();
                rhw rhwVarM3497A11 = EsAuthenticateCredentials$AuthenticateCredentials.m3497A();
                rhwVarM3497A11.m75528u(esAuthenticateCredentials$NativePassword);
                esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) rhwVarM3497A11.build();
            } else {
                if (!(seg1Var instanceof bh7)) {
                    throw new NoWhenBranchMatchedException();
                }
                shw shwVarM3514p = EsAuthenticateCredentials$EmailAddress.m3514p();
                shwVarM3514p.m78142m(((bh7) seg1Var).m29203k());
                EsAuthenticateCredentials$EmailAddress esAuthenticateCredentials$EmailAddress = (EsAuthenticateCredentials$EmailAddress) shwVarM3514p.build();
                rhw rhwVarM3497A12 = EsAuthenticateCredentials$AuthenticateCredentials.m3497A();
                rhwVarM3497A12.m75524q(esAuthenticateCredentials$EmailAddress);
                esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) rhwVarM3497A12.build();
            }
        }
        diwVarM3560s.m36128m(esAuthenticateCredentials$AuthenticateCredentials);
        diwVarM3560s.m36130r();
        diwVarM3560s.m36132t(yh7Var.f272751a);
        kyu0 kyu0Var = xh7Var.f261457c;
        if (kyu0Var != null) {
            xnw xnwVarM3638q = EsRecaptchaInfo$RecaptchaInfo.m3638q();
            xnwVarM3638q.m91517m(kyu0Var.m57726a());
            String strM57727b = kyu0Var.m57727b();
            if (strM57727b != null) {
                xnwVarM3638q.m91518q(strM57727b);
            }
            esRecaptchaInfo$RecaptchaInfo = (EsRecaptchaInfo$RecaptchaInfo) xnwVarM3638q.build();
        } else {
            esRecaptchaInfo$RecaptchaInfo = null;
        }
        if (esRecaptchaInfo$RecaptchaInfo != null) {
            diwVarM3560s.m36131s(esRecaptchaInfo$RecaptchaInfo);
        }
        diwVarM3560s.m36129q(xh7Var.f261458d);
        EsAuthenticateRequest$AuthenticateRequest esAuthenticateRequest$AuthenticateRequest = (EsAuthenticateRequest$AuthenticateRequest) diwVarM3560s.build();
        AtomicReference atomicReference = new AtomicReference(null);
        wj50.m88279p(esAuthenticateRequest$AuthenticateRequest);
        ConnectableObservable connectableObservablePublish = this.f272504a.m42589a(esAuthenticateRequest$AuthenticateRequest).publish();
        Single singleSingleOrError = connectableObservablePublish.doOnNext(new xg7(atomicReference, i)).doOnError(new xg7(atomicReference, 1)).doOnSubscribe(new jz0(10, atomicReference, connectableObservablePublish)).take(1L).singleOrError();
        return singleSingleOrError.map(new c06(this, singleSingleOrError, atomicReference, 8));
    }

    /* JADX INFO: renamed from: c */
    public final ki7 m93588c(EsAuthenticateResult$AuthenticateResult esAuthenticateResult$AuthenticateResult, Single single, eh00 eh00Var) {
        int i;
        geg1 kg7Var;
        int iM3575s = esAuthenticateResult$AuthenticateResult.m3575s();
        int i2 = 2;
        switch (iM3575s == 0 ? -1 : ng7.f153576g[edb.m38547C(iM3575s)]) {
            case 1:
                EsAuthenticateResult$AuthenticateSuccess esAuthenticateResult$AuthenticateSuccessM3577u = esAuthenticateResult$AuthenticateResult.m3577u();
                EsAuthBlob$AuthBlob esAuthBlob$AuthBlobM3581p = esAuthenticateResult$AuthenticateSuccessM3577u.m3581p();
                return new ji7(new wi7(esAuthenticateResult$AuthenticateSuccessM3577u.getUsername(), esAuthenticateResult$AuthenticateSuccessM3577u.m3582r() ? new C1856fd(esAuthenticateResult$AuthenticateSuccessM3577u.m3580o().m3477r(), esAuthenticateResult$AuthenticateSuccessM3577u.m3580o().m3476q(), new Date(esAuthenticateResult$AuthenticateSuccessM3577u.m3580o().m3475p().m1969s() * ((long) 1000))) : null, new eg7(esAuthBlob$AuthBlobM3581p.m7481p().getUsername(), esAuthBlob$AuthBlobM3581p.m7481p().m7487q().m45891s())));
            case 2:
                EsAuthenticateResult$AuthenticateFailure esAuthenticateResult$AuthenticateFailureM3573q = esAuthenticateResult$AuthenticateResult.m3573q();
                int iM3565r = esAuthenticateResult$AuthenticateFailureM3573q.m3565r();
                int i3 = iM3565r != 0 ? ng7.f153570a[edb.m38547C(iM3565r)] : -1;
                if (i3 != 1) {
                    return i3 != 2 ? new gi7(new nh7(400, "Esperanto failure: Failure reason NOT_SET")) : new gi7(new nh7(Integer.valueOf(esAuthenticateResult$AuthenticateFailureM3573q.m3566s().m3568n()), esAuthenticateResult$AuthenticateFailureM3573q.m3566s().getMessage()));
                }
                switch (esAuthenticateResult$AuthenticateFailureM3573q.m3563p().ordinal()) {
                    case 1:
                        return new di7(new nh7(400, "Aborted"));
                    case 2:
                        return new gi7(new nh7(400, "Unsupported Response"));
                    case 3:
                        return new gi7(new nh7(400, "Non Successful Response"));
                    case 4:
                        return new di7(new nh7(400, "HTTP Transport Error"));
                    case 5:
                        return new gi7(new nh7(400, "Unsupported Authentication Method"));
                    case 6:
                        return new gi7(new nh7(400, "Invalid Arguments"));
                    case 7:
                        return new di7(new nh7(503, "Unknown Backend Error"));
                    case 8:
                        return bi7.f27347a;
                    case 9:
                        return new di7(new nh7(400, "Bad Request"));
                    case 10:
                        return new gi7(new nh7(400, "Unsupported Login Protocol"));
                    case 11:
                        return new di7(new nh7(400, "Request Timeout"));
                    case 12:
                        return new gi7(new nh7(400, "Unknown Identifier"));
                    case 13:
                        return fi7.f69799a;
                    case 14:
                        return ci7.f38245a;
                    case 15:
                        return new di7(new nh7(503, "Try Again Later"));
                    case 16:
                        return new gi7(new nh7(400, "Hash mismatch"));
                    case 17:
                        return new gi7(new nh7(Integer.valueOf(WindowState.MAXIMIZED), "Not Allowed"));
                    default:
                        return new gi7(new nh7(Integer.valueOf(esAuthenticateResult$AuthenticateFailureM3573q.m3564q()), "Unexpected failure from Login5"));
                }
            case 3:
                EsSignupRequired$SignupRequired esSignupRequired$SignupRequiredM3576t = esAuthenticateResult$AuthenticateResult.m3576t();
                String name = esSignupRequired$SignupRequiredM3576t.getName();
                String strM3642q = esSignupRequired$SignupRequiredM3576t.m3642q();
                boolean zM3646u = esSignupRequired$SignupRequiredM3576t.m3646u();
                String strM3641o = esSignupRequired$SignupRequiredM3576t.m3641o();
                int iOrdinal = esSignupRequired$SignupRequiredM3576t.m3644s().ordinal();
                if (iOrdinal != 1) {
                    i = 3;
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            i = 1;
                        } else {
                            i2 = 4;
                            i = i2;
                        }
                    }
                } else {
                    i = i2;
                }
                return new ii7(new m621(name, strM3642q, zM3646u, strM3641o, i, esSignupRequired$SignupRequiredM3576t.m3648w(), esSignupRequired$SignupRequiredM3576t.m3647v(), esSignupRequired$SignupRequiredM3576t.m3643r(), esSignupRequired$SignupRequiredM3576t.m3645t()));
            case 4:
                EsCodeRequired$CodeRequired esCodeRequired$CodeRequiredM3572p = esAuthenticateResult$AuthenticateResult.m3572p();
                AtomicReference atomicReference = new AtomicReference(Boolean.FALSE);
                og7 og7Var = new og7(atomicReference, eh00Var, 1);
                if (ng7.f153573d[esCodeRequired$CodeRequiredM3572p.m3596o().m3605u().ordinal()] == 1) {
                    int i4 = 1;
                    kg7Var = new ig7(esCodeRequired$CodeRequiredM3572p.m3596o().m3601q(), esCodeRequired$CodeRequiredM3572p.m3596o().m3600o(), esCodeRequired$CodeRequiredM3572p.m3596o().m3604t(), new Date(TimeUnit.SECONDS.toMillis(esCodeRequired$CodeRequiredM3572p.m3596o().m3602r())), esCodeRequired$CodeRequiredM3572p.m3596o().m3603s(), new ug7(atomicReference, this, esCodeRequired$CodeRequiredM3572p.m3597p(), single, eh00Var, i4), new qg7(atomicReference, this, esCodeRequired$CodeRequiredM3572p.m3597p(), single, eh00Var, i4), og7Var);
                } else {
                    int i5 = 0;
                    ug7 ug7Var = new ug7(atomicReference, this, esCodeRequired$CodeRequiredM3572p.m3597p(), single, eh00Var, i5);
                    sg7 sg7Var = new sg7(atomicReference, this, esCodeRequired$CodeRequiredM3572p.m3597p(), single, eh00Var, i5);
                    kg7Var = new kg7(esCodeRequired$CodeRequiredM3572p.m3596o().m3599n(), esCodeRequired$CodeRequiredM3572p.m3596o().m3600o(), esCodeRequired$CodeRequiredM3572p.m3596o().m3604t(), new Date(TimeUnit.SECONDS.toMillis(esCodeRequired$CodeRequiredM3572p.m3596o().m3602r())), esCodeRequired$CodeRequiredM3572p.m3596o().m3603s(), ug7Var, new sr5(sg7Var, 29), og7Var, sg7Var);
                }
                return new ai7(kg7Var);
            case 5:
                EsInteractionRequired$InteractionRequired esInteractionRequired$InteractionRequiredM3574r = esAuthenticateResult$AuthenticateResult.m3574r();
                AtomicReference atomicReference2 = new AtomicReference(Boolean.FALSE);
                return new ai7(new jg7(esInteractionRequired$InteractionRequiredM3574r.m3625q(), new sg7(atomicReference2, this, esInteractionRequired$InteractionRequiredM3574r.m3624o(), single, eh00Var, 1), new og7(atomicReference2, eh00Var, 2)));
            case 6:
                EsAuthnPlatformRequired$AuthnPlatformRequired esAuthnPlatformRequired$AuthnPlatformRequiredM3571o = esAuthenticateResult$AuthenticateResult.m3571o();
                AtomicReference atomicReference3 = new AtomicReference(Boolean.FALSE);
                return new ai7(new hg7(esAuthnPlatformRequired$AuthnPlatformRequiredM3571o.m3585p().m45891s(), new qg7(atomicReference3, this, esAuthnPlatformRequired$AuthnPlatformRequiredM3571o.m3584n(), single, eh00Var, 0), new og7(atomicReference3, eh00Var, 0)));
            default:
                return new gi7(new nh7(400, "Esperanto failure: incomplete response"));
        }
    }
}
