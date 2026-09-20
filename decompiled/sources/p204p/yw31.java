package p204p;

import com.spotify.voiceassistants.playermodels.CommandPlayRequest;
import com.spotify.voiceassistants.playermodels.VoiceAssistantLoggingContext;

/* JADX INFO: loaded from: classes11.dex */
public final class yw31 extends ibk {

    /* JADX INFO: renamed from: a */
    public sr4 f276848a;

    /* JADX INFO: renamed from: b */
    public VoiceAssistantLoggingContext f276849b;

    /* JADX INFO: renamed from: c */
    public CommandPlayRequest f276850c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f276851d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zw31 f276852e;

    /* JADX INFO: renamed from: f */
    public int f276853f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw31(zw31 zw31Var, ibk ibkVar) {
        super(ibkVar);
        this.f276852e = zw31Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f276851d = obj;
        this.f276853f |= Integer.MIN_VALUE;
        return this.f276852e.m97111e(null, null, null, null, this);
    }
}
