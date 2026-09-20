package p204p;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.roundedcorner.RoundedConstraintLayout;
import com.spotify.music.R;
import com.spotify.voiceassistants.playermodels.CommandPlayRequest;
import com.spotify.voiceassistants.playermodels.PlayIntent;
import com.spotify.voiceassistants.playermodels.SearchEndpointRequest;
import com.spotify.voiceassistants.playermodels.SpeakeasyDualResponse;
import com.spotify.voiceassistants.playermodels.VoiceAssistantLoggingContext;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.io.File;
import java.util.HashMap;
import java.util.Optional;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import spotify.your_library.esperanto.proto.YourLibraryDecorateResponse;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity;

/* JADX INFO: loaded from: classes9.dex */
public final class ycm0 implements rdc1, Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f271526a;

    /* JADX INFO: renamed from: b */
    public Object f271527b;

    /* JADX INFO: renamed from: c */
    public Object f271528c;

    /* JADX INFO: renamed from: d */
    public Object f271529d;

    /* JADX INFO: renamed from: e */
    public Object f271530e;

    /* JADX INFO: renamed from: f */
    public Object f271531f;

    /* JADX INFO: renamed from: g */
    public Object f271532g;

    public ycm0() {
        this.f271526a = 21;
        this.f271531f = Optional.empty();
        this.f271532g = Optional.empty();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ azu0 m93352a(ycm0 ycm0Var) {
        return (azu0) ycm0Var.f271527b;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ File m93353b(ycm0 ycm0Var) {
        return (File) ycm0Var.f271528c;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ File m93354c(ycm0 ycm0Var) {
        return (File) ycm0Var.f271529d;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ File m93355d(ycm0 ycm0Var) {
        return (File) ycm0Var.f271530e;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ File m93356e(ycm0 ycm0Var) {
        return (File) ycm0Var.f271531f;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ File m93357f(ycm0 ycm0Var) {
        return (File) ycm0Var.f271532g;
    }

    /* JADX INFO: renamed from: g */
    public static final void m93358g(ycm0 ycm0Var, String str, String str2, boolean z, d850 d850Var) {
        ub80 ub80VarM63737m = n5h1.m63737m((m500) ycm0Var.f271528c);
        String str3 = wl51.m88460J0(str2) ? str : str2;
        di41 di41Var = (di41) ycm0Var.f271532g;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        ycm0Var.f271532g = x0h1.m89578u(ub80VarM63737m, null, 0, new np1(ycm0Var, z, str3, ub80VarM63737m, str, str2, d850Var, (fbk) null, 7), 3);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f271526a) {
            case 13:
                SpeakeasyDualResponse speakeasyDualResponse = (SpeakeasyDualResponse) obj;
                dx31 dx31Var = (dx31) this.f271527b;
                HashMap map = dx31Var.f53845f;
                prq0 prq0Var = (prq0) map.get((Uri) this.f271528c);
                if (prq0Var != null) {
                    prq0Var.f180661c = speakeasyDualResponse;
                }
                Uri uri = (Uri) this.f271528c;
                SearchEndpointRequest searchEndpointRequest = (SearchEndpointRequest) this.f271529d;
                am71 am71Var = (am71) this.f271530e;
                sr4 sr4Var = (sr4) this.f271531f;
                VoiceAssistantLoggingContext voiceAssistantLoggingContext = (VoiceAssistantLoggingContext) this.f271532g;
                fsc1 fsc1Var = dx31Var.f53841b;
                clq0 clq0Var = new clq0(uri, searchEndpointRequest, map, fsc1Var, am71Var, sr4Var, voiceAssistantLoggingContext, 1);
                if (!(speakeasyDualResponse instanceof SpeakeasyDualResponse.CanPrepareResponse)) {
                    searchEndpointRequest.getInteractionId();
                    return ((woy0) fsc1Var).m88673b(speakeasyDualResponse, clq0Var, voiceAssistantLoggingContext);
                }
                return dx31Var.f53840a.m86528a(new CommandPlayRequest(((SpeakeasyDualResponse.CanPrepareResponse) speakeasyDualResponse).getActionNlUri(), searchEndpointRequest.getSourceDevice().getDeviceType(), false, 4, (DefaultConstructorMarker) null)).compose(dx31Var.f53844e).flatMapCompletable(new ax31(uri, sr4Var, voiceAssistantLoggingContext, dx31Var, speakeasyDualResponse, clq0Var, searchEndpointRequest)).m23300q(new ay21(uri, voiceAssistantLoggingContext, dx31Var, 9));
            case 17:
                c9b1 c9b1Var = (c9b1) this.f271532g;
                d9b1 d9b1Var = (d9b1) this.f271527b;
                YourLibraryDecorateResponse yourLibraryDecorateResponse = (YourLibraryDecorateResponse) obj;
                if (yourLibraryDecorateResponse.m98164b() != 1) {
                    return d9b1Var.m35352a((voc1) this.f271528c, (String) this.f271529d, (String) this.f271530e, (String) this.f271531f, null, c9b1Var, "");
                }
                YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntityM98165n = yourLibraryDecorateResponse.m98165n();
                return d9b1Var.m35352a((voc1) this.f271528c, (String) this.f271529d, (String) this.f271530e, (String) this.f271531f, yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntityM98165n.mo78647e().m98274q(), c9b1Var, d9b1Var.f46783h.getResources().getString(R.string.venue_address_and_city_subtitle, yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntityM98165n.m98270z().m98314n(), yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntityM98165n.m98270z().m98315o()));
            default:
                eu6 eu6Var = (eu6) this.f271527b;
                PlayIntent playIntent = (PlayIntent) this.f271528c;
                String str = (String) this.f271529d;
                String str2 = (String) this.f271530e;
                eu6Var.getClass();
                VoiceAssistantLoggingContext voiceAssistantLoggingContext2 = new VoiceAssistantLoggingContext(str, playIntent.getUri().toString(), null, str2);
                return ((dx31) eu6Var.f62886k).m37187a(playIntent.getUri(), (SearchEndpointRequest) obj, (am71) this.f271531f, (sr4) this.f271532g, voiceAssistantLoggingContext2).m23300q(new uj81(19, eu6Var, voiceAssistantLoggingContext2));
        }
    }

    @Override // p204p.rdc1
    public View getRoot() {
        switch (this.f271526a) {
            case 1:
                return (ConstraintLayout) this.f271527b;
            case 2:
                return (ConstraintLayout) this.f271527b;
            case 3:
                return (RoundedConstraintLayout) this.f271527b;
            case 4:
                return (ConstraintLayout) this.f271527b;
            case 10:
                return (ConstraintLayout) this.f271527b;
            default:
                return (ConstraintLayout) this.f271527b;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m93359h(File file) {
        this.f271530e = file;
    }

    /* JADX INFO: renamed from: i */
    public uoa m93360i() {
        return new uoa(this);
    }

    /* JADX INFO: renamed from: j */
    public e8g1 m93361j() {
        String str;
        qv1 qv1Var;
        fhv0 fhv0Var;
        String str2 = (String) this.f271527b;
        if (str2 != null && (str = (String) this.f271528c) != null && (qv1Var = (qv1) this.f271529d) != null && (fhv0Var = (fhv0) this.f271530e) != null) {
            return new e8g1(str2, str, qv1Var, fhv0Var, (Optional) this.f271531f, (Optional) this.f271532g);
        }
        StringBuilder sb = new StringBuilder();
        if (((String) this.f271527b) == null) {
            sb.append(" meetingCode");
        }
        if (((String) this.f271528c) == null) {
            sb.append(" meetingUrl");
        }
        if (((qv1) this.f271529d) == null) {
            sb.append(" meetingStatus");
        }
        if (((fhv0) this.f271530e) == null) {
            sb.append(" recordingInfo");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: k */
    public f5k m93362k(String str, String str2, boolean z) {
        return new f5k("profile_restrict_user_listening_activity", z ? duu.f53275c : yqu.f275297c, (c5k) null, Integer.valueOf(z ? R.string.restrict_user_listening_activity_row_title_hidden : R.string.restrict_user_listening_activity_row_title), (String) null, false, (p221) null, new e5k(z4k.f279256b, 1, z ? new d5k(gkw0.f80936Z0, gkw0.f80937a1) : new d5k(gkw0.f80939b1, gkw0.f80941c1), new rf1(this, str, str2, z, 23)), 244);
    }

    /* JADX INFO: renamed from: l */
    public void m93363l(File file) {
        this.f271531f = file;
    }

    /* JADX INFO: renamed from: m */
    public void m93364m() {
        ((lwr) this.f271532g).m60129c();
    }

    /* JADX INFO: renamed from: n */
    public fiz m93365n(Set set, a8v0 a8v0Var, boolean z) {
        if (set.isEmpty()) {
            return new ysk(new gso(gbu.f78413a), 27);
        }
        a8v0Var.m25059h("decorate_episode_and_audiobook_progress");
        return ffg1.m41541j(new nzx0(new iq2(z, ((l5v0) this.f271531f).f130016c, (Object) null, cyf1.m34374j(new nzx0(new uyf0(this, set, a8v0Var, (fbk) null, 16)), (luk) this.f271528c), (fbk) null)), a3s0.f12037L0, new s4r0(0, a8v0Var, a8v0.class, "endProgressPoint", "endProgressPoint()V", 0, 0, 2), new lvm0(a8v0Var, 2));
    }

    /* JADX INFO: renamed from: o */
    public void m93366o(File file) {
        this.f271528c = file;
    }

    /* JADX INFO: renamed from: p */
    public void m93367p(azu0 azu0Var) {
        this.f271527b = azu0Var;
    }

    /* JADX INFO: renamed from: q */
    public void m93368q(File file) {
        this.f271532g = file;
    }

    /* JADX INFO: renamed from: r */
    public void m93369r(cr41 cr41Var) {
        lwr lwrVar = (lwr) this.f271532g;
        Single singleFromCallable = Single.fromCallable(new x31(22, this, cr41Var));
        Scheduler scheduler = (Scheduler) this.f271528c;
        lwrVar.m60127a(singleFromCallable.subscribeOn(scheduler).flatMap(new dr41(this, cr41Var)).observeOn(scheduler).subscribe(new kwr0(15, this, cr41Var), new sc01(cr41Var, 27)));
    }

    /* JADX INFO: renamed from: s */
    public void m93370s(File file) {
        this.f271529d = file;
    }

    /* JADX INFO: renamed from: t */
    public void m93371t(jue jueVar) {
        this.f271532g = Optional.of(jueVar);
    }

    /* JADX INFO: renamed from: u */
    public void m93372u(uve uveVar) {
        this.f271531f = Optional.of(uveVar);
    }

    /* JADX INFO: renamed from: v */
    public void m93373v(String str) {
        if (str == null) {
            throw new NullPointerException("Null meetingCode");
        }
        this.f271527b = str;
    }

    /* JADX INFO: renamed from: w */
    public void m93374w(qv1 qv1Var) {
        if (qv1Var == null) {
            throw new NullPointerException("Null meetingStatus");
        }
        this.f271529d = qv1Var;
    }

    /* JADX INFO: renamed from: x */
    public void m93375x(String str) {
        if (str == null) {
            throw new NullPointerException("Null meetingUrl");
        }
        this.f271528c = str;
    }

    /* JADX INFO: renamed from: y */
    public void m93376y(fhv0 fhv0Var) {
        if (fhv0Var == null) {
            throw new NullPointerException("Null recordingInfo");
        }
        this.f271530e = fhv0Var;
    }

    public /* synthetic */ ycm0(int i) {
        this.f271526a = i;
    }

    public /* synthetic */ ycm0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f271526a = i;
        this.f271527b = obj;
        this.f271528c = obj2;
        this.f271529d = obj3;
        this.f271530e = obj4;
        this.f271531f = obj5;
        this.f271532g = obj6;
    }

    public ycm0(e8g1 e8g1Var) {
        this.f271526a = 21;
        this.f271531f = Optional.empty();
        Optional.empty();
        this.f271527b = e8g1Var.f57195a;
        this.f271528c = e8g1Var.f57196b;
        this.f271529d = e8g1Var.f57197c;
        this.f271530e = e8g1Var.f57198d;
        this.f271531f = e8g1Var.f57199e;
        this.f271532g = e8g1Var.f57200f;
    }

    public ycm0(Object obj, ViewGroup viewGroup, c851 c851Var, hc80 hc80Var, st91 st91Var) {
        this.f271526a = 19;
        this.f271527b = obj;
        this.f271528c = viewGroup;
        this.f271529d = c851Var;
        this.f271530e = hc80Var;
        this.f271531f = st91Var;
        this.f271532g = viewGroup.getContext();
    }

    public ycm0(uqw uqwVar, Scheduler scheduler, p6x p6xVar, abs0 abs0Var, jet0 jet0Var) {
        this.f271526a = 14;
        this.f271527b = uqwVar;
        this.f271528c = scheduler;
        this.f271529d = p6xVar;
        this.f271530e = abs0Var;
        this.f271531f = jet0Var;
        this.f271532g = new lwr();
    }

    public ycm0(tgw tgwVar, q831 q831Var, m500 m500Var, ob90 ob90Var, luk lukVar) {
        this.f271526a = 9;
        this.f271527b = tgwVar;
        this.f271531f = q831Var;
        this.f271528c = m500Var;
        this.f271529d = ob90Var;
        this.f271530e = lukVar;
    }

    public ycm0(luk lukVar, rmm0 rmm0Var) {
        this.f271526a = 6;
        this.f271527b = lukVar;
        hb11 hb11VarM52092t = j0g1.m52092t(0, 1, 2, 1);
        this.f271528c = hb11VarM52092t;
        this.f271529d = bzf1.m31020l(hb11VarM52092t);
        this.f271532g = rmm0Var.mo29877i().mo27151a(uh1.f230309C, new wh1(this, 25));
    }

    public ycm0(ur91 ur91Var) {
        this.f271526a = 16;
        this.f271527b = (yum0) ur91Var.f233297j.f163265b;
        this.f271528c = (yum0) ur91Var.f233298k.f163265b;
        this.f271529d = ur91Var.f233304q;
        this.f271530e = sam.m77674m(new sr91(ur91Var, 3));
        this.f271531f = sam.m77674m(new sr91(ur91Var, 1));
        this.f271532g = sam.m77674m(new sr91(ur91Var, 2));
    }
}
