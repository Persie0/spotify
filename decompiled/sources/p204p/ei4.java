package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ei4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f59781a;

    /* JADX INFO: renamed from: b */
    public final di4 f59782b;

    /* JADX INFO: renamed from: c */
    public final boolean f59783c;

    /* JADX INFO: renamed from: d */
    public final boolean f59784d;

    /* JADX INFO: renamed from: e */
    public final bji f59785e;

    /* JADX INFO: renamed from: f */
    public final wg61 f59786f;

    public ei4(boolean z, di4 di4Var, boolean z2, boolean z3, bji bjiVar) {
        this.f59781a = z;
        this.f59782b = di4Var;
        this.f59783c = z2;
        this.f59784d = z3;
        this.f59785e = bjiVar;
        this.f59786f = new wg61(new bh4(this, 18));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m39060a() {
        ei4 ei4Var = (ei4) this.f59786f.getValue();
        return ei4Var != null ? ei4Var.m39060a() : this.f59781a;
    }

    /* JADX INFO: renamed from: b */
    public final di4 m39061b() {
        di4 di4VarM39061b;
        ei4 ei4Var = (ei4) this.f59786f.getValue();
        return (ei4Var == null || (di4VarM39061b = ei4Var.m39061b()) == null) ? this.f59782b : di4VarM39061b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m39062c() {
        ei4 ei4Var = (ei4) this.f59786f.getValue();
        return ei4Var != null ? ei4Var.m39062c() : this.f59783c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m39063d() {
        ei4 ei4Var = (ei4) this.f59786f.getValue();
        return ei4Var != null ? ei4Var.m39063d() : this.f59784d;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("speakeasy_polling_ready_state_enabled", "android-music-libs-voice-assistant-flags", m39060a());
        String str = m39061b().f49231a;
        di4[] di4VarArrValues = di4.values();
        ArrayList arrayList = new ArrayList(di4VarArrValues.length);
        for (di4 di4Var : di4VarArrValues) {
            arrayList.add(di4Var.f49231a);
        }
        return h6f.m46715L(k8aVar, new k8a("third_party_utterance_banner", "android-music-libs-voice-assistant-flags", str, arrayList), new k8a("voice_assistants_alexa_dialog_enabled", "android-music-libs-voice-assistant-flags", m39062c()), new k8a("voice_assistants_settings_enabled", "android-music-libs-voice-assistant-flags", m39063d()));
    }

    public ei4(bji bjiVar) {
        this(false, di4.NEVER, false, false, bjiVar);
    }
}
