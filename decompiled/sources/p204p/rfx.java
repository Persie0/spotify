package p204p;

import com.spotify.home.evopage.mobius.Event;
import com.spotify.home.evopage.mobius.State;

/* JADX INFO: loaded from: classes2.dex */
public final class rfx extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ufx f198757a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfx(ufx ufxVar) {
        super(1);
        this.f198757a = ufxVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        String pageToken;
        jex jexVar = this.f198757a.f229911c;
        State state = (State) jexVar.f111687N0.mo33098e();
        if (state != null) {
            State.Content content = state instanceof State.Content ? (State.Content) state : null;
            if (content != null && (pageToken = content.getPageToken()) != null && (!wl51.m88460J0(pageToken))) {
                jexVar.m53120l(Event.LoadMore.INSTANCE);
            }
        }
        return w2a1.f247311a;
    }
}
