package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes2.dex */
public final class bo90 implements Connectable {

    /* JADX INFO: renamed from: a */
    public final ybn f29049a;

    /* JADX INFO: renamed from: b */
    public final xq41 f29050b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f29051c;

    /* JADX INFO: renamed from: d */
    public final mb80 f29052d;

    /* JADX INFO: renamed from: e */
    public final tc31 f29053e;

    /* JADX INFO: renamed from: f */
    public final lo10 f29054f;

    /* JADX INFO: renamed from: g */
    public final k7p0 f29055g;

    /* JADX INFO: renamed from: h */
    public final gb80 f29056h;

    /* JADX INFO: renamed from: i */
    public final wy50 f29057i;

    /* JADX INFO: renamed from: t */
    public final ff4 f29058t;

    public bo90(ybn ybnVar, xq41 xq41Var, Scheduler scheduler, mb80 mb80Var, tc31 tc31Var, lo10 lo10Var, k7p0 k7p0Var, gb80 gb80Var, wy50 wy50Var, ff4 ff4Var) {
        this.f29049a = ybnVar;
        this.f29050b = xq41Var;
        this.f29051c = scheduler;
        this.f29052d = mb80Var;
        this.f29053e = tc31Var;
        this.f29054f = lo10Var;
        this.f29055g = k7p0Var;
        this.f29056h = gb80Var;
        this.f29057i = wy50Var;
        this.f29058t = ff4Var;
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        return new tg3(this, consumer);
    }
}
