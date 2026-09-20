package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class d1g1 extends kv30 {

    /* JADX INFO: renamed from: l */
    public final aqs f44291l;

    /* JADX INFO: renamed from: m */
    public final ev61 f44292m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ s4g1 f44293n;

    public d1g1(s4g1 s4g1Var, ev61 ev61Var) {
        Objects.requireNonNull(s4g1Var);
        aqs aqsVar = new aqs("OnRequestCrossDevicePromptCallback");
        this.f44293n = s4g1Var;
        super(8);
        attachInterface(this, "com.google.android.play.core.crossdeviceprompt.protocol.ICrossDevicePromptServiceCallback");
        this.f44291l = aqsVar;
        this.f44292m = ev61Var;
    }
}
