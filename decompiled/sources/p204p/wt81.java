package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes8.dex */
public abstract class wt81 extends it1 {

    /* JADX INFO: renamed from: e */
    public Object f254879e;

    /* JADX INFO: renamed from: f */
    public boolean f254880f;

    /* JADX INFO: renamed from: g */
    public boolean f254881g;

    /* JADX INFO: renamed from: h */
    public boolean f254882h;

    /* JADX INFO: renamed from: i */
    public int f254883i;

    public wt81() {
        super(1);
        this.f254879e = lau.f131415a;
        this.f254880f = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: B */
    public final ContextTrack m88913B(int i) {
        return ((i8c) this.f254879e.get(i)).f99756a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // p204p.hjv0
    /* JADX INFO: renamed from: e */
    public final int mo1617e() {
        return this.f254879e.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // p204p.hjv0
    /* JADX INFO: renamed from: f */
    public final long mo1618f(int i) {
        return ((i8c) this.f254879e.get(i)).f99757b;
    }
}
