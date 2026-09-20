package p204p;

import android.content.Intent;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes3.dex */
public final class u550 implements t3t0, Function {

    /* JADX INFO: renamed from: a */
    public final Intent f226912a;

    public /* synthetic */ u550(Intent intent) {
        this.f226912a = intent;
    }

    @Override // p204p.t3t0
    /* JADX INFO: renamed from: a */
    public String mo60915a() {
        String stringExtra = this.f226912a.getStringExtra("REDIRECT_URI");
        return stringExtra != null ? stringExtra : "";
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            return p1j0.f173119a;
        }
        Intent intent = this.f226912a;
        return new u1j0(wdc0.class, new zdc0(intent.getBooleanExtra("manual_select_open_user_initiated_autodetect", false), intent.getBooleanExtra("manual_select_is_ambiguous_device", false), intent.getStringExtra("manual_select_ambiguous_device_title"), intent.getBooleanExtra("manual_select_is_airpods_ambiguous_type", false), (jgq0) intent.getParcelableExtra("manual_select_predicted_device"), intent.getBooleanExtra("manual_select_predicted_device_was_matched", false), intent.getBooleanExtra("manual_select_resume_music", false)), new xzq0(1, false, 6));
    }

    @Override // p204p.t3t0
    /* JADX INFO: renamed from: b */
    public String mo80018b() {
        return this.f226912a.getStringExtra("CODE_CHALLENGE_METHOD");
    }

    @Override // p204p.t3t0
    /* JADX INFO: renamed from: c */
    public int mo60916c() {
        String stringExtra = this.f226912a.getStringExtra("RESPONSE_TYPE");
        if (stringExtra == null) {
            return 4;
        }
        if (stringExtra.equals("token")) {
            return 1;
        }
        if (stringExtra.equals("code")) {
            return 2;
        }
        return stringExtra.equals("none") ? 3 : 4;
    }

    @Override // p204p.t3t0
    /* JADX INFO: renamed from: d */
    public boolean mo60917d() {
        return false;
    }

    @Override // p204p.t3t0
    /* JADX INFO: renamed from: g */
    public String mo60918g() {
        return this.f226912a.getStringExtra("UTM_CAMPAIGN");
    }

    @Override // p204p.t3t0
    public String getClientId() {
        String stringExtra = this.f226912a.getStringExtra("CLIENT_ID");
        return stringExtra != null ? stringExtra : "";
    }

    @Override // p204p.t3t0
    public String getState() {
        return this.f226912a.getStringExtra("STATE");
    }

    @Override // p204p.t3t0
    /* JADX INFO: renamed from: i */
    public String mo60919i() {
        return this.f226912a.getStringExtra("UTM_SOURCE");
    }

    @Override // p204p.t3t0
    /* JADX INFO: renamed from: j */
    public cke mo60920j() {
        return (cke) this.f226912a.getParcelableExtra("CLIENT_IDENTITY");
    }

    @Override // p204p.t3t0
    /* JADX INFO: renamed from: l */
    public String mo60921l() {
        return this.f226912a.getStringExtra("associated_content");
    }

    @Override // p204p.t3t0
    /* JADX INFO: renamed from: m */
    public String mo80019m() {
        return this.f226912a.getStringExtra("CODE_CHALLENGE");
    }

    @Override // p204p.t3t0
    /* JADX INFO: renamed from: t */
    public String[] mo60925t() {
        String[] stringArrayExtra = this.f226912a.getStringArrayExtra("SCOPES");
        return stringArrayExtra != null ? stringArrayExtra : new String[0];
    }

    @Override // p204p.t3t0
    /* JADX INFO: renamed from: u */
    public String mo60926u() {
        return this.f226912a.getStringExtra("UTM_MEDIUM");
    }
}
