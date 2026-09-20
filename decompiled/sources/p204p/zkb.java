package p204p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.C1045b;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes5.dex */
public final class zkb implements EventSource {

    /* JADX INFO: renamed from: a */
    public final f3p f283697a;

    /* JADX INFO: renamed from: b */
    public final d2d f283698b;

    /* JADX INFO: renamed from: c */
    public final luk f283699c;

    public zkb(f3p f3pVar, d2d d2dVar, luk lukVar) {
        this.f283697a = f3pVar;
        this.f283698b = d2dVar;
        this.f283699c = lukVar;
    }

    @Override // com.spotify.mobius.EventSource
    /* JADX INFO: renamed from: a */
    public final Disposable mo15572a(Consumer consumer) {
        FlowEventSources.Companion companion = FlowEventSources.f5713a;
        fiz[] fizVarArr = {new xkb(new xkb(this.f283697a.f65562c, this, 0), this, 1)};
        companion.getClass();
        return new C1045b(this.f283699c, fizVarArr).mo15572a(new eo2(consumer, 4));
    }
}
