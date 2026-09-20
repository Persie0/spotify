package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.voiceassistants.playermodels.PlayIntent;

/* JADX INFO: loaded from: classes11.dex */
public final class li9 implements esc1 {

    /* JADX INFO: renamed from: b */
    public static final Object f133744b = kkc0.m56695h0(new pqm0(new st60("com.samsung.android.bixby.service"), new li9("com.samsung.android.bixby.service")), new pqm0(new st60("com.samsung.android.bixby.agent"), new li9("com.samsung.android.bixby.agent")));

    /* JADX INFO: renamed from: a */
    public final String f133745a;

    public li9(String str) {
        this.f133745a = str;
    }

    @Override // p204p.esc1
    /* JADX INFO: renamed from: a */
    public final ExternalAccessoryDescription mo34985a() {
        return new ExternalAccessoryDescription("voice_assistant", null, null, "app_to_app", null, "app", d6n0.f45731d, "bixby", null, "media_session", this.f133745a, 278, null);
    }

    @Override // p204p.esc1
    /* JADX INFO: renamed from: b */
    public final String mo34986b(PlayIntent playIntent) {
        return "SAMSUNG_BIXBY";
    }
}
