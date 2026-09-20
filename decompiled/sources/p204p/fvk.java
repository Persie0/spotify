package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.voiceassistants.playermodels.PlayIntent;

/* JADX INFO: loaded from: classes11.dex */
public final class fvk implements esc1 {

    /* JADX INFO: renamed from: b */
    public static final Object f73807b = kkc0.m56695h0(new pqm0(new st60("com.microsoft.cortana"), new fvk("com.microsoft.cortana")), new pqm0(new st60("com.microsoft.cortana.wip"), new fvk("com.microsoft.cortana.wip")), new pqm0(new st60("com.microsoft.cortana.daily"), new fvk("com.microsoft.cortana.daily")));

    /* JADX INFO: renamed from: a */
    public final String f73808a;

    public fvk(String str) {
        this.f73808a = str;
    }

    @Override // p204p.esc1
    /* JADX INFO: renamed from: a */
    public final ExternalAccessoryDescription mo34985a() {
        return new ExternalAccessoryDescription("voice_assistant", null, null, "app_to_app", null, "app", "microsoft", "cortana", null, "media_session", this.f73808a, 278, null);
    }

    @Override // p204p.esc1
    /* JADX INFO: renamed from: b */
    public final String mo34986b(PlayIntent playIntent) {
        return "CORTANA";
    }
}
