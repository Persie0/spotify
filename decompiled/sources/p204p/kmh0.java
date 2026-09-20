package p204p;

import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final class kmh0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f124162a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nlv0 f124163b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Consumer f124164c;

    public kmh0(Object obj, nlv0 nlv0Var, Consumer consumer) {
        this.f124162a = obj;
        this.f124163b = nlv0Var;
        this.f124164c = consumer;
    }

    @Override // com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        Object obj2 = this.f124162a;
        nlv0 nlv0Var = this.f124163b;
        Consumer consumer = this.f124164c;
        synchronized (obj2) {
            if (!nlv0Var.f155174a) {
                consumer.accept(new bce1(obj, null));
            }
        }
    }
}
