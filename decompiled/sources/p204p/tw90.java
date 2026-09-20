package p204p;

import android.view.View;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: classes8.dex */
public final class tw90 implements Connectable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f224381a = 1;

    /* JADX INFO: renamed from: b */
    public int f224382b;

    /* JADX INFO: renamed from: c */
    public final Object f224383c;

    /* JADX INFO: renamed from: d */
    public final Object f224384d;

    /* JADX INFO: renamed from: e */
    public final Object f224385e;

    /* JADX INFO: renamed from: f */
    public final Object f224386f;

    /* JADX INFO: renamed from: g */
    public final Object f224387g;

    /* JADX INFO: renamed from: h */
    public Object f224388h;

    public tw90(he90 he90Var, oj10 oj10Var, tyz tyzVar, hsb1 hsb1Var, vv91 vv91Var) {
        this.f224383c = he90Var;
        this.f224384d = oj10Var;
        this.f224385e = tyzVar;
        this.f224386f = hsb1Var;
        this.f224387g = vv91Var;
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        switch (this.f224381a) {
            case 0:
                return new tg3(this, consumer);
            default:
                this.f224388h = consumer;
                return new gk81(this, 4);
        }
    }

    /* JADX INFO: renamed from: a */
    public int m81664a(View view) {
        if (view != null) {
            return ((he90) this.f224383c).m47281k().indexOfChild(view) - 1;
        }
        return -1;
    }

    public tw90(jpk0 jpk0Var, m6n0 m6n0Var, int i, xre xreVar, gcu0 gcu0Var, Flowable flowable, fiz fizVar, qwx0 qwx0Var) {
        this.f224383c = jpk0Var;
        this.f224384d = m6n0Var;
        this.f224382b = i;
        this.f224385e = gcu0Var;
        this.f224386f = flowable;
        this.f224387g = fizVar;
        this.f224388h = qwx0Var;
    }
}
