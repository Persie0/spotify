package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class zja1 implements t3t0 {

    /* JADX INFO: renamed from: a */
    public final Uri f283407a;

    public zja1(String str) {
        this.f283407a = Uri.parse(str);
    }

    @Override // p204p.t3t0
    /* JADX INFO: renamed from: a */
    public final String mo60915a() {
        String queryParameter = this.f283407a.getQueryParameter("redirect_uri");
        return queryParameter != null ? queryParameter : "";
    }

    @Override // p204p.t3t0
    /* JADX INFO: renamed from: b */
    public final String mo80018b() {
        return this.f283407a.getQueryParameter("code_challenge_method");
    }

    @Override // p204p.t3t0
    /* JADX INFO: renamed from: c */
    public final int mo60916c() {
        return 2;
    }

    @Override // p204p.t3t0
    /* JADX INFO: renamed from: d */
    public final boolean mo60917d() {
        return this.f283407a.getBooleanQueryParameter("show_dialog", false);
    }

    @Override // p204p.t3t0
    /* JADX INFO: renamed from: g */
    public final String mo60918g() {
        return this.f283407a.getQueryParameter("utm_campaign");
    }

    @Override // p204p.t3t0
    public final String getClientId() {
        String queryParameter = this.f283407a.getQueryParameter("client_id");
        return queryParameter != null ? queryParameter : "";
    }

    @Override // p204p.t3t0
    public final String getState() {
        return this.f283407a.getQueryParameter("state");
    }

    @Override // p204p.t3t0
    /* JADX INFO: renamed from: i */
    public final String mo60919i() {
        return this.f283407a.getQueryParameter("utm_source");
    }

    @Override // p204p.t3t0
    /* JADX INFO: renamed from: l */
    public final String mo60921l() {
        return this.f283407a.getQueryParameter("associated_content");
    }

    @Override // p204p.t3t0
    /* JADX INFO: renamed from: m */
    public final String mo80019m() {
        return this.f283407a.getQueryParameter("code_challenge");
    }

    @Override // p204p.t3t0
    /* JADX INFO: renamed from: t */
    public final String[] mo60925t() {
        String queryParameter = this.f283407a.getQueryParameter("scope");
        return queryParameter == null ? new String[0] : queryParameter.split(" ");
    }

    @Override // p204p.t3t0
    /* JADX INFO: renamed from: u */
    public final String mo60926u() {
        return this.f283407a.getQueryParameter("utm_medium");
    }
}
