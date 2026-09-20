package com.spotify.jam.features.dialogs.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p204p.agm;
import p204p.bga;
import p204p.bnm0;
import p204p.bu91;
import p204p.cbm0;
import p204p.dwp;
import p204p.e8f;
import p204p.e940;
import p204p.f710;
import p204p.fbk;
import p204p.h431;
import p204p.hj31;
import p204p.ibk;
import p204p.ic41;
import p204p.k0e1;
import p204p.kv91;
import p204p.l5h1;
import p204p.lwr;
import p204p.nu91;
import p204p.oge0;
import p204p.ou91;
import p204p.pqa;
import p204p.pw90;
import p204p.qbj0;
import p204p.qro;
import p204p.rsw0;
import p204p.tc41;
import p204p.u7q;
import p204p.uc41;
import p204p.vaq;
import p204p.vc41;
import p204p.vyf1;
import p204p.wj50;
import p204p.wl51;
import p204p.x0h1;
import p204p.xgg1;
import p204p.yt91;
import p204p.yuk;
import p204p.zt91;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m24212d2 = {"Lcom/spotify/jam/features/dialogs/impl/SocialListeningOnboardingActivity;", "Lp/ic41;", "", "<init>", "()V", "src_main_java_com_spotify_jam_features_dialogs_impl-impl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class SocialListeningOnboardingActivity extends ic41 {

    /* JADX INFO: renamed from: l1 */
    public static final /* synthetic */ int f4646l1 = 0;

    /* JADX INFO: renamed from: d1 */
    public vaq f4647d1;

    /* JADX INFO: renamed from: e1 */
    public dwp f4648e1;

    /* JADX INFO: renamed from: f1 */
    public Scheduler f4649f1;

    /* JADX INFO: renamed from: g1 */
    public e940 f4650g1;

    /* JADX INFO: renamed from: h1 */
    public u7q f4651h1;

    /* JADX INFO: renamed from: i1 */
    public agm f4652i1;

    /* JADX INFO: renamed from: j1 */
    public oge0 f4653j1;

    /* JADX INFO: renamed from: k1 */
    public SocialListeningIPLOnboardingHeader f4654k1;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: u0 */
    public static final Object m12032u0(SocialListeningOnboardingActivity socialListeningOnboardingActivity, ibk ibkVar) {
        hj31 hj31Var;
        SocialListeningOnboardingActivity socialListeningOnboardingActivity2;
        if (ibkVar instanceof hj31) {
            hj31Var = (hj31) ibkVar;
            int i = hj31Var.f91954d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hj31Var.f91954d = i - Integer.MIN_VALUE;
            } else {
                hj31Var = new hj31(socialListeningOnboardingActivity, ibkVar);
            }
        } else {
            hj31Var = new hj31(socialListeningOnboardingActivity, ibkVar);
        }
        Object objM86755t = hj31Var.f91952b;
        int i2 = hj31Var.f91954d;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            agm agmVar = socialListeningOnboardingActivity.f4652i1;
            if (agmVar == null) {
                wj50.m88260d0("personalizationSettingProvider");
                throw null;
            }
            hj31Var.f91951a = socialListeningOnboardingActivity;
            hj31Var.f91954d = 1;
            objM86755t = vyf1.m86755t(k0e1.m54985d(agmVar.f15429a.m32730a(true).onErrorReturnItem(Boolean.FALSE)), hj31Var);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
            socialListeningOnboardingActivity2 = socialListeningOnboardingActivity;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            socialListeningOnboardingActivity2 = hj31Var.f91951a;
            bga.m29073P(objM86755t);
        }
        String string = socialListeningOnboardingActivity2.getString(((Boolean) objM86755t).booleanValue() ? R.string.social_listening_v2_onboarding_host_info_jam_no_personalization : R.string.social_listening_v2_onboarding_host_info_jam);
        vaq vaqVar = socialListeningOnboardingActivity.f4647d1;
        if (vaqVar == null) {
            wj50.m88260d0("iconBuilder");
            throw null;
        }
        vc41 vc41Var = vc41.DEVICES;
        Context context = vaqVar.f239313a;
        tc41 tc41Var = new tc41(context, vc41Var, context.getResources().getDimension(R.dimen.privacy_notice_icon_size));
        tc41Var.setBounds(0, 0, tc41Var.f219021n.mo57072j(), tc41Var.f219021n.mo57071h());
        uc41 uc41Var = new uc41(4, tc41Var, true);
        SpannableString spannableString = new SpannableString(context.getString(R.string.social_listening_v2_onboarding_host_info_turn_off_jam, tc41Var.m80416a()));
        int iM88458H0 = wl51.m88458H0(spannableString, tc41Var.m80416a(), 0, false, 6);
        spannableString.setSpan(uc41Var, iM88458H0, tc41Var.m80416a().length() + iM88458H0, 18);
        return new SpannableStringBuilder().append((CharSequence) string).append((CharSequence) (socialListeningOnboardingActivity.getResources().getConfiguration().orientation == 1 ? "\n\n" : " ")).append((CharSequence) spannableString);
    }

    @Override // p204p.ic41, p204p.anm0
    /* JADX INFO: renamed from: g */
    public final bnm0 mo2758g() {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        return new bnm0(f710.m40939g(xgg1.m90662N1("SOCIAL_LISTENING_IPLONBOARDINGDIALOG", "social-listening/iplonboardingdialog", 1847, "social-listening"), null, 4));
    }

    @Override // p204p.ic41, p204p.cc80, p204p.m500, p204p.cwf, p204p.bwf, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_onboarding);
        this.f4654k1 = (SocialListeningIPLOnboardingHeader) findViewById(R.id.social_listening_ipl_onboarding_header);
        String stringExtra = getIntent().getStringExtra("username");
        x0h1.m89578u(l5h1.m58232p(getLifecycle()), null, 0, new h431((TextView) findViewById(R.id.onboarding_privacy_notice), this, (fbk) null, 4), 3);
        Scheduler scheduler = this.f4649f1;
        if (scheduler == null) {
            wj50.m88260d0("mainScheduler");
            throw null;
        }
        dwp dwpVar = this.f4648e1;
        if (dwpVar == null) {
            wj50.m88260d0("instrumentation");
            throw null;
        }
        u7q u7qVar = this.f4651h1;
        if (u7qVar == null) {
            wj50.m88260d0("userFaceLoader");
            throw null;
        }
        oge0 oge0Var = new oge0(scheduler, dwpVar, u7qVar);
        this.f4653j1 = oge0Var;
        oge0Var.f165109d = this;
        kv91 kv91Var = dwpVar.f53731a;
        yt91 yt91VarM96903c = dwpVar.f53732b.f15692b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("host_onboarding", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = zt91VarM94607a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        kv91Var.mo57449i((ou91) nu91Var.m87248a(), null);
        ((lwr) oge0Var.f165108c).m60127a(((Flowable) u7qVar.f227741b).m23360y(pqa.f180227W0).m23327A().flatMap(new qro(u7qVar, 18)).map(e8f.f57167V0).observeOn(scheduler).subscribe(new qbj0(oge0Var, 20), pw90.f181953W0));
        ((Button) findViewById(R.id.confirm_button)).setOnClickListener(new rsw0(11, this, stringExtra));
    }

    @Override // p204p.cc80, p204p.r55, p204p.m500, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        oge0 oge0Var = this.f4653j1;
        if (oge0Var == null) {
            wj50.m88260d0("presenter");
            throw null;
        }
        ((lwr) oge0Var.f165108c).m60129c();
        oge0Var.f165109d = null;
    }
}
