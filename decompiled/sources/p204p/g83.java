package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.voiceassistants.playermodels.PlayIntent;

/* JADX INFO: loaded from: classes11.dex */
public final class g83 implements esc1 {

    /* JADX INFO: renamed from: b */
    public static final Object f77396b = kkc0.m56695h0(new pqm0(new st60("com.amazon.dee.app"), new g83("com.amazon.dee.app")), new pqm0(new st60("com.amazon.dee.app.beta"), new g83("com.amazon.dee.app.beta")), new pqm0(new st60("com.amazon.aca"), new g83("com.amazon.aca")), new pqm0(new st60("com.amazon.alexa.multimodal.lyra"), new g83("com.amazon.alexa.multimodal.lyra")), new pqm0(new st60("com.amazon.alexa.multimodal.gemini"), new g83("com.amazon.alexa.multimodal.gemini")), new pqm0(new st60("amazon.speech.sim"), new g83("amazon.speech.sim")));

    /* JADX INFO: renamed from: a */
    public final String f77397a;

    public g83(String str) {
        this.f77397a = str;
    }

    @Override // p204p.esc1
    /* JADX INFO: renamed from: a */
    public final ExternalAccessoryDescription mo34985a() {
        return new ExternalAccessoryDescription("voice_assistant", null, null, "app_to_app", null, "app", "amazon", "alexa", null, "media_session", this.f77397a, 278, null);
    }

    @Override // p204p.esc1
    /* JADX INFO: renamed from: b */
    public final String mo34986b(PlayIntent playIntent) {
        return "ANDROID_ALEXA";
    }
}
