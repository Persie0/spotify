package p204p;

import com.spotify.hovercraftasr.p080v1.AsrStreamRequest;
import com.spotify.hovercraftasr.p080v1.C0792a;
import com.spotify.hovercraftasr.p080v1.C0793b;
import com.spotify.hovercraftasr.p080v1.C0795d;

/* JADX INFO: loaded from: classes.dex */
public final class wa21 implements sa21 {

    /* JADX INFO: renamed from: a */
    public final String f249338a;

    /* JADX INFO: renamed from: b */
    public final z4l0 f249339b;

    /* JADX INFO: renamed from: c */
    public final xnd1 f249340c;

    /* JADX INFO: renamed from: d */
    public final u4l0 f249341d;

    /* JADX INFO: renamed from: e */
    public old1 f249342e;

    /* JADX INFO: renamed from: f */
    public AsrStreamRequest.InteractionManagerParams f249343f;

    public wa21(String str, z4l0 z4l0Var, xnd1 xnd1Var, u4l0 u4l0Var) {
        this.f249338a = str;
        this.f249339b = z4l0Var;
        this.f249340c = xnd1Var;
        this.f249341d = u4l0Var;
    }

    /* JADX INFO: renamed from: b */
    public final C0792a m87562b() {
        C0795d c0795dM11875o = AsrStreamRequest.PartialTranscriptOptions.m11875o();
        c0795dM11875o.m11894m();
        AsrStreamRequest.PartialTranscriptOptions partialTranscriptOptions = (AsrStreamRequest.PartialTranscriptOptions) c0795dM11875o.build();
        C0793b c0793bM11868o = AsrStreamRequest.EndSpeechDetectionOptions.m11868o();
        c0793bM11868o.m11889m();
        AsrStreamRequest.EndSpeechDetectionOptions endSpeechDetectionOptions = (AsrStreamRequest.EndSpeechDetectionOptions) c0793bM11868o.build();
        C0792a c0792aM11866u = AsrStreamRequest.m11866u();
        c0792aM11866u.m11883q();
        c0792aM11866u.m11887u(partialTranscriptOptions);
        c0792aM11866u.m11885s(endSpeechDetectionOptions);
        AsrStreamRequest.InteractionManagerParams interactionManagerParams = this.f249343f;
        if (interactionManagerParams != null) {
            c0792aM11866u.m11886t(interactionManagerParams);
        }
        return c0792aM11866u;
    }
}
