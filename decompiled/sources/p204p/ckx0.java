package p204p;

import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ScrollView;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import com.spotify.authentication.login5esperanto.EsCodeRequired$CodeRequiredProceedResult;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.jam.internal.socialconnect.models.AvailableJam;
import com.spotify.jam.internal.socialconnect.models.AvailableMember;
import com.spotify.jam.internal.socialconnect.models.JoinOption;
import com.spotify.jam.internal.socialconnect.models.ResolvedJam;
import com.spotify.jam.internal.socialconnect.models.ResolvedToken;
import com.spotify.jam.internal.socialconnect.models.Visibility;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.music.R;
import com.spotify.player.model.ErrorType;
import com.spotify.player.model.PlayerError;
import com.spotify.playlist.p126ai.creation.p127v2.ChatMessage;
import com.spotify.playlist.p126ai.creation.p127v2.Sender;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableToSingle;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class ckx0 implements InterfaceC1667ah, Function, gie0, ObservableOnSubscribe, t6l0, q5w0, ant, SingleOnSubscribe, Init, Predicate, bi71 {

    /* JADX INFO: renamed from: c */
    public static ckx0 f39107c;

    /* JADX INFO: renamed from: d */
    public static final dkx0 f39108d = new dkx0(0, false, false, 0, 0);

    /* JADX INFO: renamed from: e */
    public static final ckx0 f39109e = new ckx0(new int[]{1, 2, 4}, 1);

    /* JADX INFO: renamed from: f */
    public static final ckx0 f39110f = new ckx0(new int[]{1, 2}, 1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39111a;

    /* JADX INFO: renamed from: b */
    public Object f39112b;

    public /* synthetic */ ckx0(Object obj, int i) {
        this.f39111a = i;
        this.f39112b = obj;
    }

    /* JADX INFO: renamed from: j */
    public static synchronized ckx0 m33205j() {
        try {
            if (f39107c == null) {
                f39107c = new ckx0(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f39107c;
    }

    @Override // p204p.bi71
    /* JADX INFO: renamed from: a */
    public av91 mo29290a(String str) {
        obg0 obg0Var = (obg0) this.f39112b;
        yt91 yt91VarM96903c = obg0Var.f163644c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("thumbnail_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, obg0Var.f163643b, System.currentTimeMillis());
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Boolean bool;
        switch (this.f39111a) {
            case 3:
                e301 e301Var = (e301) obj;
                C2062kq c2062kq = (C2062kq) this.f39112b;
                if (e301Var.f55572b) {
                    c2062kq.f125177g = e301Var.f55571a;
                    c2062kq.f125178h = false;
                    return CompletableEmpty.f7437a;
                }
                if (eng1.m39502h(e301Var.f55576f)) {
                    CompletableEmpty completableEmpty = CompletableEmpty.f7437a;
                    wj50.m88279p(completableEmpty);
                    return completableEmpty;
                }
                Completable completableFlatMapCompletable = ((jf61) c2062kq.f125173c.get()).f111831b.firstOrError().flatMapCompletable(new s5f1(c2062kq, 3));
                completableFlatMapCompletable.getClass();
                return completableFlatMapCompletable.m23299p(Functions.f7232h);
            case 7:
                dz0 dz0Var = (dz0) this.f39112b;
                geg1 geg1Var = dz0Var.f54472f.f133106a;
                dva0 dva0Var = dz0Var.f54473g;
                w0b0 w0b0Var = dva0Var.f53406a;
                cva0 cva0Var = (w0b0Var == null || (bool = dva0Var.f53407b) == null) ? null : new cva0(w0b0Var, bool.booleanValue());
                jy0 jy0VarM51874a = ((iy0) dz0Var.f54469c).m51874a();
                rk7 rk7VarM54736a = jy0VarM51874a.m54736a();
                return new xua0(geg1Var, cva0Var, rk7VarM54736a != null ? new hy0(jy0VarM51874a.m54738c(), jy0VarM51874a.m54737b(), rk7VarM54736a) : null);
            case 8:
                return Single.fromCallable(new x31(0, (c41) this.f39112b, (qta0) obj));
            case 9:
                hiu0 hiu0Var = (hiu0) obj;
                return new CompletableToSingle(g0b1.m43282x(dau.f47107a, new C1968i6((zh1) this.f39112b, new ju61(hiu0Var.f91885b, hiu0Var.f91884a), hiu0Var, null, 7)), new yh1(hiu0Var, 0), null).onErrorReturn(new s5f1(hiu0Var, 9));
            case 12:
                ChatMessage chatMessage = (ChatMessage) obj;
                Sender sender = chatMessage.getSender();
                int i = sender == null ? -1 : kt2.f126116a[sender.ordinal()];
                if (i != -1) {
                    if (i == 1) {
                        return Observable.just(new qke0(chatMessage.getMessageId(), chatMessage.getSubmitTimestamp(), chatMessage.getStatus().getMessage(), new mke0(g6f.m43724h1(chatMessage.getMessagePreferences().getExcludedUrisList()), g6f.m43724h1(chatMessage.getMessagePreferences().getIncludedUrisList()))));
                    }
                    if (i == 2 || i == 3) {
                        return lt2.m59855b((lt2) this.f39112b, new dt2(chatMessage.getMessageId(), chatMessage.getStatus(), chatMessage.getPlaylist(), chatMessage.getSubmitTimestamp(), chatMessage.getUpdatedTimestamp(), new mke0(g6f.m43724h1(chatMessage.getMessagePreferences().getExcludedUrisList()), g6f.m43724h1(chatMessage.getMessagePreferences().getIncludedUrisList()))), Observable.empty());
                    }
                    if (i != 4 && i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Observable.error(new Exception("Unknown sender"));
            case 14:
                return ((ya3) this.f39112b).m93176j(ka3.f120773g, za3.f280970g);
            case 23:
                pqm0 pqm0Var = (pqm0) obj;
                lcf lcfVar = (lcf) pqm0Var.f180350a;
                PlayerError playerError = (PlayerError) pqm0Var.f180351b;
                jr5 jr5Var = (jr5) this.f39112b;
                boolean zM50680c = jr5Var.f115082f.m50680c();
                Object cr5Var = dr5.f52168a;
                if (!zM50680c) {
                    if (!(lcfVar instanceof icf) && !jr5.m54170b(jr5Var, lcfVar)) {
                        cr5Var = new cr5(ErrorType.UNKNOWN);
                    }
                    Single singleJust = Single.just(cr5Var);
                    wj50.m88279p(singleJust);
                    return singleJust;
                }
                if ((lcfVar instanceof icf) || jr5.m54170b(jr5Var, lcfVar)) {
                    if (jr5.m54170b(jr5Var, lcfVar)) {
                        return Single.just(cr5Var);
                    }
                    return playerError.error() == ErrorType.SUCCESS ? Single.just(cr5Var) : Single.just(new cr5(playerError.error()));
                }
                Single singleJust2 = Single.just(new cr5(ErrorType.UNKNOWN));
                wj50.m88279p(singleJust2);
                return singleJust2;
            case 26:
                y5f y5fVar = (y5f) ((Map) obj).get(((q97) this.f39112b).f186514a);
                return new j2y(y5fVar != null ? y5fVar.f269419c : false);
            case 27:
                ((eh00) this.f39112b).invoke();
                return ng7.f153572c[((EsCodeRequired$CodeRequiredProceedResult) obj).m3613n().m3607o().ordinal()] == 1 ? new oyx0(new nh7(400, "Esperanto failure: unknown context")) : new oyx0(new nh7(400, "Esperanto failure: incomplete response"));
            default:
                y5f y5fVar2 = (y5f) ((Map) obj).get(((eo7) this.f39112b).f61331a);
                return Boolean.valueOf(y5fVar2 != null ? y5fVar2.f269417a : false);
        }
    }

    @Override // p204p.gie0
    /* JADX INFO: renamed from: b */
    public void mo29244b(zge0 zge0Var, boolean z) {
        if (zge0Var instanceof gr51) {
            ((gr51) zge0Var).f83646z.mo45461l().m96064d(false);
        }
        gie0 gie0Var = ((b50) this.f39112b).f23455e;
        if (gie0Var != null) {
            gie0Var.mo29244b(zge0Var, z);
        }
    }

    @Override // p204p.q5w0
    /* JADX INFO: renamed from: c */
    public void mo33206c(long j, String str) {
        ((w9q0) ((z43) this.f39112b).f279104c).mo29821d();
    }

    @Override // p204p.q5w0
    /* JADX INFO: renamed from: d */
    public void mo33207d(long j, String str) {
        ((w9q0) ((z43) this.f39112b).f279104c).mo29823f();
    }

    @Override // p204p.gie0
    /* JADX INFO: renamed from: f */
    public boolean mo29245f(zge0 zge0Var) {
        b50 b50Var = (b50) this.f39112b;
        if (zge0Var == b50Var.f23453c) {
            return false;
        }
        ((gr51) zge0Var).f83645A.getClass();
        b50Var.getClass();
        gie0 gie0Var = b50Var.f23455e;
        if (gie0Var != null) {
            return gie0Var.mo29245f(zge0Var);
        }
        return false;
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        ab5 ab5Var = (ab5) obj;
        wj50.m88279p(ab5Var);
        za5 za5Var = ((db5) this.f39112b).f47206f.f67724a;
        return First.m15575c(ab5Var, s601.m77311n0(za5Var != null ? new qa5(za5Var) : null));
    }

    /* JADX INFO: renamed from: g */
    public void m33209g(IconCompat iconCompat) {
        int iM396j = iconCompat.m396j();
        for (int i : (int[]) this.f39112b) {
            if (iM396j == i) {
                if (iM396j != 4 || "content".equalsIgnoreCase(iconCompat.m397k().getScheme())) {
                    return;
                }
                throw new IllegalArgumentException("Unsupported URI scheme for: " + iconCompat);
            }
        }
        throw new IllegalArgumentException(s571.m77246e(iM396j, "Custom icon type is not allowed: "));
    }

    /* JADX INFO: renamed from: h */
    public cx50 m33210h(ResolvedJam resolvedJam) {
        int i;
        xw50 xw50Var;
        AvailableJam availableJam = resolvedJam.availableJam;
        xx50 xx50VarM62966b = ((mvo) this.f39112b).m62966b(availableJam.playbackInfo);
        List list = resolvedJam.resolvedTokens;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Set setM43736n1 = g6f.m43736n1(arrayList);
                String str = availableJam.joinToken.token;
                List<AvailableMember> list2 = availableJam.members;
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(list2, 10));
                for (AvailableMember availableMember : list2) {
                    String str2 = availableMember.displayName;
                    if (str2 == null) {
                        str2 = "";
                    }
                    arrayList2.add(new bx50(str2, availableMember.username, availableMember.imageUrl, availableMember.isHost, availableMember.isAnonymous));
                }
                List<JoinOption> list3 = resolvedJam.joinOptions;
                ArrayList arrayList3 = new ArrayList(i6f.m49804T(list3, 10));
                for (JoinOption joinOption : list3) {
                    int iOrdinal = joinOption.f4773c.ordinal();
                    if (iOrdinal == 0) {
                        i = 1;
                    } else if (iOrdinal == 1) {
                        i = 2;
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = 3;
                    }
                    arrayList3.add(new ax50(i, new yw50(joinOption.hostApproval.required)));
                }
                boolean z = availableJam.capabilities.blockHost;
                boolean z2 = xx50VarM62966b.f266869g.f245621c != null;
                Visibility visibility = resolvedJam.visibility;
                return new cx50(str, setM43736n1, str, arrayList2, xx50VarM62966b, arrayList3, z, new zw50(z2, visibility.nudge, visibility.persistentSurface, visibility.inviteNotification));
            }
            int iOrdinal2 = ((ResolvedToken) it.next()).f4847c.ordinal();
            if (iOrdinal2 == 0) {
                xw50Var = null;
            } else if (iOrdinal2 == 1) {
                xw50Var = xw50.f266589a;
            } else if (iOrdinal2 == 2) {
                xw50Var = xw50.f266590b;
            } else if (iOrdinal2 == 3) {
                xw50Var = xw50.f266591c;
            } else if (iOrdinal2 == 4) {
                xw50Var = xw50.f266593e;
            } else {
                if (iOrdinal2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                xw50Var = xw50.f266592d;
            }
            if (xw50Var != null) {
                arrayList.add(xw50Var);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public dkx0 m33211i() {
        return (dkx0) this.f39112b;
    }

    /* JADX INFO: renamed from: k */
    public void m33212k(CarIcon carIcon) {
        if (carIcon == null || carIcon.getType() != 1) {
            return;
        }
        IconCompat icon = carIcon.getIcon();
        if (icon == null) {
            throw new IllegalStateException("Custom icon does not have a backing IconCompat");
        }
        m33209g(icon);
    }

    @Override // p204p.InterfaceC1667ah
    /* JADX INFO: renamed from: q */
    public boolean mo1561q(View view) {
        ((C1704bh) this.f39112b).invoke();
        return true;
    }

    @Override // io.reactivex.rxjava3.core.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) {
        s1e1 s1e1Var = (s1e1) this.f39112b;
        s1e1Var.f204704c = observableEmitter;
        observableEmitter.setCancellable(new zg0(s1e1Var, 0));
        Boolean bool = (Boolean) s1e1Var.f204705d;
        if (bool != null) {
            observableEmitter.onNext(bool);
        }
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        tq3 tq3Var = (tq3) obj;
        xq3 xq3Var = (xq3) this.f39112b;
        EncoreButton encoreButton = (EncoreButton) xq3Var.f264860e;
        if (tq3Var instanceof rq3) {
            encoreButton.setText(R.string.anchor_links_back_to_the_top_label);
            wg61 wg61Var = m9y.f141402a;
            encoreButton.setAlpha(0.0f);
            encoreButton.setVisibility(0);
            encoreButton.animate().alpha(1.0f).setInterpolator((Interpolator) m9y.f141402a.getValue()).setDuration(200L).start();
            return;
        }
        if (!(tq3Var instanceof sq3)) {
            throw new NoWhenBranchMatchedException();
        }
        wg61 wg61Var2 = m9y.f141402a;
        encoreButton.animate().alpha(0.0f).setDuration(200L).setInterpolator((Interpolator) m9y.f141402a.getValue()).withEndAction(new RunnableC1978ih(encoreButton, 2)).start();
        wq3 wq3Var = new wq3(xq3Var, 0);
        if (((AtomicBoolean) xq3Var.f264858c).getAndSet(true)) {
            return;
        }
        wq3Var.invoke();
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        cbf0 cbf0VarM35556a;
        dbf0 dbf0VarM38368c = ((ebf0) obj).m38368c(hy5.class, ((vx5) this.f39112b).f245618a);
        hy5 hy5Var = (hy5) ((dbf0VarM38368c == null || (cbf0VarM35556a = dbf0VarM38368c.m35556a()) == null) ? null : (ktx) cbf0VarM35556a.f36107a);
        return (hy5Var != null ? (nx5) g6f.m43745s0(hy5Var.f96463a) : null) != null;
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public swd1 mo24684x(View view, swd1 swd1Var) {
        dx40 dx40VarMo51806g = swd1Var.f214650a.mo51806g(655);
        ScrollView scrollView = (ScrollView) ((wx1) this.f39112b).f255875d.f177385b;
        int i = dx40VarMo51806g.f53850c;
        scrollView.setPadding(dx40VarMo51806g.f53848a, scrollView.getPaddingTop(), i, dx40VarMo51806g.f53851d);
        return swd1Var;
    }

    public ckx0(ay5 ay5Var, vx5 vx5Var) {
        this.f39111a = 24;
        this.f39112b = vx5Var;
    }

    public ckx0(eh00 eh00Var, yg7 yg7Var) {
        this.f39111a = 27;
        this.f39112b = eh00Var;
    }

    public ckx0(rwt0 rwt0Var) {
        this.f39111a = 11;
        AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk = (AeFpsRangeLegacyQuirk) rwt0Var.m76583e(AeFpsRangeLegacyQuirk.class);
        if (aeFpsRangeLegacyQuirk == null) {
            this.f39112b = null;
        } else {
            this.f39112b = aeFpsRangeLegacyQuirk.f364a;
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        bji bjiVar;
        bji bjiVar2;
        bji bjiVar3;
        bji bjiVar4;
        switch (this.f39111a) {
            case 16:
                yx3 yx3Var = (yx3) this.f39112b;
                fnk0 fnk0Var = yx3Var.f277121c;
                if (fnk0Var == null || !fnk0Var.m42228h("android-boombox-settings.crossfade_enabled")) {
                    bjiVar = fnk0Var;
                    bjiVar = yx3Var.f277122d;
                }
                if (bjiVar != null) {
                }
                break;
            case 17:
                w84 w84Var = (w84) this.f39112b;
                fnk0 fnk0Var2 = w84Var.f248847h;
                if (fnk0Var2 == null || !fnk0Var2.m42228h("android-gen-alpha-account-creation.parental_consent_flow_enabled")) {
                    bjiVar2 = fnk0Var2;
                    bjiVar2 = w84Var.f248848i;
                }
                if (bjiVar2 != null) {
                }
                break;
            case 18:
            default:
                gi5 gi5Var = (gi5) this.f39112b;
                fnk0 fnk0Var3 = gi5Var.f80068r;
                if (fnk0Var3 == null || !fnk0Var3.m42228h("apps-music-libs-eventsender.event_sending_interval_seconds")) {
                    bjiVar4 = fnk0Var3;
                    bjiVar4 = gi5Var.f80069s;
                }
                if (bjiVar4 != null) {
                }
                break;
            case 19:
                eh4 eh4Var = (eh4) this.f39112b;
                fnk0 fnk0Var4 = eh4Var.f59494l;
                if (fnk0Var4 == null || !fnk0Var4.m42228h("android-media-session.restrict_playing_state_when_connect_car_is_active")) {
                    bjiVar3 = fnk0Var4;
                    bjiVar3 = eh4Var.f59495m;
                }
                if (bjiVar3 != null) {
                }
                break;
            case 20:
                singleEmitter.onSuccess(new rt4(((Boolean) Single.create(new fj1((tt4) this.f39112b, 17)).blockingGet()).booleanValue()));
                break;
        }
    }

    public ckx0(int i) {
        this.f39111a = i;
        switch (i) {
            case 18:
                this.f39112b = null;
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    this.f39112b = keyStore;
                    keyStore.load(null);
                    return;
                } catch (IOException | GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            default:
                return;
        }
    }

    @Override // p204p.q5w0
    /* JADX INFO: renamed from: e */
    public void mo33208e(long j, String str) {
    }
}
