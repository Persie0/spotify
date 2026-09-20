package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class m4c {

    /* JADX INFO: renamed from: a */
    public final rc81 f139893a;

    /* JADX INFO: renamed from: b */
    public final gc41 f139894b;

    /* JADX INFO: renamed from: c */
    public int f139895c;

    /* JADX INFO: renamed from: e */
    public boolean f139897e;

    /* JADX INFO: renamed from: f */
    public boolean f139898f;

    /* JADX INFO: renamed from: h */
    public boolean f139900h;

    /* JADX INFO: renamed from: i */
    public final wt81 f139901i;

    /* JADX INFO: renamed from: d */
    public int f139896d = -1;

    /* JADX INFO: renamed from: g */
    public boolean f139899g = true;

    public m4c(rc81 rc81Var, gc41 gc41Var) {
        this.f139893a = rc81Var;
        this.f139894b = gc41Var;
        if (!(rc81Var.getAdapter() instanceof wt81)) {
            throw new IllegalArgumentException("Carousel must have a TracksCarouselAdapter.");
        }
        rc81Var.setOnLayoutChildrenListener(new a99(this, 10));
        this.f139901i = (wt81) rc81Var.getAdapter();
        rc81Var.f5027j2.add(new l4c(this));
    }
}
